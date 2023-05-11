import { Diagnostic } from 'vscode-languageserver';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { TFileId } from '../../../types.js';

export interface IAnalyzer {
  /**
   * It analyzes the document and returns a list of diagnostics.
   */
  analyze(document: TextDocument): Record<string, Diagnostic[]>;
  setSetupFile(fileUri: TFileId): void;
  removeFile(fileUri: TFileId): void;
}
