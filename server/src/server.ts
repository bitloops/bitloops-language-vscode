import {
  TextDocuments,
  TextDocumentChangeEvent,
  _Connection,
  InitializeParams,
  InitializeResult,
  TextDocumentSyncKind,
  DidChangeConfigurationNotification,
} from 'vscode-languageserver/node.js';

import { TextDocument } from 'vscode-languageserver-textdocument';
import { CompletionItemProvider } from './completion.js';
import { WorkspaceSettingsManager } from './settings.js';
import { IAnalyzer } from './analyzer.js';
import { ILspClient } from './lsp-client.js';
import { BitloopsAnalyzer } from './parser/index.js';
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

  constructor(lspClient: ILspClient, connection: _Connection) {
    // Create a simple text document manager.
    this.connection = connection;
    this.lspClient = lspClient;
    this.settingsManger = new WorkspaceSettingsManager();
    this.analyzer = new BitloopsAnalyzer();
  }

  public async onDidChangeContent(change: TextDocumentChangeEvent<TextDocument>): Promise<void> {
    const settings = await this.settingsManger.getDocumentSettings(
      change.document.uri,
      this.hasConfigurationCapability,
      this.connection,
    );
    // We could use retrieved settings here to change the way we parse the document

    const diagnostics = this.analyzer.analyze(change.document);
    this.lspClient.publishDiagnostics({ uri: change.document.uri, diagnostics });
  }

  public onInitialize(params: InitializeParams): InitializeResult {
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
    if (this.hasWorkspaceFolderCapability) {
      this.connection.workspace.onDidChangeWorkspaceFolders((_event) => {
        this.connection.console.log('Workspace folder change event received.');
      });
    }
  }

  public onDidClose(e: TextDocumentChangeEvent<TextDocument>) {
    this.settingsManger.clear(e);
  }

  public completion = CompletionItemProvider.onCompletion;
  public completionResolve = CompletionItemProvider.onCompletionResolve;
}
