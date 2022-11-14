import { Diagnostic } from 'vscode-languageserver';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { DiagnosticFactory } from './diagnostic.js';
import { EErrors } from './types/Errors.js';
import { components } from './types/keywords.js';
import { getMatchRange } from './utils/regex.js';

export interface IAnalyzer {
  /**
   * It analyzes the document and returns a list of diagnostics.
   */
  analyze(document: TextDocument): Diagnostic[];
}

let problems = 0;

export class RegexAnalyzer implements IAnalyzer {
  public analyze(textDocument: TextDocument): Diagnostic[] {
    let diagnostics: Diagnostic[] = [];
    diagnostics = diagnostics.concat(this.validateComponents(textDocument));
    // connection.console.log(`[validate] ${textDocument.uri} has ${diagnostics.length} for ${text}`);
    problems = diagnostics.length;
    return diagnostics;
  }

  private validateComponents = (document: TextDocument): Diagnostic[] => {
    const diagnostics = [...this.validateIdentifier(document)];
    return diagnostics;
  };
  private validateIdentifier = (document: TextDocument): Diagnostic[] => {
    const componentUnion = Object.values(components).join('|');
    const pattern = new RegExp(`(${componentUnion})(?!\\s*\\w)`);
    const match = pattern.exec(document.getText());
    if (match) {
      const useCaseSyntacError = DiagnosticFactory.create(
        1,
        getMatchRange(document, match),
        EErrors.NoIdentifier,
      );
      // console.log(useCaseSyntacError);
      return [useCaseSyntacError];
    }
    return [];
  };
}
