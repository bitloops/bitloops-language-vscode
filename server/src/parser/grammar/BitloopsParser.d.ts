declare class BitloopsParser extends antlr4.Parser {
  static grammarFileName: string;
  static literalNames: string[];
  static symbolicNames: string[];
  static ruleNames: string[];
  constructor(input: any);
  _interp: antlr4.atn.ParserATNSimulator;
  ruleNames: string[];
  literalNames: string[];
  symbolicNames: string[];
  get atn(): antlr4.atn.ATN;
  sempred(localctx: any, ruleIndex: any, predIndex: any): boolean;
  bitloopsPrimaryType_sempred(localctx: any, predIndex: any): boolean;
  decoratorMemberExpression_sempred(localctx: any, predIndex: any): boolean;
  expression_sempred(localctx: any, predIndex: any): boolean;
  initializer(): InitializerContext;
  bindingPattern(): BindingPatternContext;
  fieldList(): FieldListContext;
  evaluationFieldList(): EvaluationFieldListContext;
  evaluationField(): EvaluationFieldContext;
  propFields(): PropFieldsContext;
  propsIdentifier(): PropsIdentifierContext;
  bitloopsIdentifiers(): BitloopsIdentifiersContext;
  primitives(): PrimitivesContext;
  identifier(): IdentifierContext;
  upperCaseIdentifier(): UpperCaseIdentifierContext;
  struct(): StructContext;
  regularErrorTypeEvaluation(): RegularErrorTypeEvaluationContext;
  methodArguments(): MethodArgumentsContext;
  openParen(): OpenParenContext;
  closeParen(): CloseParenContext;
  regularIdentifier(): RegularIdentifierContext;
  regularStringEvaluation(): RegularStringEvaluationContext;
  regularIntegerEvaluation(): RegularIntegerEvaluationContext;
  regularDecimalEvaluation(): RegularDecimalEvaluationContext;
  regularBooleanEvaluation(): RegularBooleanEvaluationContext;
  regularStructEvaluation(): RegularStructEvaluationContext;
  regularDTOEvaluation(): RegularDTOEvaluationContext;
  field(): FieldContext;
  bitloopsPrimaryType(_p: any): any;
  _ctx: any;
  bitloopsBuiltInClass(): BitloopsBuiltInClassContext;
  predefinedType(): PredefinedTypeContext;
  typeName(): TypeNameContext;
  methodDefinitionList(): MethodDefinitionListContext;
  methodDefinition(): MethodDefinitionContext;
  typeQuery(): TypeQueryContext;
  typeQueryExpression(): TypeQueryExpressionContext;
  typeAnnotation(): TypeAnnotationContext;
  parameterList(): ParameterListContext;
  requiredParameterList(): RequiredParameterListContext;
  parameter(): ParameterContext;
  optionalParameter(): OptionalParameterContext;
  restParameter(): RestParameterContext;
  requiredParameter(): RequiredParameterContext;
  accessibilityModifier(): AccessibilityModifierContext;
  identifierOrPattern(): IdentifierOrPatternContext;
  indexSignature(): IndexSignatureContext;
  enumBody(): EnumBodyContext;
  enumMemberList(): EnumMemberListContext;
  enumMember(): EnumMemberContext;
  namespaceDeclaration(): NamespaceDeclarationContext;
  namespaceName(): NamespaceNameContext;
  importAliasDeclaration(): ImportAliasDeclarationContext;
  decoratorList(): DecoratorListContext;
  decorator(): DecoratorContext;
  decoratorMemberExpression(_p: any): DecoratorMemberExpressionContext;
  decoratorCallExpression(): DecoratorCallExpressionContext;
  program(): ProgramContext;
  sourceElement(): SourceElementContext;
  jestTestDeclaration(): JestTestDeclarationContext;
  errorEvaluation(): ErrorEvaluationContext;
  evaluation(): EvaluationContext;
  condition(): ConditionContext;
  returnStatement(): ReturnStatementContext;
  constDeclaration(): ConstDeclarationContext;
  variableDeclaration(): VariableDeclarationContext;
  statement(): StatementContext;
  builtInFunction(): BuiltInFunctionContext;
  applyRuleStatementRulesList(): ApplyRuleStatementRulesListContext;
  applyRulesRule(): ApplyRulesRuleContext;
  block(): BlockContext;
  statementList(): StatementListContext;
  fromBlock(): FromBlockContext;
  multipleImportStatement(): MultipleImportStatementContext;
  variableDeclarationList(): VariableDeclarationListContext;
  emptyStatement_(): EmptyStatement_Context;
  expressionStatement(): ExpressionStatementContext;
  ifStatement(): IfStatementContext;
  iterationStatement(): IterationStatementContext;
  varModifier(): VarModifierContext;
  continueStatement(): ContinueStatementContext;
  breakStatement(): BreakStatementContext;
  withStatement(): WithStatementContext;
  switchStatement(): SwitchStatementContext;
  caseBlock(): CaseBlockContext;
  caseClauses(): CaseClausesContext;
  caseClause(): CaseClauseContext;
  defaultClause(): DefaultClauseContext;
  labelledStatement(): LabelledStatementContext;
  throwStatement(): ThrowStatementContext;
  tryStatement(): TryStatementContext;
  catchProduction(): CatchProductionContext;
  finallyProduction(): FinallyProductionContext;
  debuggerStatement(): DebuggerStatementContext;
  domainFieldDeclaration(): DomainFieldDeclarationContext;
  isBrokenStatement(): IsBrokenStatementContext;
  domainRuleBody(): DomainRuleBodyContext;
  domainRuleDeclaration(): DomainRuleDeclarationContext;
  aggregateDeclaration(): AggregateDeclarationContext;
  domainConstDeclaration(): DomainConstDeclarationContext;
  entityDeclaration(): EntityDeclarationContext;
  entityBody(): EntityBodyContext;
  valueObjectDeclaration(): ValueObjectDeclarationContext;
  domainConstDeclarationList(): DomainConstDeclarationListContext;
  publicMethodDeclarationList(): PublicMethodDeclarationListContext;
  privateMethodDeclarationList(): PrivateMethodDeclarationListContext;
  domainConstructorDeclaration(): DomainConstructorDeclarationContext;
  useCaseIdentifier(): UseCaseIdentifierContext;
  useCaseDeclaration(): UseCaseDeclarationContext;
  propsDeclaration(): PropsDeclarationContext;
  readModelDeclaration(): ReadModelDeclarationContext;
  repoPortDeclaration(): RepoPortDeclarationContext;
  repoPortIdentifier(): RepoPortIdentifierContext;
  aggregateRootIdentifier(): AggregateRootIdentifierContext;
  repoExtendsList(): RepoExtendsListContext;
  repoPortMethodDefinitions(): RepoPortMethodDefinitionsContext;
  repoPortExtendableIdentifierList(): RepoPortExtendableIdentifierListContext;
  repoPortExtendableIdentifier(): RepoPortExtendableIdentifierContext;
  dtoDeclaration(): DtoDeclarationContext;
  structDeclaration(): StructDeclarationContext;
  dtoEvaluationIdentifier(): DtoEvaluationIdentifierContext;
  dtoEvaluation(): DtoEvaluationContext;
  valueObjectEvaluation(): ValueObjectEvaluationContext;
  domainEvaluationInput(): DomainEvaluationInputContext;
  entityEvaluation(): EntityEvaluationContext;
  structEvaluationIdentifier(): StructEvaluationIdentifierContext;
  structEvaluation(): StructEvaluationContext;
  builtInClassEvaluation(): BuiltInClassEvaluationContext;
  propsEvaluation(): PropsEvaluationContext;
  domainErrorDeclaration(): DomainErrorDeclarationContext;
  applicationErrorDeclaration(): ApplicationErrorDeclarationContext;
  domainErrorIdentifier(): DomainErrorIdentifierContext;
  applicationErrorIdentifier(): ApplicationErrorIdentifierContext;
  useCaseExecuteDeclaration(): UseCaseExecuteDeclarationContext;
  restControllerParameters(): RestControllerParametersContext;
  restControllerExecuteDeclaration(): RestControllerExecuteDeclarationContext;
  restControllerMethodDeclaration(): RestControllerMethodDeclarationContext;
  httpMethod(): HttpMethodContext;
  controllerDeclaration(): ControllerDeclarationContext;
  graphQLResolverOptions(): GraphQLResolverOptionsContext;
  graphQLOperationTypeAssignment(): GraphQLOperationTypeAssignmentContext;
  graphQLOperationInputTypeAssignment(): GraphQLOperationInputTypeAssignmentContext;
  graphQLResolverInputType(): GraphQLResolverInputTypeContext;
  graphQLOperation(): GraphQLOperationContext;
  graphQLControllerExecuteDeclaration(): GraphQLControllerExecuteDeclarationContext;
  graphQLControllerParameters(): GraphQLControllerParametersContext;
  graphQLControllerReturnType(): GraphQLControllerReturnTypeContext;
  dtoIdentifier(): DtoIdentifierContext;
  dtoIdentifiers(): DtoIdentifiersContext;
  errorIdentifier(): ErrorIdentifierContext;
  errorIdentifiers(): ErrorIdentifiersContext;
  valueObjectIdentifier(): ValueObjectIdentifierContext;
  entityIdentifier(): EntityIdentifierContext;
  domainRuleIdentifier(): DomainRuleIdentifierContext;
  returnOkType(): ReturnOkTypeContext;
  returnErrorsType(): ReturnErrorsTypeContext;
  returnOkErrorType(): ReturnOkErrorTypeContext;
  packagePortIdentifier(): PackagePortIdentifierContext;
  packagePortDeclaration(): PackagePortDeclarationContext;
  methodDeclaration(): MethodDeclarationContext;
  privateMethodDeclaration(): PrivateMethodDeclarationContext;
  publicMethodDeclaration(): PublicMethodDeclarationContext;
  returnPublicMethodType(): ReturnPublicMethodTypeContext;
  returnPrivateMethodType(): ReturnPrivateMethodTypeContext;
  propertyMemberBase(): PropertyMemberBaseContext;
  indexMemberDeclaration(): IndexMemberDeclarationContext;
  generatorMethod(): GeneratorMethodContext;
  generatorFunctionDeclaration(): GeneratorFunctionDeclarationContext;
  generatorBlock(): GeneratorBlockContext;
  generatorDefinition(): GeneratorDefinitionContext;
  iteratorBlock(): IteratorBlockContext;
  iteratorDefinition(): IteratorDefinitionContext;
  formalParameterList(): FormalParameterListContext;
  formalParameterArg(): FormalParameterArgContext;
  lastFormalParameterArg(): LastFormalParameterArgContext;
  functionBody(): FunctionBodyContext;
  arrayLiteral(): ArrayLiteralContext;
  elementList(): ElementListContext;
  objectLiteral(): ObjectLiteralContext;
  regularVariableEvaluationORliteralORexpression(): RegularVariableEvaluationORliteralORexpressionContext;
  propertyAssignment(): PropertyAssignmentContext;
  getAccessor(): GetAccessorContext;
  setAccessor(): SetAccessorContext;
  propertyName(): PropertyNameContext;
  arguments(): ArgumentsContext;
  argumentList(): ArgumentListContext;
  argument(): ArgumentContext;
  expressionSequence(): ExpressionSequenceContext;
  functionExpressionDeclaration(): FunctionExpressionDeclarationContext;
  expression(_p: any): ExpressionContext;
  asExpression(): AsExpressionContext;
  arrowFunctionDeclaration(): ArrowFunctionDeclarationContext;
  arrowFunctionParameters(): ArrowFunctionParametersContext;
  arrowFunctionBody(): ArrowFunctionBodyContext;
  assignmentOperator(): AssignmentOperatorContext;
  literal(): LiteralContext;
  templateStringLiteral(): TemplateStringLiteralContext;
  templateStringAtom(): TemplateStringAtomContext;
  numericLiteral(): NumericLiteralContext;
  identifierName(): IdentifierNameContext;
  identifierOrKeyWord(): IdentifierOrKeyWordContext;
  reservedWord(): ReservedWordContext;
  keyword(): KeywordContext;
  getter(): GetterContext;
  setter(): SetterContext;
  eos(): EosContext;
  isInstanceOf(): IsInstanceOfContext;
  classTypes(): ClassTypesContext;
}
declare namespace BitloopsParser {
  export const EOF: -1;
  export const MultiLineComment: number;
  export const SingleLineComment: number;
  export const RegularExpressionLiteral: number;
  export const OpenBracket: number;
  export const CloseBracket: number;
  export const OpenParen: number;
  export const CloseParen: number;
  export const OpenBrace: number;
  export const TemplateCloseBrace: number;
  export const CloseBrace: number;
  export const SemiColon: number;
  export const Comma: number;
  export const Assign: number;
  export const QuestionMark: number;
  export const Colon: number;
  export const Ellipsis: number;
  export const Dot: number;
  export const PlusPlus: number;
  export const MinusMinus: number;
  export const Plus: number;
  export const Minus: number;
  export const BitNot: number;
  export const Not: number;
  export const Multiply: number;
  export const Divide: number;
  export const Modulus: number;
  export const RightShiftArithmetic: number;
  export const LeftShiftArithmetic: number;
  export const RightShiftLogical: number;
  export const LessThan: number;
  export const MoreThan: number;
  export const LessThanEquals: number;
  export const GreaterThanEquals: number;
  export const Equals_: number;
  export const NotEquals: number;
  export const IdentityEquals: number;
  export const IdentityNotEquals: number;
  export const BitAnd: number;
  export const BitXOr: number;
  export const BitOr: number;
  export const And: number;
  export const Or: number;
  export const Xor: number;
  export const MultiplyAssign: number;
  export const DivideAssign: number;
  export const ModulusAssign: number;
  export const PlusAssign: number;
  export const MinusAssign: number;
  export const LeftShiftArithmeticAssign: number;
  export const RightShiftArithmeticAssign: number;
  export const RightShiftLogicalAssign: number;
  export const BitAndAssign: number;
  export const BitXorAssign: number;
  export const BitOrAssign: number;
  export const ARROW: number;
  export const NullLiteral: number;
  export const BooleanLiteral: number;
  export const IntegerLiteral: number;
  export const DecimalLiteral: number;
  export const HexIntegerLiteral: number;
  export const OctalIntegerLiteral: number;
  export const OctalIntegerLiteral2: number;
  export const BinaryIntegerLiteral: number;
  export const Optional: number;
  export const Break: number;
  export const Do: number;
  export const Instanceof: number;
  export const Typeof: number;
  export const Case: number;
  export const Else: number;
  export const New: number;
  export const Var: number;
  export const Catch: number;
  export const Finally: number;
  export const Return: number;
  export const Void: number;
  export const Continue: number;
  export const For: number;
  export const Switch: number;
  export const While: number;
  export const Debugger: number;
  export const Function_: number;
  export const This: number;
  export const With: number;
  export const Default: number;
  export const If: number;
  export const Throw: number;
  export const Delete: number;
  export const In: number;
  export const Try: number;
  export const As: number;
  export const From: number;
  export const ReadOnly: number;
  export const Async: number;
  export const Throws: number;
  export const ApplyRules: number;
  export const Extends: number;
  export const Const: number;
  export const RepoPort: number;
  export const Props: number;
  export const ReadModel: number;
  export const DTO: number;
  export const RESTController: number;
  export const GraphQLController: number;
  export const GRPCController: number;
  export const UseCase: number;
  export const ValueObject: number;
  export const AggregateRoot: number;
  export const Entity: number;
  export const DomainEvent: number;
  export const Service: number;
  export const Repository: number;
  export const Factory: number;
  export const DomainError: number;
  export const ApplicationError: number;
  export const DomainErrors: number;
  export const ApplicationErrors: number;
  export const OK: number;
  export const Errors: number;
  export const Config: number;
  export const PackagePort: number;
  export const VO: number;
  export const Rule: number;
  export const IsBrokenIf: number;
  export const Root: number;
  export const Constructor: number;
  export const Let: number;
  export const Private: number;
  export const Public: number;
  export const Protected: number;
  export const Static: number;
  export const Any: number;
  export const Double: number;
  export const Float: number;
  export const Int32: number;
  export const Int64: number;
  export const Uint32: number;
  export const Uint64: number;
  export const Sint32: number;
  export const Sint64: number;
  export const Fixed32: number;
  export const Fixed64: number;
  export const Sfixed32: number;
  export const Sfixed64: number;
  export const Boolean: number;
  export const String: number;
  export const Bytes: number;
  export const Timestamp: number;
  export const Struct: number;
  export const TypeAlias: number;
  export const Get: number;
  export const Set: number;
  export const Execute: number;
  export const Create: number;
  export const Namespace: number;
  export const Declare: number;
  export const JestTest: number;
  export const JestTestStatement: number;
  export const JestTestStatementList: number;
  export const JestTestFunctionBody: number;
  export const JestTestExecute: number;
  export const JestTestStructEvaluation: number;
  export const JestTestDTOEvaluation: number;
  export const JestTestEvaluation: number;
  export const JestTestReturnOkErrorType: number;
  export const JestTestExpression: number;
  export const JestTestConstDeclaration: number;
  export const JestTestMethodDefinitionList: number;
  export const JestTestCreateMethodDeclaration: number;
  export const JestTestPrivateMethodDeclaration: number;
  export const JestTestPublicMethodDeclaration: number;
  export const JestTestValueObjectDeclaration: number;
  export const JestTestEntityDeclaration: number;
  export const JestTestCondition: number;
  export const JestTestVariableDeclaration: number;
  export const JestTestThisDeclaration: number;
  export const JestTestIsInstanceOf: number;
  export const JestTestValueObjectEvaluation: number;
  export const JestTestEntityEvaluation: number;
  export const JestTestSingleExpression: number;
  export const JestTestGetClass: number;
  export const JestTestBuiltInFunction: number;
  export const JestTestBuiltInClass: number;
  export const JestTestBitloopsPrimaryType: number;
  export const UUIDv4: number;
  export const Is: number;
  export const GetClass: number;
  export const ToString: number;
  export const At: number;
  export const Method: number;
  export const MethodGet: number;
  export const MethodPost: number;
  export const MethodPut: number;
  export const MethodPatch: number;
  export const MethodDelete: number;
  export const MethodOptions: number;
  export const GraphQLOperation: number;
  export const Input: number;
  export const OperationMutation: number;
  export const OperationQuery: number;
  export const OperationSubscription: number;
  export const ErrorClass: number;
  export const DTOIdentifier: number;
  export const ValueObjectIdentifier: number;
  export const EntityIdentifier: number;
  export const ErrorIdentifier: number;
  export const ControllerIdentifier: number;
  export const UseCaseIdentifier: number;
  export const PackagePortIdentifier: number;
  export const PropsIdentifier: number;
  export const ReadModelIdentifier: number;
  export const RuleIdentifier: number;
  export const RepoPortIdentifier: number;
  export const DomainErrorIdentifier: number;
  export const ValueObjectEvaluationIdentifier: number;
  export const UpperCaseIdentifier: number;
  export const Identifier: number;
  export const StringLiteral: number;
  export const BackTick: number;
  export const WhiteSpaces: number;
  export const LineTerminator: number;
  export const HtmlComment: number;
  export const CDataComment: number;
  export const UnexpectedCharacter: number;
  export const TemplateStringStartExpression: number;
  export const TemplateStringAtom: number;
  export const WS: number;
  export const RULE_initializer: number;
  export const RULE_bindingPattern: number;
  export const RULE_fieldList: number;
  export const RULE_evaluationFieldList: number;
  export const RULE_evaluationField: number;
  export const RULE_propFields: number;
  export const RULE_propsIdentifier: number;
  export const RULE_bitloopsIdentifiers: number;
  export const RULE_primitives: number;
  export const RULE_identifier: number;
  export const RULE_upperCaseIdentifier: number;
  export const RULE_struct: number;
  export const RULE_regularErrorTypeEvaluation: number;
  export const RULE_methodArguments: number;
  export const RULE_openParen: number;
  export const RULE_closeParen: number;
  export const RULE_regularIdentifier: number;
  export const RULE_regularStringEvaluation: number;
  export const RULE_regularIntegerEvaluation: number;
  export const RULE_regularDecimalEvaluation: number;
  export const RULE_regularBooleanEvaluation: number;
  export const RULE_regularStructEvaluation: number;
  export const RULE_regularDTOEvaluation: number;
  export const RULE_field: number;
  export const RULE_bitloopsPrimaryType: number;
  export const RULE_bitloopsBuiltInClass: number;
  export const RULE_predefinedType: number;
  export const RULE_typeName: number;
  export const RULE_methodDefinitionList: number;
  export const RULE_methodDefinition: number;
  export const RULE_typeQuery: number;
  export const RULE_typeQueryExpression: number;
  export const RULE_typeAnnotation: number;
  export const RULE_parameterList: number;
  export const RULE_requiredParameterList: number;
  export const RULE_parameter: number;
  export const RULE_optionalParameter: number;
  export const RULE_restParameter: number;
  export const RULE_requiredParameter: number;
  export const RULE_accessibilityModifier: number;
  export const RULE_identifierOrPattern: number;
  export const RULE_indexSignature: number;
  export const RULE_enumBody: number;
  export const RULE_enumMemberList: number;
  export const RULE_enumMember: number;
  export const RULE_namespaceDeclaration: number;
  export const RULE_namespaceName: number;
  export const RULE_importAliasDeclaration: number;
  export const RULE_decoratorList: number;
  export const RULE_decorator: number;
  export const RULE_decoratorMemberExpression: number;
  export const RULE_decoratorCallExpression: number;
  export const RULE_program: number;
  export const RULE_sourceElement: number;
  export const RULE_jestTestDeclaration: number;
  export const RULE_errorEvaluation: number;
  export const RULE_evaluation: number;
  export const RULE_condition: number;
  export const RULE_returnStatement: number;
  export const RULE_constDeclaration: number;
  export const RULE_variableDeclaration: number;
  export const RULE_statement: number;
  export const RULE_builtInFunction: number;
  export const RULE_applyRuleStatementRulesList: number;
  export const RULE_applyRulesRule: number;
  export const RULE_block: number;
  export const RULE_statementList: number;
  export const RULE_fromBlock: number;
  export const RULE_multipleImportStatement: number;
  export const RULE_variableDeclarationList: number;
  export const RULE_emptyStatement_: number;
  export const RULE_expressionStatement: number;
  export const RULE_ifStatement: number;
  export const RULE_iterationStatement: number;
  export const RULE_varModifier: number;
  export const RULE_continueStatement: number;
  export const RULE_breakStatement: number;
  export const RULE_withStatement: number;
  export const RULE_switchStatement: number;
  export const RULE_caseBlock: number;
  export const RULE_caseClauses: number;
  export const RULE_caseClause: number;
  export const RULE_defaultClause: number;
  export const RULE_labelledStatement: number;
  export const RULE_throwStatement: number;
  export const RULE_tryStatement: number;
  export const RULE_catchProduction: number;
  export const RULE_finallyProduction: number;
  export const RULE_debuggerStatement: number;
  export const RULE_domainFieldDeclaration: number;
  export const RULE_isBrokenStatement: number;
  export const RULE_domainRuleBody: number;
  export const RULE_domainRuleDeclaration: number;
  export const RULE_aggregateDeclaration: number;
  export const RULE_domainConstDeclaration: number;
  export const RULE_entityDeclaration: number;
  export const RULE_entityBody: number;
  export const RULE_valueObjectDeclaration: number;
  export const RULE_domainConstDeclarationList: number;
  export const RULE_publicMethodDeclarationList: number;
  export const RULE_privateMethodDeclarationList: number;
  export const RULE_domainConstructorDeclaration: number;
  export const RULE_useCaseIdentifier: number;
  export const RULE_useCaseDeclaration: number;
  export const RULE_propsDeclaration: number;
  export const RULE_readModelDeclaration: number;
  export const RULE_repoPortDeclaration: number;
  export const RULE_repoPortIdentifier: number;
  export const RULE_aggregateRootIdentifier: number;
  export const RULE_repoExtendsList: number;
  export const RULE_repoPortMethodDefinitions: number;
  export const RULE_repoPortExtendableIdentifierList: number;
  export const RULE_repoPortExtendableIdentifier: number;
  export const RULE_dtoDeclaration: number;
  export const RULE_structDeclaration: number;
  export const RULE_dtoEvaluationIdentifier: number;
  export const RULE_dtoEvaluation: number;
  export const RULE_valueObjectEvaluation: number;
  export const RULE_domainEvaluationInput: number;
  export const RULE_entityEvaluation: number;
  export const RULE_structEvaluationIdentifier: number;
  export const RULE_structEvaluation: number;
  export const RULE_builtInClassEvaluation: number;
  export const RULE_propsEvaluation: number;
  export const RULE_domainErrorDeclaration: number;
  export const RULE_applicationErrorDeclaration: number;
  export const RULE_domainErrorIdentifier: number;
  export const RULE_applicationErrorIdentifier: number;
  export const RULE_useCaseExecuteDeclaration: number;
  export const RULE_restControllerParameters: number;
  export const RULE_restControllerExecuteDeclaration: number;
  export const RULE_restControllerMethodDeclaration: number;
  export const RULE_httpMethod: number;
  export const RULE_controllerDeclaration: number;
  export const RULE_graphQLResolverOptions: number;
  export const RULE_graphQLOperationTypeAssignment: number;
  export const RULE_graphQLOperationInputTypeAssignment: number;
  export const RULE_graphQLResolverInputType: number;
  export const RULE_graphQLOperation: number;
  export const RULE_graphQLControllerExecuteDeclaration: number;
  export const RULE_graphQLControllerParameters: number;
  export const RULE_graphQLControllerReturnType: number;
  export const RULE_dtoIdentifier: number;
  export const RULE_dtoIdentifiers: number;
  export const RULE_errorIdentifier: number;
  export const RULE_errorIdentifiers: number;
  export const RULE_valueObjectIdentifier: number;
  export const RULE_entityIdentifier: number;
  export const RULE_domainRuleIdentifier: number;
  export const RULE_returnOkType: number;
  export const RULE_returnErrorsType: number;
  export const RULE_returnOkErrorType: number;
  export const RULE_packagePortIdentifier: number;
  export const RULE_packagePortDeclaration: number;
  export const RULE_methodDeclaration: number;
  export const RULE_privateMethodDeclaration: number;
  export const RULE_publicMethodDeclaration: number;
  export const RULE_returnPublicMethodType: number;
  export const RULE_returnPrivateMethodType: number;
  export const RULE_propertyMemberBase: number;
  export const RULE_indexMemberDeclaration: number;
  export const RULE_generatorMethod: number;
  export const RULE_generatorFunctionDeclaration: number;
  export const RULE_generatorBlock: number;
  export const RULE_generatorDefinition: number;
  export const RULE_iteratorBlock: number;
  export const RULE_iteratorDefinition: number;
  export const RULE_formalParameterList: number;
  export const RULE_formalParameterArg: number;
  export const RULE_lastFormalParameterArg: number;
  export const RULE_functionBody: number;
  export const RULE_arrayLiteral: number;
  export const RULE_elementList: number;
  export const RULE_objectLiteral: number;
  export const RULE_regularVariableEvaluationORliteralORexpression: number;
  export const RULE_propertyAssignment: number;
  export const RULE_getAccessor: number;
  export const RULE_setAccessor: number;
  export const RULE_propertyName: number;
  export const RULE_arguments: number;
  export const RULE_argumentList: number;
  export const RULE_argument: number;
  export const RULE_expressionSequence: number;
  export const RULE_functionExpressionDeclaration: number;
  export const RULE_expression: number;
  export const RULE_asExpression: number;
  export const RULE_arrowFunctionDeclaration: number;
  export const RULE_arrowFunctionParameters: number;
  export const RULE_arrowFunctionBody: number;
  export const RULE_assignmentOperator: number;
  export const RULE_literal: number;
  export const RULE_templateStringLiteral: number;
  export const RULE_templateStringAtom: number;
  export const RULE_numericLiteral: number;
  export const RULE_identifierName: number;
  export const RULE_identifierOrKeyWord: number;
  export const RULE_reservedWord: number;
  export const RULE_keyword: number;
  export const RULE_getter: number;
  export const RULE_setter: number;
  export const RULE_eos: number;
  export const RULE_isInstanceOf: number;
  export const RULE_classTypes: number;
  export { DeleteKeywordContext };
  export { RegularDTOEvaluationStringContext };
  export { RegularStructEvaluationStringContext };
  export { RegularErrorTypeEvaluationStringContext };
  export { IdentifierStringContext };
  export { ExecuteExpressionContext };
  export { CreateExpressionContext };
  export { PrimitivePrimTypeContext };
  export { ArrayBitloopsPrimTypeContext };
  export { BitloopsBuiltInClassPrimTypeContext };
  export { BitloopsIdentifierPrimTypeContext };
  export { ApplyRulesStatementContext };
  export { DoStatementContext };
  export { ForVarStatementContext };
  export { ForVarInStatementContext };
  export { WhileStatementContext };
  export { ForStatementContext };
  export { ForInStatementContext };
  export { DomainEvaluationInputRegularContext };
  export { DomainEvaluationInputFieldListContext };
  export { RESTControllerDeclarationContext };
  export { GraphQLControllerDeclarationContext };
  export { PublicMethodDeclarationExpressionContext };
  export { PrivateMethodDeclarationExpressionContext };
  export { PropertyExpressionAssignmentContext };
  export { ComputedPropertyExpressionAssignmentContext };
  export { PropertyShorthandContext };
  export { PropertySetterContext };
  export { PropertyGetterContext };
  export { RestParameterInObjectContext };
  export { MethodPropertyContext };
  export { ParenthesizedExpressionContext };
  export { ToStringExpressionContext };
  export { AdditiveExpressionContext };
  export { RelationalExpressionContext };
  export { LogicalAndExpressionContext };
  export { LiteralExpressionContext };
  export { LogicalOrExpressionContext };
  export { ArrayLiteralExpressionContext };
  export { MemberDotExpressionContext };
  export { NotExpressionContext };
  export { EvaluationExpressionContext };
  export { IdentifierExpressionContext };
  export { ThisExpressionContext };
  export { AssignmentExpressionContext };
  export { MethodCallExpressionContext };
  export { LogicalXorExpressionContext };
  export { GetClassExpressionContext };
  export { EqualityExpressionContext };
  export { MultiplicativeExpressionContext };
  export { TemplateStringLiteralLabelContext };
  export { StringLiteralContext };
  export { RegularExpressionLiteralContext };
  export { BooleanLiteralContext };
  export { NumericLiteralLabelContext };
  export { NullLiteralContext };
  export { DecimalLiteralContext };
  export { IntegerLiteralContext };
  export { InitializerContext };
  export { BindingPatternContext };
  export { FieldListContext };
  export { EvaluationFieldListContext };
  export { EvaluationFieldContext };
  export { PropFieldsContext };
  export { PropsIdentifierContext };
  export { BitloopsIdentifiersContext };
  export { PrimitivesContext };
  export { IdentifierContext };
  export { UpperCaseIdentifierContext };
  export { StructContext };
  export { RegularErrorTypeEvaluationContext };
  export { MethodArgumentsContext };
  export { OpenParenContext };
  export { CloseParenContext };
  export { RegularIdentifierContext };
  export { RegularStringEvaluationContext };
  export { RegularIntegerEvaluationContext };
  export { RegularDecimalEvaluationContext };
  export { RegularBooleanEvaluationContext };
  export { RegularStructEvaluationContext };
  export { RegularDTOEvaluationContext };
  export { FieldContext };
  export { BitloopsPrimaryTypeContext };
  export { BitloopsBuiltInClassContext };
  export { PredefinedTypeContext };
  export { TypeNameContext };
  export { MethodDefinitionListContext };
  export { MethodDefinitionContext };
  export { TypeQueryContext };
  export { TypeQueryExpressionContext };
  export { TypeAnnotationContext };
  export { ParameterListContext };
  export { RequiredParameterListContext };
  export { ParameterContext };
  export { OptionalParameterContext };
  export { RestParameterContext };
  export { RequiredParameterContext };
  export { AccessibilityModifierContext };
  export { IdentifierOrPatternContext };
  export { IndexSignatureContext };
  export { EnumBodyContext };
  export { EnumMemberListContext };
  export { EnumMemberContext };
  export { NamespaceDeclarationContext };
  export { NamespaceNameContext };
  export { ImportAliasDeclarationContext };
  export { DecoratorListContext };
  export { DecoratorContext };
  export { DecoratorMemberExpressionContext };
  export { DecoratorCallExpressionContext };
  export { ProgramContext };
  export { SourceElementContext };
  export { JestTestDeclarationContext };
  export { ErrorEvaluationContext };
  export { EvaluationContext };
  export { ConditionContext };
  export { ReturnStatementContext };
  export { ConstDeclarationContext };
  export { VariableDeclarationContext };
  export { StatementContext };
  export { BuiltInFunctionContext };
  export { ApplyRuleStatementRulesListContext };
  export { ApplyRulesRuleContext };
  export { BlockContext };
  export { StatementListContext };
  export { FromBlockContext };
  export { MultipleImportStatementContext };
  export { VariableDeclarationListContext };
  export { EmptyStatement_Context };
  export { ExpressionStatementContext };
  export { IfStatementContext };
  export { IterationStatementContext };
  export { VarModifierContext };
  export { ContinueStatementContext };
  export { BreakStatementContext };
  export { WithStatementContext };
  export { SwitchStatementContext };
  export { CaseBlockContext };
  export { CaseClausesContext };
  export { CaseClauseContext };
  export { DefaultClauseContext };
  export { LabelledStatementContext };
  export { ThrowStatementContext };
  export { TryStatementContext };
  export { CatchProductionContext };
  export { FinallyProductionContext };
  export { DebuggerStatementContext };
  export { DomainFieldDeclarationContext };
  export { IsBrokenStatementContext };
  export { DomainRuleBodyContext };
  export { DomainRuleDeclarationContext };
  export { AggregateDeclarationContext };
  export { DomainConstDeclarationContext };
  export { EntityDeclarationContext };
  export { EntityBodyContext };
  export { ValueObjectDeclarationContext };
  export { DomainConstDeclarationListContext };
  export { PublicMethodDeclarationListContext };
  export { PrivateMethodDeclarationListContext };
  export { DomainConstructorDeclarationContext };
  export { UseCaseIdentifierContext };
  export { UseCaseDeclarationContext };
  export { PropsDeclarationContext };
  export { ReadModelDeclarationContext };
  export { RepoPortDeclarationContext };
  export { RepoPortIdentifierContext };
  export { AggregateRootIdentifierContext };
  export { RepoExtendsListContext };
  export { RepoPortMethodDefinitionsContext };
  export { RepoPortExtendableIdentifierListContext };
  export { RepoPortExtendableIdentifierContext };
  export { DtoDeclarationContext };
  export { StructDeclarationContext };
  export { DtoEvaluationIdentifierContext };
  export { DtoEvaluationContext };
  export { ValueObjectEvaluationContext };
  export { DomainEvaluationInputContext };
  export { EntityEvaluationContext };
  export { StructEvaluationIdentifierContext };
  export { StructEvaluationContext };
  export { BuiltInClassEvaluationContext };
  export { PropsEvaluationContext };
  export { DomainErrorDeclarationContext };
  export { ApplicationErrorDeclarationContext };
  export { DomainErrorIdentifierContext };
  export { ApplicationErrorIdentifierContext };
  export { UseCaseExecuteDeclarationContext };
  export { RestControllerParametersContext };
  export { RestControllerExecuteDeclarationContext };
  export { RestControllerMethodDeclarationContext };
  export { HttpMethodContext };
  export { ControllerDeclarationContext };
  export { GraphQLResolverOptionsContext };
  export { GraphQLOperationTypeAssignmentContext };
  export { GraphQLOperationInputTypeAssignmentContext };
  export { GraphQLResolverInputTypeContext };
  export { GraphQLOperationContext };
  export { GraphQLControllerExecuteDeclarationContext };
  export { GraphQLControllerParametersContext };
  export { GraphQLControllerReturnTypeContext };
  export { DtoIdentifierContext };
  export { DtoIdentifiersContext };
  export { ErrorIdentifierContext };
  export { ErrorIdentifiersContext };
  export { ValueObjectIdentifierContext };
  export { EntityIdentifierContext };
  export { DomainRuleIdentifierContext };
  export { ReturnOkTypeContext };
  export { ReturnErrorsTypeContext };
  export { ReturnOkErrorTypeContext };
  export { PackagePortIdentifierContext };
  export { PackagePortDeclarationContext };
  export { MethodDeclarationContext };
  export { PrivateMethodDeclarationContext };
  export { PublicMethodDeclarationContext };
  export { ReturnPublicMethodTypeContext };
  export { ReturnPrivateMethodTypeContext };
  export { PropertyMemberBaseContext };
  export { IndexMemberDeclarationContext };
  export { GeneratorMethodContext };
  export { GeneratorFunctionDeclarationContext };
  export { GeneratorBlockContext };
  export { GeneratorDefinitionContext };
  export { IteratorBlockContext };
  export { IteratorDefinitionContext };
  export { FormalParameterListContext };
  export { FormalParameterArgContext };
  export { LastFormalParameterArgContext };
  export { FunctionBodyContext };
  export { ArrayLiteralContext };
  export { ElementListContext };
  export { ObjectLiteralContext };
  export { RegularVariableEvaluationORliteralORexpressionContext };
  export { PropertyAssignmentContext };
  export { GetAccessorContext };
  export { SetAccessorContext };
  export { PropertyNameContext };
  export { ArgumentsContext };
  export { ArgumentListContext };
  export { ArgumentContext };
  export { ExpressionSequenceContext };
  export { FunctionExpressionDeclarationContext };
  export { ExpressionContext };
  export { AsExpressionContext };
  export { ArrowFunctionDeclarationContext };
  export { ArrowFunctionParametersContext };
  export { ArrowFunctionBodyContext };
  export { AssignmentOperatorContext };
  export { LiteralContext };
  export { TemplateStringLiteralContext };
  export { TemplateStringAtomContext };
  export { NumericLiteralContext };
  export { IdentifierNameContext };
  export { IdentifierOrKeyWordContext };
  export { ReservedWordContext };
  export { KeywordContext };
  export { GetterContext };
  export { SetterContext };
  export { EosContext };
  export { IsInstanceOfContext };
  export { ClassTypesContext };
}
export default BitloopsParser;
import antlr4 from 'antlr4';
declare class InitializerContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Assign(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BindingPatternContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  arrayLiteral(): antlr4.ParserRuleContext;
  objectLiteral(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FieldListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  field: (i: any) => any;
  SemiColon: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EvaluationFieldListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  evaluationField: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EvaluationFieldContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  Colon(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropFieldsContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  CloseBrace(): antlr4.Token;
  fieldList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropsIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  PropsIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsIdentifiersContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UseCaseIdentifier(): antlr4.Token;
  dtoIdentifier(): antlr4.ParserRuleContext;
  ControllerIdentifier(): antlr4.Token;
  ErrorIdentifier(): antlr4.Token;
  propsIdentifier(): antlr4.ParserRuleContext;
  ValueObjectIdentifier(): antlr4.Token;
  EntityIdentifier(): antlr4.Token;
  RepoPortIdentifier(): antlr4.Token;
  ReadModelIdentifier(): antlr4.Token;
  UpperCaseIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PrimitivesContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Any(): antlr4.Token;
  Double(): antlr4.Token;
  Float(): antlr4.Token;
  Int32(): antlr4.Token;
  Int64(): antlr4.Token;
  Uint32(): antlr4.Token;
  Uint64(): antlr4.Token;
  Sint32(): antlr4.Token;
  Sint64(): antlr4.Token;
  Fixed32(): antlr4.Token;
  Fixed64(): antlr4.Token;
  Sfixed32(): antlr4.Token;
  Sfixed64(): antlr4.Token;
  Boolean(): antlr4.Token;
  String(): antlr4.Token;
  Bytes(): antlr4.Token;
  Timestamp(): antlr4.Token;
  Void(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class UpperCaseIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UpperCaseIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StructContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UpperCaseIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularErrorTypeEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  errorIdentifier(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodArgumentsContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  argumentList: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class OpenParenContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CloseParenContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class RegularStringEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  StringLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularIntegerEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  IntegerLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularDecimalEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DecimalLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularBooleanEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  BooleanLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularStructEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UpperCaseIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularDTOEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTOIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FieldContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  bitloopsPrimaryType(): antlr4.ParserRuleContext;
  identifier(): antlr4.ParserRuleContext;
  Optional(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsBuiltInClassContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UUIDv4(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PredefinedTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Any(): antlr4.Token;
  Int32(): antlr4.Token;
  Boolean(): antlr4.Token;
  String(): antlr4.Token;
  Struct(): antlr4.Token;
  Void(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TypeNameContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  namespaceName(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodDefinitionListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  methodDefinition: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodDefinitionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifier(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TypeQueryContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Typeof(): antlr4.Token;
  typeQueryExpression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TypeQueryExpressionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  identifierName: (i: any) => any;
  Dot: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TypeAnnotationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Colon(): antlr4.Token;
  bitloopsPrimaryType(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ParameterListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  restParameter(): antlr4.ParserRuleContext;
  parameter: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RequiredParameterListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  requiredParameter: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ParameterContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  requiredParameter(): antlr4.ParserRuleContext;
  optionalParameter(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class OptionalParameterContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierOrPattern(): antlr4.ParserRuleContext;
  decoratorList(): antlr4.ParserRuleContext;
  QuestionMark(): antlr4.Token;
  initializer(): antlr4.ParserRuleContext;
  accessibilityModifier(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestParameterContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Ellipsis(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RequiredParameterContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierOrPattern(): antlr4.ParserRuleContext;
  decoratorList(): antlr4.ParserRuleContext;
  accessibilityModifier(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AccessibilityModifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Public(): antlr4.Token;
  Private(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierOrPatternContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierName(): antlr4.ParserRuleContext;
  bindingPattern(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IndexSignatureContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBracket(): antlr4.Token;
  Identifier(): antlr4.Token;
  Colon(): antlr4.Token;
  CloseBracket(): antlr4.Token;
  typeAnnotation(): antlr4.ParserRuleContext;
  Int32(): antlr4.Token;
  String(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EnumBodyContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  enumMemberList(): antlr4.ParserRuleContext;
  Comma(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EnumMemberListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  enumMember: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EnumMemberContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  propertyName(): antlr4.ParserRuleContext;
  Assign(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NamespaceDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Namespace(): antlr4.Token;
  namespaceName(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  CloseBrace(): antlr4.Token;
  statementList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NamespaceNameContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier: (i: any) => any;
  Dot: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ImportAliasDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  Assign(): antlr4.Token;
  namespaceName(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecoratorListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  decorator: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecoratorContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  At(): antlr4.Token;
  decoratorMemberExpression(): antlr4.ParserRuleContext;
  decoratorCallExpression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecoratorMemberExpressionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  OpenParen(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  decoratorMemberExpression(): antlr4.ParserRuleContext;
  Dot(): antlr4.Token;
  identifierName(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecoratorCallExpressionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  decoratorMemberExpression(): antlr4.ParserRuleContext;
  arguments(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ProgramContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  sourceElement: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class SourceElementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  dtoDeclaration(): antlr4.ParserRuleContext;
  domainErrorDeclaration(): antlr4.ParserRuleContext;
  applicationErrorDeclaration(): antlr4.ParserRuleContext;
  controllerDeclaration(): antlr4.ParserRuleContext;
  jestTestDeclaration(): antlr4.ParserRuleContext;
  propsDeclaration(): antlr4.ParserRuleContext;
  structDeclaration(): antlr4.ParserRuleContext;
  useCaseDeclaration(): antlr4.ParserRuleContext;
  packagePortDeclaration(): antlr4.ParserRuleContext;
  valueObjectDeclaration(): antlr4.ParserRuleContext;
  domainRuleDeclaration(): antlr4.ParserRuleContext;
  entityDeclaration(): antlr4.ParserRuleContext;
  aggregateDeclaration(): antlr4.ParserRuleContext;
  repoPortDeclaration(): antlr4.ParserRuleContext;
  readModelDeclaration(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class JestTestDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  JestTestFunctionBody(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  SemiColon: (i: any) => any;
  JestTestStatementList(): antlr4.Token;
  statementList(): antlr4.ParserRuleContext;
  JestTestStatement(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  JestTestStructEvaluation(): antlr4.Token;
  structEvaluation(): antlr4.ParserRuleContext;
  JestTestDTOEvaluation(): antlr4.Token;
  dtoEvaluation(): antlr4.ParserRuleContext;
  JestTestEvaluation(): antlr4.Token;
  evaluation(): antlr4.ParserRuleContext;
  JestTestIsInstanceOf(): antlr4.Token;
  isInstanceOf(): antlr4.ParserRuleContext;
  JestTest(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  restControllerParameters(): antlr4.ParserRuleContext;
  restControllerExecuteDeclaration(): antlr4.ParserRuleContext;
  restControllerMethodDeclaration(): antlr4.ParserRuleContext;
  JestTestBuiltInClass(): antlr4.Token;
  builtInClassEvaluation(): antlr4.ParserRuleContext;
  JestTestReturnOkErrorType(): antlr4.Token;
  returnOkErrorType(): antlr4.ParserRuleContext;
  JestTestConstDeclaration(): antlr4.Token;
  constDeclaration(): antlr4.ParserRuleContext;
  JestTestExpression(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  JestTestMethodDefinitionList(): antlr4.Token;
  methodDefinitionList(): antlr4.ParserRuleContext;
  JestTestCreateMethodDeclaration(): antlr4.Token;
  domainConstructorDeclaration(): antlr4.ParserRuleContext;
  JestTestPrivateMethodDeclaration(): antlr4.Token;
  privateMethodDeclaration(): antlr4.ParserRuleContext;
  JestTestPublicMethodDeclaration(): antlr4.Token;
  publicMethodDeclaration(): antlr4.ParserRuleContext;
  JestTestValueObjectDeclaration(): antlr4.Token;
  valueObjectDeclaration(): antlr4.ParserRuleContext;
  JestTestEntityDeclaration(): antlr4.Token;
  entityDeclaration(): antlr4.ParserRuleContext;
  JestTestCondition(): antlr4.Token;
  condition(): antlr4.ParserRuleContext;
  JestTestVariableDeclaration(): antlr4.Token;
  variableDeclaration(): antlr4.ParserRuleContext;
  JestTestValueObjectEvaluation(): antlr4.Token;
  valueObjectEvaluation(): antlr4.ParserRuleContext;
  JestTestEntityEvaluation(): antlr4.Token;
  entityEvaluation(): antlr4.ParserRuleContext;
  JestTestBuiltInFunction(): antlr4.Token;
  builtInFunction(): antlr4.ParserRuleContext;
  JestTestBitloopsPrimaryType(): antlr4.Token;
  bitloopsPrimaryType(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ErrorEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ErrorIdentifier(): antlr4.Token;
  methodArguments(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  isInstanceOf(): antlr4.ParserRuleContext;
  builtInClassEvaluation(): antlr4.ParserRuleContext;
  errorEvaluation(): antlr4.ParserRuleContext;
  dtoEvaluation(): antlr4.ParserRuleContext;
  valueObjectEvaluation(): antlr4.ParserRuleContext;
  entityEvaluation(): antlr4.ParserRuleContext;
  propsEvaluation(): antlr4.ParserRuleContext;
  structEvaluation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ConditionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Return(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ConstDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Const(): antlr4.Token;
  identifier(): antlr4.ParserRuleContext;
  Assign(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class VariableDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifier(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  Assign(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  block(): antlr4.ParserRuleContext;
  expression(): antlr4.ParserRuleContext;
  constDeclaration(): antlr4.ParserRuleContext;
  variableDeclaration(): antlr4.ParserRuleContext;
  emptyStatement_(): antlr4.ParserRuleContext;
  propsDeclaration(): antlr4.ParserRuleContext;
  namespaceDeclaration(): antlr4.ParserRuleContext;
  ifStatement(): antlr4.ParserRuleContext;
  breakStatement(): antlr4.ParserRuleContext;
  switchStatement(): antlr4.ParserRuleContext;
  iterationStatement(): antlr4.ParserRuleContext;
  returnStatement(): antlr4.ParserRuleContext;
  throwStatement(): antlr4.ParserRuleContext;
  tryStatement(): antlr4.ParserRuleContext;
  arrowFunctionDeclaration(): antlr4.ParserRuleContext;
  builtInFunction(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BuiltInFunctionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class ApplyRuleStatementRulesListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  applyRulesRule: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ApplyRulesRuleContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  domainRuleIdentifier(): antlr4.ParserRuleContext;
  arguments(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BlockContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  CloseBrace(): antlr4.Token;
  statementList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StatementListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  statement: (i: any) => any;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FromBlockContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  From(): antlr4.Token;
  StringLiteral(): antlr4.Token;
  eos(): antlr4.ParserRuleContext;
  Multiply(): antlr4.Token;
  multipleImportStatement(): antlr4.ParserRuleContext;
  As(): antlr4.Token;
  identifierName(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MultipleImportStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  identifierName: (i: any) => any;
  CloseBrace(): antlr4.Token;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class VariableDeclarationListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  variableDeclaration: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EmptyStatement_Context extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ExpressionStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expressionSequence(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IfStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  If(): antlr4.Token;
  OpenParen(): antlr4.Token;
  condition(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  statement: (i: any) => any;
  Else(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IterationStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class VarModifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Var(): antlr4.Token;
  Let(): antlr4.Token;
  Const(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ContinueStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Continue(): antlr4.Token;
  eos(): antlr4.ParserRuleContext;
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BreakStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Break(): antlr4.Token;
  eos(): antlr4.ParserRuleContext;
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class WithStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  With(): antlr4.Token;
  OpenParen(): antlr4.Token;
  expressionSequence(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class SwitchStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Switch(): antlr4.Token;
  OpenParen(): antlr4.Token;
  condition(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  caseBlock(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CaseBlockContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  defaultClause(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  caseClauses: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CaseClausesContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  caseClause: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CaseClauseContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Case(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  Colon(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  CloseBrace(): antlr4.Token;
  statementList(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DefaultClauseContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Default(): antlr4.Token;
  Colon(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  CloseBrace(): antlr4.Token;
  statementList(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LabelledStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  Colon(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ThrowStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Throw(): antlr4.Token;
  expressionSequence(): antlr4.ParserRuleContext;
  eos(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TryStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Try(): antlr4.Token;
  block(): antlr4.ParserRuleContext;
  catchProduction(): antlr4.ParserRuleContext;
  finallyProduction(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CatchProductionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Catch(): antlr4.Token;
  OpenParen(): antlr4.Token;
  Identifier(): antlr4.Token;
  CloseParen(): antlr4.Token;
  block(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FinallyProductionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Finally(): antlr4.Token;
  block(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DebuggerStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Debugger(): antlr4.Token;
  eos(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainFieldDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  fieldList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IsBrokenStatementContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  IsBrokenIf(): antlr4.Token;
  OpenParen(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainRuleBodyContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  functionBody(): antlr4.ParserRuleContext;
  isBrokenStatement(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainRuleDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Rule(): antlr4.Token;
  domainRuleIdentifier(): antlr4.ParserRuleContext;
  Throws(): antlr4.Token;
  ErrorIdentifier(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  domainRuleBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AggregateDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Root(): antlr4.Token;
  Entity(): antlr4.Token;
  entityIdentifier(): antlr4.ParserRuleContext;
  entityBody(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainConstDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  constDeclaration(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EntityDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Entity(): antlr4.Token;
  entityIdentifier(): antlr4.ParserRuleContext;
  entityBody(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EntityBodyContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  domainConstDeclarationList(): antlr4.ParserRuleContext;
  domainConstructorDeclaration(): antlr4.ParserRuleContext;
  publicMethodDeclarationList(): antlr4.ParserRuleContext;
  privateMethodDeclarationList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ValueObjectDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ValueObject(): antlr4.Token;
  valueObjectIdentifier(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  domainConstDeclarationList(): antlr4.ParserRuleContext;
  domainConstructorDeclaration(): antlr4.ParserRuleContext;
  privateMethodDeclarationList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainConstDeclarationListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  domainConstDeclaration: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PublicMethodDeclarationListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  publicMethodDeclaration: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PrivateMethodDeclarationListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  privateMethodDeclaration: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainConstructorDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Constructor(): antlr4.Token;
  Colon(): antlr4.Token;
  returnOkErrorType(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class UseCaseIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UseCaseIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class UseCaseDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UseCase(): antlr4.Token;
  useCaseIdentifier(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  useCaseExecuteDeclaration(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropsDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Props(): antlr4.Token;
  PropsIdentifier(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  fieldList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReadModelDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ReadModel(): antlr4.Token;
  ReadModelIdentifier(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  fieldList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  RepoPort(): antlr4.Token;
  repoPortIdentifier(): antlr4.ParserRuleContext;
  LessThan(): antlr4.Token;
  ReadModelIdentifier(): antlr4.Token;
  MoreThan(): antlr4.Token;
  repoExtendsList(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  repoPortMethodDefinitions(): antlr4.ParserRuleContext;
  aggregateRootIdentifier(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  RepoPortIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AggregateRootIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  EntityIdentifier(): antlr4.Token;
  ReadModelIdentifier(): antlr4.Token;
  Identifier(): antlr4.Token;
  UpperCaseIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoExtendsListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Extends(): antlr4.Token;
  repoPortExtendableIdentifierList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortMethodDefinitionsContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  methodDefinitionList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortExtendableIdentifierListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  repoPortExtendableIdentifier: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortExtendableIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  RepoPortIdentifier(): antlr4.Token;
  UpperCaseIdentifier: (i: any) => any;
  LessThan(): antlr4.Token;
  MoreThan(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTO(): antlr4.Token;
  DTOIdentifier(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  fieldList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StructDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Struct(): antlr4.Token;
  UpperCaseIdentifier(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  fieldList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoEvaluationIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  dtoIdentifier(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  dtoEvaluationIdentifier(): antlr4.ParserRuleContext;
  OpenParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  evaluationFieldList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ValueObjectEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  valueObjectIdentifier(): antlr4.ParserRuleContext;
  domainEvaluationInput(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainEvaluationInputContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class EntityEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  entityIdentifier(): antlr4.ParserRuleContext;
  domainEvaluationInput(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StructEvaluationIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UpperCaseIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StructEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  structEvaluationIdentifier(): antlr4.ParserRuleContext;
  OpenParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  evaluationFieldList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BuiltInClassEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  bitloopsBuiltInClass(): antlr4.ParserRuleContext;
  methodArguments(): antlr4.ParserRuleContext;
  Dot(): antlr4.Token;
  identifier(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropsEvaluationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  OpenParen(): antlr4.Token;
  propsIdentifier(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  CloseParen(): antlr4.Token;
  evaluationFieldList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainErrorDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DomainError(): antlr4.Token;
  domainErrorIdentifier(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  CloseBrace(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  evaluationFieldList(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ApplicationErrorDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ApplicationError(): antlr4.Token;
  applicationErrorIdentifier(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  CloseBrace(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  evaluationFieldList(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainErrorIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DomainErrorIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ApplicationErrorIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DomainErrorIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class UseCaseExecuteDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Execute(): antlr4.Token;
  Colon(): antlr4.Token;
  returnOkErrorType(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestControllerParametersContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier: (i: any) => any;
  Comma(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestControllerExecuteDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Execute(): antlr4.Token;
  OpenParen(): antlr4.Token;
  restControllerParameters(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestControllerMethodDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Method(): antlr4.Token;
  Colon(): antlr4.Token;
  httpMethod(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class HttpMethodContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  MethodGet(): antlr4.Token;
  MethodPut(): antlr4.Token;
  MethodPost(): antlr4.Token;
  MethodDelete(): antlr4.Token;
  MethodPatch(): antlr4.Token;
  MethodOptions(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ControllerDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class GraphQLResolverOptionsContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  graphQLOperationTypeAssignment(): antlr4.ParserRuleContext;
  graphQLOperationInputTypeAssignment(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLOperationTypeAssignmentContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  GraphQLOperation(): antlr4.Token;
  Colon(): antlr4.Token;
  graphQLOperation(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLOperationInputTypeAssignmentContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Input(): antlr4.Token;
  Colon(): antlr4.Token;
  graphQLResolverInputType(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLResolverInputTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTOIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLOperationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OperationMutation(): antlr4.Token;
  OperationQuery(): antlr4.Token;
  OperationSubscription(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLControllerExecuteDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Execute(): antlr4.Token;
  OpenParen(): antlr4.Token;
  graphQLControllerParameters(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  Colon(): antlr4.Token;
  graphQLControllerReturnType(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLControllerParametersContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLControllerReturnTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTOIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTOIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoIdentifiersContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  dtoIdentifier: (i: any) => any;
  BitOr: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ErrorIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ErrorIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ErrorIdentifiersContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  errorIdentifier: (i: any) => any;
  BitOr: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ValueObjectIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ValueObjectIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EntityIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  EntityIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainRuleIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  RuleIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnOkTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OK(): antlr4.Token;
  OpenParen(): antlr4.Token;
  bitloopsPrimaryType(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnErrorsTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Errors(): antlr4.Token;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  errorIdentifiers(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnOkErrorTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): antlr4.Token;
  returnOkType(): antlr4.ParserRuleContext;
  Comma(): antlr4.Token;
  returnErrorsType(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PackagePortIdentifierContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  PackagePortIdentifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PackagePortDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  PackagePort(): antlr4.Token;
  packagePortIdentifier(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  methodDefinitionList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class PrivateMethodDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifier(): antlr4.ParserRuleContext;
  returnPrivateMethodType(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  Private(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PublicMethodDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifier(): antlr4.ParserRuleContext;
  returnPublicMethodType(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  Public(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnPublicMethodTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Colon(): antlr4.Token;
  returnOkErrorType(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnPrivateMethodTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  typeAnnotation(): antlr4.ParserRuleContext;
  Colon(): antlr4.Token;
  returnOkErrorType(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyMemberBaseContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  accessibilityModifier(): antlr4.ParserRuleContext;
  Static(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IndexMemberDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  indexSignature(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GeneratorMethodContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  Multiply(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GeneratorFunctionDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Function_(): antlr4.Token;
  Multiply(): antlr4.Token;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  Identifier(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GeneratorBlockContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  generatorDefinition: (i: any) => any;
  CloseBrace(): antlr4.Token;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GeneratorDefinitionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Multiply(): antlr4.Token;
  iteratorDefinition(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IteratorBlockContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  iteratorDefinition: (i: any) => any;
  CloseBrace(): antlr4.Token;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IteratorDefinitionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBracket(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  CloseBracket(): antlr4.Token;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FormalParameterListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  formalParameterArg: (i: any) => any;
  lastFormalParameterArg(): antlr4.ParserRuleContext;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FormalParameterArgContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierOrKeyWord(): antlr4.ParserRuleContext;
  decorator(): antlr4.ParserRuleContext;
  accessibilityModifier(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  Assign(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LastFormalParameterArgContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Ellipsis(): antlr4.Token;
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FunctionBodyContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  statementList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrayLiteralContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBracket(): antlr4.Token;
  CloseBracket(): antlr4.Token;
  elementList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ElementListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ObjectLiteralContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): antlr4.Token;
  CloseBrace(): antlr4.Token;
  propertyAssignment: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularVariableEvaluationORliteralORexpressionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyAssignmentContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class GetAccessorContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  getter(): antlr4.ParserRuleContext;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  typeAnnotation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class SetAccessorContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  setter(): antlr4.ParserRuleContext;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  Identifier(): antlr4.Token;
  bindingPattern(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyNameContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierName(): antlr4.ParserRuleContext;
  StringLiteral(): antlr4.Token;
  numericLiteral(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArgumentsContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  argumentList(): antlr4.ParserRuleContext;
  Comma(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArgumentListContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  argument: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArgumentContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  regularVariableEvaluationORliteralORexpression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ExpressionSequenceContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FunctionExpressionDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Function_(): antlr4.Token;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  Identifier(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  typeAnnotation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ExpressionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class AsExpressionContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  predefinedType(): antlr4.ParserRuleContext;
  OpenBracket(): antlr4.Token;
  CloseBracket(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrowFunctionDeclarationContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  arrowFunctionParameters(): antlr4.ParserRuleContext;
  ARROW(): antlr4.Token;
  arrowFunctionBody(): antlr4.ParserRuleContext;
  Async(): antlr4.Token;
  typeAnnotation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrowFunctionParametersContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrowFunctionBodyContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  functionBody(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AssignmentOperatorContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  MultiplyAssign(): antlr4.Token;
  DivideAssign(): antlr4.Token;
  ModulusAssign(): antlr4.Token;
  PlusAssign(): antlr4.Token;
  MinusAssign(): antlr4.Token;
  LeftShiftArithmeticAssign(): antlr4.Token;
  RightShiftArithmeticAssign(): antlr4.Token;
  RightShiftLogicalAssign(): antlr4.Token;
  BitAndAssign(): antlr4.Token;
  BitXorAssign(): antlr4.Token;
  BitOrAssign(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LiteralContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class TemplateStringLiteralContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  BackTick: (i: any) => any;
  templateStringAtom: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TemplateStringAtomContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  TemplateStringAtom(): antlr4.Token;
  TemplateStringStartExpression(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  TemplateCloseBrace(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NumericLiteralContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class IdentifierNameContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierOrKeyWordContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): antlr4.Token;
  TypeAlias(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReservedWordContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  keyword(): antlr4.ParserRuleContext;
  NullLiteral(): antlr4.Token;
  BooleanLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class KeywordContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Break(): antlr4.Token;
  Do(): antlr4.Token;
  Instanceof(): antlr4.Token;
  Typeof(): antlr4.Token;
  Case(): antlr4.Token;
  Else(): antlr4.Token;
  New(): antlr4.Token;
  Var(): antlr4.Token;
  Catch(): antlr4.Token;
  Finally(): antlr4.Token;
  Return(): antlr4.Token;
  Void(): antlr4.Token;
  Continue(): antlr4.Token;
  For(): antlr4.Token;
  Switch(): antlr4.Token;
  While(): antlr4.Token;
  Debugger(): antlr4.Token;
  Function_(): antlr4.Token;
  This(): antlr4.Token;
  With(): antlr4.Token;
  Default(): antlr4.Token;
  If(): antlr4.Token;
  Throw(): antlr4.Token;
  Delete(): antlr4.Token;
  In(): antlr4.Token;
  Try(): antlr4.Token;
  ReadOnly(): antlr4.Token;
  Async(): antlr4.Token;
  From(): antlr4.Token;
  UseCase(): antlr4.Token;
  Extends(): antlr4.Token;
  Const(): antlr4.Token;
  Let(): antlr4.Token;
  Private(): antlr4.Token;
  Public(): antlr4.Token;
  Protected(): antlr4.Token;
  Static(): antlr4.Token;
  Get(): antlr4.Token;
  Set(): antlr4.Token;
  TypeAlias(): antlr4.Token;
  String(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GetterContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Get(): antlr4.Token;
  propertyName(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class SetterContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Set(): antlr4.Token;
  propertyName(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EosContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  SemiColon(): antlr4.Token;
  EOF(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IsInstanceOfContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  regularIdentifier(): antlr4.ParserRuleContext;
  Is(): antlr4.Token;
  classTypes(): antlr4.ParserRuleContext;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ClassTypesContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ErrorClass(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DeleteKeywordContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  Delete(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularDTOEvaluationStringContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  regularDTOEvaluation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularStructEvaluationStringContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  regularStructEvaluation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularErrorTypeEvaluationStringContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  regularErrorTypeEvaluation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierStringContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ExecuteExpressionContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  Execute(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CreateExpressionContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  Create(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PrimitivePrimTypeContext extends BitloopsPrimaryTypeContext {
  constructor(parser: any, ctx: any);
  primitives(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrayBitloopsPrimTypeContext extends BitloopsPrimaryTypeContext {
  constructor(parser: any, ctx: any);
  bitloopsPrimaryType(): antlr4.ParserRuleContext;
  OpenBracket(): antlr4.Token;
  CloseBracket(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsBuiltInClassPrimTypeContext extends BitloopsPrimaryTypeContext {
  constructor(parser: any, ctx: any);
  bitloopsBuiltInClass(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsIdentifierPrimTypeContext extends BitloopsPrimaryTypeContext {
  constructor(parser: any, ctx: any);
  bitloopsIdentifiers(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ApplyRulesStatementContext extends BuiltInFunctionContext {
  constructor(parser: any, ctx: any);
  ApplyRules(): antlr4.Token;
  OpenParen(): antlr4.Token;
  applyRuleStatementRulesList(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DoStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  Do(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  While(): antlr4.Token;
  OpenParen(): antlr4.Token;
  expressionSequence(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  eos(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ForVarStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  For(): antlr4.Token;
  OpenParen(): antlr4.Token;
  varModifier(): antlr4.ParserRuleContext;
  variableDeclarationList(): antlr4.ParserRuleContext;
  SemiColon: (i: any) => any;
  CloseParen(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  expressionSequence: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ForVarInStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  For(): antlr4.Token;
  OpenParen(): antlr4.Token;
  varModifier(): antlr4.ParserRuleContext;
  variableDeclaration(): antlr4.ParserRuleContext;
  expressionSequence(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  In(): antlr4.Token;
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class WhileStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  While(): antlr4.Token;
  OpenParen(): antlr4.Token;
  expressionSequence(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ForStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  For(): antlr4.Token;
  OpenParen(): antlr4.Token;
  SemiColon: (i: any) => any;
  CloseParen(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  expressionSequence: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ForInStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  For(): antlr4.Token;
  OpenParen(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  expressionSequence(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  statement(): antlr4.ParserRuleContext;
  In(): antlr4.Token;
  Identifier(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainEvaluationInputRegularContext extends DomainEvaluationInputContext {
  constructor(parser: any, ctx: any);
  OpenParen(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainEvaluationInputFieldListContext extends DomainEvaluationInputContext {
  constructor(parser: any, ctx: any);
  OpenParen(): antlr4.Token;
  OpenBrace(): antlr4.Token;
  evaluationFieldList(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RESTControllerDeclarationContext extends ControllerDeclarationContext {
  constructor(parser: any, ctx: any);
  RESTController(): antlr4.Token;
  ControllerIdentifier(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  restControllerMethodDeclaration(): antlr4.ParserRuleContext;
  restControllerExecuteDeclaration(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLControllerDeclarationContext extends ControllerDeclarationContext {
  constructor(parser: any, ctx: any);
  GraphQLController(): antlr4.Token;
  ControllerIdentifier(): antlr4.Token;
  formalParameterList(): antlr4.ParserRuleContext;
  OpenBrace(): antlr4.Token;
  graphQLResolverOptions(): antlr4.ParserRuleContext;
  graphQLControllerExecuteDeclaration(): antlr4.ParserRuleContext;
  CloseBrace(): antlr4.Token;
  SemiColon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PublicMethodDeclarationExpressionContext extends MethodDeclarationContext {
  constructor(parser: any, ctx: any);
  publicMethodDeclaration(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PrivateMethodDeclarationExpressionContext extends MethodDeclarationContext {
  constructor(parser: any, ctx: any);
  privateMethodDeclaration(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  propertyName(): antlr4.ParserRuleContext;
  regularVariableEvaluationORliteralORexpression(): antlr4.ParserRuleContext;
  Colon(): antlr4.Token;
  Assign(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  OpenBracket(): antlr4.Token;
  regularVariableEvaluationORliteralORexpression: (i: any) => any;
  CloseBracket(): antlr4.Token;
  Colon(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyShorthandContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  identifierOrKeyWord(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertySetterContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  setAccessor(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyGetterContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  getAccessor(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestParameterInObjectContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  restParameter(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodPropertyContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  generatorMethod(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ParenthesizedExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  OpenParen(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ToStringExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression(): antlr4.ParserRuleContext;
  Dot(): antlr4.Token;
  ToString(): antlr4.Token;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AdditiveExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Plus(): antlr4.Token;
  Minus(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RelationalExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  LessThan(): antlr4.Token;
  MoreThan(): antlr4.Token;
  LessThanEquals(): antlr4.Token;
  GreaterThanEquals(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LogicalAndExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  And(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LiteralExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  literal(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LogicalOrExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Or(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrayLiteralExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  arrayLiteral(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MemberDotExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression(): antlr4.ParserRuleContext;
  Dot(): antlr4.Token;
  regularIdentifier(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NotExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  Not(): antlr4.Token;
  expression(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EvaluationExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  evaluation(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  regularIdentifier(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ThisExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  This(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AssignmentExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression: (i: any) => any;
  Assign(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodCallExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression(): antlr4.ParserRuleContext;
  methodArguments(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LogicalXorExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Xor(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GetClassExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression(): antlr4.ParserRuleContext;
  Dot(): antlr4.Token;
  GetClass(): antlr4.Token;
  OpenParen(): antlr4.Token;
  CloseParen(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EqualityExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Equals_(): antlr4.Token;
  NotEquals(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MultiplicativeExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Multiply(): antlr4.Token;
  Divide(): antlr4.Token;
  Modulus(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TemplateStringLiteralLabelContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  templateStringLiteral(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StringLiteralContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  StringLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularExpressionLiteralContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  RegularExpressionLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BooleanLiteralContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  BooleanLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NumericLiteralLabelContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  numericLiteral(): antlr4.ParserRuleContext;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NullLiteralContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  NullLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecimalLiteralContext extends NumericLiteralContext {
  constructor(parser: any, ctx: any);
  DecimalLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IntegerLiteralContext extends NumericLiteralContext {
  constructor(parser: any, ctx: any);
  IntegerLiteral(): antlr4.Token;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsPrimaryTypeContext extends antlr4.ParserRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
