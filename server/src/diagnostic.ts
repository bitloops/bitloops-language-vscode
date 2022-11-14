import { Diagnostic, DiagnosticSeverity, Range, TextDocument } from 'vscode-languageserver/node.js';

export enum LogLevel {
  Error = 1,
  Warn = 2,
  Info = 3,
  Log = 4,
}

export class DiagnosticFactory {
  public static create(
    severity: LogLevel,
    range: Range,
    message: string,
    addRelatedInformation?: string[],
  ): Diagnostic {
    message = this.prefixMessage(message, severity);
    const diagnostic: Diagnostic = {
      severity,
      range,
      message,
      source: 'bl',
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
  public static prefixMessage(message: string, severity: LogLevel) {
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
