import { TFileDiagnostics } from '../../services/StateManager.js';

export interface IAnalyzer {
  /**
   * It analyzes the document and returns a list of diagnostics.
   */
  analyze(): TFileDiagnostics;
}
