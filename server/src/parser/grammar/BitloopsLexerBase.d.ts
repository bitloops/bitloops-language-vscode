export default class JavaScriptLexerBase extends antlr4.Lexer {
  constructor(input: any);
  scopeStrictModes: any[];
  lastToken: antlr4.Token;
  useStrictDefault: boolean;
  useStrictCurrent: boolean;
  templateDepth: number;
  getStrictDefault(): boolean;
  setUseStrictDefault(value: any): void;
  IsStrictMode(): boolean;
  IsInTemplateString(): boolean;
  getCurrentToken(): antlr4.Token;
  ProcessOpenBrace(): void;
  ProcessCloseBrace(): void;
  ProcessStringLiteral(): void;
  IncreaseTemplateDepth(): void;
  DecreaseTemplateDepth(): void;
  IsRegexPossible(): boolean;
  IsStartOfFile(): boolean;
}
import antlr4 from 'antlr4';
