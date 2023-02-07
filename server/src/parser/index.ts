import {
  OriginalParserError,
  TParserInputData,
  isParserErrors,
  isIntermediateASTValidationErrors,
  IntermediateAST,
  transpiler,
  OriginalValidatorError,
} from '@bitloops/bl-transpiler';
import { Diagnostic } from 'vscode-languageserver/node.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer } from '../analyzer.js';
import { DiagnosticFactory } from '../diagnostic.js';

export class BitloopsAnalyzer implements IAnalyzer {
  static diagnostics: Diagnostic[] = [];
  analyze(document: TextDocument): Diagnostic[] {
    try {
      const transpileInputData = this.documentToParserInputData(document);
      const intermediateModel = transpiler.bitloopsCodeToIntermediateModel(transpileInputData);
      if (isParserErrors(intermediateModel)) {
        const diagnostics = this.mapParserErrorsToLSPDiagnostics(intermediateModel, document);
        return diagnostics;
      }
      const validatedIntermediateModel = transpiler.validateIntermediateModel(
        intermediateModel as IntermediateAST,
      );
      if (isIntermediateASTValidationErrors(validatedIntermediateModel)) {
        const diagnostics = this.mapValidatorErrorsToLSPDiagnostics(
          validatedIntermediateModel,
          document,
        );
        return diagnostics;
      }
      return [];
    } catch (e) {
      console.log('error', e);
      return [];
    }
  }

  // private documentToParserInputData(document: TextDocument): TParserInputData {
  //   const res: Partial<TParserInputData> = {};
  //   const setup = [];
  //   const core = [];

  //   if (document.uri.endsWith('setup.bl'))
  //     setup.push({
  //       fileId: document.uri.split('/').slice(-1)[0],
  //       fileContents: document.getText(),
  //     });
  //   // Handle possibly unknown bounded context and module
  //   const boundedContext = document.uri.split('/')?.slice(-3)?.[0] ?? 'unknown';
  //   const module = document.uri.split('/')?.slice(-2)?.[0] ?? 'unknown';
  //   core.push({
  //     boundedContext,
  //     module,
  //     fileId: document.uri.split('/').slice(-1)[0],
  //     fileContents: document.getText(),
  //   });
  //   res.setup = setup;
  //   res.core = core;
  //   return res as TParserInputData;
  // }

  private documentToParserInputData(document: TextDocument): TParserInputData {
    const res: Partial<TParserInputData> = {};
    const setup = [];
    const core = [];

    if (document.uri.endsWith('setup.bl'))
      setup.push({
        fileId: document.uri.split('/').slice(-1)[0],
        fileContents: document.getText(),
      });
    // Handle possibly unknown bounded context and module
    const boundedContext = document.uri.split('/')?.slice(-3)?.[0] ?? 'unknown';
    const module = document.uri.split('/')?.slice(-2)?.[0] ?? 'unknown';
    core.push({
      boundedContext,
      module,
      fileId: document.uri.split('/').slice(-1)[0],
      fileContents: document.getText(),
    });
    res.setup = setup;
    res.core = core;
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
        `line: ${e.line}:${e.column}, offendingSymbol: ${e.offendingToken.text}, msg: ${e.message}`,
      ),
    );
  }

  mapValidatorErrorsToLSPDiagnostics(
    validatorErrors: OriginalValidatorError,
    document: TextDocument,
  ): Diagnostic[] {
    return validatorErrors.map((e) =>
      DiagnosticFactory.create(
        1,
        {
          start: {
            line: e.metadata.start.line - 1,
            character: e.metadata.start.column - 1,
          },
          end: {
            line: e.metadata.end.line - 1,
            character: e.metadata.end.column - 1,
          },
        },
        `line: ${e.metadata.start.line}:${e.metadata.start.column} , msg: ${e.message}`,
      ),
    );
  }
}
