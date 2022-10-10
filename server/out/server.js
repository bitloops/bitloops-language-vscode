"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BitloopsServer = void 0;
/* --------------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * ------------------------------------------------------------------------------------------ */
const node_1 = require("vscode-languageserver/node");
const vscode_languageserver_textdocument_1 = require("vscode-languageserver-textdocument");
const completion_1 = require("./completion");
const setings_1 = require("./setings");
const linter_1 = require("./linter");
// Create a connection for the server, using Node's IPC as a transport.
// Also include all preview / proposed LSP features.
const connection = (0, node_1.createConnection)(node_1.ProposedFeatures.all);
class BitloopsServer {
    constructor(connection, hasConfigurationCapability, hasWorkspaceFolderCapability, hasDiagnosticRelatedInformationCapability) {
        this.connection = connection;
        this.documents = new node_1.TextDocuments(vscode_languageserver_textdocument_1.TextDocument);
        this.hasConfigurationCapability = hasConfigurationCapability;
        this.hasWorkspaceFolderCapability = hasWorkspaceFolderCapability;
        this.hasDiagnosticRelatedInformationCapability = hasDiagnosticRelatedInformationCapability;
        this.register();
    }
    register() {
        this.documents.onDidClose(setings_1.onDidClose);
        this.documents.onDidChangeContent((change) => {
            (0, linter_1.lint)(change.document, this.hasConfigurationCapability, this.hasDiagnosticRelatedInformationCapability, this.connection);
        });
        this.connection.onDidChangeWatchedFiles(this.onDidChangedWatchedFiles);
        this.connection.onCompletion(completion_1.BitloopsCompletionItemProvider.onCompletion);
        this.connection.onCompletionResolve(completion_1.BitloopsCompletionItemProvider.onCompletionResolve);
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
    onDidChangedWatchedFiles(_change) {
        // Monitored files have change in VSCode
        connection.console.log('We received an file change event');
    }
}
exports.BitloopsServer = BitloopsServer;
//# sourceMappingURL=server.js.map