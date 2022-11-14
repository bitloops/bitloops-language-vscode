import antlr from 'antlr4';
import { Diagnostic } from 'vscode-languageserver/node.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer } from '../analyzer.js';
import BitloopsLexer from './grammar/BitloopsLexer.js';
import BitloopsParser from './grammar/BitloopsParser.js';
import { VerboseListener } from './errorListener.js';

export class ANTLR4Analyzer implements IAnalyzer {
  static diagnostics: Diagnostic[] = [];
  analyze(document: TextDocument): Diagnostic[] {
    try {
      console.log('uri', document.uri);
      if (document.uri.endsWith('setup.bl')) {
        // TODO handle setup grammar
        return [];
      }
      ANTLR4Analyzer.diagnostics = [];
      const textFile = document.getText();
      const chars = new (antlr as any).InputStream(textFile);
      const lexer = new BitloopsLexer(chars) as any;
      const tokens = new (antlr as any).CommonTokenStream(lexer);
      const parser = new BitloopsParser(tokens) as any;

      parser.removeErrorListeners();
      parser.addErrorListener(new VerboseListener());
      const _ = parser.program();
      ANTLR4Analyzer.diagnostics = this.transformDiagnosticsIndexesToDocumentPositions(
        ANTLR4Analyzer.diagnostics,
        document,
      );
      return ANTLR4Analyzer.diagnostics;
    } catch (e) {
      console.log('error', e);
      return [];
    }
  }

  transformDiagnosticsIndexesToDocumentPositions(
    diagnostics: Diagnostic[],
    document: TextDocument,
  ) {
    return diagnostics.map((d) => ({
      ...d,
      range: {
        start: document.positionAt(d.range.start as any),
        end: document.positionAt(d.range.end as any),
      },
    }));
  }
}
