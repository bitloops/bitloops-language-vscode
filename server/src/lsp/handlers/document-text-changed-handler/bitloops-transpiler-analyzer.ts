import {
  isParserErrors,
  isIntermediateASTValidationErrors,
  transpiler,
  TranspilerErrors,
  Transpiler,
  ValidationErrors,
  ParserSyntacticErrors,
  TSymbolTableSemantics,
} from '@bitloops/bl-transpiler';
import { Diagnostic } from 'vscode-languageserver/node.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer } from './interface.js';
import { DiagnosticFactory, LogLevel } from '../../../utils/diagnostic.js';
import { TFileId } from '../../../types.js';
import { StateManager, TFileDiagnostics } from '../../services/StateManager.js';

export class BitloopsAnalyzer implements IAnalyzer {
  symbolTable: TSymbolTableSemantics | null;
  constructor(private stateManager: StateManager) {}

  analyze(): TFileDiagnostics {
    try {
      this.stateManager.clearPreviousDiagnostics();
      if (this.stateManager.getSetupFile() === null) {
        return this.stateManager.handleMissingSetupFile();
      }
      const transpilerInput = this.stateManager.fileBuffersToParserInput();
      if (!this.stateManager.projectStructureIsCorrect(transpilerInput)) {
        return this.stateManager.getDiagnostics();
      }

      console.log(`Analyzing...[${transpilerInput.core.length}] files`);
      // console.log(
      //   'Info:',
      //   transpilerInput.core.map((x) => ({ bc: x.boundedContext, mod: x.module })),
      // );
      this.symbolTable = transpiler.getSymbolTable(transpilerInput) as TSymbolTableSemantics;

      const intermediateModelOrErrors = transpiler.bitloopsCodeToIntermediateModel(transpilerInput);
      if (Transpiler.isTranspilerError(intermediateModelOrErrors)) {
        this.mapTranspilerErrorsToLSPDiagnostics(intermediateModelOrErrors);
        return this.stateManager.getDiagnostics();
      }

      console.log('Workspace analysis completed without errors');
      return this.stateManager.getDiagnostics();
    } catch (e) {
      console.error('Unexpected error:', e);
      return new Map();
    }
  }

  private mapTranspilerErrorsToLSPDiagnostics(transpilerErrors: TranspilerErrors): void {
    if (isParserErrors(transpilerErrors)) {
      this.symbolTable = null; //symbolTable is not available if there are parser errors
      this.mapParserErrorsToLSPDiagnostics(transpilerErrors);
      return;
    }
    if (isIntermediateASTValidationErrors(transpilerErrors)) {
      this.mapValidatorErrorsToLSPDiagnostics(transpilerErrors);
      return;
    }
    throw new Error('Unknown error type');
  }

  private mapParserErrorsToLSPDiagnostics(parserErrors: ParserSyntacticErrors): void {
    // console.log('Mapping parser errors to LSP diagnostics');
    console.log(`Found ${parserErrors.length} parser syntactic errors`);
    // for (const parserError of parserErrors) {
    //   this.stateManager.getDiagnostics()[parserError.fileId] = [];
    // }
    // Clear previous diagnostics
    this.stateManager.clearPreviousDiagnostics();
    // TODO this can be optimized by not creating a new text document for each error, but rather
    // keeping a local cache of text documents
    const fileIdsToTextDocuments: Record<TFileId, TextDocument> = {};
    for (const parserError of parserErrors) {
      const fileUri = parserError.fileId;
      let textDocument = fileIdsToTextDocuments[fileUri];
      if (!textDocument) {
        const fileContent = this.stateManager.getFileContent(fileUri);
        if (!fileContent) {
          throw new Error(`File content not found for fileUri ${fileUri}`);
        }
        textDocument = TextDocument.create(fileUri, 'bitloops', 1, fileContent);
      }
      const diagnosticRange = {
        start: textDocument.positionAt(parserError.start),
        end: textDocument.positionAt(parserError.stop),
      };
      // console.log({
      //   message: parserError.message,
      //   diagnosticRange,
      //   fileUri,
      // });
      this.stateManager.addDiagnostics(fileUri, [
        DiagnosticFactory.create(
          LogLevel.Error,
          diagnosticRange,
          `${parserError.message}\noffendingSymbol: ${parserError.offendingToken.text}\nline: ${parserError.line}:${parserError.column}`,
          fileUri,
        ),
      ]);
    }
  }

  private mapValidatorErrorsToLSPDiagnostics(validatorErrors: ValidationErrors): void {
    // console.log('Mapping validator errors to LSP diagnostics');
    console.log(`Found ${validatorErrors.length} semantic validation errors`);
    this.stateManager.clearPreviousDiagnostics();
    for (const e of validatorErrors) {
      const rangeZeroBased = {
        start: {
          line: e.metadata.start.line - 1,
          character: e.metadata.start.column - 1,
        },
        end: {
          line: e.metadata.end.line - 1,
          character: e.metadata.end.column - 1,
        },
      };
      this.stateManager.addDiagnostics(e.metadata.fileId, [
        DiagnosticFactory.create(
          LogLevel.Error,
          rangeZeroBased,
          `${e.message}\nLine: ${e.metadata.start.line}:${e.metadata.start.column}`,
          e.metadata.fileId,
        ),
      ]);
    }
  }
  public getSymbolTable(): TSymbolTableSemantics | null {
    if (!this.symbolTable) {
      return null;
    }
    return this.symbolTable;
  }
}
