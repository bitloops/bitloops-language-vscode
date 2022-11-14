export const components = {
  UseCase: 'UseCase',
  Router: 'Router',
  DTO: 'DTO',
  Rule: 'Rule',
  Struct: 'Struct',
  Props: 'Props',
  ValueObject: 'ValueObject',
  DomainError: 'DomainError',
  ApplicationError: 'ApplicationError',
  Entity: 'Entity',
  GraphQLController: 'GraphQLController',
  RESTController: 'RESTController',
  PackagePort: 'PackagePort',
};

export const componentsWithArgs = {
  UseCase: 'UseCase',
  ApplicationError: 'ApplicationError',
  DomainError: 'DomainError',
};

export const keywords = [
  'optional',
  'break',
  'do',
  'instanceof',
  'typeof',
  'case',
  'else',
  'new',
  'var',
  'catch',
  'finally',
  'return',
  'void',
  'continue',
  'for',
  'switch',
  'while',
  'debugger',
  'function',
  'this',
  'with',
  'default',
  'if',
  'throw',
  'delete',
  'in',
  'try',
  'as',
  'from',
  'readonly',
  'async',
  'throws',
  'applyRules',

  'extends',
  'super',
  'const',
  'export',
  'import',
  'RepoPort',
  'Props',
  'ReadModel',
  'DTO',
  'RESTController',
  'GraphQLController',
  'GRPCController',
  'UseCase',
  'ValueObject',
  'AggregateRoot',
  'Entity',
  'DomainEvent',
  'Service',
  'Repository',
  'Factory',
  'DomainError',
  'ApplicationError',
  'DomainErrors',
  'ApplicationErrors',
  'OK',
  'Errors',
  'Config',
  'PackagePort',
  'VO',
  'Rule',
  'isBrokenIf',
  'Root',
  'constructor',
  /// when parsing strict mode

  // Implements:                     'implements' ;
  'let',
  'private',
  'public',
  'interface',
  'package',
  'protected',
  'static',
  // Yield:                          'yield' ;

  //keywords:

  'any',
  'double',
  'float',
  'int32',
  'int64',
  'uint32',
  'uint64',
  'sint32',
  'sint64',
  'fixed32',
  'fixed64',
  'sfixed32',
  'sfixed64',
  'bool',
  'string',
  'bytes',
  'timestamp',
  'Struct',

  'execute',
  'create',
  'namespace',
  'declare',

  'UUIDv4',

  'is',
  'getClass',
  'toString',
  'REST',
  'Methods',
  'GET',
  'POST',
  'PUT',
  'PATCH',
  'DELETE',
  'OPTIONS',
  'operation',
  'input',
  'GraphQL',
  'Operations',
  'Mutation',
  'Query',
];

// // GraphQL Controller
// GraphQLOperation:       'operation';
// Input:                  'input';
// OperationMutation:      'GraphQL.Operations.Mutation';
// OperationQuery:         'GraphQL.Operations.Query';
// OperationSubscription:  'GraphQL.Operations.Subscription';

// ErrorClass: 'Error';

// /// Identifier Names and Identifiers
// DTOIdentifier:                  UpperCaseStart IdentifierPart* DTO;
// ValueObjectIdentifier:          UpperCaseStart IdentifierPart* VO;
// EntityIdentifier:               UpperCaseStart IdentifierPart* Entity;
// ErrorIdentifier:                (DomainErrors | ApplicationErrors) Dot UpperCaseStart IdentifierPart*;
// ControllerIdentifier:           UpperCaseStart IdentifierPart* 'Controller';
// UseCaseIdentifier:              UpperCaseStart IdentifierPart* UseCase;
// PackagePortIdentifier:          UpperCaseStart IdentifierPart* PackagePort;
// PropsIdentifier:                UpperCaseStart IdentifierPart* Props;
// ReadModelIdentifier:            UpperCaseStart IdentifierPart* ReadModel;
// RuleIdentifier:                 UpperCaseStart IdentifierPart* Rule;
// RepoPortIdentifier:             UpperCaseStart IdentifierPart* RepoPort;
// DomainErrorIdentifier:          UpperCaseStart IdentifierPart* 'Error';
// ValueObjectEvaluationIdentifier:   UpperCaseStart IdentifierPart* VO;
// UpperCaseIdentifier:            UpperCaseStart IdentifierPart*;
// Identifier:                     IdentifierStart IdentifierPart*;
// // GetClassEvaluation:             (RegularVariableEvaluation | ThisVariableEvaluation) '.getClass()';

// // RegularMethodEvaluation:                RegularVariableEvaluation '(' RegularVariableEvaluation? ')';

