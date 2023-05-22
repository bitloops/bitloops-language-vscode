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
import { fileURLToPath } from 'url';
import { basename, dirname } from 'path';
import { TFileId, TParserCoreInputData, TParserSetupInputData } from '../../types.js';
import { DiagnosticFactory, LogLevel } from '../../utils/diagnostic.js';

export type TFileDiagnostics = Map<TFileId, Diagnostic[]>;

/**
 * Possible edges cases to consider:
 * 
 * - onDidChangeContent before Created: If a file is created and edited quickly, it's possible that the onDidChangeContent event could be fired before the Created event has been processed. This is particularly likely if you're debouncing onDidChangeContent. To handle this, you could modify updateFile to create the file in your server's state if it doesn't exist yet. This would ensure that the file is always added before it's updated.

 * - Multiple onDidChangeContent events before Created: If a file is edited multiple times quickly after creation, you might receive multiple onDidChangeContent events before the Created event. You would need to ensure that these updates are handled correctly and in order, even if they occur before the file is officially "created" in your server's state.

 * - Deleted before onDidChangeContent: Similarly, if a file is deleted quickly after being edited, you might receive a Deleted event before the onDidChangeContent event. In this case, you might want to ignore the onDidChangeContent event, because the file no longer exists.

 * - Concurrency: If your server is handling multiple files or requests concurrently, you need to ensure that your state management is thread-safe. This might involve using locks or other synchronization techniques to prevent race conditions.

 * - Error handling: If an error occurs while reading a file or updating your server's state, you need to ensure that your server can recover gracefully. This might involve catching and handling errors, logging them for debugging purposes, and cleaning up any inconsistent state.

 * - File not opened: If a file is created but not opened in the editor, the client might not send an onDidChangeContent event, so your server won't know to read the file's content. You might need to handle this case specifically, or accept that your server won't know about files until they're opened.


    Extras:
    We should handle the possibility that files may be deleted outside of the editor, in which case the deletion event might not be immediately detected by the LSP.

 */
export class StateManager {
  // Keeps track of file state, handles addFile, removeFile, updateFile

  private setup: Record<string, TParserSetupInputData> = {};

  private core: Record<string, TParserCoreInputData> = {};

  private setupFileUri: string | null = null;

  private diagnostics: Map<TFileId, Diagnostic[]> = new Map();

  public setSetupFile(setupFileUri: string): void {
    this.setupFileUri = setupFileUri;
  }

  public getSetupFile(): string | null {
    return this.setupFileUri;
  }

  public getDiagnostics(): TFileDiagnostics {
    return this.diagnostics;
  }
  public setDiagnostics(uri: string, diagnostics: Diagnostic[]) {
    this.diagnostics.set(uri, diagnostics);
  }

  public addDiagnostics(uri: string, diagnostics: Diagnostic[]) {
    const existingDiagnostics = this.diagnostics.get(uri) || [];
    this.diagnostics.set(uri, [...existingDiagnostics, ...diagnostics]);
  }

  public removeFile(fileUri: string): void {
    delete this.setup[fileUri];
    delete this.core[fileUri];
    // We need to make its diagnostics disappear
    this.diagnostics.set(fileUri, []);
    if (this.fileIsSetupFile(fileUri)) {
      this.setupFileUri = null;
    }
    // Consider which step would be appropriate to delete empty diagnostics
  }

  private fileIsSetupFile(fileUri: string): boolean {
    const filePath = fileURLToPath(fileUri);
    const fileName = basename(filePath);
    return fileName === 'setup.bl';
  }

  /**
   * Updates the file buffers
   */
  public addNewFile(document: TextDocument) {
    const filePath = fileURLToPath(document.uri);
    const fileName = basename(filePath);
    if (fileName === 'setup.bl') {
      this.setup[document.uri] = {
        fileId: document.uri,
        fileContents: document.getText(),
      };
      this.setupFileUri = document.uri;
      // Recalculate bounded contexts and modules for all files
      this.updateFilesBoundedContextAndModule();
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

  private updateFilesBoundedContextAndModule() {
    for (const file of Object.values(this.core)) {
      const { boundedContext, module } = this.extractFileBoundedContextAndModule(file.fileId);
      file.boundedContext = boundedContext;
      file.module = module;
    }
  }

  public updateFile(document: TextDocument) {
    // For now, we are not doing anything special here
    this.addNewFile(document);
  }

  public handleMissingSetupFile(): TFileDiagnostics {
    const message = `Setup file not found. Please create a file named setup.bl at the root of your project`;
    for (const key in this.core) {
      this.diagnostics.set(key, [
        DiagnosticFactory.create(
          LogLevel.Error,
          {
            start: { line: 0, character: 0 },
            end: { line: 0, character: 0 },
          },
          message,
        ),
      ]);
    }
    return this.diagnostics;
  }

  public fileBuffersToParserInput(): TParserInputData {
    return {
      core: Object.values(this.core),
      setup: Object.values(this.setup),
    };
  }

  public clearPreviousDiagnostics(): void {
    for (const key of this.diagnostics.keys()) {
      this.diagnostics.set(key, []);
    }
  }

  public projectStructureIsCorrect(transpileInputData: TParserInputData): boolean {
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
        this.diagnostics.set(a.fileId, [
          DiagnosticFactory.create(
            LogLevel.Error,
            {
              start: { line: 0, character: 0 },
              end: { line: 0, character: 0 },
            },
            message,
          ),
        ]);
        console.log('Adding diagnostic for fileName', a.fileId);
        result = false;
      }
    }
    return result;
  }

  public getFileContent(fileUri: string) {
    if (this.setup[fileUri]) {
      return this.setup[fileUri].fileContents;
    } else if (this.core[fileUri]) {
      return this.core[fileUri].fileContents;
    } else {
      throw new Error(`File ${fileUri} not found in state manager`);
    }
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
    const projectRootPath = dirname(this.setupFileUri);

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
}
