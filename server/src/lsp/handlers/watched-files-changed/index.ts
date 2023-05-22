import { DidChangeWatchedFilesParams, FileChangeType, _Connection } from 'vscode-languageserver';
import fs from 'fs/promises';
import { fileURLToPath } from 'url';
import { IAnalyzer } from '../document-text-changed-handler/interface.js';
import { ILspClient } from '../../client.js';
import { resolve } from 'path';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { StateManager } from '../../services/StateManager.js';

export const handleChangeOnWatchedFiles = async (
  connection: _Connection,
  stateManger: StateManager,
  analyzer: IAnalyzer,
  lspClient: ILspClient,
  _change: DidChangeWatchedFilesParams,
) => {
  // Monitored files have change in VSCode
  // connection.console.log('We received a file change event');
  for (let i = 0; i < _change.changes.length; i++) {
    const event = _change.changes[i];
    switch (event.type) {
      // Created: This event is fired when a new file is created in the workspace.
      case FileChangeType.Created:
        console.log('File created: ' + event.uri);
        // Resolve to ensure it's an absolute path
        const filePath = resolve(fileURLToPath(event.uri));

        const fileContent = await fs.readFile(filePath, 'utf-8');
        const textDocument = TextDocument.create(event.uri, 'bitloops', 1, fileContent);

        stateManger.addNewFile(textDocument);
        const workspaceDiagnostics = analyzer.analyze();
        for (const [uri, diagnostics] of workspaceDiagnostics) {
          lspClient.publishDiagnostics({ uri, diagnostics });
        }
        break;
      // Deleted: This event is fired when a file is deleted from the workspace.
      case FileChangeType.Deleted: {
        const fileUri = event.uri;
        stateManger.removeFile(fileUri);
        console.log('File deleted: ' + fileUri);
        lspClient.emptyFileDiagnostics(fileUri);

        // Call the analyzer to check all files
        const workspaceDiagnostics = analyzer.analyze();
        for (const [uri, diagnostics] of workspaceDiagnostics) {
          lspClient.publishDiagnostics({ uri, diagnostics });
        }
        break;
      }
      // Changed: This event is fired when an existing file's metadata (like permissions or timestamps) is changed. Note that it doesn't represent the change in the content of a file, that's handled by onDidChangeContent.
      case FileChangeType.Changed:
        console.log('File changed: ' + event.uri);
        break;
      default:
        // do nothing
        break;
    }
  }
};
