"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.lint = void 0;
const diagnostic_1 = require("./diagnostic");
const setings_1 = require("./setings");
const keywords_1 = require("./types/keywords");
const regex_1 = require("./utils/regex");
let problems = 0;
async function lint(textDocument, hasConfigurationCapability, hasDiagnosticRelatedInformationCapability, connection) {
    // In this simple example we get the settings for every validate run.
    const settings = await (0, setings_1.getDocumentSettings)(textDocument.uri, hasConfigurationCapability, connection);
    // const pattern = /\b[A-Z]{2,}\b/g;
    let diagnostics = [];
    if (problems < settings.maxNumberOfProblems) {
        diagnostics = diagnostics.concat(validateComponents(textDocument));
        // connection.console.log(`[validate] ${textDocument.uri} has ${diagnostics.length} for ${text}`);
        problems = diagnostics.length;
        connection.sendDiagnostics({ uri: textDocument.uri, diagnostics });
    }
}
exports.lint = lint;
const validateComponents = (document) => {
    const diagnostics = [...validateIdentifier(document)];
    return diagnostics;
};
const validateIdentifier = (document) => {
    const componentUnion = Object.values(keywords_1.components).join('|');
    const pattern = new RegExp(`(${componentUnion})(?!\\s*\\w)`);
    const match = pattern.exec(document.getText());
    if (match) {
        const useCaseSyntacError = diagnostic_1.DiagnosticFactory.create(1, (0, regex_1.getMatchRange)(document, match), "Expected indentifier" /* EErrors.NoIdentifier */);
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
//# sourceMappingURL=linter.js.map