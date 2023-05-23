import * as lsp from 'vscode-languageserver';

export interface ILspClient {
  publishDiagnostics(args: lsp.PublishDiagnosticsParams): void;
  emptyFileDiagnostics(fileUri: string): void;
  showLoadingProgress(message: string): void;
  hideLoadingProgress(): void;

  showErrorMessage(message: string): void;
  showWarningMessage(message: string): void;
}

export class LspClientImpl implements ILspClient {
  constructor(protected connection: lsp.Connection) {}
  showLoadingProgress(message: string): void {
    throw new Error('Method not implemented.');
  }
  hideLoadingProgress(): void {
    throw new Error('Method not implemented.');
  }

  publishDiagnostics(params: lsp.PublishDiagnosticsParams): void {
    this.connection.sendDiagnostics(params);
  }

  emptyFileDiagnostics(fileUri: string): void {
    this.connection.sendDiagnostics({ uri: fileUri, diagnostics: [] });
  }
  showErrorMessage(message: string): void {
    this.connection.window.showErrorMessage(message);
  }

  showWarningMessage(message: string): void {
    this.connection.window.showWarningMessage(message);
  }
}
