import {
  OriginalParserError,
  TParserInputData,
  isParserErrors,
  isIntermediateASTValidationErrors,
  transpiler,
  OriginalValidatorError,
} from '@bitloops/bl-transpiler';
import { Diagnostic } from 'vscode-languageserver/node.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer } from './analyzer.js';
import { DiagnosticFactory, LogLevel } from '../../../utils/diagnostic.js';
import { TFileId, TParserCoreInputData, TParserSetupInputData } from '../../../types.js';

export class BitloopsAnalyzer implements IAnalyzer {
  private diagnostics: Record<TFileId, Diagnostic[]> = {};

  private setup: Record<string, TParserSetupInputData> = {};

  private core: Record<string, TParserCoreInputData> = {};

  private setupFileUri: string = '';

  analyze(document: TextDocument): Record<string, Diagnostic[]> {
    try {
      this.clearPreviousDiagnostics();
      const transpilerInput = this.documentToParserInput(document);
      if (!this.projectStructureIsCorrect(transpilerInput)) {
        return this.diagnostics;
      }
      // Now a single ok file, clears all the diagnostics,

      const intermediateModelOrErrors = transpiler.bitloopsCodeToIntermediateModel(transpilerInput);
      if (isParserErrors(intermediateModelOrErrors)) {
        this.mapParserErrorsToLSPDiagnostics(intermediateModelOrErrors, document);
        return this.diagnostics;
      }
      if (isIntermediateASTValidationErrors(intermediateModelOrErrors)) {
        this.mapValidatorErrorsToLSPDiagnostics(intermediateModelOrErrors);
        return this.diagnostics;
      }
      return this.diagnostics;
    } catch (e) {
      console.log('error', e);
      return {};
    }
  }
  setSetupFile(setupFileUri: string): void {
    this.setupFileUri = setupFileUri;
  }

  removeFile(fileUri: string): void {
    delete this.setup[fileUri];
    delete this.core[fileUri];
    delete this.diagnostics[fileUri];
  }

  private documentToParserInput(document: TextDocument): TParserInputData {
    if (!(document.uri in this.diagnostics)) {
      this.diagnostics[document.uri] = [];
    }
    this.updateFileBuffers(document);
    return {
      core: Object.values(this.core),
      setup: Object.values(this.setup),
    };
    // this.res.core = Object.values(this.core);
    // this.res.setup = Object.values(this.setup);
    // return this.res as TParserInputData;
  }

  private updateFileBuffers(document: TextDocument) {
    const fileName = document.uri.split('/').slice(-1)[0];
    if (fileName === 'setup.bl') {
      this.setup[document.uri] = {
        fileId: document.uri,
        fileContents: document.getText(),
      };
      // this.setupFileUri = document.uri;
    } else if (document.uri.endsWith('.bl')) {
      const { boundedContext, module } = this.extractFileBoundedContextAndModule(document.uri);
      console.log(
        'Extracted boundedContext and module',
        { boundedContext, module },
        'for file::',
        fileName,
      );
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
    if (this.setupFileUri === '') {
      console.log("Setup file hasn't been set yet");
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

  private mapParserErrorsToLSPDiagnostics(
    parserErrors: OriginalParserError,
    document: TextDocument,
  ): void {
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

  private mapValidatorErrorsToLSPDiagnostics(validatorErrors: OriginalValidatorError): void {
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
