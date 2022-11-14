declare class BitloopsLexer extends BitloopsLexerBase {
  static grammarFileName: string;
  static channelNames: string[];
  static modeNames: string[];
  static literalNames: string[];
  static symbolicNames: string[];
  static ruleNames: string[];
  _interp: antlr4.atn.LexerATNSimulator;
  get atn(): antlr4.atn.ATN;
  action(localctx: any, ruleIndex: any, actionIndex: any): void;
  OpenBrace_action(localctx: any, actionIndex: any): void;
  CloseBrace_action(localctx: any, actionIndex: any): void;
  BackTick_action(localctx: any, actionIndex: any): void;
  BackTickInside_action(localctx: any, actionIndex: any): void;
  sempred(localctx: any, ruleIndex: any, predIndex: any): boolean;
  RegularExpressionLiteral_sempred(localctx: any, predIndex: any): boolean;
  TemplateCloseBrace_sempred(localctx: any, predIndex: any): boolean;
}
declare namespace BitloopsLexer {
  const EOF: -1;
  const MultiLineComment: number;
  const SingleLineComment: number;
  const RegularExpressionLiteral: number;
  const OpenBracket: number;
  const CloseBracket: number;
  const OpenParen: number;
  const CloseParen: number;
  const OpenBrace: number;
  const TemplateCloseBrace: number;
  const CloseBrace: number;
  const SemiColon: number;
  const Comma: number;
  const Assign: number;
  const QuestionMark: number;
  const Colon: number;
  const Ellipsis: number;
  const Dot: number;
  const PlusPlus: number;
  const MinusMinus: number;
  const Plus: number;
  const Minus: number;
  const BitNot: number;
  const Not: number;
  const Multiply: number;
  const Divide: number;
  const Modulus: number;
  const RightShiftArithmetic: number;
  const LeftShiftArithmetic: number;
  const RightShiftLogical: number;
  const LessThan: number;
  const MoreThan: number;
  const LessThanEquals: number;
  const GreaterThanEquals: number;
  const Equals_: number;
  const NotEquals: number;
  const IdentityEquals: number;
  const IdentityNotEquals: number;
  const BitAnd: number;
  const BitXOr: number;
  const BitOr: number;
  const And: number;
  const Or: number;
  const Xor: number;
  const MultiplyAssign: number;
  const DivideAssign: number;
  const ModulusAssign: number;
  const PlusAssign: number;
  const MinusAssign: number;
  const LeftShiftArithmeticAssign: number;
  const RightShiftArithmeticAssign: number;
  const RightShiftLogicalAssign: number;
  const BitAndAssign: number;
  const BitXorAssign: number;
  const BitOrAssign: number;
  const ARROW: number;
  const NullLiteral: number;
  const BooleanLiteral: number;
  const IntegerLiteral: number;
  const DecimalLiteral: number;
  const HexIntegerLiteral: number;
  const OctalIntegerLiteral: number;
  const OctalIntegerLiteral2: number;
  const BinaryIntegerLiteral: number;
  const Optional: number;
  const Break: number;
  const Do: number;
  const Instanceof: number;
  const Typeof: number;
  const Case: number;
  const Else: number;
  const New: number;
  const Var: number;
  const Catch: number;
  const Finally: number;
  const Return: number;
  const Void: number;
  const Continue: number;
  const For: number;
  const Switch: number;
  const While: number;
  const Debugger: number;
  const Function_: number;
  const This: number;
  const With: number;
  const Default: number;
  const If: number;
  const Throw: number;
  const Delete: number;
  const In: number;
  const Try: number;
  const As: number;
  const From: number;
  const ReadOnly: number;
  const Async: number;
  const Throws: number;
  const ApplyRules: number;
  const Extends: number;
  const Const: number;
  const RepoPort: number;
  const Props: number;
  const ReadModel: number;
  const DTO: number;
  const RESTController: number;
  const GraphQLController: number;
  const GRPCController: number;
  const UseCase: number;
  const ValueObject: number;
  const AggregateRoot: number;
  const Entity: number;
  const DomainEvent: number;
  const Service: number;
  const Repository: number;
  const Factory: number;
  const DomainError: number;
  const ApplicationError: number;
  const DomainErrors: number;
  const ApplicationErrors: number;
  const OK: number;
  const Errors: number;
  const Config: number;
  const PackagePort: number;
  const VO: number;
  const Rule: number;
  const IsBrokenIf: number;
  const Root: number;
  const Constructor: number;
  const Let: number;
  const Private: number;
  const Public: number;
  const Protected: number;
  const Static: number;
  const Any: number;
  const Double: number;
  const Float: number;
  const Int32: number;
  const Int64: number;
  const Uint32: number;
  const Uint64: number;
  const Sint32: number;
  const Sint64: number;
  const Fixed32: number;
  const Fixed64: number;
  const Sfixed32: number;
  const Sfixed64: number;
  const Boolean: number;
  const String: number;
  const Bytes: number;
  const Timestamp: number;
  const Struct: number;
  const TypeAlias: number;
  const Get: number;
  const Set: number;
  const Execute: number;
  const Create: number;
  const Namespace: number;
  const Declare: number;
  const JestTest: number;
  const JestTestStatement: number;
  const JestTestStatementList: number;
  const JestTestFunctionBody: number;
  const JestTestExecute: number;
  const JestTestStructEvaluation: number;
  const JestTestDTOEvaluation: number;
  const JestTestEvaluation: number;
  const JestTestReturnOkErrorType: number;
  const JestTestExpression: number;
  const JestTestConstDeclaration: number;
  const JestTestMethodDefinitionList: number;
  const JestTestCreateMethodDeclaration: number;
  const JestTestPrivateMethodDeclaration: number;
  const JestTestPublicMethodDeclaration: number;
  const JestTestValueObjectDeclaration: number;
  const JestTestEntityDeclaration: number;
  const JestTestCondition: number;
  const JestTestVariableDeclaration: number;
  const JestTestThisDeclaration: number;
  const JestTestIsInstanceOf: number;
  const JestTestValueObjectEvaluation: number;
  const JestTestEntityEvaluation: number;
  const JestTestSingleExpression: number;
  const JestTestGetClass: number;
  const JestTestBuiltInFunction: number;
  const JestTestBuiltInClass: number;
  const JestTestBitloopsPrimaryType: number;
  const UUIDv4: number;
  const Is: number;
  const GetClass: number;
  const ToString: number;
  const At: number;
  const Method: number;
  const MethodGet: number;
  const MethodPost: number;
  const MethodPut: number;
  const MethodPatch: number;
  const MethodDelete: number;
  const MethodOptions: number;
  const GraphQLOperation: number;
  const Input: number;
  const OperationMutation: number;
  const OperationQuery: number;
  const OperationSubscription: number;
  const ErrorClass: number;
  const DTOIdentifier: number;
  const ValueObjectIdentifier: number;
  const EntityIdentifier: number;
  const ErrorIdentifier: number;
  const ControllerIdentifier: number;
  const UseCaseIdentifier: number;
  const PackagePortIdentifier: number;
  const PropsIdentifier: number;
  const ReadModelIdentifier: number;
  const RuleIdentifier: number;
  const RepoPortIdentifier: number;
  const DomainErrorIdentifier: number;
  const ValueObjectEvaluationIdentifier: number;
  const UpperCaseIdentifier: number;
  const Identifier: number;
  const StringLiteral: number;
  const BackTick: number;
  const WhiteSpaces: number;
  const LineTerminator: number;
  const HtmlComment: number;
  const CDataComment: number;
  const UnexpectedCharacter: number;
  const TemplateStringStartExpression: number;
  const TemplateStringAtom: number;
  const WS: number;
  const ERROR: number;
  const TEMPLATE: number;
}
export default BitloopsLexer;
import BitloopsLexerBase from './BitloopsLexerBase.js';
import antlr4 from 'antlr4';
