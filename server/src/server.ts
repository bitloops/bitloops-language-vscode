/* --------------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * ------------------------------------------------------------------------------------------ */
import { createConnection, TextDocuments, ProposedFeatures, Connection } from 'vscode-languageserver/node.js';

import { TextDocument } from 'vscode-languageserver-textdocument';
import { BitloopsCompletionItemProvider } from './completion.js';
import { getDocumentSettings, onDidClose } from './setings.js';
import { lint } from './linter.js';
// Create a connection for the server, using Node's IPC as a transport.
// Also include all preview / proposed LSP features.
const connection = createConnection(ProposedFeatures.all);

export class BitloopsServer {
  protected documents: TextDocuments<TextDocument>;
  constructor(
    protected connection: Connection,
    protected hasConfigurationCapability: boolean,
    protected hasWorkspaceFolderCapability: boolean,
    protected hasDiagnosticRelatedInformationCapability: boolean
  ) {
    this.documents = new TextDocuments(TextDocument);
  }

  public register() {
    this.documents.onDidClose(onDidClose);
    this.documents.onDidChangeContent((change) => {
      lint(
        change.document,
        this.hasConfigurationCapability,
        this.hasDiagnosticRelatedInformationCapability,
        this.connection
      );
    });

    this.connection.onDidChangeWatchedFiles(this.onDidChangedWatchedFiles);
    this.connection.onCompletion(BitloopsCompletionItemProvider.onCompletion);
    this.connection.onCompletionResolve(BitloopsCompletionItemProvider.onCompletionResolve);
    // Listen on the connection
    this.connection.listen();
    this.documents.listen(this.connection);
  }

  // connection.onDidChangeConfiguration((change) => {
  //   if (hasConfigurationCapability) {
  //     // Reset all cached document settings
  //     documentSettings.clear();
  //   } else {
  //     globalSettings = <ExampleSettings>(change.settings.BitloopsServer || defaultSettings);
  //   }

  //   // Revalidate all open text documents
  //   documents.all().forEach(validateTextDocument);
  // });

  private onDidChangedWatchedFiles(_change: any) {
    // Monitored files have change in VSCode
    connection.console.log('We received an file change event');
  }

  // This handler provides the initial list of the completion items.
  // connection.onCompletion((_textDocumentPosition: TextDocumentPositionParams): CompletionItem[] => {
  //   // The pass parameter contains the position of the text document in
  //   // which code complete got requested. For the example we ignore this
  //   // info and always provide the same completion items.
  //   const keywords: CompletionItem[] = keywordSymbols.map((keyword: string, i: number) => {
  //     return { label: keyword, kind: CompletionItemKind.Keyword, data: i };
  //   });
  //   return keywords;
  // });

  // This handler resolves additional information for the item selected in
  // the completion list.
  // connection.onCompletionResolve((item: CompletionItem): CompletionItem => {
  //   if (item.data === 1) {
  //     item.detail = 'TypeScript details';
  //     item.documentation = 'TypeScript documentation';
  //   } else if (item.data === 2) {
  //     item.detail = 'JavaScript details';
  //     item.documentation = 'JavaScript documentation';
  //   }
  //   return item;
  // });

  // Make the text document manager listen on the connection
  // for open, change and close text document events
}
