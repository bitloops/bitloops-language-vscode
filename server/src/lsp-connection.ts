import {
  createConnection,
  TextDocuments,
  ProposedFeatures,
  _Connection,
} from 'vscode-languageserver/node.js';

import { TextDocument } from 'vscode-languageserver-textdocument';
import { LspClientImpl } from './lsp-client.js';
import { BitloopsServer } from './server.js';

export class LspConnection {
  private connection: _Connection;
  private server: BitloopsServer;

  protected documents: TextDocuments<TextDocument>;
  constructor() {
    this.documents = new TextDocuments(TextDocument);
    this.connection = createConnection(ProposedFeatures.all);
    const lspClient = new LspClientImpl(this.connection);

    this.server = new BitloopsServer(lspClient, this.connection);
  }

  public registerLspEvents() {
    const server = this.server;
    this.connection.onInitialize(server.onInitialize.bind(server));
    this.connection.onInitialized(server.onInitialized.bind(server));

    this.documents.onDidClose(server.onDidClose.bind(server));
    this.documents.onDidChangeContent(server.onDidChangeContent.bind(server));
    this.connection.onCompletion(server.completion.bind(server, this.documents));
    this.connection.onCompletionResolve(server.completionResolve.bind(server));
    return this;
  }

  // Listen on the connection
  public listen() {
    // Make the text document manager listen on the connection
    // for open, change and close text document events
    this.documents.listen(this.connection);
    // Listen on the connection
    this.connection.listen();
  }
}