// // ThisVariableEvaluation:                 This '.' RegularVariableEvaluation ;
// // RegularVariableEvaluation:              (RegularEvaluationPart | UpperCaseIdentifier) ('.' RegularEvaluationPart)*;

// /// String Literals
// StringLiteral:                 ('"' DoubleStringCharacter* '"'
//             //  |                  '\'' SingleStringCharacter* '\'') {this.ProcessStringLiteral();}
//              |                  '\'' SingleStringCharacter* '\'')
//              ;

// BackTick:                       '`' {this.IncreaseTemplateDepth();} -> pushMode(TEMPLATE);

// WhiteSpaces:                    [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);

// LineTerminator:                 [\r\n\u2028\u2029] -> channel(HIDDEN);

// /// Comments

// HtmlComment:                    '<!--' .*? '-->' -> channel(HIDDEN);
// CDataComment:                   '<![CDATA[' .*? ']]>' -> channel(HIDDEN);
// UnexpectedCharacter:            . -> channel(ERROR);

// mode TEMPLATE;

// BackTickInside:                 '`' {this.DecreaseTemplateDepth();} -> type(BackTick), popMode;
// TemplateStringStartExpression:  '${' -> pushMode(DEFAULT_MODE);
// TemplateStringAtom:             ~[`];

// WS: [ \n\t\r]+ -> skip;

// // Fragment rules

// fragment DoubleStringCharacter
//     : ~["\\\r\n]
//     | '\\' EscapeSequence
//     | LineContinuation
//     ;
// fragment SingleStringCharacter
//     : ~['\\\r\n]
//     | '\\' EscapeSequence
//     | LineContinuation
//     ;
// fragment EscapeSequence
//     : CharacterEscapeSequence
//     | '0' // no digit ahead! TODO
//     | HexEscapeSequence
//     | UnicodeEscapeSequence
//     | ExtendedUnicodeEscapeSequence
//     ;
// fragment CharacterEscapeSequence
//     : SingleEscapeCharacter
//     | NonEscapeCharacter
//     ;
// fragment HexEscapeSequence
//     : 'x' HexDigit HexDigit
//     ;
// fragment UnicodeEscapeSequence
//     : 'u' HexDigit HexDigit HexDigit HexDigit
//     ;
// fragment ExtendedUnicodeEscapeSequence
//     : 'u' '{' HexDigit+ '}'
//     ;
// fragment SingleEscapeCharacter
//     : ['"\\bfnrtv]
//     ;

// fragment NonEscapeCharacter
//     : ~['"\\bfnrtv0-9xu\r\n]
//     ;
// fragment EscapeCharacter
//     : SingleEscapeCharacter
//     | [0-9]
//     | [xu]
//     ;
// fragment LineContinuation
//     : '\\' [\r\n\u2028\u2029]
//     ;
// fragment HexDigit
//     : [0-9a-fA-F]
//     ;
// fragment DecimalIntegerLiteral
//     : '0'
//     | [1-9] [0-9]*
//     ;
// fragment ExponentPart
//     : [eE] [+-]? [0-9]+
//     ;
// fragment RegularEvaluationPart: [a-zA-Z_][a-zA-Z0-9]*;
// // fragment RegularMethodEvaluationPart: [a-zA-Z_][a-zA-Z0-9]*;
// // fragment RegularEvaluationPart
// //     : RegularEvaluationStart
// //     | [\p{Mn}]
// //     | [\p{Nd}]
// //     | [\p{Pc}]
// //     | '\u200C'
// //     | '\u200D'
// //     ;
// fragment RegularEvaluationStart
//     : [\p{L}]
//     | [$_]
//     | '\\' UnicodeEscapeSequence
//     ;
// fragment IdentifierPart
//     : IdentifierStart
//     | [\p{Mn}]
//     | [\p{Nd}]
//     | [\p{Pc}]
//     | '\u200C'
//     | '\u200D'
//     ;
// fragment IdentifierStart
//     : [\p{L}]
//     | [$_]
//     | '\\' UnicodeEscapeSequence
//     ;

// fragment UpperCaseStart
//     : [\p{Lu}]
//     ;

// fragment RegularExpressionFirstChar
//     : ~[*\r\n\u2028\u2029\\/[]
//     | RegularExpressionBackslashSequence
//     | '[' RegularExpressionClassChar* ']'
//     ;
// fragment RegularExpressionChar
//     : ~[\r\n\u2028\u2029\\/[]
//     | RegularExpressionBackslashSequence
//     | '[' RegularExpressionClassChar* ']'
//     ;
// fragment RegularExpressionClassChar
//     : ~[\r\n\u2028\u2029\]\\]
//     | RegularExpressionBackslashSequence
//     ;
// fragment RegularExpressionBackslashSequence
//     : '\\' ~[\r\n\u2028\u2029]
//     ;
