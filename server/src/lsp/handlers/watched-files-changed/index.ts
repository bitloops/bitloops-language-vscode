import { DidChangeWatchedFilesParams, FileChangeType, _Connection } from 'vscode-languageserver';
import { IAnalyzer } from '../document-text-changed-handler/analyzer.js';
import { ILspClient } from '../../client.js';

export const handleChangeOnWatchedFiles = (
  connection: _Connection,
  analyzer: IAnalyzer,
  lspClient: ILspClient,
  _change: DidChangeWatchedFilesParams,
) => {
  // Monitored files have change in VSCode
  connection.console.log('We received an file change event');
  for (let i = 0; i < _change.changes.length; i++) {
    const change = _change.changes[i];
    switch (change.type) {
      case FileChangeType.Created:
        console.log('File created: ' + change.uri);
        break;
      case FileChangeType.Deleted: {
        const fileUri = change.uri;
        analyzer.removeFile(fileUri);
        console.log('File deleted: ' + fileUri);
        lspClient.emptyFileDiagnostics(fileUri);
        break;
      }
      case FileChangeType.Changed:
        console.log('File changed: ' + change.uri);
        break;
      default:
        // do nothing
        break;
    }
  }
};
