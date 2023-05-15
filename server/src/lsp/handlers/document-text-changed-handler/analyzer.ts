import { Diagnostic } from 'vscode-languageserver';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { TFileId } from '../../../types.js';
import { TFileDiagnostics } from './bitloops-transpiler-analyzer.js';

export interface IAnalyzer {
  /**
   * It analyzes the document and returns a list of diagnostics.
   */
  analyze(document: TextDocument): TFileDiagnostics;
  analyzeAll(): TFileDiagnostics;
  setSetupFile(fileUri: TFileId): void;
  addNewFile(document: TextDocument): void;
  removeFile(fileUri: TFileId): void;
}
