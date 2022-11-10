import antlr4 from 'antlr4';
import Lexer from 'antlr4/Lexer.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer } from '../analyzer.js';
import BitloopsVisitor from './BitloopsVisitor/BitloopsVisitor.js';
import BitloopsLexer from './grammar/BitloopsLexer.js';
import BitloopsParser from './grammar/BitloopsParser.js';

export class BitloopsIntermediateASTParser implements IAnalyzer {
  analyze(document: TextDocument): any[] {
    const textFile = document.getText();
    const chars = new antlr4.InputStream(textFile);
    const lexer: Lexer = new BitloopsLexer(chars) as any;
    const tokens = new antlr4.CommonTokenStream(lexer);
    const parser = new BitloopsParser(tokens);
    const tree = parser.program();
    const bitloopsVisitor = new BitloopsVisitor();
    const result = bitloopsVisitor.visit(tree);
    console.log('result', result);
    return [];
  }
}
