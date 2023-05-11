import * as lsp from 'vscode-languageserver';

export interface ILspClient {
  publishDiagnostics(args: lsp.PublishDiagnosticsParams): void;
  emptyFileDiagnostics(fileUri: string): void;
}

export class LspClientImpl implements ILspClient {
  constructor(protected connection: lsp.Connection) {}

  publishDiagnostics(params: lsp.PublishDiagnosticsParams): void {
    this.connection.sendDiagnostics(params);
  }

  emptyFileDiagnostics(fileUri: string): void {
    this.connection.sendDiagnostics({ uri: fileUri, diagnostics: [] });
  }
}
