import { Diagnostic, DiagnosticSeverity, Range, TextDocument } from 'vscode-languageserver/node';

export class DiagnosticFactory {
  public static create(
    severity: 1 | 2 | 3 | 4,
    range: Range,
    message: string,
    addRelatedInformation?: string[]
  ): Diagnostic {
    message = this.prefixMessage(message, severity);
    const diagnostic: Diagnostic = {
      severity: severity,
      range: range,
      message: message,
      source: 'ex',
    };
    if (addRelatedInformation) {
      diagnostic.relatedInformation = [];
      for (const related of addRelatedInformation) {
        diagnostic.relatedInformation.push({
          location: {
            // TODO? add TextDocument uri?
            uri: '',
            range: range,
          },
          message: related,
        });
      }
    }
    return diagnostic;
  }
  public static prefixMessage(message: string, severity: 1 | 2 | 3 | 4) {
    switch (severity) {
      case 1:
        return `Error: ${message}`;
      case 2:
        return `Warning: ${message}`;
      case 3:
        return `Information: ${message}`;
      case 4:
        return `Hint: ${message}`;
      default:
        return message;
    }
  }
}
