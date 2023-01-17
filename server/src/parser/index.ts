import {
  OriginalParserError,
  TParserInputData,
  isParserErrors,
  transpiler,
} from '@bitloops/bl-transpiler';
import { Diagnostic } from 'vscode-languageserver/node.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer } from '../analyzer.js';
import { DiagnosticFactory } from '../diagnostic.js';

export class BitloopsAnalyzer implements IAnalyzer {
  static diagnostics: Diagnostic[] = [];
  analyze(document: TextDocument): Diagnostic[] {
    try {
      const transpileInputData = this.toParserInputData(document);
      const intermediateModel = transpiler.bitloopsCodeToIntermediateModel(transpileInputData);
      if (isParserErrors(intermediateModel)) {
        const diagnostics = this.mapParserErrorsToLSPDiagnostics(intermediateModel, document);
        return diagnostics;
      }
      return [];
    } catch (e) {
      console.log('error', e);
      return [];
    }
  }

  private toParserInputData(document: TextDocument): TParserInputData {
    const res: Partial<TParserInputData> = {};

    if (document.uri.endsWith('setup.bl')) {
      res.setup = [
        {
          fileId: document.uri.split('/').slice(-1)[0],
          fileContents: document.getText(),
        },
      ];
      return res as TParserInputData;
    }
    // Handle possibly unknown bounded context and module
    const boundedContext = document.uri.split('/')?.slice(-3)?.[0] ?? 'unknown';
    const module = document.uri.split('/')?.slice(-2)?.[0] ?? 'unknown';
    res.core = [
      {
        boundedContext,
        module,
        fileId: document.uri.split('/').slice(-1)[0],
        fileContents: document.getText(),
      },
    ];
    return res as TParserInputData;
  }

  mapParserErrorsToLSPDiagnostics(
    parserErrors: OriginalParserError,
    document: TextDocument,
  ): Diagnostic[] {
    return parserErrors.map((e) =>
      DiagnosticFactory.create(
        1,
        {
          start: document.positionAt(e.start),
          end: document.positionAt(e.stop),
        },
        `line: ${e.line}:${e.column}, offendingSymbol : ${e.offendingToken.text}, msg: ${e.message}`,
      ),
    );
  }
}
