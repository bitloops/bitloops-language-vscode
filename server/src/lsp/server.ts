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
} from 'vscode-languageserver/node.js';

import { TextDocument } from 'vscode-languageserver-textdocument';
import { CompletionItemProvider } from './handlers/completion-handler/completion.js';
import { WorkspaceSettingsManager } from '../utils/settings.js';
import { IAnalyzer } from './handlers/document-text-changed-handler/analyzer.js';
import { ILspClient } from './client.js';
import { BitloopsAnalyzer } from './handlers/document-text-changed-handler/bitloops-transpiler-analyzer.js';
import * as fs from 'fs';
import * as path from 'path';
import { FileUtils } from '../utils/file.js';
import { handleChangeOnWatchedFiles } from './handlers/watched-files-changed/index.js';

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

  // Default Global Settings
  private hasConfigurationCapability = false;
  private hasWorkspaceFolderCapability = false;
  private hasDiagnosticRelatedInformationCapability = false;
  private workspaceFolders: WorkspaceFolder[] = [];

  constructor(lspClient: ILspClient, connection: _Connection) {
    // Create a simple text document manager.
    this.connection = connection;
    this.lspClient = lspClient;
    this.settingsManger = new WorkspaceSettingsManager();
    this.analyzer = new BitloopsAnalyzer();
  }

  public async onDidChangeContent(change: TextDocumentChangeEvent<TextDocument>): Promise<void> {
    console.log('onDidChangeContent::', change.document.uri);
    this.createDiagnostics(change.document);
  }

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

  public onInitialized() {
    if (this.hasConfigurationCapability) {
      // Register for all configuration changes.
      this.connection.client.register(DidChangeConfigurationNotification.type, undefined);
    }
    this.validateWorkspace(this.workspaceFolders);
    if (this.hasWorkspaceFolderCapability) {
      this.connection.workspace.onDidChangeWorkspaceFolders((_event) => {
        this.connection.console.log('Workspace folder change event received.');
      });
    }
  }

  public onDidClose(e: TextDocumentChangeEvent<TextDocument>) {
    console.log('onDidClose::', e.document.uri);
    this.settingsManger.clear(e);
    // const uri = e.document.uri;
    // this.analyzer.removeFile(uri);
  }

  public completion = CompletionItemProvider.onCompletion;
  public completionResolve = CompletionItemProvider.onCompletionResolve;

  public onDidChangeWatchedFiles(params: DidChangeWatchedFilesParams) {
    return handleChangeOnWatchedFiles(this.connection, this.analyzer, this.lspClient, params);
  }

  private async createDiagnostics(document: TextDocument): Promise<void> {
    const settings = await this.settingsManger.getDocumentSettings(
      document.uri,
      this.hasConfigurationCapability,
      this.connection,
    );
    // We could use retrieved settings here to change the way we parse the document

    const diagnostics = this.analyzer.analyze(document);
    for (const [uri, diagnostic] of Object.entries(diagnostics)) {
      this.lspClient.publishDiagnostics({ uri: uri, diagnostics: diagnostic });
    }
  }

  private async validateWorkspace(workspaceFolders: WorkspaceFolder[]) {
    for (const workspaceFolder of workspaceFolders) {
      const workspaceRoot = path.resolve(workspaceFolder.uri.replace('file://', ''));
      // For now we only handle 1 setup.bl file, consequently only 1 bl project
      // Perhaps we would isolate each project, having its own analyzer

      const setupFilePath = this.findSetupFilePath(workspaceRoot);
      if (setupFilePath === null) {
        throw new Error('No setup.bl file found');
      }
      console.log('setupFilePath::', setupFilePath);
      this.analyzer.setSetupFile(setupFilePath);
      await this.validateBitloopsFiles(workspaceRoot);
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

  private async validateBitloopsFiles(startPath: string): Promise<void> {
    const files = fs.readdirSync(startPath);
    for (var i = 0; i < files.length; i++) {
      const fileUri = path.join(startPath, files[i]);
      const stat = fs.lstatSync(fileUri);
      if (stat.isDirectory()) {
        this.validateBitloopsFiles(fileUri);
      } else if (fileUri.endsWith('.bl')) {
        // console.log('validating fileName::', fileUri);
        const textDocument = TextDocument.create(
          FileUtils.pathToDocumentUri(fileUri),
          'bitloops',
          1,
          fs.readFileSync(fileUri, 'utf8'),
        );
        await this.createDiagnostics(textDocument);
      }
    }
  }
}
