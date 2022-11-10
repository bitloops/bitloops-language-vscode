import antlr4 from 'antlr4';
import Lexer from 'antlr4/Lexer.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import Recognizer from 'antlr4/Recognizer';
import Token from 'antlr4/Token';
import { IAnalyzer } from '../analyzer.js';
import BitloopsLexer from './grammar/BitloopsLexer.js';
import BitloopsParser from './grammar/BitloopsParser.js';

// import { ErrorListener } from 'antlr4/error';
class VerboseListener {
  syntaxError = (
    _recognizer: Recognizer,
    _offendingSymbol: Token,
    line: number,
    column: number,
    _msg: string,
    _e: any
  ) => {
    // const stack: any = recognizer.getTokenErrorDisplay(offendingSymbol);
    // console.log("rule stack: "+stack);
    console.log(`line: ${line}:${column}, offendingSymbol : ${_offendingSymbol.text}, msg: ${_msg}`);
  };
}

export class AntlrAnalyzer implements IAnalyzer {
  analyze(document: TextDocument): any[] {
    try {
      const textFile = document.getText();

      const chars = new antlr4.InputStream(textFile);
      const lexer: Lexer = new BitloopsLexer(chars) as any;
      const tokens = new antlr4.CommonTokenStream(lexer);
      const parser = new BitloopsParser(tokens) as any;

      parser.removeErrorListeners();
      parser.addErrorListener(new VerboseListener() as any);
      const tree = parser.program();
      return [];
    } catch (e) {
      console.log('error', e);
      return [];
    }
  }
}
