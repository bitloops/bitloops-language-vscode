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
import { TParserCoreInputData, TParserSetupInputData } from '../types.js';

export class BitloopsAnalyzer implements IAnalyzer {
  private diagnostics: Record<string, Diagnostic[]> = {};
  private res: Partial<TParserInputData> = {};
  private setup: Record<string, TParserSetupInputData> = {};
  private core: Record<string, TParserCoreInputData> = {};
  analyze(document: TextDocument): Record<string, Diagnostic[]> {
    try {
      const transpileInputData = this.documentToParserInputData(document);
      const intermediateModel = transpiler.bitloopsCodeToIntermediateModel(transpileInputData);
      if (isParserErrors(intermediateModel)) {
        this.mapParserErrorsToLSPDiagnostics(intermediateModel, document);
        return this.diagnostics;
      }
      const validatedIntermediateModel = transpiler.validateIntermediateModel(
        intermediateModel as IntermediateAST,
      );
      if (isIntermediateASTValidationErrors(validatedIntermediateModel)) {
        this.mapValidatorErrorsToLSPDiagnostics(validatedIntermediateModel, document);
        return this.diagnostics;
      }
      return this.diagnostics;
    } catch (e) {
      console.log('error', e);
      return {};
    }
  }

  private documentToParserInputData(document: TextDocument): TParserInputData {
    //giving file id as uri for now
    if (!(document.uri in this.diagnostics)) this.diagnostics[document.uri] = [];
    if (document.uri.endsWith('setup.bl'))
      this.setup[document.uri] = [
        {
          // fileId: document.uri.split('/').slice(-1)[0],
          fileId: document.uri,
          fileContents: document.getText(),
        },
      ];
    // Handle possibly unknown bounded context and module
    else if (document.uri.endsWith('.bl')) {
      const boundedContext = document.uri.split('/')?.slice(-3)?.[0] ?? 'unknown';
      const module = document.uri.split('/')?.slice(-2)?.[0] ?? 'unknown';
      this.core[document.uri] = [
        {
          boundedContext,
          module,
          // fileId: document.uri.split('/').slice(-1)[0],
          fileId: document.uri,
          fileContents: document.getText(),
        },
      ];
    }
    this.res.core = [];
    this.res.setup = [];
    for (const core of Object.values(this.core)) {
      this.res.core.push(...core);
    }
    for (const setup of Object.values(this.setup)) {
      this.res.setup.push(...setup);
    }
    for (const key in this.diagnostics) {
      this.diagnostics[key] = [];
    }
    return this.res as TParserInputData;
  }
  mapParserErrorsToLSPDiagnostics(parserErrors: OriginalParserError, document: TextDocument): void {
    parserErrors.forEach((e) => {
      this.diagnostics[e.fileId] = [];
    });
    for (const key in this.diagnostics) {
      this.diagnostics[key] = [];
    }
    parserErrors.map((e) =>
      this.diagnostics[e.fileId].push(
        DiagnosticFactory.create(
          1,
          {
            start: document.positionAt(e.start),
            end: document.positionAt(e.stop),
          },
          `line: ${e.line}:${e.column}, offendingSymbol: ${e.offendingToken.text}, msg: ${e.message}`,
          e.fileId,
        ),
      ),
    );
  }

  mapValidatorErrorsToLSPDiagnostics(
    validatorErrors: OriginalValidatorError,
    document: TextDocument,
  ): void {
    validatorErrors.forEach((e) => {
      this.diagnostics[e.metadata.fileId] = [];
    });
    for (const key in this.diagnostics) {
      this.diagnostics[key] = [];
    }
    validatorErrors.map((e) => {
      this.diagnostics[e.metadata.fileId].push(
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
          e.metadata.fileId,
        ),
      );
    });
  }
}
