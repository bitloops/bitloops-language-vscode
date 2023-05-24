import {
  TextDocuments,
  TextDocumentChangeEvent,
  _Connection,
  InitializeParams,
  InitializeResult,
  TextDocumentSyncKind,
  DidChangeConfigurationNotification,
  WorkspaceFolder,
  DidChangeWatchedFilesParams,
  TextDocumentPositionParams,
  Hover,
  HoverParams,
  Position,
} from 'vscode-languageserver/node.js';

import { TextDocument } from 'vscode-languageserver-textdocument';
import { CompletionItemProvider } from './handlers/completion-handler/completion.js';
import { WorkspaceSettingsManager } from '../utils/settings.js';
import { IAnalyzer } from './handlers/document-text-changed-handler/interface.js';
import { ILspClient } from './client.js';
import { BitloopsAnalyzer } from './handlers/document-text-changed-handler/bitloops-transpiler-analyzer.js';
import * as fs from 'fs';
import * as path from 'path';
import { FileUtils } from '../utils/file.js';
import { handleChangeOnWatchedFiles } from './handlers/watched-files-changed/index.js';
import { fileURLToPath } from 'url';
import { StateManager } from './services/StateManager.js';
import { handleHover } from './handlers/hover-handler/hover.js';

// Create a connection for the server, using Node's IPC as a transport.
// Also include all preview / proposed LSP features.

/**
 * Abstract every direct interaction with the connection
 * to this class.
 */
export class BitloopsServer {
  private connection: _Connection;
  private settingsManger: WorkspaceSettingsManager;
  private analyzer: IAnalyzer;
  private lspClient: ILspClient;
  private stateManager: StateManager;

  // Default Global Settings
  private hasConfigurationCapability = false;
  private hasWorkspaceFolderCapability = false;
  private hasDiagnosticRelatedInformationCapability = false;
  private workspaceFolders: WorkspaceFolder[] = [];

  private isInitialized = false;

  constructor(lspClient: ILspClient, connection: _Connection) {
    // Create a simple text document manager.
    this.connection = connection;
    this.lspClient = lspClient;
    this.settingsManger = new WorkspaceSettingsManager();
    const stateManager = new StateManager();
    this.stateManager = stateManager;
    this.analyzer = new BitloopsAnalyzer(stateManager);
  }

  /**
   * Invoked when the content of a text document changes, such as when the user types.
   * Due to debouncing, it will not be called immediately upon every text change,
   * but only after the user has stopped typing for a certain period of time (the debounce interval).
   *
   * This function creates diagnostics for the changed document.
   *
   * NOTE: This function should not be used to maintain state, since it can be subject to delay due to debounce.
   *
   * TODOS:
   * Remember to handle errors and edge cases, such as
   * - what happens if a file is deleted while its content update is still debounced.
   */
  public async onDidChangeContent(change: TextDocumentChangeEvent<TextDocument>): Promise<void> {
    console.log('onDidChangeContent::', change.document.uri);
    if (!this.isInitialized) {
      console.log('onDidChangeContent:: not initialized yet');
      // Initialization is not complete. We could choose to delay processing,
      // queue the event to be processed later, or just do nothing.
      return;
    }
    const document = change.document;

    const settings = await this.settingsManger.getDocumentSettings(
      document.uri,
      this.hasConfigurationCapability,
      this.connection,
    );
    // We could use retrieved settings here to change the way we parse the document

    this.stateManager.updateFile(document);
    const workspaceDiagnostics = this.analyzer.analyze();
    // console.log({
    //   workspaceDiagnostics,
    // });
    for (const [uri, diagnostics] of workspaceDiagnostics) {
      // console.log('publishing diagnostics::', { uri, diagnostics });
      this.lspClient.publishDiagnostics({ uri, diagnostics });
    }
  }

  /**
   * When a new file is created and opened in the client, the client should send a didOpen event to the server with the document's content.
   * However, this relies on the client opening the newly created file. If the file is created but not opened, you won't receive a didOpen event.
   */
  // public async onDidOpen(change: TextDocumentChangeEvent<TextDocument>): Promise<void> {
  //   this.createDiagnostics(change.document);
  // }

