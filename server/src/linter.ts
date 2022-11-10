import { Connection } from 'vscode-languageserver';
import { getDocumentSettings } from './setings.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer, RegexAnalyzer } from './analyzer.js';
import { AntlrAnalyzer } from './parser/index.js';

const analyzer: IAnalyzer = new AntlrAnalyzer();
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

  console.debug('visited analyzer');
  // const pattern = /\b[A-Z]{2,}\b/g;
  let diagnostics = analyzer.analyze(textDocument);
  connection.sendDiagnostics({ uri: textDocument.uri, diagnostics });
}
