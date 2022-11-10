declare class BitloopsParser {
  static grammarFileName: string;
  static literalNames: string[];
  static symbolicNames: string[];
  static ruleNames: string[];
  constructor(input: any);
  _interp: any;
  ruleNames: string[];
  literalNames: string[];
  symbolicNames: string[];
  get atn(): any;
  sempred(localctx: any, ruleIndex: any, predIndex: any): any;
  bitloopsPrimaryType_sempred(localctx: any, predIndex: any): any;
  decoratorMemberExpression_sempred(localctx: any, predIndex: any): any;
  expression_sempred(localctx: any, predIndex: any): any;
  initializer(): InitializerContext;
  state: number;
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
  export const EOF: any;
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
declare class InitializerContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Assign(): any;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BindingPatternContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  arrayLiteral(): any;
  objectLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FieldListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  field: (i: any) => any;
  SemiColon: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EvaluationFieldListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  evaluationField: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EvaluationFieldContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  Colon(): any;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropFieldsContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  CloseBrace(): any;
  fieldList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropsIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  PropsIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsIdentifiersContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UseCaseIdentifier(): any;
  dtoIdentifier(): any;
  ControllerIdentifier(): any;
  ErrorIdentifier(): any;
  propsIdentifier(): any;
  ValueObjectIdentifier(): any;
  EntityIdentifier(): any;
  RepoPortIdentifier(): any;
  ReadModelIdentifier(): any;
  UpperCaseIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PrimitivesContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Any(): any;
  Double(): any;
  Float(): any;
  Int32(): any;
  Int64(): any;
  Uint32(): any;
  Uint64(): any;
  Sint32(): any;
  Sint64(): any;
  Fixed32(): any;
  Fixed64(): any;
  Sfixed32(): any;
  Sfixed64(): any;
  Boolean(): any;
  String(): any;
  Bytes(): any;
  Timestamp(): any;
  Void(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class UpperCaseIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UpperCaseIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StructContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UpperCaseIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularErrorTypeEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  errorIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodArgumentsContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): any;
  CloseParen(): any;
  argumentList: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class OpenParenContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CloseParenContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class RegularStringEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  StringLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularIntegerEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  IntegerLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularDecimalEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DecimalLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularBooleanEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  BooleanLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularStructEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UpperCaseIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularDTOEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTOIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FieldContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  bitloopsPrimaryType(): any;
  identifier(): any;
  Optional(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsBuiltInClassContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UUIDv4(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PredefinedTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Any(): any;
  Int32(): any;
  Boolean(): any;
  String(): any;
  Struct(): any;
  Void(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TypeNameContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  namespaceName(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodDefinitionListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  methodDefinition: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodDefinitionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifier(): any;
  typeAnnotation(): any;
  SemiColon(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TypeQueryContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Typeof(): any;
  typeQueryExpression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TypeQueryExpressionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  identifierName: (i: any) => any;
  Dot: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TypeAnnotationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Colon(): any;
  bitloopsPrimaryType(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ParameterListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  restParameter(): any;
  parameter: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RequiredParameterListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  requiredParameter: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ParameterContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  requiredParameter(): any;
  optionalParameter(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class OptionalParameterContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierOrPattern(): any;
  decoratorList(): any;
  QuestionMark(): any;
  initializer(): any;
  accessibilityModifier(): any;
  typeAnnotation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestParameterContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Ellipsis(): any;
  expression(): any;
  typeAnnotation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RequiredParameterContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierOrPattern(): any;
  decoratorList(): any;
  accessibilityModifier(): any;
  typeAnnotation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AccessibilityModifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Public(): any;
  Private(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierOrPatternContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierName(): any;
  bindingPattern(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IndexSignatureContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBracket(): any;
  Identifier(): any;
  Colon(): any;
  CloseBracket(): any;
  typeAnnotation(): any;
  Int32(): any;
  String(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EnumBodyContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  enumMemberList(): any;
  Comma(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EnumMemberListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  enumMember: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EnumMemberContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  propertyName(): any;
  Assign(): any;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NamespaceDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Namespace(): any;
  namespaceName(): any;
  OpenBrace(): any;
  CloseBrace(): any;
  statementList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NamespaceNameContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier: (i: any) => any;
  Dot: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ImportAliasDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  Assign(): any;
  namespaceName(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecoratorListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  decorator: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecoratorContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  At(): any;
  decoratorMemberExpression(): any;
  decoratorCallExpression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecoratorMemberExpressionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  OpenParen(): any;
  expression(): any;
  CloseParen(): any;
  decoratorMemberExpression(): any;
  Dot(): any;
  identifierName(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecoratorCallExpressionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  decoratorMemberExpression(): any;
  arguments(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ProgramContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  sourceElement: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class SourceElementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  dtoDeclaration(): any;
  domainErrorDeclaration(): any;
  applicationErrorDeclaration(): any;
  controllerDeclaration(): any;
  jestTestDeclaration(): any;
  propsDeclaration(): any;
  structDeclaration(): any;
  useCaseDeclaration(): any;
  packagePortDeclaration(): any;
  valueObjectDeclaration(): any;
  domainRuleDeclaration(): any;
  entityDeclaration(): any;
  aggregateDeclaration(): any;
  repoPortDeclaration(): any;
  readModelDeclaration(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class JestTestDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  JestTestFunctionBody(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  SemiColon: (i: any) => any;
  JestTestStatementList(): any;
  statementList(): any;
  JestTestStatement(): any;
  statement(): any;
  JestTestStructEvaluation(): any;
  structEvaluation(): any;
  JestTestDTOEvaluation(): any;
  dtoEvaluation(): any;
  JestTestEvaluation(): any;
  evaluation(): any;
  JestTestIsInstanceOf(): any;
  isInstanceOf(): any;
  JestTest(): any;
  formalParameterList(): any;
  restControllerParameters(): any;
  restControllerExecuteDeclaration(): any;
  restControllerMethodDeclaration(): any;
  JestTestBuiltInClass(): any;
  builtInClassEvaluation(): any;
  JestTestReturnOkErrorType(): any;
  returnOkErrorType(): any;
  JestTestConstDeclaration(): any;
  constDeclaration(): any;
  JestTestExpression(): any;
  expression(): any;
  JestTestMethodDefinitionList(): any;
  methodDefinitionList(): any;
  JestTestCreateMethodDeclaration(): any;
  domainConstructorDeclaration(): any;
  JestTestPrivateMethodDeclaration(): any;
  privateMethodDeclaration(): any;
  JestTestPublicMethodDeclaration(): any;
  publicMethodDeclaration(): any;
  JestTestValueObjectDeclaration(): any;
  valueObjectDeclaration(): any;
  JestTestEntityDeclaration(): any;
  entityDeclaration(): any;
  JestTestCondition(): any;
  condition(): any;
  JestTestVariableDeclaration(): any;
  variableDeclaration(): any;
  JestTestValueObjectEvaluation(): any;
  valueObjectEvaluation(): any;
  JestTestEntityEvaluation(): any;
  entityEvaluation(): any;
  JestTestBuiltInFunction(): any;
  builtInFunction(): any;
  JestTestBitloopsPrimaryType(): any;
  bitloopsPrimaryType(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ErrorEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ErrorIdentifier(): any;
  methodArguments(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  isInstanceOf(): any;
  builtInClassEvaluation(): any;
  errorEvaluation(): any;
  dtoEvaluation(): any;
  valueObjectEvaluation(): any;
  entityEvaluation(): any;
  propsEvaluation(): any;
  structEvaluation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ConditionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Return(): any;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ConstDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Const(): any;
  identifier(): any;
  Assign(): any;
  expression(): any;
  typeAnnotation(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class VariableDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifier(): any;
  typeAnnotation(): any;
  Assign(): any;
  expression(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  block(): any;
  expression(): any;
  constDeclaration(): any;
  variableDeclaration(): any;
  emptyStatement_(): any;
  propsDeclaration(): any;
  namespaceDeclaration(): any;
  ifStatement(): any;
  breakStatement(): any;
  switchStatement(): any;
  iterationStatement(): any;
  returnStatement(): any;
  throwStatement(): any;
  tryStatement(): any;
  arrowFunctionDeclaration(): any;
  builtInFunction(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BuiltInFunctionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class ApplyRuleStatementRulesListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  applyRulesRule: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ApplyRulesRuleContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  domainRuleIdentifier(): any;
  arguments(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BlockContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  CloseBrace(): any;
  statementList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StatementListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  statement: (i: any) => any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FromBlockContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  From(): any;
  StringLiteral(): any;
  eos(): any;
  Multiply(): any;
  multipleImportStatement(): any;
  As(): any;
  identifierName(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MultipleImportStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  identifierName: (i: any) => any;
  CloseBrace(): any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class VariableDeclarationListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  variableDeclaration: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EmptyStatement_Context {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ExpressionStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expressionSequence(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IfStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  If(): any;
  OpenParen(): any;
  condition(): any;
  CloseParen(): any;
  statement: (i: any) => any;
  Else(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IterationStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class VarModifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Var(): any;
  Let(): any;
  Const(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ContinueStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Continue(): any;
  eos(): any;
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BreakStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Break(): any;
  eos(): any;
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class WithStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  With(): any;
  OpenParen(): any;
  expressionSequence(): any;
  CloseParen(): any;
  statement(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class SwitchStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Switch(): any;
  OpenParen(): any;
  condition(): any;
  CloseParen(): any;
  caseBlock(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CaseBlockContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  defaultClause(): any;
  CloseBrace(): any;
  caseClauses: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CaseClausesContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  caseClause: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CaseClauseContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Case(): any;
  expression(): any;
  Colon(): any;
  OpenBrace(): any;
  CloseBrace(): any;
  statementList(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DefaultClauseContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Default(): any;
  Colon(): any;
  OpenBrace(): any;
  CloseBrace(): any;
  statementList(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LabelledStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  Colon(): any;
  statement(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ThrowStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Throw(): any;
  expressionSequence(): any;
  eos(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TryStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Try(): any;
  block(): any;
  catchProduction(): any;
  finallyProduction(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class CatchProductionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Catch(): any;
  OpenParen(): any;
  Identifier(): any;
  CloseParen(): any;
  block(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FinallyProductionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Finally(): any;
  block(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DebuggerStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Debugger(): any;
  eos(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainFieldDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  fieldList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IsBrokenStatementContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  IsBrokenIf(): any;
  OpenParen(): any;
  expression(): any;
  CloseParen(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainRuleBodyContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  functionBody(): any;
  isBrokenStatement(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainRuleDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Rule(): any;
  domainRuleIdentifier(): any;
  Throws(): any;
  ErrorIdentifier(): any;
  OpenBrace(): any;
  domainRuleBody(): any;
  CloseBrace(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AggregateDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Root(): any;
  Entity(): any;
  entityIdentifier(): any;
  entityBody(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainConstDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  constDeclaration(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EntityDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Entity(): any;
  entityIdentifier(): any;
  entityBody(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EntityBodyContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  domainConstDeclarationList(): any;
  domainConstructorDeclaration(): any;
  publicMethodDeclarationList(): any;
  privateMethodDeclarationList(): any;
  CloseBrace(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ValueObjectDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ValueObject(): any;
  valueObjectIdentifier(): any;
  OpenBrace(): any;
  domainConstDeclarationList(): any;
  domainConstructorDeclaration(): any;
  privateMethodDeclarationList(): any;
  CloseBrace(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainConstDeclarationListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  domainConstDeclaration: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PublicMethodDeclarationListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  publicMethodDeclaration: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PrivateMethodDeclarationListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  privateMethodDeclaration: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainConstructorDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Constructor(): any;
  Colon(): any;
  returnOkErrorType(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class UseCaseIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UseCaseIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class UseCaseDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UseCase(): any;
  useCaseIdentifier(): any;
  OpenBrace(): any;
  useCaseExecuteDeclaration(): any;
  CloseBrace(): any;
  formalParameterList(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropsDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Props(): any;
  PropsIdentifier(): any;
  OpenBrace(): any;
  fieldList(): any;
  CloseBrace(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReadModelDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ReadModel(): any;
  ReadModelIdentifier(): any;
  OpenBrace(): any;
  fieldList(): any;
  CloseBrace(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  RepoPort(): any;
  repoPortIdentifier(): any;
  LessThan(): any;
  ReadModelIdentifier(): any;
  MoreThan(): any;
  repoExtendsList(): any;
  SemiColon(): any;
  repoPortMethodDefinitions(): any;
  aggregateRootIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  RepoPortIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AggregateRootIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  EntityIdentifier(): any;
  ReadModelIdentifier(): any;
  Identifier(): any;
  UpperCaseIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoExtendsListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Extends(): any;
  repoPortExtendableIdentifierList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortMethodDefinitionsContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  methodDefinitionList(): any;
  CloseBrace(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortExtendableIdentifierListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  repoPortExtendableIdentifier: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RepoPortExtendableIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  RepoPortIdentifier(): any;
  UpperCaseIdentifier: (i: any) => any;
  LessThan(): any;
  MoreThan(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTO(): any;
  DTOIdentifier(): any;
  OpenBrace(): any;
  fieldList(): any;
  CloseBrace(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StructDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Struct(): any;
  UpperCaseIdentifier(): any;
  OpenBrace(): any;
  fieldList(): any;
  CloseBrace(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoEvaluationIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  dtoIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  dtoEvaluationIdentifier(): any;
  OpenParen(): any;
  OpenBrace(): any;
  evaluationFieldList(): any;
  CloseBrace(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ValueObjectEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  valueObjectIdentifier(): any;
  domainEvaluationInput(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainEvaluationInputContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class EntityEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  entityIdentifier(): any;
  domainEvaluationInput(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StructEvaluationIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  UpperCaseIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StructEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  structEvaluationIdentifier(): any;
  OpenParen(): any;
  OpenBrace(): any;
  evaluationFieldList(): any;
  CloseBrace(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BuiltInClassEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  bitloopsBuiltInClass(): any;
  methodArguments(): any;
  Dot(): any;
  identifier(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropsEvaluationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  OpenParen(): any;
  propsIdentifier(): any;
  CloseBrace(): any;
  CloseParen(): any;
  evaluationFieldList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainErrorDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DomainError(): any;
  domainErrorIdentifier(): any;
  OpenBrace(): any;
  CloseBrace(): any;
  formalParameterList(): any;
  evaluationFieldList(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ApplicationErrorDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ApplicationError(): any;
  applicationErrorIdentifier(): any;
  OpenBrace(): any;
  CloseBrace(): any;
  formalParameterList(): any;
  evaluationFieldList(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainErrorIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DomainErrorIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ApplicationErrorIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DomainErrorIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class UseCaseExecuteDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Execute(): any;
  Colon(): any;
  returnOkErrorType(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestControllerParametersContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier: (i: any) => any;
  Comma(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestControllerExecuteDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Execute(): any;
  OpenParen(): any;
  restControllerParameters(): any;
  CloseParen(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestControllerMethodDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Method(): any;
  Colon(): any;
  httpMethod(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class HttpMethodContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  MethodGet(): any;
  MethodPut(): any;
  MethodPost(): any;
  MethodDelete(): any;
  MethodPatch(): any;
  MethodOptions(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ControllerDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class GraphQLResolverOptionsContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  graphQLOperationTypeAssignment(): any;
  graphQLOperationInputTypeAssignment(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLOperationTypeAssignmentContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  GraphQLOperation(): any;
  Colon(): any;
  graphQLOperation(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLOperationInputTypeAssignmentContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Input(): any;
  Colon(): any;
  graphQLResolverInputType(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLResolverInputTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTOIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLOperationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OperationMutation(): any;
  OperationQuery(): any;
  OperationSubscription(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLControllerExecuteDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Execute(): any;
  OpenParen(): any;
  graphQLControllerParameters(): any;
  CloseParen(): any;
  Colon(): any;
  graphQLControllerReturnType(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLControllerParametersContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLControllerReturnTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTOIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  DTOIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DtoIdentifiersContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  dtoIdentifier: (i: any) => any;
  BitOr: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ErrorIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ErrorIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ErrorIdentifiersContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  errorIdentifier: (i: any) => any;
  BitOr: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ValueObjectIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ValueObjectIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EntityIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  EntityIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainRuleIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  RuleIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnOkTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OK(): any;
  OpenParen(): any;
  bitloopsPrimaryType(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnErrorsTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Errors(): any;
  OpenParen(): any;
  CloseParen(): any;
  errorIdentifiers(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnOkErrorTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): any;
  returnOkType(): any;
  Comma(): any;
  returnErrorsType(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PackagePortIdentifierContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  PackagePortIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PackagePortDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  PackagePort(): any;
  packagePortIdentifier(): any;
  OpenBrace(): any;
  methodDefinitionList(): any;
  CloseBrace(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class PrivateMethodDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifier(): any;
  returnPrivateMethodType(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  Private(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PublicMethodDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifier(): any;
  returnPublicMethodType(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  Public(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnPublicMethodTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Colon(): any;
  returnOkErrorType(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReturnPrivateMethodTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  typeAnnotation(): any;
  Colon(): any;
  returnOkErrorType(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyMemberBaseContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  accessibilityModifier(): any;
  Static(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IndexMemberDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  indexSignature(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GeneratorMethodContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  OpenParen(): any;
  CloseParen(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  Multiply(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GeneratorFunctionDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Function_(): any;
  Multiply(): any;
  OpenParen(): any;
  CloseParen(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  Identifier(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GeneratorBlockContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  generatorDefinition: (i: any) => any;
  CloseBrace(): any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GeneratorDefinitionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Multiply(): any;
  iteratorDefinition(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IteratorBlockContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  iteratorDefinition: (i: any) => any;
  CloseBrace(): any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IteratorDefinitionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBracket(): any;
  expression(): any;
  CloseBracket(): any;
  OpenParen(): any;
  CloseParen(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FormalParameterListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): any;
  CloseParen(): any;
  formalParameterArg: (i: any) => any;
  lastFormalParameterArg(): any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FormalParameterArgContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierOrKeyWord(): any;
  decorator(): any;
  accessibilityModifier(): any;
  typeAnnotation(): any;
  Assign(): any;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LastFormalParameterArgContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Ellipsis(): any;
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FunctionBodyContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  statementList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrayLiteralContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBracket(): any;
  CloseBracket(): any;
  elementList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ElementListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ObjectLiteralContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenBrace(): any;
  CloseBrace(): any;
  propertyAssignment: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularVariableEvaluationORliteralORexpressionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyAssignmentContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class GetAccessorContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  getter(): any;
  OpenParen(): any;
  CloseParen(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  typeAnnotation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class SetAccessorContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  setter(): any;
  OpenParen(): any;
  CloseParen(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  Identifier(): any;
  bindingPattern(): any;
  typeAnnotation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyNameContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  identifierName(): any;
  StringLiteral(): any;
  numericLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArgumentsContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  OpenParen(): any;
  CloseParen(): any;
  argumentList(): any;
  Comma(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArgumentListContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  argument: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArgumentContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  regularVariableEvaluationORliteralORexpression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ExpressionSequenceContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression: (i: any) => any;
  Comma: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class FunctionExpressionDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Function_(): any;
  OpenParen(): any;
  CloseParen(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  Identifier(): any;
  formalParameterList(): any;
  typeAnnotation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ExpressionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class AsExpressionContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  predefinedType(): any;
  OpenBracket(): any;
  CloseBracket(): any;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrowFunctionDeclarationContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  arrowFunctionParameters(): any;
  ARROW(): any;
  arrowFunctionBody(): any;
  Async(): any;
  typeAnnotation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrowFunctionParametersContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  OpenParen(): any;
  CloseParen(): any;
  formalParameterList(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrowFunctionBodyContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  expression(): any;
  OpenBrace(): any;
  functionBody(): any;
  CloseBrace(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AssignmentOperatorContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  MultiplyAssign(): any;
  DivideAssign(): any;
  ModulusAssign(): any;
  PlusAssign(): any;
  MinusAssign(): any;
  LeftShiftArithmeticAssign(): any;
  RightShiftArithmeticAssign(): any;
  RightShiftLogicalAssign(): any;
  BitAndAssign(): any;
  BitXorAssign(): any;
  BitOrAssign(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LiteralContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class TemplateStringLiteralContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  BackTick: (i: any) => any;
  templateStringAtom: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TemplateStringAtomContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  TemplateStringAtom(): any;
  TemplateStringStartExpression(): any;
  expression(): any;
  TemplateCloseBrace(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NumericLiteralContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
declare class IdentifierNameContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierOrKeyWordContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Identifier(): any;
  TypeAlias(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ReservedWordContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  keyword(): any;
  NullLiteral(): any;
  BooleanLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class KeywordContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Break(): any;
  Do(): any;
  Instanceof(): any;
  Typeof(): any;
  Case(): any;
  Else(): any;
  New(): any;
  Var(): any;
  Catch(): any;
  Finally(): any;
  Return(): any;
  Void(): any;
  Continue(): any;
  For(): any;
  Switch(): any;
  While(): any;
  Debugger(): any;
  Function_(): any;
  This(): any;
  With(): any;
  Default(): any;
  If(): any;
  Throw(): any;
  Delete(): any;
  In(): any;
  Try(): any;
  ReadOnly(): any;
  Async(): any;
  From(): any;
  UseCase(): any;
  Extends(): any;
  Const(): any;
  Let(): any;
  Private(): any;
  Public(): any;
  Protected(): any;
  Static(): any;
  Get(): any;
  Set(): any;
  TypeAlias(): any;
  String(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GetterContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Get(): any;
  propertyName(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class SetterContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  Set(): any;
  propertyName(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EosContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  SemiColon(): any;
  EOF(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IsInstanceOfContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  regularIdentifier(): any;
  Is(): any;
  classTypes(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ClassTypesContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  ErrorClass(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DeleteKeywordContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  Delete(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularDTOEvaluationStringContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  regularDTOEvaluation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularStructEvaluationStringContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  regularStructEvaluation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularErrorTypeEvaluationStringContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  regularErrorTypeEvaluation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierStringContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ExecuteExpressionContext extends RegularIdentifierContext {
  constructor(parser: any, ctx: any);
  Execute(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PrimitivePrimTypeContext extends BitloopsPrimaryTypeContext {
  constructor(parser: any, ctx: any);
  primitives(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrayBitloopsPrimTypeContext extends BitloopsPrimaryTypeContext {
  constructor(parser: any, ctx: any);
  bitloopsPrimaryType(): any;
  OpenBracket(): any;
  CloseBracket(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsBuiltInClassPrimTypeContext extends BitloopsPrimaryTypeContext {
  constructor(parser: any, ctx: any);
  bitloopsBuiltInClass(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsIdentifierPrimTypeContext extends BitloopsPrimaryTypeContext {
  constructor(parser: any, ctx: any);
  bitloopsIdentifiers(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ApplyRulesStatementContext extends BuiltInFunctionContext {
  constructor(parser: any, ctx: any);
  ApplyRules(): any;
  OpenParen(): any;
  applyRuleStatementRulesList(): any;
  CloseParen(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DoStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  Do(): any;
  statement(): any;
  While(): any;
  OpenParen(): any;
  expressionSequence(): any;
  CloseParen(): any;
  eos(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ForVarStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  For(): any;
  OpenParen(): any;
  varModifier(): any;
  variableDeclarationList(): any;
  SemiColon: (i: any) => any;
  CloseParen(): any;
  statement(): any;
  expressionSequence: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ForVarInStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  For(): any;
  OpenParen(): any;
  varModifier(): any;
  variableDeclaration(): any;
  expressionSequence(): any;
  CloseParen(): any;
  statement(): any;
  In(): any;
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class WhileStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  While(): any;
  OpenParen(): any;
  expressionSequence(): any;
  CloseParen(): any;
  statement(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ForStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  For(): any;
  OpenParen(): any;
  SemiColon: (i: any) => any;
  CloseParen(): any;
  statement(): any;
  expressionSequence: (i: any) => any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ForInStatementContext extends IterationStatementContext {
  constructor(parser: any, ctx: any);
  For(): any;
  OpenParen(): any;
  expression(): any;
  expressionSequence(): any;
  CloseParen(): any;
  statement(): any;
  In(): any;
  Identifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainEvaluationInputRegularContext extends DomainEvaluationInputContext {
  constructor(parser: any, ctx: any);
  OpenParen(): any;
  expression(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DomainEvaluationInputFieldListContext extends DomainEvaluationInputContext {
  constructor(parser: any, ctx: any);
  OpenParen(): any;
  OpenBrace(): any;
  evaluationFieldList(): any;
  CloseBrace(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RESTControllerDeclarationContext extends ControllerDeclarationContext {
  constructor(parser: any, ctx: any);
  RESTController(): any;
  ControllerIdentifier(): any;
  formalParameterList(): any;
  OpenBrace(): any;
  restControllerMethodDeclaration(): any;
  restControllerExecuteDeclaration(): any;
  CloseBrace(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GraphQLControllerDeclarationContext extends ControllerDeclarationContext {
  constructor(parser: any, ctx: any);
  GraphQLController(): any;
  ControllerIdentifier(): any;
  formalParameterList(): any;
  OpenBrace(): any;
  graphQLResolverOptions(): any;
  graphQLControllerExecuteDeclaration(): any;
  CloseBrace(): any;
  SemiColon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PublicMethodDeclarationExpressionContext extends MethodDeclarationContext {
  constructor(parser: any, ctx: any);
  publicMethodDeclaration(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PrivateMethodDeclarationExpressionContext extends MethodDeclarationContext {
  constructor(parser: any, ctx: any);
  privateMethodDeclaration(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  propertyName(): any;
  regularVariableEvaluationORliteralORexpression(): any;
  Colon(): any;
  Assign(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  OpenBracket(): any;
  regularVariableEvaluationORliteralORexpression: (i: any) => any;
  CloseBracket(): any;
  Colon(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyShorthandContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  identifierOrKeyWord(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertySetterContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  setAccessor(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class PropertyGetterContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  getAccessor(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RestParameterInObjectContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  restParameter(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodPropertyContext extends PropertyAssignmentContext {
  constructor(parser: any, ctx: any);
  generatorMethod(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ParenthesizedExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  OpenParen(): any;
  expression(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ToStringExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression(): any;
  Dot(): any;
  ToString(): any;
  OpenParen(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AdditiveExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Plus(): any;
  Minus(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RelationalExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  LessThan(): any;
  MoreThan(): any;
  LessThanEquals(): any;
  GreaterThanEquals(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LogicalAndExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  And(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LiteralExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  literal(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LogicalOrExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Or(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ArrayLiteralExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  arrayLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MemberDotExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression(): any;
  Dot(): any;
  regularIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NotExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  Not(): any;
  expression(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EvaluationExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  evaluation(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IdentifierExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  regularIdentifier(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class ThisExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  This(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class AssignmentExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression: (i: any) => any;
  Assign(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MethodCallExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression(): any;
  methodArguments(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class LogicalXorExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Xor(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class GetClassExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  expression(): any;
  Dot(): any;
  GetClass(): any;
  OpenParen(): any;
  CloseParen(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class EqualityExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Equals_(): any;
  NotEquals(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class MultiplicativeExpressionContext extends ExpressionContext {
  constructor(parser: any, ctx: any);
  op: any;
  expression: (i: any) => any;
  Multiply(): any;
  Divide(): any;
  Modulus(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class TemplateStringLiteralLabelContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  templateStringLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class StringLiteralContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  StringLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class RegularExpressionLiteralContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  RegularExpressionLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BooleanLiteralContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  BooleanLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NumericLiteralLabelContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  numericLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class NullLiteralContext extends LiteralContext {
  constructor(parser: any, ctx: any);
  NullLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class DecimalLiteralContext extends NumericLiteralContext {
  constructor(parser: any, ctx: any);
  DecimalLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class IntegerLiteralContext extends NumericLiteralContext {
  constructor(parser: any, ctx: any);
  IntegerLiteral(): any;
  enterRule(listener: any): void;
  exitRule(listener: any): void;
  accept(visitor: any): any;
}
declare class BitloopsPrimaryTypeContext {
  constructor(parser: any, parent: any, invokingState: any);
  parser: any;
  ruleIndex: number;
  copyFrom(ctx: any): void;
}
