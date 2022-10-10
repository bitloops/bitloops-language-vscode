import {
  Connection,
  Diagnostic,
  DiagnosticSeverity,
  TextDocument,
  TextDocuments,
} from 'vscode-languageserver';
import { DiagnosticFactory } from './diagnostic';
import { getDocumentSettings } from './setings';
import { EErrors } from './types/Errors';
import { components, componentsWithArgs } from './types/keywords';
import { getMatchRange, negateRegex } from './utils/regex';

let problems = 0;
export async function lint(
  textDocument: TextDocument,
  hasConfigurationCapability: boolean,
  hasDiagnosticRelatedInformationCapability: boolean,
  connection: Connection,
): Promise<void> {
  // In this simple example we get the settings for every validate run.
  const settings = await getDocumentSettings(
    textDocument.uri,
    hasConfigurationCapability,
    connection,
  );

  // const pattern = /\b[A-Z]{2,}\b/g;
  let diagnostics: Diagnostic[] = [];
  if (problems < settings.maxNumberOfProblems) {
    diagnostics = diagnostics.concat(validateComponents(textDocument));
    // connection.console.log(`[validate] ${textDocument.uri} has ${diagnostics.length} for ${text}`);
    problems = diagnostics.length;

    connection.sendDiagnostics({ uri: textDocument.uri, diagnostics });
  }
}
const validateComponents = (document: TextDocument): Diagnostic[] => {
  const diagnostics = [...validateIdentifier(document)];
  return diagnostics;
};
const validateIdentifier = (document: TextDocument): Diagnostic[] => {
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
// const validateComponentsWithArgs = (document: TextDocument): Diagnostic[] => {
//   const componentUnion = Object.values(componentsWithArgs).join('|');
//   const pattern = new RegExp(`(${componentUnion}\\s*\\w*\\s*)(?!\\(\))`, 'g');
//   const match = pattern.exec(document.getText());
//   if (match) {
//     const useCaseSyntacError = DiagnosticFactory.create(
//       1,
//       getMatchRange(document, match),
//       EErrors.NoArgs,
//     );
//     // console.log(useCaseSyntacError);
//     return [useCaseSyntacError];
//   }
//   return [];
// };
