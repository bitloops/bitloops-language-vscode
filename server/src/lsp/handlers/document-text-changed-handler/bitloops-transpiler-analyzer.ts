import {
  TParserInputData,
  isParserErrors,
  isIntermediateASTValidationErrors,
  transpiler,
  TranspilerErrors,
  Transpiler,
  ValidationErrors,
  ParserSyntacticErrors,
} from '@bitloops/bl-transpiler';
import { Diagnostic } from 'vscode-languageserver/node.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer } from './analyzer.js';
import { DiagnosticFactory, LogLevel } from '../../../utils/diagnostic.js';
import { TFileId, TParserCoreInputData, TParserSetupInputData } from '../../../types.js';

export type TFileDiagnostics = Record<TFileId, Diagnostic[]>;

export class BitloopsAnalyzer implements IAnalyzer {
  private diagnostics: TFileDiagnostics = {};

  private setup: Record<string, TParserSetupInputData> = {};

  private core: Record<string, TParserCoreInputData> = {};

  private setupFileUri: string | null = null;

  analyze(document: TextDocument): TFileDiagnostics {
    this.addNewFile(document);
    return this.analyzeAll();
  }

  analyzeAll(): TFileDiagnostics {
    try {
      this.clearPreviousDiagnostics();
      if (this.setupFileUri === null) {
        return this.handleMissingSetupFile();
      }
      const transpilerInput = this.fileBuffersToParserInput();
      if (!this.projectStructureIsCorrect(transpilerInput)) {
        return this.diagnostics;
      }

      console.log(`Analyzing...[${transpilerInput.core.length}] files`);
      // console.log(
      //   'Info:',
      //   transpilerInput.core.map((x) => ({ bc: x.boundedContext, mod: x.module })),
      // );
      const intermediateModelOrErrors = transpiler.bitloopsCodeToIntermediateModel(transpilerInput);
      if (Transpiler.isTranspilerError(intermediateModelOrErrors)) {
        this.mapTranspilerErrorsToLSPDiagnostics(intermediateModelOrErrors);
        return this.diagnostics;
      }
      return this.diagnostics;
    } catch (e) {
      console.error('Unexpected error:', e);
      return {};
    }
  }

  setSetupFile(setupFileUri: string): void {
    this.setupFileUri = setupFileUri;
  }

  removeFile(fileUri: string): void {
    delete this.setup[fileUri];
    delete this.core[fileUri];
    // We need to make its diagnostics disappear
    this.diagnostics[fileUri] = [];
    // Consider which step would be appropriate to delete empty diagnostics
  }

  private handleMissingSetupFile(): TFileDiagnostics {
    const message = `Setup file not found. Please create a file named setup.bl at the root of your project`;
    for (const key in this.core) {
      this.diagnostics[key] = [
        DiagnosticFactory.create(
          LogLevel.Error,
          {
            start: { line: 0, character: 0 },
            end: { line: 0, character: 0 },
          },
          message,
        ),
      ];
    }
    return this.diagnostics;
  }

  private fileBuffersToParserInput(): TParserInputData {
    return {
      core: Object.values(this.core),
      setup: Object.values(this.setup),
    };
  }

  /**
   * Updates the file buffers
   */
  addNewFile(document: TextDocument) {
    const fileName = document.uri.split('/').slice(-1)[0];
    if (fileName === 'setup.bl') {
      this.setup[document.uri] = {
        fileId: document.uri,
        fileContents: document.getText(),
      };
      this.setupFileUri = document.uri;
    } else if (document.uri.endsWith('.bl')) {
      const { boundedContext, module } = this.extractFileBoundedContextAndModule(document.uri);
      // console.log(
      //   'Extracted boundedContext and module',
      //   { boundedContext, module },
      //   'for file::',
      //   fileName,
      // );
      this.core[document.uri] = {
        boundedContext,
        module,
        fileId: document.uri,
        fileContents: document.getText(),
      };
    }
  }

  private clearPreviousDiagnostics(): void {
    for (const key in this.diagnostics) {
      this.diagnostics[key] = [];
    }
  }

