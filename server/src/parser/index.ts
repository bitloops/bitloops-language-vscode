import antlr from 'antlr4';
import { Diagnostic, Range } from 'vscode-languageserver/node.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import Token from 'antlr4/Token.js';
import { IAnalyzer } from '../analyzer.js';
import Recognizer from 'antlr4/Recognizer.js';
import BitloopsLexer from './grammar/BitloopsLexer.js';
import BitloopsParser from './grammar/BitloopsParser.js';
import { DiagnosticFactory } from '../diagnostic.js';

let diagnostics: Diagnostic[] = [];
// import { ErrorListener } from 'antlr4/error';
class VerboseListener extends (antlr as any).error.ErrorListener {
  syntaxError = (
    _recognizer: Recognizer.default,
    offendingToken: any,
    line: number,
    column: number,
    msg: string,
    _e: any,
  ) => {
    // const stack: any = recognizer.getTokenErrorDisplay(offendingSymbol);
    // console.log("rule stack: "+stack);
    console.log(`line: ${line}:${column}, offendingSymbol : ${offendingToken.text}, msg: ${msg}`);
    const start = offendingToken.start;
    const stop = offendingToken.stop;
    console.log(`start: ${start}, stop: ${stop}`);
    // let range = new Range(error.line - 1, error.startColumn, error.line - 1, error.endColumn);

    const diagnostic = DiagnosticFactory.create(
      1,
      {
        start: {
          line: line - 1,
          character: start,
        },
        end: {
          line: line - 1,
          character: stop + 1,
        },
      },
      `line: ${line}:${column}, offendingSymbol : ${offendingToken.text}, msg: ${msg}`,
    );
    diagnostics.push(diagnostic);
  };
}

export class AntlrAnalyzer implements IAnalyzer {
  analyze(document: TextDocument): Diagnostic[] {
    try {
      diagnostics = [];
      const textFile = document.getText();
      const chars = new (antlr as any).InputStream(textFile);
      const lexer = new BitloopsLexer(chars) as any;
      const tokens = new (antlr as any).CommonTokenStream(lexer);
      const parser = new BitloopsParser(tokens) as any;

      parser.removeErrorListeners();
      parser.addErrorListener(new VerboseListener());
      const _ = parser.program();
      console.log('parsed');
      // console.log(tree);
      return diagnostics;
    } catch (e) {
      console.log('error', e);
      return [];
    }
  }
}
