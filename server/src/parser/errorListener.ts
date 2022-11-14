import antlr from 'antlr4';
import Recognizer from 'antlr4/Recognizer.js';
import { DiagnosticFactory } from '../diagnostic.js';
import { ANTLR4Analyzer } from './index.js';
// import { ErrorListener } from 'antlr4/error';

export class VerboseListener extends (antlr as any).error.ErrorListener {
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
        start,
        end: stop,
      },
      `line: ${line}:${column}, offendingSymbol : ${offendingToken.text}, msg: ${msg}`,
    );
    ANTLR4Analyzer.diagnostics.push(diagnostic);
  };
}