  public onInitialize(params: InitializeParams): InitializeResult {
    this.workspaceFolders = params.workspaceFolders ?? [];
    console.log('workspaceFolders::', this.workspaceFolders);

    const capabilities = params.capabilities;
    this.hasConfigurationCapability = !!(
      capabilities.workspace && !!capabilities.workspace.configuration
    );
    this.hasWorkspaceFolderCapability = !!!!capabilities.workspace?.workspaceFolders;
    this.hasDiagnosticRelatedInformationCapability =
      !!capabilities.textDocument?.publishDiagnostics?.relatedInformation;

    const result: InitializeResult = {
      capabilities: {
        textDocumentSync: TextDocumentSyncKind.Incremental,
        // Tell the client that this server supports code completion.
        completionProvider: {
          resolveProvider: true,
          triggerCharacters: ['.'],
        },
        hoverProvider: true,
      },
    };
    if (this.hasWorkspaceFolderCapability) {
      result.capabilities.workspace = {
        workspaceFolders: {
          supported: true,
        },
      };
    }

    return result;
  }

  public async onInitialized() {
    if (this.hasConfigurationCapability) {
      // Register for all configuration changes.
      this.connection.client.register(DidChangeConfigurationNotification.type, undefined);
    }
    await this.validateWorkspace(this.workspaceFolders);

    if (this.hasWorkspaceFolderCapability) {
      this.connection.workspace.onDidChangeWorkspaceFolders((_event) => {
        this.connection.console.log('Workspace folder change event received.');
      });
    }
    this.isInitialized = true;
  }

  public onDidClose(e: TextDocumentChangeEvent<TextDocument>) {
    console.log('onDidClose::', e.document.uri);
    this.settingsManger.clear(e);
  }

  public completion = CompletionItemProvider.onCompletion;
  public completionResolve = CompletionItemProvider.onCompletionResolve;

  public onDidChangeWatchedFiles(params: DidChangeWatchedFilesParams) {
    return handleChangeOnWatchedFiles(
      this.connection,
      this.stateManager,
      this.analyzer,
      this.lspClient,
      params,
    );
  }

  public onHover(params: HoverParams): Hover {
    return handleHover(this.stateManager, this.analyzer, params);
  }

  private async validateWorkspace(workspaceFolders: WorkspaceFolder[]): Promise<void> {
    for (const workspaceFolder of workspaceFolders) {
      // const workspaceRoot = path.resolve(workspaceFolder.uri.replace('file://', ''));
      const workspaceRoot = fileURLToPath(workspaceFolder.uri);

      // For now we only handle 1 setup.bl file, consequently only 1 bl project
      // Perhaps we would isolate each project, having its own analyzer

      const setupFilePath: string | null = this.findSetupFilePath(workspaceRoot);
      if (setupFilePath === null) {
        // Inform the user that no setup.bl file was found
        this.lspClient.showWarningMessage('No setup.bl file found');
        // Even if the setup is not found, we still want to analyze the files and register them
      }
      console.log('setupFilePath::', setupFilePath);
      this.stateManager.setSetupFile(setupFilePath);
      this.registerBitloopsFiles(workspaceRoot);
      console.log('Validating workspace');

      const workspaceDiagnostics = this.analyzer.analyze();
      for (const [uri, diagnostics] of workspaceDiagnostics) {
        this.lspClient.publishDiagnostics({ uri, diagnostics });
      }
    }
  }
  private findSetupFilePath(workspaceRoot: string): string | null {
    const files = fs.readdirSync(workspaceRoot);
    let foundSetupFilePath = null;
    for (const file of files) {
      const fileUri = path.join(workspaceRoot, file);
      const stat = fs.lstatSync(fileUri);
      if (stat.isDirectory()) {
        foundSetupFilePath ||= this.findSetupFilePath(fileUri);
      } else if (fileUri.endsWith('setup.bl')) {
        return FileUtils.pathToDocumentUri(fileUri);
      }
    }
    return foundSetupFilePath;
  }

  private registerBitloopsFiles(startPath: string): void {
    const files = fs.readdirSync(startPath);
    for (var i = 0; i < files.length; i++) {
      const fileUri = path.join(startPath, files[i]);
      const stat = fs.lstatSync(fileUri);
      if (stat.isDirectory()) {
        this.registerBitloopsFiles(fileUri);
      } else if (fileUri.endsWith('.bl')) {
        // console.log('validating fileName::', fileUri);
        const textDocument = TextDocument.create(
          FileUtils.pathToDocumentUri(fileUri),
          'bitloops',
          1,
          fs.readFileSync(fileUri, 'utf8'),
        );
        this.stateManager.addNewFile(textDocument);
      }
    }
  }
}