  private projectStructureIsCorrect(transpileInputData: TParserInputData): boolean {
    let result = true;
    for (const a of transpileInputData.core) {
      if (a.boundedContext === 'unknown' || a.module === 'unknown') {
        let message = `File is not in a valid location`;
        if (a.boundedContext === 'unknown' && a.module === 'unknown') {
          message += ` (bounded context and module are unknown)`;
        } else if (a.boundedContext === 'unknown') {
          message += ` (bounded context is unknown)`;
        } else if (a.module === 'unknown') {
          message += ` (module is unknown)`;
        }
        this.diagnostics[a.fileId] = [
          DiagnosticFactory.create(
            LogLevel.Error,
            {
              start: { line: 0, character: 0 },
              end: { line: 0, character: 0 },
            },
            message,
          ),
        ];
        console.log('Adding diagnostic for fileName', a.fileId);
        result = false;
      }
    }
    return result;
  }

  /**
   *
   * @example
   * const fileUri = 'file:///home/user/Project/iam/authentication/services/ports/ports.bl';
   * const setupFileUri = 'file:///home/user/Project/setup.bl';
   *
   * Would return { boundedContext: 'iam'; module: 'authentication'}
   *
   * If the setup file is not found, it would return { boundedContext: 'unknown'; module: 'unknown'}
   */
  private extractFileBoundedContextAndModule(fileUri: string): {
    boundedContext: string | 'unknown';
    module: string | 'unknown';
  } {
    if (this.setupFileUri === null) {
      console.log("Setup file hasn't been set yet");
      return { boundedContext: 'unknown', module: 'unknown' };
    }
    const projectRootPath = this.setupFileUri.split('/').slice(0, -1).join('/');
    if (!fileUri.startsWith(projectRootPath)) {
      return { boundedContext: 'unknown', module: 'unknown' };
    }
    const filePathRelativeToProjectRoot = fileUri.replace(projectRootPath, '');
    const filePathParts = filePathRelativeToProjectRoot.split('/');
    // Handle edge cases, now we return unknown but perhaps we should add a diagnostic error
    const isSiblingToSetup = filePathParts.length === 2;
    if (isSiblingToSetup) {
      return { boundedContext: 'unknown', module: 'unknown' };
    }
    const isChildOfBoundedContextFolder = filePathParts.length === 3;
    if (isChildOfBoundedContextFolder) {
      // Module is unknown
      return { boundedContext: filePathParts[1], module: 'unknown' };
    }

    const boundedContext = filePathParts[1];
    const module = filePathParts[2];
    return { boundedContext, module };
  }

  private mapTranspilerErrorsToLSPDiagnostics(transpilerErrors: TranspilerErrors): void {
    if (isParserErrors(transpilerErrors)) {
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
    for (const parserError of parserErrors) {
      this.diagnostics[parserError.fileId] = [];
    }
    // Clear previous diagnostics
    for (const key in this.diagnostics) {
      this.diagnostics[key] = [];
    }
    // TODO this can be optimized by not creating a new text document for each error, but rather
    // keeping a local cache of text documents
    const fileIdsToTextDocuments: Record<TFileId, TextDocument> = {};
    for (const parserError of parserErrors) {
      const fileUri = parserError.fileId;
      let textDocument = fileIdsToTextDocuments[fileUri];
      if (!textDocument) {
        const fileContent = this.core[fileUri]?.fileContents || this.setup[fileUri]?.fileContents;
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
      this.diagnostics[fileUri].push(
        DiagnosticFactory.create(
          LogLevel.Error,
          diagnosticRange,
          `${parserError.message}\noffendingSymbol: ${parserError.offendingToken.text}\nline: ${parserError.line}:${parserError.column}`,
          fileUri,
        ),
      );
    }
  }

  private mapValidatorErrorsToLSPDiagnostics(validatorErrors: ValidationErrors): void {
    // console.log('Mapping validator errors to LSP diagnostics');
    console.log(`Found ${validatorErrors.length} semantic validation errors`);
    for (const validatorError of validatorErrors) {
      this.diagnostics[validatorError.metadata.fileId] = [];
    }
    // Clear previous diagnostics
    for (const key in this.diagnostics) {
      this.diagnostics[key] = [];
    }
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
      this.diagnostics[e.metadata.fileId].push(
        DiagnosticFactory.create(
          LogLevel.Error,
          rangeZeroBased,
          `${e.message}\nLine: ${e.metadata.start.line}:${e.metadata.start.column}`,
          e.metadata.fileId,
        ),
      );
    }
  }
}
