// Generated from /home/markos/code/bitloops/bitloops-language-vscode/server/src/parser/grammar/BitloopsParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BitloopsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, RegularExpressionLiteral=3, OpenBracket=4, 
		CloseBracket=5, OpenParen=6, CloseParen=7, OpenBrace=8, TemplateCloseBrace=9, 
		CloseBrace=10, SemiColon=11, Comma=12, Assign=13, QuestionMark=14, Colon=15, 
		Ellipsis=16, Dot=17, PlusPlus=18, MinusMinus=19, Plus=20, Minus=21, BitNot=22, 
		Not=23, Multiply=24, Divide=25, Modulus=26, RightShiftArithmetic=27, LeftShiftArithmetic=28, 
		RightShiftLogical=29, LessThan=30, MoreThan=31, LessThanEquals=32, GreaterThanEquals=33, 
		Equals_=34, NotEquals=35, IdentityEquals=36, IdentityNotEquals=37, BitAnd=38, 
		BitXOr=39, BitOr=40, And=41, Or=42, Xor=43, MultiplyAssign=44, DivideAssign=45, 
		ModulusAssign=46, PlusAssign=47, MinusAssign=48, LeftShiftArithmeticAssign=49, 
		RightShiftArithmeticAssign=50, RightShiftLogicalAssign=51, BitAndAssign=52, 
		BitXorAssign=53, BitOrAssign=54, ARROW=55, NullLiteral=56, BooleanLiteral=57, 
		IntegerLiteral=58, DecimalLiteral=59, HexIntegerLiteral=60, OctalIntegerLiteral=61, 
		OctalIntegerLiteral2=62, BinaryIntegerLiteral=63, Optional=64, Break=65, 
		Do=66, Instanceof=67, Typeof=68, Case=69, Else=70, New=71, Var=72, Catch=73, 
		Finally=74, Return=75, Void=76, Continue=77, For=78, Switch=79, While=80, 
		Debugger=81, Function_=82, This=83, With=84, Default=85, If=86, Throw=87, 
		Delete=88, In=89, Try=90, As=91, From=92, ReadOnly=93, Async=94, Throws=95, 
		ApplyRules=96, Extends=97, Const=98, RepoPort=99, Props=100, ReadModel=101, 
		DTO=102, RESTController=103, GraphQLController=104, GRPCController=105, 
		UseCase=106, ValueObject=107, AggregateRoot=108, Entity=109, DomainEvent=110, 
		Service=111, Repository=112, Factory=113, DomainError=114, ApplicationError=115, 
		DomainErrors=116, ApplicationErrors=117, OK=118, Errors=119, Config=120, 
		PackagePort=121, VO=122, Rule=123, IsBrokenIf=124, Root=125, Constructor=126, 
		Let=127, Private=128, Public=129, Protected=130, Static=131, Any=132, 
		Double=133, Float=134, Int32=135, Int64=136, Uint32=137, Uint64=138, Sint32=139, 
		Sint64=140, Fixed32=141, Fixed64=142, Sfixed32=143, Sfixed64=144, Boolean=145, 
		String=146, Bytes=147, Timestamp=148, Struct=149, TypeAlias=150, Get=151, 
		Set=152, Execute=153, Create=154, Namespace=155, Declare=156, JestTest=157, 
		JestTestStatement=158, JestTestStatementList=159, JestTestFunctionBody=160, 
		JestTestExecute=161, JestTestStructEvaluation=162, JestTestDTOEvaluation=163, 
		JestTestEvaluation=164, JestTestReturnOkErrorType=165, JestTestExpression=166, 
		JestTestConstDeclaration=167, JestTestMethodDefinitionList=168, JestTestCreateMethodDeclaration=169, 
		JestTestPrivateMethodDeclaration=170, JestTestPublicMethodDeclaration=171, 
		JestTestValueObjectDeclaration=172, JestTestEntityDeclaration=173, JestTestCondition=174, 
		JestTestVariableDeclaration=175, JestTestThisDeclaration=176, JestTestIsInstanceOf=177, 
		JestTestValueObjectEvaluation=178, JestTestEntityEvaluation=179, JestTestSingleExpression=180, 
		JestTestGetClass=181, JestTestBuiltInFunction=182, JestTestBuiltInClass=183, 
		JestTestBitloopsPrimaryType=184, UUIDv4=185, Is=186, GetClass=187, ToString=188, 
		At=189, Method=190, MethodGet=191, MethodPost=192, MethodPut=193, MethodPatch=194, 
		MethodDelete=195, MethodOptions=196, GraphQLOperation=197, Input=198, 
		OperationMutation=199, OperationQuery=200, OperationSubscription=201, 
		ErrorClass=202, DTOIdentifier=203, ValueObjectIdentifier=204, EntityIdentifier=205, 
		ErrorIdentifier=206, ControllerIdentifier=207, UseCaseIdentifier=208, 
		PackagePortIdentifier=209, PropsIdentifier=210, ReadModelIdentifier=211, 
		RuleIdentifier=212, RepoPortIdentifier=213, DomainErrorIdentifier=214, 
		ValueObjectEvaluationIdentifier=215, UpperCaseIdentifier=216, Identifier=217, 
		StringLiteral=218, BackTick=219, WhiteSpaces=220, LineTerminator=221, 
		HtmlComment=222, CDataComment=223, UnexpectedCharacter=224, TemplateStringStartExpression=225, 
		TemplateStringAtom=226, WS=227;
	public static final int
		RULE_initializer = 0, RULE_bindingPattern = 1, RULE_fieldList = 2, RULE_evaluationFieldList = 3, 
		RULE_evaluationField = 4, RULE_propFields = 5, RULE_propsIdentifier = 6, 
		RULE_bitloopsIdentifiers = 7, RULE_primitives = 8, RULE_identifier = 9, 
		RULE_upperCaseIdentifier = 10, RULE_struct = 11, RULE_regularErrorTypeEvaluation = 12, 
		RULE_methodArguments = 13, RULE_openParen = 14, RULE_closeParen = 15, 
		RULE_regularIdentifier = 16, RULE_regularStringEvaluation = 17, RULE_regularIntegerEvaluation = 18, 
		RULE_regularDecimalEvaluation = 19, RULE_regularBooleanEvaluation = 20, 
		RULE_regularStructEvaluation = 21, RULE_regularDTOEvaluation = 22, RULE_field = 23, 
		RULE_bitloopsPrimaryType = 24, RULE_bitloopsBuiltInClass = 25, RULE_predefinedType = 26, 
		RULE_typeName = 27, RULE_methodDefinitionList = 28, RULE_methodDefinition = 29, 
		RULE_typeQuery = 30, RULE_typeQueryExpression = 31, RULE_typeAnnotation = 32, 
		RULE_parameterList = 33, RULE_requiredParameterList = 34, RULE_parameter = 35, 
		RULE_optionalParameter = 36, RULE_restParameter = 37, RULE_requiredParameter = 38, 
		RULE_accessibilityModifier = 39, RULE_identifierOrPattern = 40, RULE_indexSignature = 41, 
		RULE_enumBody = 42, RULE_enumMemberList = 43, RULE_enumMember = 44, RULE_namespaceDeclaration = 45, 
		RULE_namespaceName = 46, RULE_importAliasDeclaration = 47, RULE_decoratorList = 48, 
		RULE_decorator = 49, RULE_decoratorMemberExpression = 50, RULE_decoratorCallExpression = 51, 
		RULE_program = 52, RULE_sourceElement = 53, RULE_jestTestDeclaration = 54, 
		RULE_errorEvaluation = 55, RULE_evaluation = 56, RULE_condition = 57, 
		RULE_returnStatement = 58, RULE_constDeclaration = 59, RULE_variableDeclaration = 60, 
		RULE_statement = 61, RULE_builtInFunction = 62, RULE_applyRuleStatementRulesList = 63, 
		RULE_applyRulesRule = 64, RULE_block = 65, RULE_statementList = 66, RULE_fromBlock = 67, 
		RULE_multipleImportStatement = 68, RULE_variableDeclarationList = 69, 
		RULE_emptyStatement_ = 70, RULE_expressionStatement = 71, RULE_ifStatement = 72, 
		RULE_iterationStatement = 73, RULE_varModifier = 74, RULE_continueStatement = 75, 
		RULE_breakStatement = 76, RULE_withStatement = 77, RULE_switchStatement = 78, 
		RULE_caseBlock = 79, RULE_caseClauses = 80, RULE_caseClause = 81, RULE_defaultClause = 82, 
		RULE_labelledStatement = 83, RULE_throwStatement = 84, RULE_tryStatement = 85, 
		RULE_catchProduction = 86, RULE_finallyProduction = 87, RULE_debuggerStatement = 88, 
		RULE_domainFieldDeclaration = 89, RULE_isBrokenStatement = 90, RULE_domainRuleBody = 91, 
		RULE_domainRuleDeclaration = 92, RULE_aggregateDeclaration = 93, RULE_domainConstDeclaration = 94, 
		RULE_entityDeclaration = 95, RULE_entityBody = 96, RULE_valueObjectDeclaration = 97, 
		RULE_domainConstDeclarationList = 98, RULE_publicMethodDeclarationList = 99, 
		RULE_privateMethodDeclarationList = 100, RULE_domainConstructorDeclaration = 101, 
		RULE_useCaseIdentifier = 102, RULE_useCaseDeclaration = 103, RULE_propsDeclaration = 104, 
		RULE_readModelDeclaration = 105, RULE_repoPortDeclaration = 106, RULE_repoPortIdentifier = 107, 
		RULE_aggregateRootIdentifier = 108, RULE_repoExtendsList = 109, RULE_repoPortMethodDefinitions = 110, 
		RULE_repoPortExtendableIdentifierList = 111, RULE_repoPortExtendableIdentifier = 112, 
		RULE_dtoDeclaration = 113, RULE_structDeclaration = 114, RULE_dtoEvaluationIdentifier = 115, 
		RULE_dtoEvaluation = 116, RULE_valueObjectEvaluation = 117, RULE_domainEvaluationInput = 118, 
		RULE_entityEvaluation = 119, RULE_structEvaluationIdentifier = 120, RULE_structEvaluation = 121, 
		RULE_builtInClassEvaluation = 122, RULE_propsEvaluation = 123, RULE_domainErrorDeclaration = 124, 
		RULE_applicationErrorDeclaration = 125, RULE_domainErrorIdentifier = 126, 
		RULE_applicationErrorIdentifier = 127, RULE_useCaseExecuteDeclaration = 128, 
		RULE_restControllerParameters = 129, RULE_restControllerExecuteDeclaration = 130, 
		RULE_restControllerMethodDeclaration = 131, RULE_httpMethod = 132, RULE_controllerDeclaration = 133, 
		RULE_graphQLResolverOptions = 134, RULE_graphQLOperationTypeAssignment = 135, 
		RULE_graphQLOperationInputTypeAssignment = 136, RULE_graphQLResolverInputType = 137, 
		RULE_graphQLOperation = 138, RULE_graphQLControllerExecuteDeclaration = 139, 
		RULE_graphQLControllerParameters = 140, RULE_graphQLControllerReturnType = 141, 
		RULE_dtoIdentifier = 142, RULE_dtoIdentifiers = 143, RULE_errorIdentifier = 144, 
		RULE_errorIdentifiers = 145, RULE_valueObjectIdentifier = 146, RULE_entityIdentifier = 147, 
		RULE_domainRuleIdentifier = 148, RULE_returnOkType = 149, RULE_returnErrorsType = 150, 
		RULE_returnOkErrorType = 151, RULE_packagePortIdentifier = 152, RULE_packagePortDeclaration = 153, 
		RULE_methodDeclaration = 154, RULE_privateMethodDeclaration = 155, RULE_publicMethodDeclaration = 156, 
		RULE_returnPublicMethodType = 157, RULE_returnPrivateMethodType = 158, 
		RULE_propertyMemberBase = 159, RULE_indexMemberDeclaration = 160, RULE_generatorMethod = 161, 
		RULE_generatorFunctionDeclaration = 162, RULE_generatorBlock = 163, RULE_generatorDefinition = 164, 
		RULE_iteratorBlock = 165, RULE_iteratorDefinition = 166, RULE_formalParameterList = 167, 
		RULE_formalParameterArg = 168, RULE_lastFormalParameterArg = 169, RULE_functionBody = 170, 
		RULE_arrayLiteral = 171, RULE_elementList = 172, RULE_objectLiteral = 173, 
		RULE_regularVariableEvaluationORliteralORexpression = 174, RULE_propertyAssignment = 175, 
		RULE_getAccessor = 176, RULE_setAccessor = 177, RULE_propertyName = 178, 
		RULE_arguments = 179, RULE_argumentList = 180, RULE_argument = 181, RULE_expressionSequence = 182, 
		RULE_functionExpressionDeclaration = 183, RULE_expression = 184, RULE_asExpression = 185, 
		RULE_arrowFunctionDeclaration = 186, RULE_arrowFunctionParameters = 187, 
		RULE_arrowFunctionBody = 188, RULE_assignmentOperator = 189, RULE_literal = 190, 
		RULE_templateStringLiteral = 191, RULE_templateStringAtom = 192, RULE_numericLiteral = 193, 
		RULE_identifierName = 194, RULE_identifierOrKeyWord = 195, RULE_reservedWord = 196, 
		RULE_keyword = 197, RULE_getter = 198, RULE_setter = 199, RULE_eos = 200, 
		RULE_isInstanceOf = 201, RULE_classTypes = 202;
	private static String[] makeRuleNames() {
		return new String[] {
			"initializer", "bindingPattern", "fieldList", "evaluationFieldList", 
			"evaluationField", "propFields", "propsIdentifier", "bitloopsIdentifiers", 
			"primitives", "identifier", "upperCaseIdentifier", "struct", "regularErrorTypeEvaluation", 
			"methodArguments", "openParen", "closeParen", "regularIdentifier", "regularStringEvaluation", 
			"regularIntegerEvaluation", "regularDecimalEvaluation", "regularBooleanEvaluation", 
			"regularStructEvaluation", "regularDTOEvaluation", "field", "bitloopsPrimaryType", 
			"bitloopsBuiltInClass", "predefinedType", "typeName", "methodDefinitionList", 
			"methodDefinition", "typeQuery", "typeQueryExpression", "typeAnnotation", 
			"parameterList", "requiredParameterList", "parameter", "optionalParameter", 
			"restParameter", "requiredParameter", "accessibilityModifier", "identifierOrPattern", 
			"indexSignature", "enumBody", "enumMemberList", "enumMember", "namespaceDeclaration", 
			"namespaceName", "importAliasDeclaration", "decoratorList", "decorator", 
			"decoratorMemberExpression", "decoratorCallExpression", "program", "sourceElement", 
			"jestTestDeclaration", "errorEvaluation", "evaluation", "condition", 
			"returnStatement", "constDeclaration", "variableDeclaration", "statement", 
			"builtInFunction", "applyRuleStatementRulesList", "applyRulesRule", "block", 
			"statementList", "fromBlock", "multipleImportStatement", "variableDeclarationList", 
			"emptyStatement_", "expressionStatement", "ifStatement", "iterationStatement", 
			"varModifier", "continueStatement", "breakStatement", "withStatement", 
			"switchStatement", "caseBlock", "caseClauses", "caseClause", "defaultClause", 
			"labelledStatement", "throwStatement", "tryStatement", "catchProduction", 
			"finallyProduction", "debuggerStatement", "domainFieldDeclaration", "isBrokenStatement", 
			"domainRuleBody", "domainRuleDeclaration", "aggregateDeclaration", "domainConstDeclaration", 
			"entityDeclaration", "entityBody", "valueObjectDeclaration", "domainConstDeclarationList", 
			"publicMethodDeclarationList", "privateMethodDeclarationList", "domainConstructorDeclaration", 
			"useCaseIdentifier", "useCaseDeclaration", "propsDeclaration", "readModelDeclaration", 
			"repoPortDeclaration", "repoPortIdentifier", "aggregateRootIdentifier", 
			"repoExtendsList", "repoPortMethodDefinitions", "repoPortExtendableIdentifierList", 
			"repoPortExtendableIdentifier", "dtoDeclaration", "structDeclaration", 
			"dtoEvaluationIdentifier", "dtoEvaluation", "valueObjectEvaluation", 
			"domainEvaluationInput", "entityEvaluation", "structEvaluationIdentifier", 
			"structEvaluation", "builtInClassEvaluation", "propsEvaluation", "domainErrorDeclaration", 
			"applicationErrorDeclaration", "domainErrorIdentifier", "applicationErrorIdentifier", 
			"useCaseExecuteDeclaration", "restControllerParameters", "restControllerExecuteDeclaration", 
			"restControllerMethodDeclaration", "httpMethod", "controllerDeclaration", 
			"graphQLResolverOptions", "graphQLOperationTypeAssignment", "graphQLOperationInputTypeAssignment", 
			"graphQLResolverInputType", "graphQLOperation", "graphQLControllerExecuteDeclaration", 
			"graphQLControllerParameters", "graphQLControllerReturnType", "dtoIdentifier", 
			"dtoIdentifiers", "errorIdentifier", "errorIdentifiers", "valueObjectIdentifier", 
			"entityIdentifier", "domainRuleIdentifier", "returnOkType", "returnErrorsType", 
			"returnOkErrorType", "packagePortIdentifier", "packagePortDeclaration", 
			"methodDeclaration", "privateMethodDeclaration", "publicMethodDeclaration", 
			"returnPublicMethodType", "returnPrivateMethodType", "propertyMemberBase", 
			"indexMemberDeclaration", "generatorMethod", "generatorFunctionDeclaration", 
			"generatorBlock", "generatorDefinition", "iteratorBlock", "iteratorDefinition", 
			"formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
			"functionBody", "arrayLiteral", "elementList", "objectLiteral", "regularVariableEvaluationORliteralORexpression", 
			"propertyAssignment", "getAccessor", "setAccessor", "propertyName", "arguments", 
			"argumentList", "argument", "expressionSequence", "functionExpressionDeclaration", 
			"expression", "asExpression", "arrowFunctionDeclaration", "arrowFunctionParameters", 
			"arrowFunctionBody", "assignmentOperator", "literal", "templateStringLiteral", 
			"templateStringAtom", "numericLiteral", "identifierName", "identifierOrKeyWord", 
			"reservedWord", "keyword", "getter", "setter", "eos", "isInstanceOf", 
			"classTypes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'['", "']'", "'('", "')'", "'{'", null, "'}'", 
			"';'", "','", "'='", "'?'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", 
			"'-'", "'~'", "'NOT'", "'*'", "'/'", "'%'", "'>>'", "'<<'", "'>>>'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", 
			"'^'", "'|'", "'AND'", "'OR'", "'XOR'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'=>'", "'null'", 
			null, null, null, null, null, null, null, "'optional'", "'break'", "'do'", 
			"'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", 
			"'finally'", "'return'", "'void'", "'continue'", "'for'", "'switch'", 
			"'while'", "'debugger'", "'function'", "'this'", "'with'", "'default'", 
			"'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", "'from'", "'readonly'", 
			"'async'", "'throws'", "'applyRules'", "'extends'", "'const'", "'RepoPort'", 
			"'Props'", "'ReadModel'", "'DTO'", "'RESTController'", "'GraphQLController'", 
			"'GRPCController'", "'UseCase'", "'ValueObject'", "'AggregateRoot'", 
			"'Entity'", "'DomainEvent'", "'Service'", "'Repository'", "'Factory'", 
			"'DomainError'", "'ApplicationError'", "'DomainErrors'", "'ApplicationErrors'", 
			"'OK'", "'Errors'", "'Config'", "'PackagePort'", "'VO'", "'Rule'", "'isBrokenIf'", 
			"'Root'", "'constructor'", "'let'", "'private'", "'public'", "'protected'", 
			"'static'", "'any'", "'double'", "'float'", "'int32'", "'int64'", "'uint32'", 
			"'uint64'", "'sint32'", "'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", 
			"'sfixed64'", "'bool'", "'string'", "'bytes'", "'timestamp'", "'Struct'", 
			"'type'", "'get'", "'set'", "'execute'", "'create'", "'namespace'", "'declare'", 
			"'JestTest'", "'JestTestStatement'", "'JestTestStatementList'", "'JestTestFunctionBody'", 
			"'JestTestExecute'", "'JestTestStructEvaluation'", "'JestTestDTOEvaluation'", 
			"'JestTestEvaluation'", "'JestTestReturnOkErrorType'", "'JestTestExpression'", 
			"'JestTestConstDeclaration'", "'JestTestMethodDefinitionList'", "'JestTestCreateMethodDeclaration'", 
			"'JestTestPrivateMethodDeclaration'", "'JestTestPublicMethodDeclaration'", 
			"'JestTestValueObjectDeclaration'", "'JestTestEntityDeclaration'", "'JestTestCondition'", 
			"'JestTestVariableDeclaration'", "'JestTestThisDeclaration'", "'JestTestIsInstanceOf'", 
			"'JestTestValueObjectEvaluation'", "'JestTestEntityEvaluation'", "'JestTestSingleExpression'", 
			"'JestTestGetClass'", "'JestTestBuiltInFunction'", "'JestTestBuiltInClass'", 
			"'JestTestBitloopsPrimaryType'", "'UUIDv4'", "'is'", "'getClass'", "'toString'", 
			"'@'", "'method'", "'REST.Methods.GET'", "'REST.Methods.POST'", "'REST.Methods.PUT'", 
			"'REST.Methods.PATCH'", "'REST.Methods.DELETE'", "'REST.Methods.OPTIONS'", 
			"'operation'", "'input'", "'GraphQL.Operations.Mutation'", "'GraphQL.Operations.Query'", 
			"'GraphQL.Operations.Subscription'", "'Error'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"TemplateCloseBrace", "CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", 
			"Colon", "Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", 
			"BitNot", "Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic", 
			"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", 
			"GreaterThanEquals", "Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
			"BitAnd", "BitXOr", "BitOr", "And", "Or", "Xor", "MultiplyAssign", "DivideAssign", 
			"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"BitXorAssign", "BitOrAssign", "ARROW", "NullLiteral", "BooleanLiteral", 
			"IntegerLiteral", "DecimalLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
			"OctalIntegerLiteral2", "BinaryIntegerLiteral", "Optional", "Break", 
			"Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", "Catch", 
			"Finally", "Return", "Void", "Continue", "For", "Switch", "While", "Debugger", 
			"Function_", "This", "With", "Default", "If", "Throw", "Delete", "In", 
			"Try", "As", "From", "ReadOnly", "Async", "Throws", "ApplyRules", "Extends", 
			"Const", "RepoPort", "Props", "ReadModel", "DTO", "RESTController", "GraphQLController", 
			"GRPCController", "UseCase", "ValueObject", "AggregateRoot", "Entity", 
			"DomainEvent", "Service", "Repository", "Factory", "DomainError", "ApplicationError", 
			"DomainErrors", "ApplicationErrors", "OK", "Errors", "Config", "PackagePort", 
			"VO", "Rule", "IsBrokenIf", "Root", "Constructor", "Let", "Private", 
			"Public", "Protected", "Static", "Any", "Double", "Float", "Int32", "Int64", 
			"Uint32", "Uint64", "Sint32", "Sint64", "Fixed32", "Fixed64", "Sfixed32", 
			"Sfixed64", "Boolean", "String", "Bytes", "Timestamp", "Struct", "TypeAlias", 
			"Get", "Set", "Execute", "Create", "Namespace", "Declare", "JestTest", 
			"JestTestStatement", "JestTestStatementList", "JestTestFunctionBody", 
			"JestTestExecute", "JestTestStructEvaluation", "JestTestDTOEvaluation", 
			"JestTestEvaluation", "JestTestReturnOkErrorType", "JestTestExpression", 
			"JestTestConstDeclaration", "JestTestMethodDefinitionList", "JestTestCreateMethodDeclaration", 
			"JestTestPrivateMethodDeclaration", "JestTestPublicMethodDeclaration", 
			"JestTestValueObjectDeclaration", "JestTestEntityDeclaration", "JestTestCondition", 
			"JestTestVariableDeclaration", "JestTestThisDeclaration", "JestTestIsInstanceOf", 
			"JestTestValueObjectEvaluation", "JestTestEntityEvaluation", "JestTestSingleExpression", 
			"JestTestGetClass", "JestTestBuiltInFunction", "JestTestBuiltInClass", 
			"JestTestBitloopsPrimaryType", "UUIDv4", "Is", "GetClass", "ToString", 
			"At", "Method", "MethodGet", "MethodPost", "MethodPut", "MethodPatch", 
			"MethodDelete", "MethodOptions", "GraphQLOperation", "Input", "OperationMutation", 
			"OperationQuery", "OperationSubscription", "ErrorClass", "DTOIdentifier", 
			"ValueObjectIdentifier", "EntityIdentifier", "ErrorIdentifier", "ControllerIdentifier", 
			"UseCaseIdentifier", "PackagePortIdentifier", "PropsIdentifier", "ReadModelIdentifier", 
			"RuleIdentifier", "RepoPortIdentifier", "DomainErrorIdentifier", "ValueObjectEvaluationIdentifier", 
			"UpperCaseIdentifier", "Identifier", "StringLiteral", "BackTick", "WhiteSpaces", 
			"LineTerminator", "HtmlComment", "CDataComment", "UnexpectedCharacter", 
			"TemplateStringStartExpression", "TemplateStringAtom", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BitloopsParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BitloopsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(BitloopsParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(Assign);
			setState(407);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingPatternContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public BindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPattern; }
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bindingPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				{
				setState(409);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				setState(410);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldListContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(BitloopsParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(BitloopsParser.SemiColon, i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			field();
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(414);
					match(SemiColon);
					setState(415);
					field();
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(421);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvaluationFieldListContext extends ParserRuleContext {
		public List<EvaluationFieldContext> evaluationField() {
			return getRuleContexts(EvaluationFieldContext.class);
		}
		public EvaluationFieldContext evaluationField(int i) {
			return getRuleContext(EvaluationFieldContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public EvaluationFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluationFieldList; }
	}

	public final EvaluationFieldListContext evaluationFieldList() throws RecognitionException {
		EvaluationFieldListContext _localctx = new EvaluationFieldListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_evaluationFieldList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			evaluationField();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					match(Comma);
					setState(425);
					evaluationField();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(431);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvaluationFieldContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvaluationFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluationField; }
	}

	public final EvaluationFieldContext evaluationField() throws RecognitionException {
		EvaluationFieldContext _localctx = new EvaluationFieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_evaluationField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(Identifier);
			setState(435);
			match(Colon);
			setState(436);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropFieldsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public PropFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propFields; }
	}

	public final PropFieldsContext propFields() throws RecognitionException {
		PropFieldsContext _localctx = new PropFieldsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(OpenBrace);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Optional || _la==Void || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Any - 132)) | (1L << (Double - 132)) | (1L << (Float - 132)) | (1L << (Int32 - 132)) | (1L << (Int64 - 132)) | (1L << (Uint32 - 132)) | (1L << (Uint64 - 132)) | (1L << (Sint32 - 132)) | (1L << (Sint64 - 132)) | (1L << (Fixed32 - 132)) | (1L << (Fixed64 - 132)) | (1L << (Sfixed32 - 132)) | (1L << (Sfixed64 - 132)) | (1L << (Boolean - 132)) | (1L << (String - 132)) | (1L << (Bytes - 132)) | (1L << (Timestamp - 132)) | (1L << (UUIDv4 - 132)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DTOIdentifier - 203)) | (1L << (ValueObjectIdentifier - 203)) | (1L << (EntityIdentifier - 203)) | (1L << (ErrorIdentifier - 203)) | (1L << (ControllerIdentifier - 203)) | (1L << (UseCaseIdentifier - 203)) | (1L << (PropsIdentifier - 203)) | (1L << (ReadModelIdentifier - 203)) | (1L << (RepoPortIdentifier - 203)) | (1L << (UpperCaseIdentifier - 203)))) != 0)) {
				{
				setState(439);
				fieldList();
				}
			}

			setState(442);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropsIdentifierContext extends ParserRuleContext {
		public TerminalNode PropsIdentifier() { return getToken(BitloopsParser.PropsIdentifier, 0); }
		public PropsIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsIdentifier; }
	}

	public final PropsIdentifierContext propsIdentifier() throws RecognitionException {
		PropsIdentifierContext _localctx = new PropsIdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propsIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(PropsIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitloopsIdentifiersContext extends ParserRuleContext {
		public TerminalNode UseCaseIdentifier() { return getToken(BitloopsParser.UseCaseIdentifier, 0); }
		public DtoIdentifierContext dtoIdentifier() {
			return getRuleContext(DtoIdentifierContext.class,0);
		}
		public TerminalNode ControllerIdentifier() { return getToken(BitloopsParser.ControllerIdentifier, 0); }
		public TerminalNode ErrorIdentifier() { return getToken(BitloopsParser.ErrorIdentifier, 0); }
		public PropsIdentifierContext propsIdentifier() {
			return getRuleContext(PropsIdentifierContext.class,0);
		}
		public TerminalNode ValueObjectIdentifier() { return getToken(BitloopsParser.ValueObjectIdentifier, 0); }
		public TerminalNode EntityIdentifier() { return getToken(BitloopsParser.EntityIdentifier, 0); }
		public TerminalNode RepoPortIdentifier() { return getToken(BitloopsParser.RepoPortIdentifier, 0); }
		public TerminalNode ReadModelIdentifier() { return getToken(BitloopsParser.ReadModelIdentifier, 0); }
		public TerminalNode UpperCaseIdentifier() { return getToken(BitloopsParser.UpperCaseIdentifier, 0); }
		public BitloopsIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitloopsIdentifiers; }
	}

	public final BitloopsIdentifiersContext bitloopsIdentifiers() throws RecognitionException {
		BitloopsIdentifiersContext _localctx = new BitloopsIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bitloopsIdentifiers);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UseCaseIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(UseCaseIdentifier);
				}
				break;
			case DTOIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				dtoIdentifier();
				}
				break;
			case ControllerIdentifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(ControllerIdentifier);
				}
				break;
			case ErrorIdentifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(ErrorIdentifier);
				}
				break;
			case PropsIdentifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				propsIdentifier();
				}
				break;
			case ValueObjectIdentifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				match(ValueObjectIdentifier);
				}
				break;
			case EntityIdentifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				match(EntityIdentifier);
				}
				break;
			case RepoPortIdentifier:
				enterOuterAlt(_localctx, 8);
				{
				setState(453);
				match(RepoPortIdentifier);
				}
				break;
			case ReadModelIdentifier:
				enterOuterAlt(_localctx, 9);
				{
				setState(454);
				match(ReadModelIdentifier);
				}
				break;
			case UpperCaseIdentifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(455);
				match(UpperCaseIdentifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitivesContext extends ParserRuleContext {
		public TerminalNode Any() { return getToken(BitloopsParser.Any, 0); }
		public TerminalNode Double() { return getToken(BitloopsParser.Double, 0); }
		public TerminalNode Float() { return getToken(BitloopsParser.Float, 0); }
		public TerminalNode Int32() { return getToken(BitloopsParser.Int32, 0); }
		public TerminalNode Int64() { return getToken(BitloopsParser.Int64, 0); }
		public TerminalNode Uint32() { return getToken(BitloopsParser.Uint32, 0); }
		public TerminalNode Uint64() { return getToken(BitloopsParser.Uint64, 0); }
		public TerminalNode Sint32() { return getToken(BitloopsParser.Sint32, 0); }
		public TerminalNode Sint64() { return getToken(BitloopsParser.Sint64, 0); }
		public TerminalNode Fixed32() { return getToken(BitloopsParser.Fixed32, 0); }
		public TerminalNode Fixed64() { return getToken(BitloopsParser.Fixed64, 0); }
		public TerminalNode Sfixed32() { return getToken(BitloopsParser.Sfixed32, 0); }
		public TerminalNode Sfixed64() { return getToken(BitloopsParser.Sfixed64, 0); }
		public TerminalNode Boolean() { return getToken(BitloopsParser.Boolean, 0); }
		public TerminalNode String() { return getToken(BitloopsParser.String, 0); }
		public TerminalNode Bytes() { return getToken(BitloopsParser.Bytes, 0); }
		public TerminalNode Timestamp() { return getToken(BitloopsParser.Timestamp, 0); }
		public TerminalNode Void() { return getToken(BitloopsParser.Void, 0); }
		public PrimitivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitives; }
	}

	public final PrimitivesContext primitives() throws RecognitionException {
		PrimitivesContext _localctx = new PrimitivesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Void - 76)) | (1L << (Any - 76)) | (1L << (Double - 76)) | (1L << (Float - 76)) | (1L << (Int32 - 76)) | (1L << (Int64 - 76)) | (1L << (Uint32 - 76)) | (1L << (Uint64 - 76)) | (1L << (Sint32 - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (Sint64 - 140)) | (1L << (Fixed32 - 140)) | (1L << (Fixed64 - 140)) | (1L << (Sfixed32 - 140)) | (1L << (Sfixed64 - 140)) | (1L << (Boolean - 140)) | (1L << (String - 140)) | (1L << (Bytes - 140)) | (1L << (Timestamp - 140)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpperCaseIdentifierContext extends ParserRuleContext {
		public TerminalNode UpperCaseIdentifier() { return getToken(BitloopsParser.UpperCaseIdentifier, 0); }
		public UpperCaseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperCaseIdentifier; }
	}

	public final UpperCaseIdentifierContext upperCaseIdentifier() throws RecognitionException {
		UpperCaseIdentifierContext _localctx = new UpperCaseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_upperCaseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(UpperCaseIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructContext extends ParserRuleContext {
		public TerminalNode UpperCaseIdentifier() { return getToken(BitloopsParser.UpperCaseIdentifier, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(UpperCaseIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularErrorTypeEvaluationContext extends ParserRuleContext {
		public ErrorIdentifierContext errorIdentifier() {
			return getRuleContext(ErrorIdentifierContext.class,0);
		}
		public RegularErrorTypeEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularErrorTypeEvaluation; }
	}

	public final RegularErrorTypeEvaluationContext regularErrorTypeEvaluation() throws RecognitionException {
		RegularErrorTypeEvaluationContext _localctx = new RegularErrorTypeEvaluationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_regularErrorTypeEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			errorIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(OpenParen);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || _la==This || _la==Delete || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
				{
				setState(469);
				argumentList();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(470);
					match(Comma);
					setState(471);
					argumentList();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(479);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenParenContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public OpenParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openParen; }
	}

	public final OpenParenContext openParen() throws RecognitionException {
		OpenParenContext _localctx = new OpenParenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_openParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(OpenParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseParenContext extends ParserRuleContext {
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public CloseParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeParen; }
	}

	public final CloseParenContext closeParen() throws RecognitionException {
		CloseParenContext _localctx = new CloseParenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_closeParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularIdentifierContext extends ParserRuleContext {
		public RegularIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularIdentifier; }
	 
		public RegularIdentifierContext() { }
		public void copyFrom(RegularIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteKeywordContext extends RegularIdentifierContext {
		public TerminalNode Delete() { return getToken(BitloopsParser.Delete, 0); }
		public DeleteKeywordContext(RegularIdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class RegularDTOEvaluationStringContext extends RegularIdentifierContext {
		public RegularDTOEvaluationContext regularDTOEvaluation() {
			return getRuleContext(RegularDTOEvaluationContext.class,0);
		}
		public RegularDTOEvaluationStringContext(RegularIdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class RegularStructEvaluationStringContext extends RegularIdentifierContext {
		public RegularStructEvaluationContext regularStructEvaluation() {
			return getRuleContext(RegularStructEvaluationContext.class,0);
		}
		public RegularStructEvaluationStringContext(RegularIdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class RegularErrorTypeEvaluationStringContext extends RegularIdentifierContext {
		public RegularErrorTypeEvaluationContext regularErrorTypeEvaluation() {
			return getRuleContext(RegularErrorTypeEvaluationContext.class,0);
		}
		public RegularErrorTypeEvaluationStringContext(RegularIdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierStringContext extends RegularIdentifierContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public IdentifierStringContext(RegularIdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class ExecuteExpressionContext extends RegularIdentifierContext {
		public TerminalNode Execute() { return getToken(BitloopsParser.Execute, 0); }
		public ExecuteExpressionContext(RegularIdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class CreateExpressionContext extends RegularIdentifierContext {
		public TerminalNode Create() { return getToken(BitloopsParser.Create, 0); }
		public CreateExpressionContext(RegularIdentifierContext ctx) { copyFrom(ctx); }
	}

	public final RegularIdentifierContext regularIdentifier() throws RecognitionException {
		RegularIdentifierContext _localctx = new RegularIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_regularIdentifier);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentifierStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(Identifier);
				}
				break;
			case DTOIdentifier:
				_localctx = new RegularDTOEvaluationStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				regularDTOEvaluation();
				}
				break;
			case UpperCaseIdentifier:
				_localctx = new RegularStructEvaluationStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				regularStructEvaluation();
				}
				break;
			case ErrorIdentifier:
				_localctx = new RegularErrorTypeEvaluationStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				regularErrorTypeEvaluation();
				}
				break;
			case Execute:
				_localctx = new ExecuteExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				match(Execute);
				}
				break;
			case Create:
				_localctx = new CreateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(490);
				match(Create);
				}
				break;
			case Delete:
				_localctx = new DeleteKeywordContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(491);
				match(Delete);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularStringEvaluationContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(BitloopsParser.StringLiteral, 0); }
		public RegularStringEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularStringEvaluation; }
	}

	public final RegularStringEvaluationContext regularStringEvaluation() throws RecognitionException {
		RegularStringEvaluationContext _localctx = new RegularStringEvaluationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_regularStringEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularIntegerEvaluationContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(BitloopsParser.IntegerLiteral, 0); }
		public RegularIntegerEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularIntegerEvaluation; }
	}

	public final RegularIntegerEvaluationContext regularIntegerEvaluation() throws RecognitionException {
		RegularIntegerEvaluationContext _localctx = new RegularIntegerEvaluationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_regularIntegerEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularDecimalEvaluationContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(BitloopsParser.DecimalLiteral, 0); }
		public RegularDecimalEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularDecimalEvaluation; }
	}

	public final RegularDecimalEvaluationContext regularDecimalEvaluation() throws RecognitionException {
		RegularDecimalEvaluationContext _localctx = new RegularDecimalEvaluationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_regularDecimalEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularBooleanEvaluationContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(BitloopsParser.BooleanLiteral, 0); }
		public RegularBooleanEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularBooleanEvaluation; }
	}

	public final RegularBooleanEvaluationContext regularBooleanEvaluation() throws RecognitionException {
		RegularBooleanEvaluationContext _localctx = new RegularBooleanEvaluationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_regularBooleanEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(BooleanLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularStructEvaluationContext extends ParserRuleContext {
		public TerminalNode UpperCaseIdentifier() { return getToken(BitloopsParser.UpperCaseIdentifier, 0); }
		public RegularStructEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularStructEvaluation; }
	}

	public final RegularStructEvaluationContext regularStructEvaluation() throws RecognitionException {
		RegularStructEvaluationContext _localctx = new RegularStructEvaluationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_regularStructEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(UpperCaseIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularDTOEvaluationContext extends ParserRuleContext {
		public TerminalNode DTOIdentifier() { return getToken(BitloopsParser.DTOIdentifier, 0); }
		public RegularDTOEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularDTOEvaluation; }
	}

	public final RegularDTOEvaluationContext regularDTOEvaluation() throws RecognitionException {
		RegularDTOEvaluationContext _localctx = new RegularDTOEvaluationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_regularDTOEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(DTOIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public BitloopsPrimaryTypeContext bitloopsPrimaryType() {
			return getRuleContext(BitloopsPrimaryTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Optional() { return getToken(BitloopsParser.Optional, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Optional) {
				{
				setState(506);
				match(Optional);
				}
			}

			setState(509);
			bitloopsPrimaryType(0);
			setState(510);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitloopsPrimaryTypeContext extends ParserRuleContext {
		public BitloopsPrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitloopsPrimaryType; }
	 
		public BitloopsPrimaryTypeContext() { }
		public void copyFrom(BitloopsPrimaryTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitivePrimTypeContext extends BitloopsPrimaryTypeContext {
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public PrimitivePrimTypeContext(BitloopsPrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayBitloopsPrimTypeContext extends BitloopsPrimaryTypeContext {
		public BitloopsPrimaryTypeContext bitloopsPrimaryType() {
			return getRuleContext(BitloopsPrimaryTypeContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(BitloopsParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(BitloopsParser.CloseBracket, 0); }
		public ArrayBitloopsPrimTypeContext(BitloopsPrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class BitloopsBuiltInClassPrimTypeContext extends BitloopsPrimaryTypeContext {
		public BitloopsBuiltInClassContext bitloopsBuiltInClass() {
			return getRuleContext(BitloopsBuiltInClassContext.class,0);
		}
		public BitloopsBuiltInClassPrimTypeContext(BitloopsPrimaryTypeContext ctx) { copyFrom(ctx); }
	}
	public static class BitloopsIdentifierPrimTypeContext extends BitloopsPrimaryTypeContext {
		public BitloopsIdentifiersContext bitloopsIdentifiers() {
			return getRuleContext(BitloopsIdentifiersContext.class,0);
		}
		public BitloopsIdentifierPrimTypeContext(BitloopsPrimaryTypeContext ctx) { copyFrom(ctx); }
	}

	public final BitloopsPrimaryTypeContext bitloopsPrimaryType() throws RecognitionException {
		return bitloopsPrimaryType(0);
	}

	private BitloopsPrimaryTypeContext bitloopsPrimaryType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitloopsPrimaryTypeContext _localctx = new BitloopsPrimaryTypeContext(_ctx, _parentState);
		BitloopsPrimaryTypeContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_bitloopsPrimaryType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
			case Any:
			case Double:
			case Float:
			case Int32:
			case Int64:
			case Uint32:
			case Uint64:
			case Sint32:
			case Sint64:
			case Fixed32:
			case Fixed64:
			case Sfixed32:
			case Sfixed64:
			case Boolean:
			case String:
			case Bytes:
			case Timestamp:
				{
				_localctx = new PrimitivePrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(513);
				primitives();
				}
				break;
			case UUIDv4:
				{
				_localctx = new BitloopsBuiltInClassPrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(514);
				bitloopsBuiltInClass();
				}
				break;
			case DTOIdentifier:
			case ValueObjectIdentifier:
			case EntityIdentifier:
			case ErrorIdentifier:
			case ControllerIdentifier:
			case UseCaseIdentifier:
			case PropsIdentifier:
			case ReadModelIdentifier:
			case RepoPortIdentifier:
			case UpperCaseIdentifier:
				{
				_localctx = new BitloopsIdentifierPrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(515);
				bitloopsIdentifiers();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayBitloopsPrimTypeContext(new BitloopsPrimaryTypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bitloopsPrimaryType);
					setState(518);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(519);
					match(OpenBracket);
					setState(520);
					match(CloseBracket);
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BitloopsBuiltInClassContext extends ParserRuleContext {
		public TerminalNode UUIDv4() { return getToken(BitloopsParser.UUIDv4, 0); }
		public BitloopsBuiltInClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitloopsBuiltInClass; }
	}

	public final BitloopsBuiltInClassContext bitloopsBuiltInClass() throws RecognitionException {
		BitloopsBuiltInClassContext _localctx = new BitloopsBuiltInClassContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bitloopsBuiltInClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(UUIDv4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredefinedTypeContext extends ParserRuleContext {
		public TerminalNode Any() { return getToken(BitloopsParser.Any, 0); }
		public TerminalNode Int32() { return getToken(BitloopsParser.Int32, 0); }
		public TerminalNode Boolean() { return getToken(BitloopsParser.Boolean, 0); }
		public TerminalNode String() { return getToken(BitloopsParser.String, 0); }
		public TerminalNode Struct() { return getToken(BitloopsParser.Struct, 0); }
		public TerminalNode Void() { return getToken(BitloopsParser.Void, 0); }
		public PredefinedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedType; }
	}

	public final PredefinedTypeContext predefinedType() throws RecognitionException {
		PredefinedTypeContext _localctx = new PredefinedTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_predefinedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Void - 76)) | (1L << (Any - 76)) | (1L << (Int32 - 76)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (Boolean - 145)) | (1L << (String - 145)) | (1L << (Struct - 145)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				namespaceName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionListContext extends ParserRuleContext {
		public List<MethodDefinitionContext> methodDefinition() {
			return getRuleContexts(MethodDefinitionContext.class);
		}
		public MethodDefinitionContext methodDefinition(int i) {
			return getRuleContext(MethodDefinitionContext.class,i);
		}
		public MethodDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinitionList; }
	}

	public final MethodDefinitionListContext methodDefinitionList() throws RecognitionException {
		MethodDefinitionListContext _localctx = new MethodDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDefinitionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(534);
				methodDefinition();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			identifier();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(541);
				formalParameterList();
				}
			}

			setState(544);
			typeAnnotation();
			setState(545);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQueryContext extends ParserRuleContext {
		public TerminalNode Typeof() { return getToken(BitloopsParser.Typeof, 0); }
		public TypeQueryExpressionContext typeQueryExpression() {
			return getRuleContext(TypeQueryExpressionContext.class,0);
		}
		public TypeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQuery; }
	}

	public final TypeQueryContext typeQuery() throws RecognitionException {
		TypeQueryContext _localctx = new TypeQueryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(Typeof);
			setState(548);
			typeQueryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQueryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(BitloopsParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(BitloopsParser.Dot, i);
		}
		public TypeQueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQueryExpression; }
	}

	public final TypeQueryExpressionContext typeQueryExpression() throws RecognitionException {
		TypeQueryExpressionContext _localctx = new TypeQueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeQueryExpression);
		try {
			int _alt;
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(551);
						identifierName();
						setState(552);
						match(Dot);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(556); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(558);
				identifierName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public BitloopsPrimaryTypeContext bitloopsPrimaryType() {
			return getRuleContext(BitloopsPrimaryTypeContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(Colon);
			setState(563);
			bitloopsPrimaryType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public RestParameterContext restParameter() {
			return getRuleContext(RestParameterContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameterList);
		int _la;
		try {
			int _alt;
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				restParameter();
				}
				break;
			case OpenBracket:
			case OpenBrace:
			case Private:
			case Public:
			case At:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				parameter();
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						match(Comma);
						setState(568);
						parameter();
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(574);
					match(Comma);
					setState(575);
					restParameter();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredParameterListContext extends ParserRuleContext {
		public List<RequiredParameterContext> requiredParameter() {
			return getRuleContexts(RequiredParameterContext.class);
		}
		public RequiredParameterContext requiredParameter(int i) {
			return getRuleContext(RequiredParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public RequiredParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredParameterList; }
	}

	public final RequiredParameterListContext requiredParameterList() throws RecognitionException {
		RequiredParameterListContext _localctx = new RequiredParameterListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_requiredParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			requiredParameter();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(581);
				match(Comma);
				setState(582);
				requiredParameter();
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public RequiredParameterContext requiredParameter() {
			return getRuleContext(RequiredParameterContext.class,0);
		}
		public OptionalParameterContext optionalParameter() {
			return getRuleContext(OptionalParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameter);
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				requiredParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				optionalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalParameterContext extends ParserRuleContext {
		public IdentifierOrPatternContext identifierOrPattern() {
			return getRuleContext(IdentifierOrPatternContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(BitloopsParser.QuestionMark, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public OptionalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParameter; }
	}

	public final OptionalParameterContext optionalParameter() throws RecognitionException {
		OptionalParameterContext _localctx = new OptionalParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_optionalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(592);
				decoratorList();
				}
			}

			{
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private || _la==Public) {
				{
				setState(595);
				accessibilityModifier();
				}
			}

			setState(598);
			identifierOrPattern();
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuestionMark:
				{
				setState(599);
				match(QuestionMark);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(600);
					typeAnnotation();
					}
				}

				}
				break;
			case Assign:
			case Colon:
				{
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(603);
					typeAnnotation();
					}
				}

				setState(606);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestParameterContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(BitloopsParser.Ellipsis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public RestParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restParameter; }
	}

	public final RestParameterContext restParameter() throws RecognitionException {
		RestParameterContext _localctx = new RestParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(Ellipsis);
			setState(610);
			expression(0);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(611);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredParameterContext extends ParserRuleContext {
		public IdentifierOrPatternContext identifierOrPattern() {
			return getRuleContext(IdentifierOrPatternContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public RequiredParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredParameter; }
	}

	public final RequiredParameterContext requiredParameter() throws RecognitionException {
		RequiredParameterContext _localctx = new RequiredParameterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_requiredParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(614);
				decoratorList();
				}
			}

			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private || _la==Public) {
				{
				setState(617);
				accessibilityModifier();
				}
			}

			setState(620);
			identifierOrPattern();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(621);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessibilityModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(BitloopsParser.Public, 0); }
		public TerminalNode Private() { return getToken(BitloopsParser.Private, 0); }
		public AccessibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessibilityModifier; }
	}

	public final AccessibilityModifierContext accessibilityModifier() throws RecognitionException {
		AccessibilityModifierContext _localctx = new AccessibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !(_la==Private || _la==Public) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrPatternContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public IdentifierOrPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrPattern; }
	}

	public final IdentifierOrPatternContext identifierOrPattern() throws RecognitionException {
		IdentifierOrPatternContext _localctx = new IdentifierOrPatternContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifierOrPattern);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				identifierName();
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				bindingPattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexSignatureContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(BitloopsParser.OpenBracket, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public TerminalNode CloseBracket() { return getToken(BitloopsParser.CloseBracket, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Int32() { return getToken(BitloopsParser.Int32, 0); }
		public TerminalNode String() { return getToken(BitloopsParser.String, 0); }
		public IndexSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexSignature; }
	}

	public final IndexSignatureContext indexSignature() throws RecognitionException {
		IndexSignatureContext _localctx = new IndexSignatureContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(OpenBracket);
			setState(631);
			match(Identifier);
			setState(632);
			match(Colon);
			setState(633);
			_la = _input.LA(1);
			if ( !(_la==Int32 || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(634);
			match(CloseBracket);
			setState(635);
			typeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumMemberListContext enumMemberList() {
			return getRuleContext(EnumMemberListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(BitloopsParser.Comma, 0); }
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			enumMemberList();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(638);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumMemberListContext extends ParserRuleContext {
		public List<EnumMemberContext> enumMember() {
			return getRuleContexts(EnumMemberContext.class);
		}
		public EnumMemberContext enumMember(int i) {
			return getRuleContext(EnumMemberContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public EnumMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMemberList; }
	}

	public final EnumMemberListContext enumMemberList() throws RecognitionException {
		EnumMemberListContext _localctx = new EnumMemberListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enumMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			enumMember();
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					match(Comma);
					setState(643);
					enumMember();
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumMemberContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(BitloopsParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMember; }
	}

	public final EnumMemberContext enumMember() throws RecognitionException {
		EnumMemberContext _localctx = new EnumMemberContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			propertyName();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(650);
				match(Assign);
				setState(651);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(BitloopsParser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(Namespace);
			setState(655);
			namespaceName();
			setState(656);
			match(OpenBrace);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Return - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (This - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Async - 65)) | (1L << (ApplyRules - 65)) | (1L << (Const - 65)) | (1L << (Props - 65)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (Namespace - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
				{
				setState(657);
				statementList();
				}
			}

			setState(660);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BitloopsParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BitloopsParser.Identifier, i);
		}
		public List<TerminalNode> Dot() { return getTokens(BitloopsParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(BitloopsParser.Dot, i);
		}
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_namespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(Identifier);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(663);
					match(Dot);
					}
					}
					setState(666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Dot );
				setState(668);
				match(Identifier);
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportAliasDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(BitloopsParser.Assign, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public ImportAliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliasDeclaration; }
	}

	public final ImportAliasDeclarationContext importAliasDeclaration() throws RecognitionException {
		ImportAliasDeclarationContext _localctx = new ImportAliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_importAliasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(Identifier);
			setState(675);
			match(Assign);
			setState(676);
			namespaceName();
			setState(677);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorListContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorList; }
	}

	public final DecoratorListContext decoratorList() throws RecognitionException {
		DecoratorListContext _localctx = new DecoratorListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_decoratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(679);
				decorator();
				}
				}
				setState(682); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==At );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(BitloopsParser.At, 0); }
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public DecoratorCallExpressionContext decoratorCallExpression() {
			return getRuleContext(DecoratorCallExpressionContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(At);
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(685);
				decoratorMemberExpression(0);
				}
				break;
			case 2:
				{
				setState(686);
				decoratorCallExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorMemberExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(BitloopsParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public DecoratorMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorMemberExpression; }
	}

	public final DecoratorMemberExpressionContext decoratorMemberExpression() throws RecognitionException {
		return decoratorMemberExpression(0);
	}

	private DecoratorMemberExpressionContext decoratorMemberExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DecoratorMemberExpressionContext _localctx = new DecoratorMemberExpressionContext(_ctx, _parentState);
		DecoratorMemberExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_decoratorMemberExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(690);
				match(Identifier);
				}
				break;
			case OpenParen:
				{
				setState(691);
				match(OpenParen);
				setState(692);
				expression(0);
				setState(693);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DecoratorMemberExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decoratorMemberExpression);
					setState(697);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(698);
					match(Dot);
					setState(699);
					identifierName();
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DecoratorCallExpressionContext extends ParserRuleContext {
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DecoratorCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorCallExpression; }
	}

	public final DecoratorCallExpressionContext decoratorCallExpression() throws RecognitionException {
		DecoratorCallExpressionContext _localctx = new DecoratorCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_decoratorCallExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			decoratorMemberExpression(0);
			setState(706);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (RepoPort - 99)) | (1L << (Props - 99)) | (1L << (ReadModel - 99)) | (1L << (DTO - 99)) | (1L << (RESTController - 99)) | (1L << (GraphQLController - 99)) | (1L << (UseCase - 99)) | (1L << (ValueObject - 99)) | (1L << (Entity - 99)) | (1L << (DomainError - 99)) | (1L << (ApplicationError - 99)) | (1L << (PackagePort - 99)) | (1L << (Rule - 99)) | (1L << (Root - 99)) | (1L << (Struct - 99)) | (1L << (JestTest - 99)) | (1L << (JestTestStatement - 99)) | (1L << (JestTestStatementList - 99)) | (1L << (JestTestFunctionBody - 99)) | (1L << (JestTestStructEvaluation - 99)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (JestTestDTOEvaluation - 163)) | (1L << (JestTestEvaluation - 163)) | (1L << (JestTestReturnOkErrorType - 163)) | (1L << (JestTestExpression - 163)) | (1L << (JestTestConstDeclaration - 163)) | (1L << (JestTestMethodDefinitionList - 163)) | (1L << (JestTestCreateMethodDeclaration - 163)) | (1L << (JestTestPrivateMethodDeclaration - 163)) | (1L << (JestTestPublicMethodDeclaration - 163)) | (1L << (JestTestValueObjectDeclaration - 163)) | (1L << (JestTestEntityDeclaration - 163)) | (1L << (JestTestCondition - 163)) | (1L << (JestTestVariableDeclaration - 163)) | (1L << (JestTestIsInstanceOf - 163)) | (1L << (JestTestValueObjectEvaluation - 163)) | (1L << (JestTestEntityEvaluation - 163)) | (1L << (JestTestBuiltInFunction - 163)) | (1L << (JestTestBuiltInClass - 163)) | (1L << (JestTestBitloopsPrimaryType - 163)))) != 0)) {
				{
				{
				setState(708);
				sourceElement();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementContext extends ParserRuleContext {
		public DtoDeclarationContext dtoDeclaration() {
			return getRuleContext(DtoDeclarationContext.class,0);
		}
		public DomainErrorDeclarationContext domainErrorDeclaration() {
			return getRuleContext(DomainErrorDeclarationContext.class,0);
		}
		public ApplicationErrorDeclarationContext applicationErrorDeclaration() {
			return getRuleContext(ApplicationErrorDeclarationContext.class,0);
		}
		public ControllerDeclarationContext controllerDeclaration() {
			return getRuleContext(ControllerDeclarationContext.class,0);
		}
		public JestTestDeclarationContext jestTestDeclaration() {
			return getRuleContext(JestTestDeclarationContext.class,0);
		}
		public PropsDeclarationContext propsDeclaration() {
			return getRuleContext(PropsDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public UseCaseDeclarationContext useCaseDeclaration() {
			return getRuleContext(UseCaseDeclarationContext.class,0);
		}
		public PackagePortDeclarationContext packagePortDeclaration() {
			return getRuleContext(PackagePortDeclarationContext.class,0);
		}
		public ValueObjectDeclarationContext valueObjectDeclaration() {
			return getRuleContext(ValueObjectDeclarationContext.class,0);
		}
		public DomainRuleDeclarationContext domainRuleDeclaration() {
			return getRuleContext(DomainRuleDeclarationContext.class,0);
		}
		public EntityDeclarationContext entityDeclaration() {
			return getRuleContext(EntityDeclarationContext.class,0);
		}
		public AggregateDeclarationContext aggregateDeclaration() {
			return getRuleContext(AggregateDeclarationContext.class,0);
		}
		public RepoPortDeclarationContext repoPortDeclaration() {
			return getRuleContext(RepoPortDeclarationContext.class,0);
		}
		public ReadModelDeclarationContext readModelDeclaration() {
			return getRuleContext(ReadModelDeclarationContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sourceElement);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				dtoDeclaration();
				}
				break;
			case DomainError:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				domainErrorDeclaration();
				}
				break;
			case ApplicationError:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				applicationErrorDeclaration();
				}
				break;
			case RESTController:
			case GraphQLController:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				controllerDeclaration();
				}
				break;
			case JestTest:
			case JestTestStatement:
			case JestTestStatementList:
			case JestTestFunctionBody:
			case JestTestStructEvaluation:
			case JestTestDTOEvaluation:
			case JestTestEvaluation:
			case JestTestReturnOkErrorType:
			case JestTestExpression:
			case JestTestConstDeclaration:
			case JestTestMethodDefinitionList:
			case JestTestCreateMethodDeclaration:
			case JestTestPrivateMethodDeclaration:
			case JestTestPublicMethodDeclaration:
			case JestTestValueObjectDeclaration:
			case JestTestEntityDeclaration:
			case JestTestCondition:
			case JestTestVariableDeclaration:
			case JestTestIsInstanceOf:
			case JestTestValueObjectEvaluation:
			case JestTestEntityEvaluation:
			case JestTestBuiltInFunction:
			case JestTestBuiltInClass:
			case JestTestBitloopsPrimaryType:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				jestTestDeclaration();
				}
				break;
			case Props:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				propsDeclaration();
				}
				break;
			case Struct:
				enterOuterAlt(_localctx, 7);
				{
				setState(720);
				structDeclaration();
				}
				break;
			case UseCase:
				enterOuterAlt(_localctx, 8);
				{
				setState(721);
				useCaseDeclaration();
				}
				break;
			case PackagePort:
				enterOuterAlt(_localctx, 9);
				{
				setState(722);
				packagePortDeclaration();
				}
				break;
			case ValueObject:
				enterOuterAlt(_localctx, 10);
				{
				setState(723);
				valueObjectDeclaration();
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 11);
				{
				setState(724);
				domainRuleDeclaration();
				}
				break;
			case Entity:
				enterOuterAlt(_localctx, 12);
				{
				setState(725);
				entityDeclaration();
				}
				break;
			case Root:
				enterOuterAlt(_localctx, 13);
				{
				setState(726);
				aggregateDeclaration();
				}
				break;
			case RepoPort:
				enterOuterAlt(_localctx, 14);
				{
				setState(727);
				repoPortDeclaration();
				}
				break;
			case ReadModel:
				enterOuterAlt(_localctx, 15);
				{
				setState(728);
				readModelDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JestTestDeclarationContext extends ParserRuleContext {
		public TerminalNode JestTestFunctionBody() { return getToken(BitloopsParser.JestTestFunctionBody, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(BitloopsParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(BitloopsParser.SemiColon, i);
		}
		public TerminalNode JestTestStatementList() { return getToken(BitloopsParser.JestTestStatementList, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode JestTestStatement() { return getToken(BitloopsParser.JestTestStatement, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode JestTestStructEvaluation() { return getToken(BitloopsParser.JestTestStructEvaluation, 0); }
		public StructEvaluationContext structEvaluation() {
			return getRuleContext(StructEvaluationContext.class,0);
		}
		public TerminalNode JestTestDTOEvaluation() { return getToken(BitloopsParser.JestTestDTOEvaluation, 0); }
		public DtoEvaluationContext dtoEvaluation() {
			return getRuleContext(DtoEvaluationContext.class,0);
		}
		public TerminalNode JestTestEvaluation() { return getToken(BitloopsParser.JestTestEvaluation, 0); }
		public EvaluationContext evaluation() {
			return getRuleContext(EvaluationContext.class,0);
		}
		public TerminalNode JestTestIsInstanceOf() { return getToken(BitloopsParser.JestTestIsInstanceOf, 0); }
		public IsInstanceOfContext isInstanceOf() {
			return getRuleContext(IsInstanceOfContext.class,0);
		}
		public TerminalNode JestTest() { return getToken(BitloopsParser.JestTest, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public RestControllerParametersContext restControllerParameters() {
			return getRuleContext(RestControllerParametersContext.class,0);
		}
		public RestControllerExecuteDeclarationContext restControllerExecuteDeclaration() {
			return getRuleContext(RestControllerExecuteDeclarationContext.class,0);
		}
		public RestControllerMethodDeclarationContext restControllerMethodDeclaration() {
			return getRuleContext(RestControllerMethodDeclarationContext.class,0);
		}
		public TerminalNode JestTestBuiltInClass() { return getToken(BitloopsParser.JestTestBuiltInClass, 0); }
		public BuiltInClassEvaluationContext builtInClassEvaluation() {
			return getRuleContext(BuiltInClassEvaluationContext.class,0);
		}
		public TerminalNode JestTestReturnOkErrorType() { return getToken(BitloopsParser.JestTestReturnOkErrorType, 0); }
		public ReturnOkErrorTypeContext returnOkErrorType() {
			return getRuleContext(ReturnOkErrorTypeContext.class,0);
		}
		public TerminalNode JestTestConstDeclaration() { return getToken(BitloopsParser.JestTestConstDeclaration, 0); }
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public TerminalNode JestTestExpression() { return getToken(BitloopsParser.JestTestExpression, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JestTestMethodDefinitionList() { return getToken(BitloopsParser.JestTestMethodDefinitionList, 0); }
		public MethodDefinitionListContext methodDefinitionList() {
			return getRuleContext(MethodDefinitionListContext.class,0);
		}
		public TerminalNode JestTestCreateMethodDeclaration() { return getToken(BitloopsParser.JestTestCreateMethodDeclaration, 0); }
		public DomainConstructorDeclarationContext domainConstructorDeclaration() {
			return getRuleContext(DomainConstructorDeclarationContext.class,0);
		}
		public TerminalNode JestTestPrivateMethodDeclaration() { return getToken(BitloopsParser.JestTestPrivateMethodDeclaration, 0); }
		public PrivateMethodDeclarationContext privateMethodDeclaration() {
			return getRuleContext(PrivateMethodDeclarationContext.class,0);
		}
		public TerminalNode JestTestPublicMethodDeclaration() { return getToken(BitloopsParser.JestTestPublicMethodDeclaration, 0); }
		public PublicMethodDeclarationContext publicMethodDeclaration() {
			return getRuleContext(PublicMethodDeclarationContext.class,0);
		}
		public TerminalNode JestTestValueObjectDeclaration() { return getToken(BitloopsParser.JestTestValueObjectDeclaration, 0); }
		public ValueObjectDeclarationContext valueObjectDeclaration() {
			return getRuleContext(ValueObjectDeclarationContext.class,0);
		}
		public TerminalNode JestTestEntityDeclaration() { return getToken(BitloopsParser.JestTestEntityDeclaration, 0); }
		public EntityDeclarationContext entityDeclaration() {
			return getRuleContext(EntityDeclarationContext.class,0);
		}
		public TerminalNode JestTestCondition() { return getToken(BitloopsParser.JestTestCondition, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode JestTestVariableDeclaration() { return getToken(BitloopsParser.JestTestVariableDeclaration, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode JestTestValueObjectEvaluation() { return getToken(BitloopsParser.JestTestValueObjectEvaluation, 0); }
		public ValueObjectEvaluationContext valueObjectEvaluation() {
			return getRuleContext(ValueObjectEvaluationContext.class,0);
		}
		public TerminalNode JestTestEntityEvaluation() { return getToken(BitloopsParser.JestTestEntityEvaluation, 0); }
		public EntityEvaluationContext entityEvaluation() {
			return getRuleContext(EntityEvaluationContext.class,0);
		}
		public TerminalNode JestTestBuiltInFunction() { return getToken(BitloopsParser.JestTestBuiltInFunction, 0); }
		public BuiltInFunctionContext builtInFunction() {
			return getRuleContext(BuiltInFunctionContext.class,0);
		}
		public TerminalNode JestTestBitloopsPrimaryType() { return getToken(BitloopsParser.JestTestBitloopsPrimaryType, 0); }
		public BitloopsPrimaryTypeContext bitloopsPrimaryType() {
			return getRuleContext(BitloopsPrimaryTypeContext.class,0);
		}
		public JestTestDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestTestDeclaration; }
	}

	public final JestTestDeclarationContext jestTestDeclaration() throws RecognitionException {
		JestTestDeclarationContext _localctx = new JestTestDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jestTestDeclaration);
		int _la;
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				match(JestTestFunctionBody);
				setState(732);
				match(OpenBrace);
				setState(733);
				functionBody();
				setState(734);
				match(CloseBrace);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(735);
					match(SemiColon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				match(JestTestStatementList);
				setState(739);
				match(OpenBrace);
				setState(740);
				statementList();
				setState(741);
				match(CloseBrace);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(742);
					match(SemiColon);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(JestTestStatement);
				setState(746);
				match(OpenBrace);
				setState(747);
				statement();
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(748);
					match(SemiColon);
					}
				}

				setState(751);
				match(CloseBrace);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(752);
					match(SemiColon);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				match(JestTestStructEvaluation);
				setState(756);
				match(OpenBrace);
				setState(757);
				structEvaluation();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(758);
					match(SemiColon);
					}
				}

				setState(761);
				match(CloseBrace);
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(762);
					match(SemiColon);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(765);
				match(JestTestDTOEvaluation);
				setState(766);
				match(OpenBrace);
				setState(767);
				dtoEvaluation();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(768);
					match(SemiColon);
					}
				}

				setState(771);
				match(CloseBrace);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(772);
					match(SemiColon);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				match(JestTestEvaluation);
				setState(776);
				match(OpenBrace);
				setState(777);
				evaluation();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(778);
					match(SemiColon);
					}
				}

				setState(781);
				match(CloseBrace);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(782);
					match(SemiColon);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(785);
				match(JestTestIsInstanceOf);
				setState(786);
				match(OpenBrace);
				setState(787);
				isInstanceOf();
				setState(788);
				match(CloseBrace);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(789);
					match(SemiColon);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(792);
				match(JestTest);
				setState(793);
				match(OpenBrace);
				setState(794);
				formalParameterList();
				setState(795);
				match(CloseBrace);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(796);
					match(SemiColon);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(799);
				match(JestTest);
				setState(800);
				match(OpenBrace);
				setState(801);
				restControllerParameters();
				setState(802);
				match(CloseBrace);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(804);
				match(JestTest);
				setState(805);
				match(OpenBrace);
				setState(806);
				restControllerExecuteDeclaration();
				setState(807);
				match(CloseBrace);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(809);
				match(JestTest);
				setState(810);
				match(OpenBrace);
				setState(811);
				restControllerMethodDeclaration();
				setState(812);
				match(CloseBrace);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(814);
				match(JestTestBuiltInClass);
				setState(815);
				match(OpenBrace);
				setState(816);
				builtInClassEvaluation();
				setState(817);
				match(CloseBrace);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(819);
				match(JestTestReturnOkErrorType);
				setState(820);
				match(OpenBrace);
				setState(821);
				returnOkErrorType();
				setState(822);
				match(CloseBrace);
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(823);
					match(SemiColon);
					}
				}

				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(826);
				match(JestTestConstDeclaration);
				setState(827);
				match(OpenBrace);
				setState(828);
				constDeclaration();
				setState(829);
				match(CloseBrace);
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(830);
					match(SemiColon);
					}
				}

				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(833);
				match(JestTestExpression);
				setState(834);
				match(OpenBrace);
				setState(835);
				expression(0);
				setState(836);
				match(CloseBrace);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(837);
					match(SemiColon);
					}
				}

				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(840);
				match(JestTestMethodDefinitionList);
				setState(841);
				match(OpenBrace);
				setState(842);
				methodDefinitionList();
				setState(843);
				match(CloseBrace);
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(844);
					match(SemiColon);
					}
				}

				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(847);
				match(JestTestCreateMethodDeclaration);
				setState(848);
				match(OpenBrace);
				setState(849);
				domainConstructorDeclaration();
				setState(850);
				match(CloseBrace);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(851);
					match(SemiColon);
					}
				}

				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(854);
				match(JestTestPrivateMethodDeclaration);
				setState(855);
				match(OpenBrace);
				setState(856);
				privateMethodDeclaration();
				setState(857);
				match(CloseBrace);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(858);
					match(SemiColon);
					}
				}

				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(861);
				match(JestTestPublicMethodDeclaration);
				setState(862);
				match(OpenBrace);
				setState(863);
				publicMethodDeclaration();
				setState(864);
				match(CloseBrace);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(865);
					match(SemiColon);
					}
				}

				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(868);
				match(JestTestValueObjectDeclaration);
				setState(869);
				match(OpenBrace);
				setState(870);
				valueObjectDeclaration();
				setState(871);
				match(CloseBrace);
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(872);
					match(SemiColon);
					}
				}

				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(875);
				match(JestTestEntityDeclaration);
				setState(876);
				match(OpenBrace);
				setState(877);
				entityDeclaration();
				setState(878);
				match(CloseBrace);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(879);
					match(SemiColon);
					}
				}

				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(882);
				match(JestTestCondition);
				setState(883);
				match(OpenBrace);
				setState(884);
				condition();
				setState(885);
				match(CloseBrace);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(886);
					match(SemiColon);
					}
				}

				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(889);
				match(JestTestVariableDeclaration);
				setState(890);
				match(OpenBrace);
				setState(891);
				variableDeclaration();
				setState(892);
				match(CloseBrace);
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(893);
					match(SemiColon);
					}
				}

				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(896);
				match(JestTestValueObjectEvaluation);
				setState(897);
				match(OpenBrace);
				setState(898);
				valueObjectEvaluation();
				setState(899);
				match(CloseBrace);
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(900);
					match(SemiColon);
					}
				}

				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(903);
				match(JestTestEntityEvaluation);
				setState(904);
				match(OpenBrace);
				setState(905);
				entityEvaluation();
				setState(906);
				match(CloseBrace);
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(907);
					match(SemiColon);
					}
				}

				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(910);
				match(JestTestBuiltInFunction);
				setState(911);
				match(OpenBrace);
				setState(912);
				builtInFunction();
				setState(913);
				match(CloseBrace);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(914);
					match(SemiColon);
					}
				}

				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(917);
				match(JestTestBitloopsPrimaryType);
				setState(918);
				match(OpenBrace);
				setState(919);
				bitloopsPrimaryType(0);
				setState(920);
				match(CloseBrace);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(921);
					match(SemiColon);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorEvaluationContext extends ParserRuleContext {
		public TerminalNode ErrorIdentifier() { return getToken(BitloopsParser.ErrorIdentifier, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public ErrorEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorEvaluation; }
	}

	public final ErrorEvaluationContext errorEvaluation() throws RecognitionException {
		ErrorEvaluationContext _localctx = new ErrorEvaluationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_errorEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(ErrorIdentifier);
			setState(927);
			methodArguments();
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(928);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvaluationContext extends ParserRuleContext {
		public IsInstanceOfContext isInstanceOf() {
			return getRuleContext(IsInstanceOfContext.class,0);
		}
		public BuiltInClassEvaluationContext builtInClassEvaluation() {
			return getRuleContext(BuiltInClassEvaluationContext.class,0);
		}
		public ErrorEvaluationContext errorEvaluation() {
			return getRuleContext(ErrorEvaluationContext.class,0);
		}
		public DtoEvaluationContext dtoEvaluation() {
			return getRuleContext(DtoEvaluationContext.class,0);
		}
		public ValueObjectEvaluationContext valueObjectEvaluation() {
			return getRuleContext(ValueObjectEvaluationContext.class,0);
		}
		public EntityEvaluationContext entityEvaluation() {
			return getRuleContext(EntityEvaluationContext.class,0);
		}
		public PropsEvaluationContext propsEvaluation() {
			return getRuleContext(PropsEvaluationContext.class,0);
		}
		public StructEvaluationContext structEvaluation() {
			return getRuleContext(StructEvaluationContext.class,0);
		}
		public EvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluation; }
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_evaluation);
		try {
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				isInstanceOf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				builtInClassEvaluation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(933);
				errorEvaluation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(934);
				dtoEvaluation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(935);
				valueObjectEvaluation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(936);
				entityEvaluation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(937);
				propsEvaluation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(938);
				structEvaluation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(BitloopsParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(Return);
			setState(944);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(BitloopsParser.Const, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(BitloopsParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(Const);
			setState(947);
			identifier();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(948);
				typeAnnotation();
				}
			}

			setState(951);
			match(Assign);
			setState(952);
			expression(0);
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(953);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(BitloopsParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			identifier();
			setState(957);
			typeAnnotation();
			setState(958);
			match(Assign);
			setState(959);
			expression(0);
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(960);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public PropsDeclarationContext propsDeclaration() {
			return getRuleContext(PropsDeclarationContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public BuiltInFunctionContext builtInFunction() {
			return getRuleContext(BuiltInFunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_statement);
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				constDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(966);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(967);
				emptyStatement_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(968);
				propsDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(969);
				namespaceDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(970);
				ifStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(971);
				breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(972);
				switchStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(973);
				iterationStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(974);
				returnStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(975);
				throwStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(976);
				tryStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(977);
				arrowFunctionDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(978);
				builtInFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltInFunctionContext extends ParserRuleContext {
		public BuiltInFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunction; }
	 
		public BuiltInFunctionContext() { }
		public void copyFrom(BuiltInFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApplyRulesStatementContext extends BuiltInFunctionContext {
		public TerminalNode ApplyRules() { return getToken(BitloopsParser.ApplyRules, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ApplyRuleStatementRulesListContext applyRuleStatementRulesList() {
			return getRuleContext(ApplyRuleStatementRulesListContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public ApplyRulesStatementContext(BuiltInFunctionContext ctx) { copyFrom(ctx); }
	}

	public final BuiltInFunctionContext builtInFunction() throws RecognitionException {
		BuiltInFunctionContext _localctx = new BuiltInFunctionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_builtInFunction);
		try {
			_localctx = new ApplyRulesStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(ApplyRules);
			setState(982);
			match(OpenParen);
			setState(983);
			applyRuleStatementRulesList();
			setState(984);
			match(CloseParen);
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(985);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplyRuleStatementRulesListContext extends ParserRuleContext {
		public List<ApplyRulesRuleContext> applyRulesRule() {
			return getRuleContexts(ApplyRulesRuleContext.class);
		}
		public ApplyRulesRuleContext applyRulesRule(int i) {
			return getRuleContext(ApplyRulesRuleContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public ApplyRuleStatementRulesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyRuleStatementRulesList; }
	}

	public final ApplyRuleStatementRulesListContext applyRuleStatementRulesList() throws RecognitionException {
		ApplyRuleStatementRulesListContext _localctx = new ApplyRuleStatementRulesListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_applyRuleStatementRulesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			applyRulesRule();
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(989);
				match(Comma);
				setState(990);
				applyRulesRule();
				}
				}
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplyRulesRuleContext extends ParserRuleContext {
		public DomainRuleIdentifierContext domainRuleIdentifier() {
			return getRuleContext(DomainRuleIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ApplyRulesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyRulesRule; }
	}

	public final ApplyRulesRuleContext applyRulesRule() throws RecognitionException {
		ApplyRulesRuleContext _localctx = new ApplyRulesRuleContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_applyRulesRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			domainRuleIdentifier();
			setState(997);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(OpenBrace);
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Return - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (This - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Async - 65)) | (1L << (ApplyRules - 65)) | (1L << (Const - 65)) | (1L << (Props - 65)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (Namespace - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
				{
				setState(1000);
				statementList();
				}
			}

			setState(1003);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1006); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1005);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1008); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(1010);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromBlockContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(BitloopsParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(BitloopsParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(BitloopsParser.Multiply, 0); }
		public MultipleImportStatementContext multipleImportStatement() {
			return getRuleContext(MultipleImportStatementContext.class,0);
		}
		public TerminalNode As() { return getToken(BitloopsParser.As, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public FromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromBlock; }
	}

	public final FromBlockContext fromBlock() throws RecognitionException {
		FromBlockContext _localctx = new FromBlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_fromBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				{
				setState(1013);
				match(Multiply);
				}
				break;
			case OpenBrace:
			case Identifier:
				{
				setState(1014);
				multipleImportStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(1017);
				match(As);
				setState(1018);
				identifierName();
				}
			}

			setState(1021);
			match(From);
			setState(1022);
			match(StringLiteral);
			setState(1023);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleImportStatementContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public MultipleImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleImportStatement; }
	}

	public final MultipleImportStatementContext multipleImportStatement() throws RecognitionException {
		MultipleImportStatementContext _localctx = new MultipleImportStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_multipleImportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1025);
				identifierName();
				setState(1026);
				match(Comma);
				}
			}

			setState(1030);
			match(OpenBrace);
			setState(1031);
			identifierName();
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1032);
				match(Comma);
				setState(1033);
				identifierName();
				}
				}
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1039);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			variableDeclaration();
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1042);
				match(Comma);
				setState(1043);
				variableDeclaration();
				}
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			expressionSequence();
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1052);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(BitloopsParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(BitloopsParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(If);
			setState(1056);
			match(OpenParen);
			setState(1057);
			condition();
			setState(1058);
			match(CloseParen);
			setState(1059);
			statement();
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1060);
				match(Else);
				setState(1061);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(BitloopsParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(BitloopsParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(BitloopsParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(BitloopsParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(BitloopsParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(BitloopsParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode In() { return getToken(BitloopsParser.In, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(BitloopsParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(BitloopsParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(BitloopsParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(BitloopsParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(BitloopsParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode In() { return getToken(BitloopsParser.In, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_iterationStatement);
		int _la;
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				match(Do);
				setState(1065);
				statement();
				setState(1066);
				match(While);
				setState(1067);
				match(OpenParen);
				setState(1068);
				expressionSequence();
				setState(1069);
				match(CloseParen);
				setState(1070);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				match(While);
				setState(1073);
				match(OpenParen);
				setState(1074);
				expressionSequence();
				setState(1075);
				match(CloseParen);
				setState(1076);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1078);
				match(For);
				setState(1079);
				match(OpenParen);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || _la==This || _la==Delete || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
					{
					setState(1080);
					expressionSequence();
					}
				}

				setState(1083);
				match(SemiColon);
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || _la==This || _la==Delete || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
					{
					setState(1084);
					expressionSequence();
					}
				}

				setState(1087);
				match(SemiColon);
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || _la==This || _la==Delete || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
					{
					setState(1088);
					expressionSequence();
					}
				}

				setState(1091);
				match(CloseParen);
				setState(1092);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1093);
				match(For);
				setState(1094);
				match(OpenParen);
				setState(1095);
				varModifier();
				setState(1096);
				variableDeclarationList();
				setState(1097);
				match(SemiColon);
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || _la==This || _la==Delete || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
					{
					setState(1098);
					expressionSequence();
					}
				}

				setState(1101);
				match(SemiColon);
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || _la==This || _la==Delete || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
					{
					setState(1102);
					expressionSequence();
					}
				}

				setState(1105);
				match(CloseParen);
				setState(1106);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1108);
				match(For);
				setState(1109);
				match(OpenParen);
				setState(1110);
				expression(0);
				setState(1115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case In:
					{
					setState(1111);
					match(In);
					}
					break;
				case RegularExpressionLiteral:
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case Not:
				case NullLiteral:
				case BooleanLiteral:
				case IntegerLiteral:
				case DecimalLiteral:
				case This:
				case Delete:
				case Execute:
				case Create:
				case UUIDv4:
				case DTOIdentifier:
				case ValueObjectIdentifier:
				case EntityIdentifier:
				case ErrorIdentifier:
				case UpperCaseIdentifier:
				case Identifier:
				case StringLiteral:
				case BackTick:
					{
					setState(1113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(1112);
						match(Identifier);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1117);
				expressionSequence();
				setState(1118);
				match(CloseParen);
				setState(1119);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1121);
				match(For);
				setState(1122);
				match(OpenParen);
				setState(1123);
				varModifier();
				setState(1124);
				variableDeclaration();
				setState(1129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case In:
					{
					setState(1125);
					match(In);
					}
					break;
				case RegularExpressionLiteral:
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case Not:
				case NullLiteral:
				case BooleanLiteral:
				case IntegerLiteral:
				case DecimalLiteral:
				case This:
				case Delete:
				case Execute:
				case Create:
				case UUIDv4:
				case DTOIdentifier:
				case ValueObjectIdentifier:
				case EntityIdentifier:
				case ErrorIdentifier:
				case UpperCaseIdentifier:
				case Identifier:
				case StringLiteral:
				case BackTick:
					{
					setState(1127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(1126);
						match(Identifier);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1131);
				expressionSequence();
				setState(1132);
				match(CloseParen);
				setState(1133);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(BitloopsParser.Var, 0); }
		public TerminalNode Let() { return getToken(BitloopsParser.Let, 0); }
		public TerminalNode Const() { return getToken(BitloopsParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Var - 72)) | (1L << (Const - 72)) | (1L << (Let - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(BitloopsParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(Continue);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1140);
				match(Identifier);
				}
			}

			setState(1143);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(BitloopsParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(Break);
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1146);
				match(Identifier);
				}
			}

			setState(1149);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(BitloopsParser.With, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(With);
			setState(1152);
			match(OpenParen);
			setState(1153);
			expressionSequence();
			setState(1154);
			match(CloseParen);
			setState(1155);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(BitloopsParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(Switch);
			setState(1158);
			match(OpenParen);
			setState(1159);
			condition();
			setState(1160);
			match(CloseParen);
			setState(1161);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(OpenBrace);
			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(1164);
				caseClauses();
				}
			}

			setState(1167);
			defaultClause();
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(1168);
				caseClauses();
				}
			}

			setState(1171);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1173);
				caseClause();
				}
				}
				setState(1176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(BitloopsParser.Case, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_caseClause);
		int _la;
		try {
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				match(Case);
				setState(1179);
				expression(0);
				setState(1180);
				match(Colon);
				setState(1181);
				match(OpenBrace);
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Return - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (This - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Async - 65)) | (1L << (ApplyRules - 65)) | (1L << (Const - 65)) | (1L << (Props - 65)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (Namespace - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
					{
					setState(1182);
					statementList();
					}
				}

				setState(1185);
				match(CloseBrace);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1186);
					match(SemiColon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1189);
				match(Case);
				setState(1190);
				expression(0);
				setState(1191);
				match(Colon);
				setState(1193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1192);
					statementList();
					}
					break;
				}
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1195);
					match(SemiColon);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(BitloopsParser.Default, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_defaultClause);
		int _la;
		try {
			setState(1218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				match(Default);
				setState(1201);
				match(Colon);
				setState(1202);
				match(OpenBrace);
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Return - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (This - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Async - 65)) | (1L << (ApplyRules - 65)) | (1L << (Const - 65)) | (1L << (Props - 65)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (Namespace - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
					{
					setState(1203);
					statementList();
					}
				}

				setState(1206);
				match(CloseBrace);
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1207);
					match(SemiColon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				match(Default);
				setState(1211);
				match(Colon);
				setState(1213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1212);
					statementList();
					}
					break;
				}
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1215);
					match(SemiColon);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(Identifier);
			setState(1221);
			match(Colon);
			setState(1222);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(BitloopsParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(Throw);
			setState(1225);
			expressionSequence();
			setState(1226);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(BitloopsParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			match(Try);
			setState(1229);
			block();
			setState(1235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(1230);
				catchProduction();
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Finally) {
					{
					setState(1231);
					finallyProduction();
					}
				}

				}
				break;
			case Finally:
				{
				setState(1234);
				finallyProduction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(BitloopsParser.Catch, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_catchProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(Catch);
			setState(1238);
			match(OpenParen);
			setState(1239);
			match(Identifier);
			setState(1240);
			match(CloseParen);
			setState(1241);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(BitloopsParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(Finally);
			setState(1244);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(BitloopsParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(Debugger);
			setState(1247);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainFieldDeclarationContext extends ParserRuleContext {
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public DomainFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainFieldDeclaration; }
	}

	public final DomainFieldDeclarationContext domainFieldDeclaration() throws RecognitionException {
		DomainFieldDeclarationContext _localctx = new DomainFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_domainFieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			fieldList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsBrokenStatementContext extends ParserRuleContext {
		public TerminalNode IsBrokenIf() { return getToken(BitloopsParser.IsBrokenIf, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public IsBrokenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isBrokenStatement; }
	}

	public final IsBrokenStatementContext isBrokenStatement() throws RecognitionException {
		IsBrokenStatementContext _localctx = new IsBrokenStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_isBrokenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(IsBrokenIf);
			setState(1252);
			match(OpenParen);
			setState(1253);
			expression(0);
			setState(1254);
			match(CloseParen);
			setState(1255);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainRuleBodyContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public IsBrokenStatementContext isBrokenStatement() {
			return getRuleContext(IsBrokenStatementContext.class,0);
		}
		public DomainRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainRuleBody; }
	}

	public final DomainRuleBodyContext domainRuleBody() throws RecognitionException {
		DomainRuleBodyContext _localctx = new DomainRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_domainRuleBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			functionBody();
			setState(1258);
			isBrokenStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainRuleDeclarationContext extends ParserRuleContext {
		public TerminalNode Rule() { return getToken(BitloopsParser.Rule, 0); }
		public DomainRuleIdentifierContext domainRuleIdentifier() {
			return getRuleContext(DomainRuleIdentifierContext.class,0);
		}
		public TerminalNode Throws() { return getToken(BitloopsParser.Throws, 0); }
		public TerminalNode ErrorIdentifier() { return getToken(BitloopsParser.ErrorIdentifier, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public DomainRuleBodyContext domainRuleBody() {
			return getRuleContext(DomainRuleBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DomainRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainRuleDeclaration; }
	}

	public final DomainRuleDeclarationContext domainRuleDeclaration() throws RecognitionException {
		DomainRuleDeclarationContext _localctx = new DomainRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_domainRuleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(Rule);
			setState(1261);
			domainRuleIdentifier();
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1262);
				formalParameterList();
				}
			}

			setState(1265);
			match(Throws);
			setState(1266);
			match(ErrorIdentifier);
			setState(1267);
			match(OpenBrace);
			setState(1268);
			domainRuleBody();
			setState(1269);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateDeclarationContext extends ParserRuleContext {
		public TerminalNode Root() { return getToken(BitloopsParser.Root, 0); }
		public TerminalNode Entity() { return getToken(BitloopsParser.Entity, 0); }
		public EntityIdentifierContext entityIdentifier() {
			return getRuleContext(EntityIdentifierContext.class,0);
		}
		public EntityBodyContext entityBody() {
			return getRuleContext(EntityBodyContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public AggregateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateDeclaration; }
	}

	public final AggregateDeclarationContext aggregateDeclaration() throws RecognitionException {
		AggregateDeclarationContext _localctx = new AggregateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_aggregateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(Root);
			setState(1272);
			match(Entity);
			setState(1273);
			entityIdentifier();
			setState(1274);
			entityBody();
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1275);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainConstDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public DomainConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainConstDeclaration; }
	}

	public final DomainConstDeclarationContext domainConstDeclaration() throws RecognitionException {
		DomainConstDeclarationContext _localctx = new DomainConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_domainConstDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			constDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityDeclarationContext extends ParserRuleContext {
		public TerminalNode Entity() { return getToken(BitloopsParser.Entity, 0); }
		public EntityIdentifierContext entityIdentifier() {
			return getRuleContext(EntityIdentifierContext.class,0);
		}
		public EntityBodyContext entityBody() {
			return getRuleContext(EntityBodyContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public EntityDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDeclaration; }
	}

	public final EntityDeclarationContext entityDeclaration() throws RecognitionException {
		EntityDeclarationContext _localctx = new EntityDeclarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_entityDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(Entity);
			setState(1281);
			entityIdentifier();
			setState(1282);
			entityBody();
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1283);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public DomainConstDeclarationListContext domainConstDeclarationList() {
			return getRuleContext(DomainConstDeclarationListContext.class,0);
		}
		public DomainConstructorDeclarationContext domainConstructorDeclaration() {
			return getRuleContext(DomainConstructorDeclarationContext.class,0);
		}
		public PublicMethodDeclarationListContext publicMethodDeclarationList() {
			return getRuleContext(PublicMethodDeclarationListContext.class,0);
		}
		public PrivateMethodDeclarationListContext privateMethodDeclarationList() {
			return getRuleContext(PrivateMethodDeclarationListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public EntityBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityBody; }
	}

	public final EntityBodyContext entityBody() throws RecognitionException {
		EntityBodyContext _localctx = new EntityBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_entityBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(OpenBrace);
			setState(1287);
			domainConstDeclarationList();
			setState(1288);
			domainConstructorDeclaration();
			setState(1289);
			publicMethodDeclarationList();
			setState(1290);
			privateMethodDeclarationList();
			setState(1291);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode ValueObject() { return getToken(BitloopsParser.ValueObject, 0); }
		public ValueObjectIdentifierContext valueObjectIdentifier() {
			return getRuleContext(ValueObjectIdentifierContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public DomainConstDeclarationListContext domainConstDeclarationList() {
			return getRuleContext(DomainConstDeclarationListContext.class,0);
		}
		public DomainConstructorDeclarationContext domainConstructorDeclaration() {
			return getRuleContext(DomainConstructorDeclarationContext.class,0);
		}
		public PrivateMethodDeclarationListContext privateMethodDeclarationList() {
			return getRuleContext(PrivateMethodDeclarationListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public ValueObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueObjectDeclaration; }
	}

	public final ValueObjectDeclarationContext valueObjectDeclaration() throws RecognitionException {
		ValueObjectDeclarationContext _localctx = new ValueObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_valueObjectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(ValueObject);
			setState(1294);
			valueObjectIdentifier();
			setState(1295);
			match(OpenBrace);
			setState(1296);
			domainConstDeclarationList();
			setState(1297);
			domainConstructorDeclaration();
			setState(1298);
			privateMethodDeclarationList();
			setState(1299);
			match(CloseBrace);
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1300);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainConstDeclarationListContext extends ParserRuleContext {
		public List<DomainConstDeclarationContext> domainConstDeclaration() {
			return getRuleContexts(DomainConstDeclarationContext.class);
		}
		public DomainConstDeclarationContext domainConstDeclaration(int i) {
			return getRuleContext(DomainConstDeclarationContext.class,i);
		}
		public DomainConstDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainConstDeclarationList; }
	}

	public final DomainConstDeclarationListContext domainConstDeclarationList() throws RecognitionException {
		DomainConstDeclarationListContext _localctx = new DomainConstDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_domainConstDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Const) {
				{
				{
				setState(1303);
				domainConstDeclaration();
				}
				}
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicMethodDeclarationListContext extends ParserRuleContext {
		public List<PublicMethodDeclarationContext> publicMethodDeclaration() {
			return getRuleContexts(PublicMethodDeclarationContext.class);
		}
		public PublicMethodDeclarationContext publicMethodDeclaration(int i) {
			return getRuleContext(PublicMethodDeclarationContext.class,i);
		}
		public PublicMethodDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicMethodDeclarationList; }
	}

	public final PublicMethodDeclarationListContext publicMethodDeclarationList() throws RecognitionException {
		PublicMethodDeclarationListContext _localctx = new PublicMethodDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_publicMethodDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1309);
					publicMethodDeclaration();
					}
					} 
				}
				setState(1314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivateMethodDeclarationListContext extends ParserRuleContext {
		public List<PrivateMethodDeclarationContext> privateMethodDeclaration() {
			return getRuleContexts(PrivateMethodDeclarationContext.class);
		}
		public PrivateMethodDeclarationContext privateMethodDeclaration(int i) {
			return getRuleContext(PrivateMethodDeclarationContext.class,i);
		}
		public PrivateMethodDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateMethodDeclarationList; }
	}

	public final PrivateMethodDeclarationListContext privateMethodDeclarationList() throws RecognitionException {
		PrivateMethodDeclarationListContext _localctx = new PrivateMethodDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_privateMethodDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Private || _la==Identifier) {
				{
				{
				setState(1315);
				privateMethodDeclaration();
				}
				}
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Constructor() { return getToken(BitloopsParser.Constructor, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public ReturnOkErrorTypeContext returnOkErrorType() {
			return getRuleContext(ReturnOkErrorTypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DomainConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainConstructorDeclaration; }
	}

	public final DomainConstructorDeclarationContext domainConstructorDeclaration() throws RecognitionException {
		DomainConstructorDeclarationContext _localctx = new DomainConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_domainConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			match(Constructor);
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1322);
				formalParameterList();
				}
			}

			setState(1325);
			match(Colon);
			setState(1326);
			returnOkErrorType();
			setState(1327);
			match(OpenBrace);
			setState(1328);
			functionBody();
			setState(1329);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseCaseIdentifierContext extends ParserRuleContext {
		public TerminalNode UseCaseIdentifier() { return getToken(BitloopsParser.UseCaseIdentifier, 0); }
		public UseCaseIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCaseIdentifier; }
	}

	public final UseCaseIdentifierContext useCaseIdentifier() throws RecognitionException {
		UseCaseIdentifierContext _localctx = new UseCaseIdentifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_useCaseIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(UseCaseIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseCaseDeclarationContext extends ParserRuleContext {
		public TerminalNode UseCase() { return getToken(BitloopsParser.UseCase, 0); }
		public UseCaseIdentifierContext useCaseIdentifier() {
			return getRuleContext(UseCaseIdentifierContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public UseCaseExecuteDeclarationContext useCaseExecuteDeclaration() {
			return getRuleContext(UseCaseExecuteDeclarationContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public UseCaseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCaseDeclaration; }
	}

	public final UseCaseDeclarationContext useCaseDeclaration() throws RecognitionException {
		UseCaseDeclarationContext _localctx = new UseCaseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_useCaseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(UseCase);
			setState(1334);
			useCaseIdentifier();
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1335);
				formalParameterList();
				}
			}

			setState(1338);
			match(OpenBrace);
			setState(1339);
			useCaseExecuteDeclaration();
			setState(1340);
			match(CloseBrace);
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1341);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropsDeclarationContext extends ParserRuleContext {
		public TerminalNode Props() { return getToken(BitloopsParser.Props, 0); }
		public TerminalNode PropsIdentifier() { return getToken(BitloopsParser.PropsIdentifier, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public PropsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsDeclaration; }
	}

	public final PropsDeclarationContext propsDeclaration() throws RecognitionException {
		PropsDeclarationContext _localctx = new PropsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_propsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(Props);
			setState(1345);
			match(PropsIdentifier);
			setState(1346);
			match(OpenBrace);
			setState(1347);
			fieldList();
			setState(1348);
			match(CloseBrace);
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1349);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadModelDeclarationContext extends ParserRuleContext {
		public TerminalNode ReadModel() { return getToken(BitloopsParser.ReadModel, 0); }
		public TerminalNode ReadModelIdentifier() { return getToken(BitloopsParser.ReadModelIdentifier, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public ReadModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readModelDeclaration; }
	}

	public final ReadModelDeclarationContext readModelDeclaration() throws RecognitionException {
		ReadModelDeclarationContext _localctx = new ReadModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_readModelDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(ReadModel);
			setState(1353);
			match(ReadModelIdentifier);
			setState(1354);
			match(OpenBrace);
			setState(1355);
			fieldList();
			setState(1356);
			match(CloseBrace);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1357);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepoPortDeclarationContext extends ParserRuleContext {
		public TerminalNode RepoPort() { return getToken(BitloopsParser.RepoPort, 0); }
		public RepoPortIdentifierContext repoPortIdentifier() {
			return getRuleContext(RepoPortIdentifierContext.class,0);
		}
		public TerminalNode LessThan() { return getToken(BitloopsParser.LessThan, 0); }
		public TerminalNode ReadModelIdentifier() { return getToken(BitloopsParser.ReadModelIdentifier, 0); }
		public TerminalNode MoreThan() { return getToken(BitloopsParser.MoreThan, 0); }
		public RepoExtendsListContext repoExtendsList() {
			return getRuleContext(RepoExtendsListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public RepoPortMethodDefinitionsContext repoPortMethodDefinitions() {
			return getRuleContext(RepoPortMethodDefinitionsContext.class,0);
		}
		public AggregateRootIdentifierContext aggregateRootIdentifier() {
			return getRuleContext(AggregateRootIdentifierContext.class,0);
		}
		public RepoPortDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repoPortDeclaration; }
	}

	public final RepoPortDeclarationContext repoPortDeclaration() throws RecognitionException {
		RepoPortDeclarationContext _localctx = new RepoPortDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_repoPortDeclaration);
		int _la;
		try {
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				match(RepoPort);
				setState(1361);
				repoPortIdentifier();
				setState(1362);
				match(LessThan);
				setState(1363);
				match(ReadModelIdentifier);
				setState(1364);
				match(MoreThan);
				setState(1365);
				repoExtendsList();
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1366);
					match(SemiColon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				match(RepoPort);
				setState(1370);
				repoPortIdentifier();
				setState(1371);
				match(LessThan);
				setState(1372);
				match(ReadModelIdentifier);
				setState(1373);
				match(MoreThan);
				setState(1374);
				repoExtendsList();
				setState(1375);
				repoPortMethodDefinitions();
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1376);
					match(SemiColon);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1379);
				match(RepoPort);
				setState(1380);
				repoPortIdentifier();
				setState(1381);
				match(LessThan);
				setState(1382);
				aggregateRootIdentifier();
				setState(1383);
				match(MoreThan);
				setState(1384);
				repoExtendsList();
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1385);
					match(SemiColon);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1388);
				match(RepoPort);
				setState(1389);
				repoPortIdentifier();
				setState(1390);
				match(LessThan);
				setState(1391);
				aggregateRootIdentifier();
				setState(1392);
				match(MoreThan);
				setState(1393);
				repoExtendsList();
				setState(1394);
				repoPortMethodDefinitions();
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1395);
					match(SemiColon);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepoPortIdentifierContext extends ParserRuleContext {
		public TerminalNode RepoPortIdentifier() { return getToken(BitloopsParser.RepoPortIdentifier, 0); }
		public RepoPortIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repoPortIdentifier; }
	}

	public final RepoPortIdentifierContext repoPortIdentifier() throws RecognitionException {
		RepoPortIdentifierContext _localctx = new RepoPortIdentifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_repoPortIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			match(RepoPortIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateRootIdentifierContext extends ParserRuleContext {
		public TerminalNode EntityIdentifier() { return getToken(BitloopsParser.EntityIdentifier, 0); }
		public TerminalNode ReadModelIdentifier() { return getToken(BitloopsParser.ReadModelIdentifier, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode UpperCaseIdentifier() { return getToken(BitloopsParser.UpperCaseIdentifier, 0); }
		public AggregateRootIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateRootIdentifier; }
	}

	public final AggregateRootIdentifierContext aggregateRootIdentifier() throws RecognitionException {
		AggregateRootIdentifierContext _localctx = new AggregateRootIdentifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_aggregateRootIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			_la = _input.LA(1);
			if ( !(((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (EntityIdentifier - 205)) | (1L << (ReadModelIdentifier - 205)) | (1L << (UpperCaseIdentifier - 205)) | (1L << (Identifier - 205)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepoExtendsListContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(BitloopsParser.Extends, 0); }
		public RepoPortExtendableIdentifierListContext repoPortExtendableIdentifierList() {
			return getRuleContext(RepoPortExtendableIdentifierListContext.class,0);
		}
		public RepoExtendsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repoExtendsList; }
	}

	public final RepoExtendsListContext repoExtendsList() throws RecognitionException {
		RepoExtendsListContext _localctx = new RepoExtendsListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_repoExtendsList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			match(Extends);
			setState(1405);
			repoPortExtendableIdentifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepoPortMethodDefinitionsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public MethodDefinitionListContext methodDefinitionList() {
			return getRuleContext(MethodDefinitionListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public RepoPortMethodDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repoPortMethodDefinitions; }
	}

	public final RepoPortMethodDefinitionsContext repoPortMethodDefinitions() throws RecognitionException {
		RepoPortMethodDefinitionsContext _localctx = new RepoPortMethodDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_repoPortMethodDefinitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(OpenBrace);
			setState(1408);
			methodDefinitionList();
			setState(1409);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepoPortExtendableIdentifierListContext extends ParserRuleContext {
		public List<RepoPortExtendableIdentifierContext> repoPortExtendableIdentifier() {
			return getRuleContexts(RepoPortExtendableIdentifierContext.class);
		}
		public RepoPortExtendableIdentifierContext repoPortExtendableIdentifier(int i) {
			return getRuleContext(RepoPortExtendableIdentifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public RepoPortExtendableIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repoPortExtendableIdentifierList; }
	}

	public final RepoPortExtendableIdentifierListContext repoPortExtendableIdentifierList() throws RecognitionException {
		RepoPortExtendableIdentifierListContext _localctx = new RepoPortExtendableIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_repoPortExtendableIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1411);
			repoPortExtendableIdentifier();
			}
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1412);
				match(Comma);
				{
				setState(1413);
				repoPortExtendableIdentifier();
				}
				}
				}
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepoPortExtendableIdentifierContext extends ParserRuleContext {
		public TerminalNode RepoPortIdentifier() { return getToken(BitloopsParser.RepoPortIdentifier, 0); }
		public List<TerminalNode> UpperCaseIdentifier() { return getTokens(BitloopsParser.UpperCaseIdentifier); }
		public TerminalNode UpperCaseIdentifier(int i) {
			return getToken(BitloopsParser.UpperCaseIdentifier, i);
		}
		public TerminalNode LessThan() { return getToken(BitloopsParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(BitloopsParser.MoreThan, 0); }
		public RepoPortExtendableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repoPortExtendableIdentifier; }
	}

	public final RepoPortExtendableIdentifierContext repoPortExtendableIdentifier() throws RecognitionException {
		RepoPortExtendableIdentifierContext _localctx = new RepoPortExtendableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_repoPortExtendableIdentifier);
		try {
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1419);
				match(RepoPortIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				match(UpperCaseIdentifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1421);
				match(UpperCaseIdentifier);
				setState(1422);
				match(LessThan);
				setState(1423);
				match(UpperCaseIdentifier);
				setState(1424);
				match(MoreThan);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtoDeclarationContext extends ParserRuleContext {
		public TerminalNode DTO() { return getToken(BitloopsParser.DTO, 0); }
		public TerminalNode DTOIdentifier() { return getToken(BitloopsParser.DTOIdentifier, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public DtoDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoDeclaration; }
	}

	public final DtoDeclarationContext dtoDeclaration() throws RecognitionException {
		DtoDeclarationContext _localctx = new DtoDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_dtoDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(DTO);
			setState(1428);
			match(DTOIdentifier);
			setState(1429);
			match(OpenBrace);
			setState(1430);
			fieldList();
			setState(1431);
			match(CloseBrace);
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1432);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(BitloopsParser.Struct, 0); }
		public TerminalNode UpperCaseIdentifier() { return getToken(BitloopsParser.UpperCaseIdentifier, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(Struct);
			setState(1436);
			match(UpperCaseIdentifier);
			setState(1437);
			match(OpenBrace);
			setState(1438);
			fieldList();
			setState(1439);
			match(CloseBrace);
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1440);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtoEvaluationIdentifierContext extends ParserRuleContext {
		public DtoIdentifierContext dtoIdentifier() {
			return getRuleContext(DtoIdentifierContext.class,0);
		}
		public DtoEvaluationIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoEvaluationIdentifier; }
	}

	public final DtoEvaluationIdentifierContext dtoEvaluationIdentifier() throws RecognitionException {
		DtoEvaluationIdentifierContext _localctx = new DtoEvaluationIdentifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_dtoEvaluationIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			dtoIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtoEvaluationContext extends ParserRuleContext {
		public DtoEvaluationIdentifierContext dtoEvaluationIdentifier() {
			return getRuleContext(DtoEvaluationIdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public EvaluationFieldListContext evaluationFieldList() {
			return getRuleContext(EvaluationFieldListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public DtoEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoEvaluation; }
	}

	public final DtoEvaluationContext dtoEvaluation() throws RecognitionException {
		DtoEvaluationContext _localctx = new DtoEvaluationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_dtoEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			dtoEvaluationIdentifier();
			setState(1446);
			match(OpenParen);
			setState(1447);
			match(OpenBrace);
			setState(1448);
			evaluationFieldList();
			setState(1449);
			match(CloseBrace);
			setState(1450);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueObjectEvaluationContext extends ParserRuleContext {
		public ValueObjectIdentifierContext valueObjectIdentifier() {
			return getRuleContext(ValueObjectIdentifierContext.class,0);
		}
		public DomainEvaluationInputContext domainEvaluationInput() {
			return getRuleContext(DomainEvaluationInputContext.class,0);
		}
		public ValueObjectEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueObjectEvaluation; }
	}

	public final ValueObjectEvaluationContext valueObjectEvaluation() throws RecognitionException {
		ValueObjectEvaluationContext _localctx = new ValueObjectEvaluationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_valueObjectEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			valueObjectIdentifier();
			setState(1453);
			domainEvaluationInput();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainEvaluationInputContext extends ParserRuleContext {
		public DomainEvaluationInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainEvaluationInput; }
	 
		public DomainEvaluationInputContext() { }
		public void copyFrom(DomainEvaluationInputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DomainEvaluationInputRegularContext extends DomainEvaluationInputContext {
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public DomainEvaluationInputRegularContext(DomainEvaluationInputContext ctx) { copyFrom(ctx); }
	}
	public static class DomainEvaluationInputFieldListContext extends DomainEvaluationInputContext {
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public EvaluationFieldListContext evaluationFieldList() {
			return getRuleContext(EvaluationFieldListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public DomainEvaluationInputFieldListContext(DomainEvaluationInputContext ctx) { copyFrom(ctx); }
	}

	public final DomainEvaluationInputContext domainEvaluationInput() throws RecognitionException {
		DomainEvaluationInputContext _localctx = new DomainEvaluationInputContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_domainEvaluationInput);
		try {
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new DomainEvaluationInputFieldListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				match(OpenParen);
				setState(1456);
				match(OpenBrace);
				setState(1457);
				evaluationFieldList();
				setState(1458);
				match(CloseBrace);
				setState(1459);
				match(CloseParen);
				}
				break;
			case 2:
				_localctx = new DomainEvaluationInputRegularContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				match(OpenParen);
				setState(1462);
				expression(0);
				setState(1463);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityEvaluationContext extends ParserRuleContext {
		public EntityIdentifierContext entityIdentifier() {
			return getRuleContext(EntityIdentifierContext.class,0);
		}
		public DomainEvaluationInputContext domainEvaluationInput() {
			return getRuleContext(DomainEvaluationInputContext.class,0);
		}
		public EntityEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityEvaluation; }
	}

	public final EntityEvaluationContext entityEvaluation() throws RecognitionException {
		EntityEvaluationContext _localctx = new EntityEvaluationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_entityEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			entityIdentifier();
			setState(1468);
			domainEvaluationInput();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructEvaluationIdentifierContext extends ParserRuleContext {
		public TerminalNode UpperCaseIdentifier() { return getToken(BitloopsParser.UpperCaseIdentifier, 0); }
		public StructEvaluationIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structEvaluationIdentifier; }
	}

	public final StructEvaluationIdentifierContext structEvaluationIdentifier() throws RecognitionException {
		StructEvaluationIdentifierContext _localctx = new StructEvaluationIdentifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_structEvaluationIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			match(UpperCaseIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructEvaluationContext extends ParserRuleContext {
		public StructEvaluationIdentifierContext structEvaluationIdentifier() {
			return getRuleContext(StructEvaluationIdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public EvaluationFieldListContext evaluationFieldList() {
			return getRuleContext(EvaluationFieldListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public StructEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structEvaluation; }
	}

	public final StructEvaluationContext structEvaluation() throws RecognitionException {
		StructEvaluationContext _localctx = new StructEvaluationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_structEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			structEvaluationIdentifier();
			setState(1473);
			match(OpenParen);
			setState(1474);
			match(OpenBrace);
			setState(1475);
			evaluationFieldList();
			setState(1476);
			match(CloseBrace);
			setState(1477);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltInClassEvaluationContext extends ParserRuleContext {
		public BitloopsBuiltInClassContext bitloopsBuiltInClass() {
			return getRuleContext(BitloopsBuiltInClassContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode Dot() { return getToken(BitloopsParser.Dot, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public BuiltInClassEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInClassEvaluation; }
	}

	public final BuiltInClassEvaluationContext builtInClassEvaluation() throws RecognitionException {
		BuiltInClassEvaluationContext _localctx = new BuiltInClassEvaluationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_builtInClassEvaluation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			bitloopsBuiltInClass();
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(1480);
				match(Dot);
				setState(1481);
				identifier();
				}
			}

			setState(1484);
			methodArguments();
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1485);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropsEvaluationContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public PropsIdentifierContext propsIdentifier() {
			return getRuleContext(PropsIdentifierContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public EvaluationFieldListContext evaluationFieldList() {
			return getRuleContext(EvaluationFieldListContext.class,0);
		}
		public PropsEvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsEvaluation; }
	}

	public final PropsEvaluationContext propsEvaluation() throws RecognitionException {
		PropsEvaluationContext _localctx = new PropsEvaluationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_propsEvaluation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(OpenBrace);
			setState(1489);
			match(OpenParen);
			setState(1490);
			propsIdentifier();
			{
			setState(1491);
			evaluationFieldList();
			}
			setState(1492);
			match(CloseBrace);
			setState(1493);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainErrorDeclarationContext extends ParserRuleContext {
		public TerminalNode DomainError() { return getToken(BitloopsParser.DomainError, 0); }
		public DomainErrorIdentifierContext domainErrorIdentifier() {
			return getRuleContext(DomainErrorIdentifierContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public EvaluationFieldListContext evaluationFieldList() {
			return getRuleContext(EvaluationFieldListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public DomainErrorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainErrorDeclaration; }
	}

	public final DomainErrorDeclarationContext domainErrorDeclaration() throws RecognitionException {
		DomainErrorDeclarationContext _localctx = new DomainErrorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_domainErrorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			match(DomainError);
			setState(1496);
			domainErrorIdentifier();
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1497);
				formalParameterList();
				}
			}

			setState(1500);
			match(OpenBrace);
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1501);
				evaluationFieldList();
				}
			}

			setState(1504);
			match(CloseBrace);
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1505);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplicationErrorDeclarationContext extends ParserRuleContext {
		public TerminalNode ApplicationError() { return getToken(BitloopsParser.ApplicationError, 0); }
		public ApplicationErrorIdentifierContext applicationErrorIdentifier() {
			return getRuleContext(ApplicationErrorIdentifierContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public EvaluationFieldListContext evaluationFieldList() {
			return getRuleContext(EvaluationFieldListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public ApplicationErrorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applicationErrorDeclaration; }
	}

	public final ApplicationErrorDeclarationContext applicationErrorDeclaration() throws RecognitionException {
		ApplicationErrorDeclarationContext _localctx = new ApplicationErrorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_applicationErrorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			match(ApplicationError);
			setState(1509);
			applicationErrorIdentifier();
			setState(1511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1510);
				formalParameterList();
				}
			}

			setState(1513);
			match(OpenBrace);
			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1514);
				evaluationFieldList();
				}
			}

			setState(1517);
			match(CloseBrace);
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1518);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainErrorIdentifierContext extends ParserRuleContext {
		public TerminalNode DomainErrorIdentifier() { return getToken(BitloopsParser.DomainErrorIdentifier, 0); }
		public DomainErrorIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainErrorIdentifier; }
	}

	public final DomainErrorIdentifierContext domainErrorIdentifier() throws RecognitionException {
		DomainErrorIdentifierContext _localctx = new DomainErrorIdentifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_domainErrorIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(DomainErrorIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplicationErrorIdentifierContext extends ParserRuleContext {
		public TerminalNode DomainErrorIdentifier() { return getToken(BitloopsParser.DomainErrorIdentifier, 0); }
		public ApplicationErrorIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applicationErrorIdentifier; }
	}

	public final ApplicationErrorIdentifierContext applicationErrorIdentifier() throws RecognitionException {
		ApplicationErrorIdentifierContext _localctx = new ApplicationErrorIdentifierContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_applicationErrorIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(DomainErrorIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseCaseExecuteDeclarationContext extends ParserRuleContext {
		public TerminalNode Execute() { return getToken(BitloopsParser.Execute, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public ReturnOkErrorTypeContext returnOkErrorType() {
			return getRuleContext(ReturnOkErrorTypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public UseCaseExecuteDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCaseExecuteDeclaration; }
	}

	public final UseCaseExecuteDeclarationContext useCaseExecuteDeclaration() throws RecognitionException {
		UseCaseExecuteDeclarationContext _localctx = new UseCaseExecuteDeclarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_useCaseExecuteDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(Execute);
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1526);
				formalParameterList();
				}
			}

			setState(1529);
			match(Colon);
			setState(1530);
			returnOkErrorType();
			setState(1531);
			match(OpenBrace);
			setState(1532);
			functionBody();
			setState(1533);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestControllerParametersContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BitloopsParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BitloopsParser.Identifier, i);
		}
		public TerminalNode Comma() { return getToken(BitloopsParser.Comma, 0); }
		public RestControllerParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restControllerParameters; }
	}

	public final RestControllerParametersContext restControllerParameters() throws RecognitionException {
		RestControllerParametersContext _localctx = new RestControllerParametersContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_restControllerParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(Identifier);
			setState(1536);
			match(Comma);
			setState(1537);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestControllerExecuteDeclarationContext extends ParserRuleContext {
		public TerminalNode Execute() { return getToken(BitloopsParser.Execute, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public RestControllerParametersContext restControllerParameters() {
			return getRuleContext(RestControllerParametersContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public RestControllerExecuteDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restControllerExecuteDeclaration; }
	}

	public final RestControllerExecuteDeclarationContext restControllerExecuteDeclaration() throws RecognitionException {
		RestControllerExecuteDeclarationContext _localctx = new RestControllerExecuteDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_restControllerExecuteDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(Execute);
			setState(1540);
			match(OpenParen);
			setState(1541);
			restControllerParameters();
			setState(1542);
			match(CloseParen);
			setState(1543);
			match(OpenBrace);
			setState(1544);
			functionBody();
			setState(1545);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestControllerMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Method() { return getToken(BitloopsParser.Method, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public HttpMethodContext httpMethod() {
			return getRuleContext(HttpMethodContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public RestControllerMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restControllerMethodDeclaration; }
	}

	public final RestControllerMethodDeclarationContext restControllerMethodDeclaration() throws RecognitionException {
		RestControllerMethodDeclarationContext _localctx = new RestControllerMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_restControllerMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(Method);
			setState(1548);
			match(Colon);
			setState(1549);
			httpMethod();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(1550);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpMethodContext extends ParserRuleContext {
		public TerminalNode MethodGet() { return getToken(BitloopsParser.MethodGet, 0); }
		public TerminalNode MethodPut() { return getToken(BitloopsParser.MethodPut, 0); }
		public TerminalNode MethodPost() { return getToken(BitloopsParser.MethodPost, 0); }
		public TerminalNode MethodDelete() { return getToken(BitloopsParser.MethodDelete, 0); }
		public TerminalNode MethodPatch() { return getToken(BitloopsParser.MethodPatch, 0); }
		public TerminalNode MethodOptions() { return getToken(BitloopsParser.MethodOptions, 0); }
		public HttpMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpMethod; }
	}

	public final HttpMethodContext httpMethod() throws RecognitionException {
		HttpMethodContext _localctx = new HttpMethodContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_httpMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			_la = _input.LA(1);
			if ( !(((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (MethodGet - 191)) | (1L << (MethodPost - 191)) | (1L << (MethodPut - 191)) | (1L << (MethodPatch - 191)) | (1L << (MethodDelete - 191)) | (1L << (MethodOptions - 191)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControllerDeclarationContext extends ParserRuleContext {
		public ControllerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controllerDeclaration; }
	 
		public ControllerDeclarationContext() { }
		public void copyFrom(ControllerDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RESTControllerDeclarationContext extends ControllerDeclarationContext {
		public TerminalNode RESTController() { return getToken(BitloopsParser.RESTController, 0); }
		public TerminalNode ControllerIdentifier() { return getToken(BitloopsParser.ControllerIdentifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public RestControllerMethodDeclarationContext restControllerMethodDeclaration() {
			return getRuleContext(RestControllerMethodDeclarationContext.class,0);
		}
		public RestControllerExecuteDeclarationContext restControllerExecuteDeclaration() {
			return getRuleContext(RestControllerExecuteDeclarationContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public RESTControllerDeclarationContext(ControllerDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class GraphQLControllerDeclarationContext extends ControllerDeclarationContext {
		public TerminalNode GraphQLController() { return getToken(BitloopsParser.GraphQLController, 0); }
		public TerminalNode ControllerIdentifier() { return getToken(BitloopsParser.ControllerIdentifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public GraphQLResolverOptionsContext graphQLResolverOptions() {
			return getRuleContext(GraphQLResolverOptionsContext.class,0);
		}
		public GraphQLControllerExecuteDeclarationContext graphQLControllerExecuteDeclaration() {
			return getRuleContext(GraphQLControllerExecuteDeclarationContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public GraphQLControllerDeclarationContext(ControllerDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final ControllerDeclarationContext controllerDeclaration() throws RecognitionException {
		ControllerDeclarationContext _localctx = new ControllerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_controllerDeclaration);
		int _la;
		try {
			setState(1575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTController:
				_localctx = new RESTControllerDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1555);
				match(RESTController);
				setState(1556);
				match(ControllerIdentifier);
				setState(1557);
				formalParameterList();
				setState(1558);
				match(OpenBrace);
				setState(1559);
				restControllerMethodDeclaration();
				setState(1560);
				restControllerExecuteDeclaration();
				setState(1561);
				match(CloseBrace);
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1562);
					match(SemiColon);
					}
				}

				}
				break;
			case GraphQLController:
				_localctx = new GraphQLControllerDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				match(GraphQLController);
				setState(1566);
				match(ControllerIdentifier);
				setState(1567);
				formalParameterList();
				setState(1568);
				match(OpenBrace);
				setState(1569);
				graphQLResolverOptions();
				setState(1570);
				graphQLControllerExecuteDeclaration();
				setState(1571);
				match(CloseBrace);
				setState(1573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(1572);
					match(SemiColon);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQLResolverOptionsContext extends ParserRuleContext {
		public GraphQLOperationTypeAssignmentContext graphQLOperationTypeAssignment() {
			return getRuleContext(GraphQLOperationTypeAssignmentContext.class,0);
		}
		public GraphQLOperationInputTypeAssignmentContext graphQLOperationInputTypeAssignment() {
			return getRuleContext(GraphQLOperationInputTypeAssignmentContext.class,0);
		}
		public GraphQLResolverOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQLResolverOptions; }
	}

	public final GraphQLResolverOptionsContext graphQLResolverOptions() throws RecognitionException {
		GraphQLResolverOptionsContext _localctx = new GraphQLResolverOptionsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_graphQLResolverOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			graphQLOperationTypeAssignment();
			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Input) {
				{
				setState(1578);
				graphQLOperationInputTypeAssignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQLOperationTypeAssignmentContext extends ParserRuleContext {
		public TerminalNode GraphQLOperation() { return getToken(BitloopsParser.GraphQLOperation, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public GraphQLOperationContext graphQLOperation() {
			return getRuleContext(GraphQLOperationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public GraphQLOperationTypeAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQLOperationTypeAssignment; }
	}

	public final GraphQLOperationTypeAssignmentContext graphQLOperationTypeAssignment() throws RecognitionException {
		GraphQLOperationTypeAssignmentContext _localctx = new GraphQLOperationTypeAssignmentContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_graphQLOperationTypeAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(GraphQLOperation);
			setState(1582);
			match(Colon);
			setState(1583);
			graphQLOperation();
			setState(1584);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQLOperationInputTypeAssignmentContext extends ParserRuleContext {
		public TerminalNode Input() { return getToken(BitloopsParser.Input, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public GraphQLResolverInputTypeContext graphQLResolverInputType() {
			return getRuleContext(GraphQLResolverInputTypeContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public GraphQLOperationInputTypeAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQLOperationInputTypeAssignment; }
	}

	public final GraphQLOperationInputTypeAssignmentContext graphQLOperationInputTypeAssignment() throws RecognitionException {
		GraphQLOperationInputTypeAssignmentContext _localctx = new GraphQLOperationInputTypeAssignmentContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_graphQLOperationInputTypeAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(Input);
			setState(1587);
			match(Colon);
			setState(1588);
			graphQLResolverInputType();
			setState(1589);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQLResolverInputTypeContext extends ParserRuleContext {
		public TerminalNode DTOIdentifier() { return getToken(BitloopsParser.DTOIdentifier, 0); }
		public GraphQLResolverInputTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQLResolverInputType; }
	}

	public final GraphQLResolverInputTypeContext graphQLResolverInputType() throws RecognitionException {
		GraphQLResolverInputTypeContext _localctx = new GraphQLResolverInputTypeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_graphQLResolverInputType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(DTOIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQLOperationContext extends ParserRuleContext {
		public TerminalNode OperationMutation() { return getToken(BitloopsParser.OperationMutation, 0); }
		public TerminalNode OperationQuery() { return getToken(BitloopsParser.OperationQuery, 0); }
		public TerminalNode OperationSubscription() { return getToken(BitloopsParser.OperationSubscription, 0); }
		public GraphQLOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQLOperation; }
	}

	public final GraphQLOperationContext graphQLOperation() throws RecognitionException {
		GraphQLOperationContext _localctx = new GraphQLOperationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_graphQLOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			_la = _input.LA(1);
			if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (OperationMutation - 199)) | (1L << (OperationQuery - 199)) | (1L << (OperationSubscription - 199)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQLControllerExecuteDeclarationContext extends ParserRuleContext {
		public TerminalNode Execute() { return getToken(BitloopsParser.Execute, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public GraphQLControllerParametersContext graphQLControllerParameters() {
			return getRuleContext(GraphQLControllerParametersContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public GraphQLControllerReturnTypeContext graphQLControllerReturnType() {
			return getRuleContext(GraphQLControllerReturnTypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public GraphQLControllerExecuteDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQLControllerExecuteDeclaration; }
	}

	public final GraphQLControllerExecuteDeclarationContext graphQLControllerExecuteDeclaration() throws RecognitionException {
		GraphQLControllerExecuteDeclarationContext _localctx = new GraphQLControllerExecuteDeclarationContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_graphQLControllerExecuteDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			match(Execute);
			setState(1596);
			match(OpenParen);
			setState(1597);
			graphQLControllerParameters();
			setState(1598);
			match(CloseParen);
			setState(1599);
			match(Colon);
			setState(1600);
			graphQLControllerReturnType();
			setState(1601);
			match(OpenBrace);
			setState(1602);
			functionBody();
			setState(1603);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQLControllerParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public GraphQLControllerParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQLControllerParameters; }
	}

	public final GraphQLControllerParametersContext graphQLControllerParameters() throws RecognitionException {
		GraphQLControllerParametersContext _localctx = new GraphQLControllerParametersContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_graphQLControllerParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQLControllerReturnTypeContext extends ParserRuleContext {
		public TerminalNode DTOIdentifier() { return getToken(BitloopsParser.DTOIdentifier, 0); }
		public GraphQLControllerReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQLControllerReturnType; }
	}

	public final GraphQLControllerReturnTypeContext graphQLControllerReturnType() throws RecognitionException {
		GraphQLControllerReturnTypeContext _localctx = new GraphQLControllerReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_graphQLControllerReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			match(DTOIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtoIdentifierContext extends ParserRuleContext {
		public TerminalNode DTOIdentifier() { return getToken(BitloopsParser.DTOIdentifier, 0); }
		public DtoIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoIdentifier; }
	}

	public final DtoIdentifierContext dtoIdentifier() throws RecognitionException {
		DtoIdentifierContext _localctx = new DtoIdentifierContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_dtoIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(DTOIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtoIdentifiersContext extends ParserRuleContext {
		public List<DtoIdentifierContext> dtoIdentifier() {
			return getRuleContexts(DtoIdentifierContext.class);
		}
		public DtoIdentifierContext dtoIdentifier(int i) {
			return getRuleContext(DtoIdentifierContext.class,i);
		}
		public List<TerminalNode> BitOr() { return getTokens(BitloopsParser.BitOr); }
		public TerminalNode BitOr(int i) {
			return getToken(BitloopsParser.BitOr, i);
		}
		public DtoIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtoIdentifiers; }
	}

	public final DtoIdentifiersContext dtoIdentifiers() throws RecognitionException {
		DtoIdentifiersContext _localctx = new DtoIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_dtoIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			dtoIdentifier();
			setState(1616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BitOr) {
				{
				{
				setState(1612);
				match(BitOr);
				setState(1613);
				dtoIdentifier();
				}
				}
				setState(1618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorIdentifierContext extends ParserRuleContext {
		public TerminalNode ErrorIdentifier() { return getToken(BitloopsParser.ErrorIdentifier, 0); }
		public ErrorIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorIdentifier; }
	}

	public final ErrorIdentifierContext errorIdentifier() throws RecognitionException {
		ErrorIdentifierContext _localctx = new ErrorIdentifierContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_errorIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			match(ErrorIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorIdentifiersContext extends ParserRuleContext {
		public List<ErrorIdentifierContext> errorIdentifier() {
			return getRuleContexts(ErrorIdentifierContext.class);
		}
		public ErrorIdentifierContext errorIdentifier(int i) {
			return getRuleContext(ErrorIdentifierContext.class,i);
		}
		public List<TerminalNode> BitOr() { return getTokens(BitloopsParser.BitOr); }
		public TerminalNode BitOr(int i) {
			return getToken(BitloopsParser.BitOr, i);
		}
		public ErrorIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorIdentifiers; }
	}

	public final ErrorIdentifiersContext errorIdentifiers() throws RecognitionException {
		ErrorIdentifiersContext _localctx = new ErrorIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_errorIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			errorIdentifier();
			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BitOr) {
				{
				{
				setState(1622);
				match(BitOr);
				setState(1623);
				errorIdentifier();
				}
				}
				setState(1628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueObjectIdentifierContext extends ParserRuleContext {
		public TerminalNode ValueObjectIdentifier() { return getToken(BitloopsParser.ValueObjectIdentifier, 0); }
		public ValueObjectIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueObjectIdentifier; }
	}

	public final ValueObjectIdentifierContext valueObjectIdentifier() throws RecognitionException {
		ValueObjectIdentifierContext _localctx = new ValueObjectIdentifierContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_valueObjectIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(ValueObjectIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityIdentifierContext extends ParserRuleContext {
		public TerminalNode EntityIdentifier() { return getToken(BitloopsParser.EntityIdentifier, 0); }
		public EntityIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityIdentifier; }
	}

	public final EntityIdentifierContext entityIdentifier() throws RecognitionException {
		EntityIdentifierContext _localctx = new EntityIdentifierContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_entityIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(EntityIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainRuleIdentifierContext extends ParserRuleContext {
		public TerminalNode RuleIdentifier() { return getToken(BitloopsParser.RuleIdentifier, 0); }
		public DomainRuleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainRuleIdentifier; }
	}

	public final DomainRuleIdentifierContext domainRuleIdentifier() throws RecognitionException {
		DomainRuleIdentifierContext _localctx = new DomainRuleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_domainRuleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(RuleIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnOkTypeContext extends ParserRuleContext {
		public TerminalNode OK() { return getToken(BitloopsParser.OK, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public BitloopsPrimaryTypeContext bitloopsPrimaryType() {
			return getRuleContext(BitloopsPrimaryTypeContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public ReturnOkTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnOkType; }
	}

	public final ReturnOkTypeContext returnOkType() throws RecognitionException {
		ReturnOkTypeContext _localctx = new ReturnOkTypeContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_returnOkType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			match(OK);
			setState(1636);
			match(OpenParen);
			setState(1637);
			bitloopsPrimaryType(0);
			setState(1638);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnErrorsTypeContext extends ParserRuleContext {
		public TerminalNode Errors() { return getToken(BitloopsParser.Errors, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public ErrorIdentifiersContext errorIdentifiers() {
			return getRuleContext(ErrorIdentifiersContext.class,0);
		}
		public ReturnErrorsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnErrorsType; }
	}

	public final ReturnErrorsTypeContext returnErrorsType() throws RecognitionException {
		ReturnErrorsTypeContext _localctx = new ReturnErrorsTypeContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_returnErrorsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(Errors);
			setState(1641);
			match(OpenParen);
			setState(1643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ErrorIdentifier) {
				{
				setState(1642);
				errorIdentifiers();
				}
			}

			setState(1645);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnOkErrorTypeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ReturnOkTypeContext returnOkType() {
			return getRuleContext(ReturnOkTypeContext.class,0);
		}
		public TerminalNode Comma() { return getToken(BitloopsParser.Comma, 0); }
		public ReturnErrorsTypeContext returnErrorsType() {
			return getRuleContext(ReturnErrorsTypeContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public ReturnOkErrorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnOkErrorType; }
	}

	public final ReturnOkErrorTypeContext returnOkErrorType() throws RecognitionException {
		ReturnOkErrorTypeContext _localctx = new ReturnOkErrorTypeContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_returnOkErrorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			match(OpenParen);
			setState(1648);
			returnOkType();
			setState(1649);
			match(Comma);
			setState(1650);
			returnErrorsType();
			setState(1651);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackagePortIdentifierContext extends ParserRuleContext {
		public TerminalNode PackagePortIdentifier() { return getToken(BitloopsParser.PackagePortIdentifier, 0); }
		public PackagePortIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagePortIdentifier; }
	}

	public final PackagePortIdentifierContext packagePortIdentifier() throws RecognitionException {
		PackagePortIdentifierContext _localctx = new PackagePortIdentifierContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_packagePortIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			match(PackagePortIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackagePortDeclarationContext extends ParserRuleContext {
		public TerminalNode PackagePort() { return getToken(BitloopsParser.PackagePort, 0); }
		public PackagePortIdentifierContext packagePortIdentifier() {
			return getRuleContext(PackagePortIdentifierContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public MethodDefinitionListContext methodDefinitionList() {
			return getRuleContext(MethodDefinitionListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public PackagePortDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagePortDeclaration; }
	}

	public final PackagePortDeclarationContext packagePortDeclaration() throws RecognitionException {
		PackagePortDeclarationContext _localctx = new PackagePortDeclarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_packagePortDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(PackagePort);
			setState(1656);
			packagePortIdentifier();
			setState(1657);
			match(OpenBrace);
			setState(1658);
			methodDefinitionList();
			setState(1659);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PublicMethodDeclarationExpressionContext extends MethodDeclarationContext {
		public PublicMethodDeclarationContext publicMethodDeclaration() {
			return getRuleContext(PublicMethodDeclarationContext.class,0);
		}
		public PublicMethodDeclarationExpressionContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class PrivateMethodDeclarationExpressionContext extends MethodDeclarationContext {
		public PrivateMethodDeclarationContext privateMethodDeclaration() {
			return getRuleContext(PrivateMethodDeclarationContext.class,0);
		}
		public PrivateMethodDeclarationExpressionContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_methodDeclaration);
		try {
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new PublicMethodDeclarationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				publicMethodDeclaration();
				}
				break;
			case 2:
				_localctx = new PrivateMethodDeclarationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				privateMethodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivateMethodDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnPrivateMethodTypeContext returnPrivateMethodType() {
			return getRuleContext(ReturnPrivateMethodTypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode Private() { return getToken(BitloopsParser.Private, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public PrivateMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateMethodDeclaration; }
	}

	public final PrivateMethodDeclarationContext privateMethodDeclaration() throws RecognitionException {
		PrivateMethodDeclarationContext _localctx = new PrivateMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_privateMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1665);
				match(Private);
				}
			}

			setState(1668);
			identifier();
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1669);
				formalParameterList();
				}
			}

			setState(1672);
			returnPrivateMethodType();
			setState(1673);
			match(OpenBrace);
			setState(1674);
			functionBody();
			setState(1675);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicMethodDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnPublicMethodTypeContext returnPublicMethodType() {
			return getRuleContext(ReturnPublicMethodTypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode Public() { return getToken(BitloopsParser.Public, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public PublicMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicMethodDeclaration; }
	}

	public final PublicMethodDeclarationContext publicMethodDeclaration() throws RecognitionException {
		PublicMethodDeclarationContext _localctx = new PublicMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_publicMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public) {
				{
				setState(1677);
				match(Public);
				}
			}

			setState(1680);
			identifier();
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1681);
				formalParameterList();
				}
			}

			setState(1684);
			returnPublicMethodType();
			setState(1685);
			match(OpenBrace);
			setState(1686);
			functionBody();
			setState(1687);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnPublicMethodTypeContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public ReturnOkErrorTypeContext returnOkErrorType() {
			return getRuleContext(ReturnOkErrorTypeContext.class,0);
		}
		public ReturnPublicMethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnPublicMethodType; }
	}

	public final ReturnPublicMethodTypeContext returnPublicMethodType() throws RecognitionException {
		ReturnPublicMethodTypeContext _localctx = new ReturnPublicMethodTypeContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_returnPublicMethodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			match(Colon);
			setState(1690);
			returnOkErrorType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnPrivateMethodTypeContext extends ParserRuleContext {
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public ReturnOkErrorTypeContext returnOkErrorType() {
			return getRuleContext(ReturnOkErrorTypeContext.class,0);
		}
		public ReturnPrivateMethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnPrivateMethodType; }
	}

	public final ReturnPrivateMethodTypeContext returnPrivateMethodType() throws RecognitionException {
		ReturnPrivateMethodTypeContext _localctx = new ReturnPrivateMethodTypeContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_returnPrivateMethodType);
		try {
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1692);
				typeAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1693);
				match(Colon);
				setState(1694);
				returnOkErrorType();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyMemberBaseContext extends ParserRuleContext {
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TerminalNode Static() { return getToken(BitloopsParser.Static, 0); }
		public PropertyMemberBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyMemberBase; }
	}

	public final PropertyMemberBaseContext propertyMemberBase() throws RecognitionException {
		PropertyMemberBaseContext _localctx = new PropertyMemberBaseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_propertyMemberBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private || _la==Public) {
				{
				setState(1697);
				accessibilityModifier();
				}
			}

			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(1700);
				match(Static);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexMemberDeclarationContext extends ParserRuleContext {
		public IndexSignatureContext indexSignature() {
			return getRuleContext(IndexSignatureContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public IndexMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexMemberDeclaration; }
	}

	public final IndexMemberDeclarationContext indexMemberDeclaration() throws RecognitionException {
		IndexMemberDeclarationContext _localctx = new IndexMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_indexMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			indexSignature();
			setState(1704);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorMethodContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode Multiply() { return getToken(BitloopsParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public GeneratorMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorMethod; }
	}

	public final GeneratorMethodContext generatorMethod() throws RecognitionException {
		GeneratorMethodContext _localctx = new GeneratorMethodContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_generatorMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(1706);
				match(Multiply);
				}
			}

			setState(1709);
			match(Identifier);
			setState(1710);
			match(OpenParen);
			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1711);
				formalParameterList();
				}
			}

			setState(1714);
			match(CloseParen);
			setState(1715);
			match(OpenBrace);
			setState(1716);
			functionBody();
			setState(1717);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(BitloopsParser.Function_, 0); }
		public TerminalNode Multiply() { return getToken(BitloopsParser.Multiply, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public GeneratorFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorFunctionDeclaration; }
	}

	public final GeneratorFunctionDeclarationContext generatorFunctionDeclaration() throws RecognitionException {
		GeneratorFunctionDeclarationContext _localctx = new GeneratorFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_generatorFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(Function_);
			setState(1720);
			match(Multiply);
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1721);
				match(Identifier);
				}
			}

			setState(1724);
			match(OpenParen);
			setState(1726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1725);
				formalParameterList();
				}
			}

			setState(1728);
			match(CloseParen);
			setState(1729);
			match(OpenBrace);
			setState(1730);
			functionBody();
			setState(1731);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public List<GeneratorDefinitionContext> generatorDefinition() {
			return getRuleContexts(GeneratorDefinitionContext.class);
		}
		public GeneratorDefinitionContext generatorDefinition(int i) {
			return getRuleContext(GeneratorDefinitionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public GeneratorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorBlock; }
	}

	public final GeneratorBlockContext generatorBlock() throws RecognitionException {
		GeneratorBlockContext _localctx = new GeneratorBlockContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_generatorBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			match(OpenBrace);
			setState(1734);
			generatorDefinition();
			setState(1739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1735);
					match(Comma);
					setState(1736);
					generatorDefinition();
					}
					} 
				}
				setState(1741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1742);
				match(Comma);
				}
			}

			setState(1745);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorDefinitionContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(BitloopsParser.Multiply, 0); }
		public IteratorDefinitionContext iteratorDefinition() {
			return getRuleContext(IteratorDefinitionContext.class,0);
		}
		public GeneratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorDefinition; }
	}

	public final GeneratorDefinitionContext generatorDefinition() throws RecognitionException {
		GeneratorDefinitionContext _localctx = new GeneratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_generatorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			match(Multiply);
			setState(1748);
			iteratorDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratorBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public List<IteratorDefinitionContext> iteratorDefinition() {
			return getRuleContexts(IteratorDefinitionContext.class);
		}
		public IteratorDefinitionContext iteratorDefinition(int i) {
			return getRuleContext(IteratorDefinitionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public IteratorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorBlock; }
	}

	public final IteratorBlockContext iteratorBlock() throws RecognitionException {
		IteratorBlockContext _localctx = new IteratorBlockContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_iteratorBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(OpenBrace);
			setState(1751);
			iteratorDefinition();
			setState(1756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1752);
					match(Comma);
					setState(1753);
					iteratorDefinition();
					}
					} 
				}
				setState(1758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1759);
				match(Comma);
				}
			}

			setState(1762);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratorDefinitionContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(BitloopsParser.OpenBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(BitloopsParser.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public IteratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorDefinition; }
	}

	public final IteratorDefinitionContext iteratorDefinition() throws RecognitionException {
		IteratorDefinitionContext _localctx = new IteratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_iteratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(OpenBracket);
			setState(1765);
			expression(0);
			setState(1766);
			match(CloseBracket);
			setState(1767);
			match(OpenParen);
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1768);
				formalParameterList();
				}
			}

			setState(1771);
			match(CloseParen);
			setState(1772);
			match(OpenBrace);
			setState(1773);
			functionBody();
			setState(1774);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1776);
				match(OpenParen);
				setState(1777);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				match(OpenParen);
				setState(1792);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Private:
				case Public:
				case TypeAlias:
				case At:
				case Identifier:
					{
					setState(1779);
					formalParameterArg();
					setState(1784);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1780);
							match(Comma);
							setState(1781);
							formalParameterArg();
							}
							} 
						}
						setState(1786);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
					}
					setState(1789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1787);
						match(Comma);
						setState(1788);
						lastFormalParameterArg();
						}
					}

					}
					break;
				case Ellipsis:
					{
					setState(1791);
					lastFormalParameterArg();
					}
					break;
				case CloseParen:
					break;
				default:
					break;
				}
				setState(1794);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterArgContext extends ParserRuleContext {
		public IdentifierOrKeyWordContext identifierOrKeyWord() {
			return getRuleContext(IdentifierOrKeyWordContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(BitloopsParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1797);
				decorator();
				}
			}

			setState(1801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private || _la==Public) {
				{
				setState(1800);
				accessibilityModifier();
				}
			}

			setState(1803);
			identifierOrKeyWord();
			setState(1805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1804);
				typeAnnotation();
				}
			}

			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1807);
				match(Assign);
				setState(1808);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(BitloopsParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			match(Ellipsis);
			setState(1812);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Return - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (This - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Async - 65)) | (1L << (ApplyRules - 65)) | (1L << (Const - 65)) | (1L << (Props - 65)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (Namespace - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
				{
				setState(1814);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(BitloopsParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(BitloopsParser.CloseBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			match(OpenBracket);
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || _la==This || _la==Delete || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
				{
				setState(1818);
				elementList();
				}
			}

			setState(1821);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			expression(0);
			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1824);
				match(Comma);
				setState(1825);
				expression(0);
				}
				}
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			match(OpenBrace);
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << Ellipsis) | (1L << Multiply) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (TypeAlias - 150)) | (1L << (Get - 150)) | (1L << (Set - 150)))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(1832);
				propertyAssignment();
				setState(1837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1833);
						match(Comma);
						setState(1834);
						propertyAssignment();
						}
						} 
					}
					setState(1839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				setState(1841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1840);
					match(Comma);
					}
				}

				}
			}

			setState(1845);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularVariableEvaluationORliteralORexpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RegularVariableEvaluationORliteralORexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularVariableEvaluationORliteralORexpression; }
	}

	public final RegularVariableEvaluationORliteralORexpressionContext regularVariableEvaluationORliteralORexpression() throws RecognitionException {
		RegularVariableEvaluationORliteralORexpressionContext _localctx = new RegularVariableEvaluationORliteralORexpressionContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_regularVariableEvaluationORliteralORexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public RegularVariableEvaluationORliteralORexpressionContext regularVariableEvaluationORliteralORexpression() {
			return getRuleContext(RegularVariableEvaluationORliteralORexpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public TerminalNode Assign() { return getToken(BitloopsParser.Assign, 0); }
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public TerminalNode OpenBracket() { return getToken(BitloopsParser.OpenBracket, 0); }
		public List<RegularVariableEvaluationORliteralORexpressionContext> regularVariableEvaluationORliteralORexpression() {
			return getRuleContexts(RegularVariableEvaluationORliteralORexpressionContext.class);
		}
		public RegularVariableEvaluationORliteralORexpressionContext regularVariableEvaluationORliteralORexpression(int i) {
			return getRuleContext(RegularVariableEvaluationORliteralORexpressionContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(BitloopsParser.CloseBracket, 0); }
		public TerminalNode Colon() { return getToken(BitloopsParser.Colon, 0); }
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public IdentifierOrKeyWordContext identifierOrKeyWord() {
			return getRuleContext(IdentifierOrKeyWordContext.class,0);
		}
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetAccessorContext setAccessor() {
			return getRuleContext(SetAccessorContext.class,0);
		}
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetAccessorContext getAccessor() {
			return getRuleContext(GetAccessorContext.class,0);
		}
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class RestParameterInObjectContext extends PropertyAssignmentContext {
		public RestParameterContext restParameter() {
			return getRuleContext(RestParameterContext.class,0);
		}
		public RestParameterInObjectContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class MethodPropertyContext extends PropertyAssignmentContext {
		public GeneratorMethodContext generatorMethod() {
			return getRuleContext(GeneratorMethodContext.class,0);
		}
		public MethodPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_propertyAssignment);
		int _la;
		try {
			setState(1864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				propertyName();
				setState(1850);
				_la = _input.LA(1);
				if ( !(_la==Assign || _la==Colon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1851);
				regularVariableEvaluationORliteralORexpression();
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1853);
				match(OpenBracket);
				setState(1854);
				regularVariableEvaluationORliteralORexpression();
				setState(1855);
				match(CloseBracket);
				setState(1856);
				match(Colon);
				setState(1857);
				regularVariableEvaluationORliteralORexpression();
				}
				break;
			case 3:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1859);
				getAccessor();
				}
				break;
			case 4:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1860);
				setAccessor();
				}
				break;
			case 5:
				_localctx = new MethodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1861);
				generatorMethod();
				}
				break;
			case 6:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1862);
				identifierOrKeyWord();
				}
				break;
			case 7:
				_localctx = new RestParameterInObjectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1863);
				restParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetAccessorContext extends ParserRuleContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAccessor; }
	}

	public final GetAccessorContext getAccessor() throws RecognitionException {
		GetAccessorContext _localctx = new GetAccessorContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_getAccessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			getter();
			setState(1867);
			match(OpenParen);
			setState(1868);
			match(CloseParen);
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1869);
				typeAnnotation();
				}
			}

			setState(1872);
			match(OpenBrace);
			setState(1873);
			functionBody();
			setState(1874);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAccessorContext extends ParserRuleContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public SetAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAccessor; }
	}

	public final SetAccessorContext setAccessor() throws RecognitionException {
		SetAccessorContext _localctx = new SetAccessorContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_setAccessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			setter();
			setState(1877);
			match(OpenParen);
			setState(1880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1878);
				match(Identifier);
				}
				break;
			case OpenBracket:
			case OpenBrace:
				{
				setState(1879);
				bindingPattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1882);
				typeAnnotation();
				}
			}

			setState(1885);
			match(CloseParen);
			setState(1886);
			match(OpenBrace);
			setState(1887);
			functionBody();
			setState(1888);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(BitloopsParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_propertyName);
		try {
			setState(1893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1891);
				match(StringLiteral);
				}
				break;
			case IntegerLiteral:
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1892);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(BitloopsParser.Comma, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			match(OpenParen);
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0) || _la==This || _la==Delete || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (Execute - 153)) | (1L << (Create - 153)) | (1L << (UUIDv4 - 153)) | (1L << (DTOIdentifier - 153)) | (1L << (ValueObjectIdentifier - 153)) | (1L << (EntityIdentifier - 153)) | (1L << (ErrorIdentifier - 153)) | (1L << (UpperCaseIdentifier - 153)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (Identifier - 217)) | (1L << (StringLiteral - 217)) | (1L << (BackTick - 217)))) != 0)) {
				{
				setState(1896);
				argumentList();
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1897);
					match(Comma);
					}
				}

				}
			}

			setState(1902);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			argument();
			setState(1909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1905);
					match(Comma);
					setState(1906);
					argument();
					}
					} 
				}
				setState(1911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public RegularVariableEvaluationORliteralORexpressionContext regularVariableEvaluationORliteralORexpression() {
			return getRuleContext(RegularVariableEvaluationORliteralORexpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1912);
			regularVariableEvaluationORliteralORexpression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BitloopsParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BitloopsParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			expression(0);
			setState(1919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1915);
				match(Comma);
				setState(1916);
				expression(0);
				}
				}
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExpressionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(BitloopsParser.Function_, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public FunctionExpressionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpressionDeclaration; }
	}

	public final FunctionExpressionDeclarationContext functionExpressionDeclaration() throws RecognitionException {
		FunctionExpressionDeclarationContext _localctx = new FunctionExpressionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_functionExpressionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
			match(Function_);
			setState(1924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1923);
				match(Identifier);
				}
			}

			setState(1926);
			match(OpenParen);
			setState(1928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(1927);
				formalParameterList();
				}
			}

			setState(1930);
			match(CloseParen);
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1931);
				typeAnnotation();
				}
			}

			setState(1934);
			match(OpenBrace);
			setState(1935);
			functionBody();
			setState(1936);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ToStringExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(BitloopsParser.Dot, 0); }
		public TerminalNode ToString() { return getToken(BitloopsParser.ToString, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public ToStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(BitloopsParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(BitloopsParser.Minus, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(BitloopsParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(BitloopsParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(BitloopsParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(BitloopsParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(BitloopsParser.And, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(BitloopsParser.Or, 0); }
		public LogicalOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayLiteralExpressionContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberDotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(BitloopsParser.Dot, 0); }
		public RegularIdentifierContext regularIdentifier() {
			return getRuleContext(RegularIdentifierContext.class,0);
		}
		public MemberDotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode Not() { return getToken(BitloopsParser.Not, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EvaluationExpressionContext extends ExpressionContext {
		public EvaluationContext evaluation() {
			return getRuleContext(EvaluationContext.class,0);
		}
		public EvaluationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public RegularIdentifierContext regularIdentifier() {
			return getRuleContext(RegularIdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode This() { return getToken(BitloopsParser.This, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(BitloopsParser.Assign, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalXorExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Xor() { return getToken(BitloopsParser.Xor, 0); }
		public LogicalXorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GetClassExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(BitloopsParser.Dot, 0); }
		public TerminalNode GetClass() { return getToken(BitloopsParser.GetClass, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public GetClassExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equals_() { return getToken(BitloopsParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(BitloopsParser.NotEquals, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(BitloopsParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(BitloopsParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(BitloopsParser.Modulus, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 368;
		enterRecursionRule(_localctx, 368, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1939);
				match(Not);
				setState(1940);
				expression(19);
				}
				break;
			case 2:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1941);
				match(OpenParen);
				setState(1942);
				expression(0);
				setState(1943);
				match(CloseParen);
				}
				break;
			case 3:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1945);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new EvaluationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1946);
				evaluation();
				}
				break;
			case 5:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1947);
				regularIdentifier();
				}
				break;
			case 6:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1948);
				arrayLiteral();
				}
				break;
			case 7:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1949);
				match(This);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1991);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1952);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1953);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1954);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1955);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1956);
						((AdditiveExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1957);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1958);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1959);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1960);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1961);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1962);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equals_ || _la==NotEquals) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1963);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1964);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1965);
						((LogicalAndExpressionContext)_localctx).op = match(And);
						setState(1966);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1967);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1968);
						((LogicalOrExpressionContext)_localctx).op = match(Or);
						setState(1969);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new LogicalXorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1970);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1971);
						((LogicalXorExpressionContext)_localctx).op = match(Xor);
						setState(1972);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1973);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1974);
						match(Assign);
						setState(1975);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new MemberDotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1976);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1977);
						match(Dot);
						setState(1978);
						regularIdentifier();
						}
						break;
					case 10:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1979);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1980);
						methodArguments();
						}
						break;
					case 11:
						{
						_localctx = new GetClassExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1981);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1982);
						match(Dot);
						setState(1983);
						match(GetClass);
						setState(1984);
						match(OpenParen);
						setState(1985);
						match(CloseParen);
						}
						break;
					case 12:
						{
						_localctx = new ToStringExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1986);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1987);
						match(Dot);
						setState(1988);
						match(ToString);
						setState(1989);
						match(OpenParen);
						setState(1990);
						match(CloseParen);
						}
						break;
					}
					} 
				}
				setState(1995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AsExpressionContext extends ParserRuleContext {
		public PredefinedTypeContext predefinedType() {
			return getRuleContext(PredefinedTypeContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(BitloopsParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(BitloopsParser.CloseBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asExpression; }
	}

	public final AsExpressionContext asExpression() throws RecognitionException {
		AsExpressionContext _localctx = new AsExpressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_asExpression);
		int _la;
		try {
			setState(2002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
			case Any:
			case Int32:
			case Boolean:
			case String:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1996);
				predefinedType();
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket) {
					{
					setState(1997);
					match(OpenBracket);
					setState(1998);
					match(CloseBracket);
					}
				}

				}
				break;
			case RegularExpressionLiteral:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case Not:
			case NullLiteral:
			case BooleanLiteral:
			case IntegerLiteral:
			case DecimalLiteral:
			case This:
			case Delete:
			case Execute:
			case Create:
			case UUIDv4:
			case DTOIdentifier:
			case ValueObjectIdentifier:
			case EntityIdentifier:
			case ErrorIdentifier:
			case UpperCaseIdentifier:
			case Identifier:
			case StringLiteral:
			case BackTick:
				enterOuterAlt(_localctx, 2);
				{
				setState(2001);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionDeclarationContext extends ParserRuleContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(BitloopsParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(BitloopsParser.Async, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ArrowFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionDeclaration; }
	}

	public final ArrowFunctionDeclarationContext arrowFunctionDeclaration() throws RecognitionException {
		ArrowFunctionDeclarationContext _localctx = new ArrowFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_arrowFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(2004);
				match(Async);
				}
			}

			setState(2007);
			arrowFunctionParameters();
			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2008);
				typeAnnotation();
				}
			}

			setState(2011);
			match(ARROW);
			setState(2012);
			arrowFunctionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(BitloopsParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BitloopsParser.CloseParen, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(2020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2014);
				match(Identifier);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2015);
				match(OpenParen);
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(2016);
					formalParameterList();
					}
				}

				setState(2019);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BitloopsParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(BitloopsParser.CloseBrace, 0); }
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_arrowFunctionBody);
		try {
			setState(2027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2022);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2023);
				match(OpenBrace);
				setState(2024);
				functionBody();
				setState(2025);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode MultiplyAssign() { return getToken(BitloopsParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(BitloopsParser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(BitloopsParser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(BitloopsParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(BitloopsParser.MinusAssign, 0); }
		public TerminalNode LeftShiftArithmeticAssign() { return getToken(BitloopsParser.LeftShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftArithmeticAssign() { return getToken(BitloopsParser.RightShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftLogicalAssign() { return getToken(BitloopsParser.RightShiftLogicalAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(BitloopsParser.BitAndAssign, 0); }
		public TerminalNode BitXorAssign() { return getToken(BitloopsParser.BitXorAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(BitloopsParser.BitOrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TemplateStringLiteralLabelContext extends LiteralContext {
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TemplateStringLiteralLabelContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(BitloopsParser.StringLiteral, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class RegularExpressionLiteralContext extends LiteralContext {
		public TerminalNode RegularExpressionLiteral() { return getToken(BitloopsParser.RegularExpressionLiteral, 0); }
		public RegularExpressionLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralContext extends LiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(BitloopsParser.BooleanLiteral, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class NumericLiteralLabelContext extends LiteralContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NumericLiteralLabelContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode NullLiteral() { return getToken(BitloopsParser.NullLiteral, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_literal);
		try {
			setState(2037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2031);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2032);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2033);
				match(StringLiteral);
				}
				break;
			case BackTick:
				_localctx = new TemplateStringLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2034);
				templateStringLiteral();
				}
				break;
			case RegularExpressionLiteral:
				_localctx = new RegularExpressionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2035);
				match(RegularExpressionLiteral);
				}
				break;
			case IntegerLiteral:
			case DecimalLiteral:
				_localctx = new NumericLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2036);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(BitloopsParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(BitloopsParser.BackTick, i);
		}
		public List<TemplateStringAtomContext> templateStringAtom() {
			return getRuleContexts(TemplateStringAtomContext.class);
		}
		public TemplateStringAtomContext templateStringAtom(int i) {
			return getRuleContext(TemplateStringAtomContext.class,i);
		}
		public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringLiteral; }
	}

	public final TemplateStringLiteralContext templateStringLiteral() throws RecognitionException {
		TemplateStringLiteralContext _localctx = new TemplateStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			match(BackTick);
			setState(2043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(2040);
				templateStringAtom();
				}
				}
				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2046);
			match(BackTick);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateStringAtomContext extends ParserRuleContext {
		public TerminalNode TemplateStringAtom() { return getToken(BitloopsParser.TemplateStringAtom, 0); }
		public TerminalNode TemplateStringStartExpression() { return getToken(BitloopsParser.TemplateStringStartExpression, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TemplateCloseBrace() { return getToken(BitloopsParser.TemplateCloseBrace, 0); }
		public TemplateStringAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringAtom; }
	}

	public final TemplateStringAtomContext templateStringAtom() throws RecognitionException {
		TemplateStringAtomContext _localctx = new TemplateStringAtomContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_templateStringAtom);
		try {
			setState(2053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(2048);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(2049);
				match(TemplateStringStartExpression);
				setState(2050);
				expression(0);
				setState(2051);
				match(TemplateCloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	 
		public NumericLiteralContext() { }
		public void copyFrom(NumericLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumericLiteralContext {
		public TerminalNode DecimalLiteral() { return getToken(BitloopsParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(NumericLiteralContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerLiteralContext extends NumericLiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(BitloopsParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(NumericLiteralContext ctx) { copyFrom(ctx); }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_numericLiteral);
		try {
			setState(2057);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2055);
				match(IntegerLiteral);
				}
				break;
			case DecimalLiteral:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2056);
				match(DecimalLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_identifierName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrKeyWordContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BitloopsParser.Identifier, 0); }
		public TerminalNode TypeAlias() { return getToken(BitloopsParser.TypeAlias, 0); }
		public IdentifierOrKeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrKeyWord; }
	}

	public final IdentifierOrKeyWordContext identifierOrKeyWord() throws RecognitionException {
		IdentifierOrKeyWordContext _localctx = new IdentifierOrKeyWordContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_identifierOrKeyWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			_la = _input.LA(1);
			if ( !(_la==TypeAlias || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(BitloopsParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(BitloopsParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_reservedWord);
		try {
			setState(2066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case From:
			case ReadOnly:
			case Async:
			case Extends:
			case Const:
			case UseCase:
			case Let:
			case Private:
			case Public:
			case Protected:
			case Static:
			case String:
			case TypeAlias:
			case Get:
			case Set:
				enterOuterAlt(_localctx, 1);
				{
				setState(2063);
				keyword();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2064);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2065);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(BitloopsParser.Break, 0); }
		public TerminalNode Do() { return getToken(BitloopsParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(BitloopsParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(BitloopsParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(BitloopsParser.Case, 0); }
		public TerminalNode Else() { return getToken(BitloopsParser.Else, 0); }
		public TerminalNode New() { return getToken(BitloopsParser.New, 0); }
		public TerminalNode Var() { return getToken(BitloopsParser.Var, 0); }
		public TerminalNode Catch() { return getToken(BitloopsParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(BitloopsParser.Finally, 0); }
		public TerminalNode Return() { return getToken(BitloopsParser.Return, 0); }
		public TerminalNode Void() { return getToken(BitloopsParser.Void, 0); }
		public TerminalNode Continue() { return getToken(BitloopsParser.Continue, 0); }
		public TerminalNode For() { return getToken(BitloopsParser.For, 0); }
		public TerminalNode Switch() { return getToken(BitloopsParser.Switch, 0); }
		public TerminalNode While() { return getToken(BitloopsParser.While, 0); }
		public TerminalNode Debugger() { return getToken(BitloopsParser.Debugger, 0); }
		public TerminalNode Function_() { return getToken(BitloopsParser.Function_, 0); }
		public TerminalNode This() { return getToken(BitloopsParser.This, 0); }
		public TerminalNode With() { return getToken(BitloopsParser.With, 0); }
		public TerminalNode Default() { return getToken(BitloopsParser.Default, 0); }
		public TerminalNode If() { return getToken(BitloopsParser.If, 0); }
		public TerminalNode Throw() { return getToken(BitloopsParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(BitloopsParser.Delete, 0); }
		public TerminalNode In() { return getToken(BitloopsParser.In, 0); }
		public TerminalNode Try() { return getToken(BitloopsParser.Try, 0); }
		public TerminalNode ReadOnly() { return getToken(BitloopsParser.ReadOnly, 0); }
		public TerminalNode Async() { return getToken(BitloopsParser.Async, 0); }
		public TerminalNode From() { return getToken(BitloopsParser.From, 0); }
		public TerminalNode UseCase() { return getToken(BitloopsParser.UseCase, 0); }
		public TerminalNode Extends() { return getToken(BitloopsParser.Extends, 0); }
		public TerminalNode Const() { return getToken(BitloopsParser.Const, 0); }
		public TerminalNode Let() { return getToken(BitloopsParser.Let, 0); }
		public TerminalNode Private() { return getToken(BitloopsParser.Private, 0); }
		public TerminalNode Public() { return getToken(BitloopsParser.Public, 0); }
		public TerminalNode Protected() { return getToken(BitloopsParser.Protected, 0); }
		public TerminalNode Static() { return getToken(BitloopsParser.Static, 0); }
		public TerminalNode Get() { return getToken(BitloopsParser.Get, 0); }
		public TerminalNode Set() { return getToken(BitloopsParser.Set, 0); }
		public TerminalNode TypeAlias() { return getToken(BitloopsParser.TypeAlias, 0); }
		public TerminalNode String() { return getToken(BitloopsParser.String, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Instanceof - 65)) | (1L << (Typeof - 65)) | (1L << (Case - 65)) | (1L << (Else - 65)) | (1L << (New - 65)) | (1L << (Var - 65)) | (1L << (Catch - 65)) | (1L << (Finally - 65)) | (1L << (Return - 65)) | (1L << (Void - 65)) | (1L << (Continue - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (Debugger - 65)) | (1L << (Function_ - 65)) | (1L << (This - 65)) | (1L << (With - 65)) | (1L << (Default - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (In - 65)) | (1L << (Try - 65)) | (1L << (From - 65)) | (1L << (ReadOnly - 65)) | (1L << (Async - 65)) | (1L << (Extends - 65)) | (1L << (Const - 65)) | (1L << (UseCase - 65)) | (1L << (Let - 65)) | (1L << (Private - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Public - 129)) | (1L << (Protected - 129)) | (1L << (Static - 129)) | (1L << (String - 129)) | (1L << (TypeAlias - 129)) | (1L << (Get - 129)) | (1L << (Set - 129)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(BitloopsParser.Get, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			match(Get);
			setState(2071);
			propertyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Set() { return getToken(BitloopsParser.Set, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(Set);
			setState(2074);
			propertyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(BitloopsParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2076);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SemiColon) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsInstanceOfContext extends ParserRuleContext {
		public RegularIdentifierContext regularIdentifier() {
			return getRuleContext(RegularIdentifierContext.class,0);
		}
		public TerminalNode Is() { return getToken(BitloopsParser.Is, 0); }
		public ClassTypesContext classTypes() {
			return getRuleContext(ClassTypesContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BitloopsParser.SemiColon, 0); }
		public IsInstanceOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isInstanceOf; }
	}

	public final IsInstanceOfContext isInstanceOf() throws RecognitionException {
		IsInstanceOfContext _localctx = new IsInstanceOfContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_isInstanceOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			regularIdentifier();
			setState(2079);
			match(Is);
			setState(2080);
			classTypes();
			setState(2082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(2081);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypesContext extends ParserRuleContext {
		public TerminalNode ErrorClass() { return getToken(BitloopsParser.ErrorClass, 0); }
		public ClassTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypes; }
	}

	public final ClassTypesContext classTypes() throws RecognitionException {
		ClassTypesContext _localctx = new ClassTypesContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_classTypes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			match(ErrorClass);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return bitloopsPrimaryType_sempred((BitloopsPrimaryTypeContext)_localctx, predIndex);
		case 50:
			return decoratorMemberExpression_sempred((DecoratorMemberExpressionContext)_localctx, predIndex);
		case 184:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bitloopsPrimaryType_sempred(BitloopsPrimaryTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean decoratorMemberExpression_sempred(DecoratorMemberExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 17);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e5\u0829\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\3\2\3"+
		"\2\3\2\3\3\3\3\5\3\u019e\n\3\3\4\3\4\3\4\7\4\u01a3\n\4\f\4\16\4\u01a6"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\7\5\u01ad\n\5\f\5\16\5\u01b0\13\5\3\5\5\5\u01b3"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u01bb\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01cb\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u01db\n\17\f\17\16\17\u01de"+
		"\13\17\5\17\u01e0\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u01ef\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\5\31\u01fe\n\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\5\32\u0207\n\32\3\32\3\32\3\32\7\32\u020c\n\32\f\32\16\32\u020f"+
		"\13\32\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u0217\n\35\3\36\7\36\u021a\n"+
		"\36\f\36\16\36\u021d\13\36\3\37\3\37\5\37\u0221\n\37\3\37\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3!\6!\u022d\n!\r!\16!\u022e\3!\3!\5!\u0233\n!\3\"\3\""+
		"\3\"\3#\3#\3#\3#\7#\u023c\n#\f#\16#\u023f\13#\3#\3#\5#\u0243\n#\5#\u0245"+
		"\n#\3$\3$\3$\7$\u024a\n$\f$\16$\u024d\13$\3%\3%\5%\u0251\n%\3&\5&\u0254"+
		"\n&\3&\5&\u0257\n&\3&\3&\3&\5&\u025c\n&\3&\5&\u025f\n&\3&\5&\u0262\n&"+
		"\3\'\3\'\3\'\5\'\u0267\n\'\3(\5(\u026a\n(\3(\5(\u026d\n(\3(\3(\5(\u0271"+
		"\n(\3)\3)\3*\3*\5*\u0277\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\5,\u0282\n,\3-"+
		"\3-\3-\7-\u0287\n-\f-\16-\u028a\13-\3.\3.\3.\5.\u028f\n.\3/\3/\3/\3/\5"+
		"/\u0295\n/\3/\3/\3\60\3\60\6\60\u029b\n\60\r\60\16\60\u029c\3\60\7\60"+
		"\u02a0\n\60\f\60\16\60\u02a3\13\60\3\61\3\61\3\61\3\61\3\61\3\62\6\62"+
		"\u02ab\n\62\r\62\16\62\u02ac\3\63\3\63\3\63\5\63\u02b2\n\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u02ba\n\64\3\64\3\64\3\64\7\64\u02bf\n\64\f"+
		"\64\16\64\u02c2\13\64\3\65\3\65\3\65\3\66\7\66\u02c8\n\66\f\66\16\66\u02cb"+
		"\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u02dc\n\67\38\38\38\38\38\58\u02e3\n8\38\38\38\38\38\5"+
		"8\u02ea\n8\38\38\38\38\58\u02f0\n8\38\38\58\u02f4\n8\38\38\38\38\58\u02fa"+
		"\n8\38\38\58\u02fe\n8\38\38\38\38\58\u0304\n8\38\38\58\u0308\n8\38\38"+
		"\38\38\58\u030e\n8\38\38\58\u0312\n8\38\38\38\38\38\58\u0319\n8\38\38"+
		"\38\38\38\58\u0320\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\58\u033b\n8\38\38\38\38\38\58\u0342\n8\38"+
		"\38\38\38\38\58\u0349\n8\38\38\38\38\38\58\u0350\n8\38\38\38\38\38\58"+
		"\u0357\n8\38\38\38\38\38\58\u035e\n8\38\38\38\38\38\58\u0365\n8\38\38"+
		"\38\38\38\58\u036c\n8\38\38\38\38\38\58\u0373\n8\38\38\38\38\38\58\u037a"+
		"\n8\38\38\38\38\38\58\u0381\n8\38\38\38\38\38\58\u0388\n8\38\38\38\38"+
		"\38\58\u038f\n8\38\38\38\38\38\58\u0396\n8\38\38\38\38\38\58\u039d\n8"+
		"\58\u039f\n8\39\39\39\59\u03a4\n9\3:\3:\3:\3:\3:\3:\3:\3:\5:\u03ae\n:"+
		"\3;\3;\3<\3<\3<\3=\3=\3=\5=\u03b8\n=\3=\3=\3=\5=\u03bd\n=\3>\3>\3>\3>"+
		"\3>\5>\u03c4\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u03d6"+
		"\n?\3@\3@\3@\3@\3@\5@\u03dd\n@\3A\3A\3A\7A\u03e2\nA\fA\16A\u03e5\13A\3"+
		"B\3B\3B\3C\3C\5C\u03ec\nC\3C\3C\3D\6D\u03f1\nD\rD\16D\u03f2\3D\5D\u03f6"+
		"\nD\3E\3E\5E\u03fa\nE\3E\3E\5E\u03fe\nE\3E\3E\3E\3E\3F\3F\3F\5F\u0407"+
		"\nF\3F\3F\3F\3F\7F\u040d\nF\fF\16F\u0410\13F\3F\3F\3G\3G\3G\7G\u0417\n"+
		"G\fG\16G\u041a\13G\3H\3H\3I\3I\5I\u0420\nI\3J\3J\3J\3J\3J\3J\3J\5J\u0429"+
		"\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u043c\nK\3K"+
		"\3K\5K\u0440\nK\3K\3K\5K\u0444\nK\3K\3K\3K\3K\3K\3K\3K\3K\5K\u044e\nK"+
		"\3K\3K\5K\u0452\nK\3K\3K\3K\3K\3K\3K\3K\3K\5K\u045c\nK\5K\u045e\nK\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u046a\nK\5K\u046c\nK\3K\3K\3K\3K\5K\u0472"+
		"\nK\3L\3L\3M\3M\5M\u0478\nM\3M\3M\3N\3N\5N\u047e\nN\3N\3N\3O\3O\3O\3O"+
		"\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\5Q\u0490\nQ\3Q\3Q\5Q\u0494\nQ\3Q\3Q\3R"+
		"\6R\u0499\nR\rR\16R\u049a\3S\3S\3S\3S\3S\5S\u04a2\nS\3S\3S\5S\u04a6\n"+
		"S\3S\3S\3S\3S\5S\u04ac\nS\3S\5S\u04af\nS\5S\u04b1\nS\3T\3T\3T\3T\5T\u04b7"+
		"\nT\3T\3T\5T\u04bb\nT\3T\3T\3T\5T\u04c0\nT\3T\5T\u04c3\nT\5T\u04c5\nT"+
		"\3U\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\5W\u04d3\nW\3W\5W\u04d6\nW\3X\3X"+
		"\3X\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]"+
		"\3^\3^\3^\5^\u04f2\n^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\5_\u04ff\n_\3`"+
		"\3`\3a\3a\3a\3a\5a\u0507\na\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\5c\u0518\nc\3d\7d\u051b\nd\fd\16d\u051e\13d\3e\7e\u0521\ne\fe\16e"+
		"\u0524\13e\3f\7f\u0527\nf\ff\16f\u052a\13f\3g\3g\5g\u052e\ng\3g\3g\3g"+
		"\3g\3g\3g\3h\3h\3i\3i\3i\5i\u053b\ni\3i\3i\3i\3i\5i\u0541\ni\3j\3j\3j"+
		"\3j\3j\3j\5j\u0549\nj\3k\3k\3k\3k\3k\3k\5k\u0551\nk\3l\3l\3l\3l\3l\3l"+
		"\3l\5l\u055a\nl\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0564\nl\3l\3l\3l\3l\3l\3l"+
		"\3l\5l\u056d\nl\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0577\nl\5l\u0579\nl\3m\3m"+
		"\3n\3n\3o\3o\3o\3p\3p\3p\3p\3q\3q\3q\7q\u0589\nq\fq\16q\u058c\13q\3r\3"+
		"r\3r\3r\3r\3r\5r\u0594\nr\3s\3s\3s\3s\3s\3s\5s\u059c\ns\3t\3t\3t\3t\3"+
		"t\3t\5t\u05a4\nt\3u\3u\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3x\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\5x\u05bc\nx\3y\3y\3y\3z\3z\3{\3{\3{\3{\3{\3{\3{\3|\3|\3"+
		"|\5|\u05cd\n|\3|\3|\5|\u05d1\n|\3}\3}\3}\3}\3}\3}\3}\3~\3~\3~\5~\u05dd"+
		"\n~\3~\3~\5~\u05e1\n~\3~\3~\5~\u05e5\n~\3\177\3\177\3\177\5\177\u05ea"+
		"\n\177\3\177\3\177\5\177\u05ee\n\177\3\177\3\177\5\177\u05f2\n\177\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\5\u0082\u05fa\n\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u0612\n\u0085\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u061e"+
		"\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0628\n\u0087\5\u0087\u062a\n\u0087\3\u0088\3\u0088\5\u0088\u062e"+
		"\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\7\u0091\u0651"+
		"\n\u0091\f\u0091\16\u0091\u0654\13\u0091\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\3\u0093\7\u0093\u065b\n\u0093\f\u0093\16\u0093\u065e\13\u0093\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\3\u0098\3\u0098\5\u0098\u066e\n\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\5\u009c\u0682"+
		"\n\u009c\3\u009d\5\u009d\u0685\n\u009d\3\u009d\3\u009d\5\u009d\u0689\n"+
		"\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\5\u009e\u0691\n"+
		"\u009e\3\u009e\3\u009e\5\u009e\u0695\n\u009e\3\u009e\3\u009e\3\u009e\3"+
		"\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\5\u00a0"+
		"\u06a2\n\u00a0\3\u00a1\5\u00a1\u06a5\n\u00a1\3\u00a1\5\u00a1\u06a8\n\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a3\5\u00a3\u06ae\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u06b3\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u06bd\n\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u06c1\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\7\u00a5\u06cc\n\u00a5\f\u00a5\16\u00a5\u06cf\13\u00a5"+
		"\3\u00a5\5\u00a5\u06d2\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u06dd\n\u00a7\f\u00a7\16\u00a7"+
		"\u06e0\13\u00a7\3\u00a7\5\u00a7\u06e3\n\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u06ec\n\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\7\u00a9\u06f9\n\u00a9\f\u00a9\16\u00a9\u06fc\13\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0700\n\u00a9\3\u00a9\5\u00a9\u0703\n\u00a9\3\u00a9\5\u00a9\u0706"+
		"\n\u00a9\3\u00aa\5\u00aa\u0709\n\u00aa\3\u00aa\5\u00aa\u070c\n\u00aa\3"+
		"\u00aa\3\u00aa\5\u00aa\u0710\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u0714\n\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ac\5\u00ac\u071a\n\u00ac\3\u00ad\3\u00ad"+
		"\5\u00ad\u071e\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\7\u00ae"+
		"\u0725\n\u00ae\f\u00ae\16\u00ae\u0728\13\u00ae\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\7\u00af\u072e\n\u00af\f\u00af\16\u00af\u0731\13\u00af\3\u00af"+
		"\5\u00af\u0734\n\u00af\5\u00af\u0736\n\u00af\3\u00af\3\u00af\3\u00b0\3"+
		"\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u074b"+
		"\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0751\n\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u075b"+
		"\n\u00b3\3\u00b3\5\u00b3\u075e\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0768\n\u00b4\3\u00b5\3\u00b5"+
		"\3\u00b5\5\u00b5\u076d\n\u00b5\5\u00b5\u076f\n\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b6\3\u00b6\3\u00b6\7\u00b6\u0776\n\u00b6\f\u00b6\16\u00b6\u0779\13"+
		"\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0780\n\u00b8\f"+
		"\u00b8\16\u00b8\u0783\13\u00b8\3\u00b9\3\u00b9\5\u00b9\u0787\n\u00b9\3"+
		"\u00b9\3\u00b9\5\u00b9\u078b\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u078f\n\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u07a1"+
		"\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u07ca\n\u00ba\f\u00ba\16\u00ba"+
		"\u07cd\13\u00ba\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u07d2\n\u00bb\3\u00bb"+
		"\5\u00bb\u07d5\n\u00bb\3\u00bc\5\u00bc\u07d8\n\u00bc\3\u00bc\3\u00bc\5"+
		"\u00bc\u07dc\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\5"+
		"\u00bd\u07e4\n\u00bd\3\u00bd\5\u00bd\u07e7\n\u00bd\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\5\u00be\u07ee\n\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u07f8\n\u00c0\3\u00c1\3\u00c1"+
		"\7\u00c1\u07fc\n\u00c1\f\u00c1\16\u00c1\u07ff\13\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0808\n\u00c2\3\u00c3"+
		"\3\u00c3\5\u00c3\u080c\n\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0815\n\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u0825\n\u00cb\3\u00cc\3\u00cc\3\u00cc\2\5\62f\u0172\u00cd"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\2\23\4\2NN\u0086\u0096\7\2NN\u0086\u0086\u0089\u0089\u0093\u0094"+
		"\u0097\u0097\3\2\u0082\u0083\4\2\u0089\u0089\u0094\u0094\5\2JJdd\u0081"+
		"\u0081\5\2\u00cf\u00cf\u00d5\u00d5\u00da\u00db\3\2\u00c1\u00c6\3\2\u00c9"+
		"\u00cb\4\2\17\17\21\21\3\2\32\34\3\2\26\27\3\2 #\3\2$%\3\2.8\4\2\u0098"+
		"\u0098\u00db\u00db\t\2C\\^`cdll\u0081\u0085\u0094\u0094\u0098\u009a\3"+
		"\3\r\r\2\u089e\2\u0198\3\2\2\2\4\u019d\3\2\2\2\6\u019f\3\2\2\2\b\u01a9"+
		"\3\2\2\2\n\u01b4\3\2\2\2\f\u01b8\3\2\2\2\16\u01be\3\2\2\2\20\u01ca\3\2"+
		"\2\2\22\u01cc\3\2\2\2\24\u01ce\3\2\2\2\26\u01d0\3\2\2\2\30\u01d2\3\2\2"+
		"\2\32\u01d4\3\2\2\2\34\u01d6\3\2\2\2\36\u01e3\3\2\2\2 \u01e5\3\2\2\2\""+
		"\u01ee\3\2\2\2$\u01f0\3\2\2\2&\u01f2\3\2\2\2(\u01f4\3\2\2\2*\u01f6\3\2"+
		"\2\2,\u01f8\3\2\2\2.\u01fa\3\2\2\2\60\u01fd\3\2\2\2\62\u0206\3\2\2\2\64"+
		"\u0210\3\2\2\2\66\u0212\3\2\2\28\u0216\3\2\2\2:\u021b\3\2\2\2<\u021e\3"+
		"\2\2\2>\u0225\3\2\2\2@\u0232\3\2\2\2B\u0234\3\2\2\2D\u0244\3\2\2\2F\u0246"+
		"\3\2\2\2H\u0250\3\2\2\2J\u0253\3\2\2\2L\u0263\3\2\2\2N\u0269\3\2\2\2P"+
		"\u0272\3\2\2\2R\u0276\3\2\2\2T\u0278\3\2\2\2V\u027f\3\2\2\2X\u0283\3\2"+
		"\2\2Z\u028b\3\2\2\2\\\u0290\3\2\2\2^\u0298\3\2\2\2`\u02a4\3\2\2\2b\u02aa"+
		"\3\2\2\2d\u02ae\3\2\2\2f\u02b9\3\2\2\2h\u02c3\3\2\2\2j\u02c9\3\2\2\2l"+
		"\u02db\3\2\2\2n\u039e\3\2\2\2p\u03a0\3\2\2\2r\u03ad\3\2\2\2t\u03af\3\2"+
		"\2\2v\u03b1\3\2\2\2x\u03b4\3\2\2\2z\u03be\3\2\2\2|\u03d5\3\2\2\2~\u03d7"+
		"\3\2\2\2\u0080\u03de\3\2\2\2\u0082\u03e6\3\2\2\2\u0084\u03e9\3\2\2\2\u0086"+
		"\u03f0\3\2\2\2\u0088\u03f9\3\2\2\2\u008a\u0406\3\2\2\2\u008c\u0413\3\2"+
		"\2\2\u008e\u041b\3\2\2\2\u0090\u041d\3\2\2\2\u0092\u0421\3\2\2\2\u0094"+
		"\u0471\3\2\2\2\u0096\u0473\3\2\2\2\u0098\u0475\3\2\2\2\u009a\u047b\3\2"+
		"\2\2\u009c\u0481\3\2\2\2\u009e\u0487\3\2\2\2\u00a0\u048d\3\2\2\2\u00a2"+
		"\u0498\3\2\2\2\u00a4\u04b0\3\2\2\2\u00a6\u04c4\3\2\2\2\u00a8\u04c6\3\2"+
		"\2\2\u00aa\u04ca\3\2\2\2\u00ac\u04ce\3\2\2\2\u00ae\u04d7\3\2\2\2\u00b0"+
		"\u04dd\3\2\2\2\u00b2\u04e0\3\2\2\2\u00b4\u04e3\3\2\2\2\u00b6\u04e5\3\2"+
		"\2\2\u00b8\u04eb\3\2\2\2\u00ba\u04ee\3\2\2\2\u00bc\u04f9\3\2\2\2\u00be"+
		"\u0500\3\2\2\2\u00c0\u0502\3\2\2\2\u00c2\u0508\3\2\2\2\u00c4\u050f\3\2"+
		"\2\2\u00c6\u051c\3\2\2\2\u00c8\u0522\3\2\2\2\u00ca\u0528\3\2\2\2\u00cc"+
		"\u052b\3\2\2\2\u00ce\u0535\3\2\2\2\u00d0\u0537\3\2\2\2\u00d2\u0542\3\2"+
		"\2\2\u00d4\u054a\3\2\2\2\u00d6\u0578\3\2\2\2\u00d8\u057a\3\2\2\2\u00da"+
		"\u057c\3\2\2\2\u00dc\u057e\3\2\2\2\u00de\u0581\3\2\2\2\u00e0\u0585\3\2"+
		"\2\2\u00e2\u0593\3\2\2\2\u00e4\u0595\3\2\2\2\u00e6\u059d\3\2\2\2\u00e8"+
		"\u05a5\3\2\2\2\u00ea\u05a7\3\2\2\2\u00ec\u05ae\3\2\2\2\u00ee\u05bb\3\2"+
		"\2\2\u00f0\u05bd\3\2\2\2\u00f2\u05c0\3\2\2\2\u00f4\u05c2\3\2\2\2\u00f6"+
		"\u05c9\3\2\2\2\u00f8\u05d2\3\2\2\2\u00fa\u05d9\3\2\2\2\u00fc\u05e6\3\2"+
		"\2\2\u00fe\u05f3\3\2\2\2\u0100\u05f5\3\2\2\2\u0102\u05f7\3\2\2\2\u0104"+
		"\u0601\3\2\2\2\u0106\u0605\3\2\2\2\u0108\u060d\3\2\2\2\u010a\u0613\3\2"+
		"\2\2\u010c\u0629\3\2\2\2\u010e\u062b\3\2\2\2\u0110\u062f\3\2\2\2\u0112"+
		"\u0634\3\2\2\2\u0114\u0639\3\2\2\2\u0116\u063b\3\2\2\2\u0118\u063d\3\2"+
		"\2\2\u011a\u0647\3\2\2\2\u011c\u0649\3\2\2\2\u011e\u064b\3\2\2\2\u0120"+
		"\u064d\3\2\2\2\u0122\u0655\3\2\2\2\u0124\u0657\3\2\2\2\u0126\u065f\3\2"+
		"\2\2\u0128\u0661\3\2\2\2\u012a\u0663\3\2\2\2\u012c\u0665\3\2\2\2\u012e"+
		"\u066a\3\2\2\2\u0130\u0671\3\2\2\2\u0132\u0677\3\2\2\2\u0134\u0679\3\2"+
		"\2\2\u0136\u0681\3\2\2\2\u0138\u0684\3\2\2\2\u013a\u0690\3\2\2\2\u013c"+
		"\u069b\3\2\2\2\u013e\u06a1\3\2\2\2\u0140\u06a4\3\2\2\2\u0142\u06a9\3\2"+
		"\2\2\u0144\u06ad\3\2\2\2\u0146\u06b9\3\2\2\2\u0148\u06c7\3\2\2\2\u014a"+
		"\u06d5\3\2\2\2\u014c\u06d8\3\2\2\2\u014e\u06e6\3\2\2\2\u0150\u0705\3\2"+
		"\2\2\u0152\u0708\3\2\2\2\u0154\u0715\3\2\2\2\u0156\u0719\3\2\2\2\u0158"+
		"\u071b\3\2\2\2\u015a\u0721\3\2\2\2\u015c\u0729\3\2\2\2\u015e\u0739\3\2"+
		"\2\2\u0160\u074a\3\2\2\2\u0162\u074c\3\2\2\2\u0164\u0756\3\2\2\2\u0166"+
		"\u0767\3\2\2\2\u0168\u0769\3\2\2\2\u016a\u0772\3\2\2\2\u016c\u077a\3\2"+
		"\2\2\u016e\u077c\3\2\2\2\u0170\u0784\3\2\2\2\u0172\u07a0\3\2\2\2\u0174"+
		"\u07d4\3\2\2\2\u0176\u07d7\3\2\2\2\u0178\u07e6\3\2\2\2\u017a\u07ed\3\2"+
		"\2\2\u017c\u07ef\3\2\2\2\u017e\u07f7\3\2\2\2\u0180\u07f9\3\2\2\2\u0182"+
		"\u0807\3\2\2\2\u0184\u080b\3\2\2\2\u0186\u080d\3\2\2\2\u0188\u080f\3\2"+
		"\2\2\u018a\u0814\3\2\2\2\u018c\u0816\3\2\2\2\u018e\u0818\3\2\2\2\u0190"+
		"\u081b\3\2\2\2\u0192\u081e\3\2\2\2\u0194\u0820\3\2\2\2\u0196\u0826\3\2"+
		"\2\2\u0198\u0199\7\17\2\2\u0199\u019a\5\u0172\u00ba\2\u019a\3\3\2\2\2"+
		"\u019b\u019e\5\u0158\u00ad\2\u019c\u019e\5\u015c\u00af\2\u019d\u019b\3"+
		"\2\2\2\u019d\u019c\3\2\2\2\u019e\5\3\2\2\2\u019f\u01a4\5\60\31\2\u01a0"+
		"\u01a1\7\r\2\2\u01a1\u01a3\5\60\31\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3"+
		"\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\7\r\2\2\u01a8\7\3\2\2\2\u01a9\u01ae\5\n\6\2"+
		"\u01aa\u01ab\7\16\2\2\u01ab\u01ad\5\n\6\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b3\7\16\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3"+
		"\2\2\2\u01b3\t\3\2\2\2\u01b4\u01b5\7\u00db\2\2\u01b5\u01b6\7\21\2\2\u01b6"+
		"\u01b7\5\u0172\u00ba\2\u01b7\13\3\2\2\2\u01b8\u01ba\7\n\2\2\u01b9\u01bb"+
		"\5\6\4\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\7\f\2\2\u01bd\r\3\2\2\2\u01be\u01bf\7\u00d4\2\2\u01bf\17\3\2\2"+
		"\2\u01c0\u01cb\7\u00d2\2\2\u01c1\u01cb\5\u011e\u0090\2\u01c2\u01cb\7\u00d1"+
		"\2\2\u01c3\u01cb\7\u00d0\2\2\u01c4\u01cb\5\16\b\2\u01c5\u01cb\7\u00ce"+
		"\2\2\u01c6\u01cb\7\u00cf\2\2\u01c7\u01cb\7\u00d7\2\2\u01c8\u01cb\7\u00d5"+
		"\2\2\u01c9\u01cb\7\u00da\2\2\u01ca\u01c0\3\2\2\2\u01ca\u01c1\3\2\2\2\u01ca"+
		"\u01c2\3\2\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c4\3\2\2\2\u01ca\u01c5\3\2"+
		"\2\2\u01ca\u01c6\3\2\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\21\3\2\2\2\u01cc\u01cd\t\2\2\2\u01cd\23\3\2\2\2\u01ce"+
		"\u01cf\7\u00db\2\2\u01cf\25\3\2\2\2\u01d0\u01d1\7\u00da\2\2\u01d1\27\3"+
		"\2\2\2\u01d2\u01d3\7\u00da\2\2\u01d3\31\3\2\2\2\u01d4\u01d5\5\u0122\u0092"+
		"\2\u01d5\33\3\2\2\2\u01d6\u01df\7\b\2\2\u01d7\u01dc\5\u016a\u00b6\2\u01d8"+
		"\u01d9\7\16\2\2\u01d9\u01db\5\u016a\u00b6\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01df\u01d7\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e2\7\t\2\2\u01e2\35\3\2\2\2\u01e3\u01e4\7\b\2"+
		"\2\u01e4\37\3\2\2\2\u01e5\u01e6\7\t\2\2\u01e6!\3\2\2\2\u01e7\u01ef\7\u00db"+
		"\2\2\u01e8\u01ef\5.\30\2\u01e9\u01ef\5,\27\2\u01ea\u01ef\5\32\16\2\u01eb"+
		"\u01ef\7\u009b\2\2\u01ec\u01ef\7\u009c\2\2\u01ed\u01ef\7Z\2\2\u01ee\u01e7"+
		"\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ee"+
		"\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef#\3\2\2\2"+
		"\u01f0\u01f1\7\u00dc\2\2\u01f1%\3\2\2\2\u01f2\u01f3\7<\2\2\u01f3\'\3\2"+
		"\2\2\u01f4\u01f5\7=\2\2\u01f5)\3\2\2\2\u01f6\u01f7\7;\2\2\u01f7+\3\2\2"+
		"\2\u01f8\u01f9\7\u00da\2\2\u01f9-\3\2\2\2\u01fa\u01fb\7\u00cd\2\2\u01fb"+
		"/\3\2\2\2\u01fc\u01fe\7B\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\5\62\32\2\u0200\u0201\5\24\13\2\u0201\61\3"+
		"\2\2\2\u0202\u0203\b\32\1\2\u0203\u0207\5\22\n\2\u0204\u0207\5\64\33\2"+
		"\u0205\u0207\5\20\t\2\u0206\u0202\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0205"+
		"\3\2\2\2\u0207\u020d\3\2\2\2\u0208\u0209\f\4\2\2\u0209\u020a\7\6\2\2\u020a"+
		"\u020c\7\7\2\2\u020b\u0208\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\63\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211"+
		"\7\u00bb\2\2\u0211\65\3\2\2\2\u0212\u0213\t\3\2\2\u0213\67\3\2\2\2\u0214"+
		"\u0217\7\u00db\2\2\u0215\u0217\5^\60\2\u0216\u0214\3\2\2\2\u0216\u0215"+
		"\3\2\2\2\u02179\3\2\2\2\u0218\u021a\5<\37\2\u0219\u0218\3\2\2\2\u021a"+
		"\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c;\3\2\2\2"+
		"\u021d\u021b\3\2\2\2\u021e\u0220\5\24\13\2\u021f\u0221\5\u0150\u00a9\2"+
		"\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223"+
		"\5B\"\2\u0223\u0224\7\r\2\2\u0224=\3\2\2\2\u0225\u0226\7F\2\2\u0226\u0227"+
		"\5@!\2\u0227?\3\2\2\2\u0228\u0233\7\u00db\2\2\u0229\u022a\5\u0186\u00c4"+
		"\2\u022a\u022b\7\23\2\2\u022b\u022d\3\2\2\2\u022c\u0229\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u0231\5\u0186\u00c4\2\u0231\u0233\3\2\2\2\u0232\u0228\3\2\2"+
		"\2\u0232\u022c\3\2\2\2\u0233A\3\2\2\2\u0234\u0235\7\21\2\2\u0235\u0236"+
		"\5\62\32\2\u0236C\3\2\2\2\u0237\u0245\5L\'\2\u0238\u023d\5H%\2\u0239\u023a"+
		"\7\16\2\2\u023a\u023c\5H%\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0242\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u0240\u0241\7\16\2\2\u0241\u0243\5L\'\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0237\3\2\2\2\u0244\u0238\3\2"+
		"\2\2\u0245E\3\2\2\2\u0246\u024b\5N(\2\u0247\u0248\7\16\2\2\u0248\u024a"+
		"\5N(\2\u0249\u0247\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024cG\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0251\5N(\2\u024f"+
		"\u0251\5J&\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251I\3\2\2\2\u0252"+
		"\u0254\5b\62\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2"+
		"\2\2\u0255\u0257\5P)\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\u0261\5R*\2\u0259\u025b\7\20\2\2\u025a\u025c\5B\"\2\u025b"+
		"\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u0262\3\2\2\2\u025d\u025f\5B"+
		"\"\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\5\2\2\2\u0261\u0259\3\2\2\2\u0261\u025e\3\2\2\2\u0262K\3\2\2\2"+
		"\u0263\u0264\7\22\2\2\u0264\u0266\5\u0172\u00ba\2\u0265\u0267\5B\"\2\u0266"+
		"\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267M\3\2\2\2\u0268\u026a\5b\62\2"+
		"\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u026d"+
		"\5P)\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u0270\5R*\2\u026f\u0271\5B\"\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2"+
		"\2\u0271O\3\2\2\2\u0272\u0273\t\4\2\2\u0273Q\3\2\2\2\u0274\u0277\5\u0186"+
		"\u00c4\2\u0275\u0277\5\4\3\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"S\3\2\2\2\u0278\u0279\7\6\2\2\u0279\u027a\7\u00db\2\2\u027a\u027b\7\21"+
		"\2\2\u027b\u027c\t\5\2\2\u027c\u027d\7\7\2\2\u027d\u027e\5B\"\2\u027e"+
		"U\3\2\2\2\u027f\u0281\5X-\2\u0280\u0282\7\16\2\2\u0281\u0280\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282W\3\2\2\2\u0283\u0288\5Z.\2\u0284\u0285\7\16\2\2\u0285"+
		"\u0287\5Z.\2\u0286\u0284\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2"+
		"\2\u0288\u0289\3\2\2\2\u0289Y\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028e"+
		"\5\u0166\u00b4\2\u028c\u028d\7\17\2\2\u028d\u028f\5\u0172\u00ba\2\u028e"+
		"\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f[\3\2\2\2\u0290\u0291\7\u009d"+
		"\2\2\u0291\u0292\5^\60\2\u0292\u0294\7\n\2\2\u0293\u0295\5\u0086D\2\u0294"+
		"\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\7\f"+
		"\2\2\u0297]\3\2\2\2\u0298\u02a1\7\u00db\2\2\u0299\u029b\7\23\2\2\u029a"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\7\u00db\2\2\u029f\u029a\3\2\2\2\u02a0"+
		"\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2_\3\2\2\2"+
		"\u02a3\u02a1\3\2\2\2\u02a4\u02a5\7\u00db\2\2\u02a5\u02a6\7\17\2\2\u02a6"+
		"\u02a7\5^\60\2\u02a7\u02a8\7\r\2\2\u02a8a\3\2\2\2\u02a9\u02ab\5d\63\2"+
		"\u02aa\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad"+
		"\3\2\2\2\u02adc\3\2\2\2\u02ae\u02b1\7\u00bf\2\2\u02af\u02b2\5f\64\2\u02b0"+
		"\u02b2\5h\65\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2e\3\2\2\2"+
		"\u02b3\u02b4\b\64\1\2\u02b4\u02ba\7\u00db\2\2\u02b5\u02b6\7\b\2\2\u02b6"+
		"\u02b7\5\u0172\u00ba\2\u02b7\u02b8\7\t\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b3"+
		"\3\2\2\2\u02b9\u02b5\3\2\2\2\u02ba\u02c0\3\2\2\2\u02bb\u02bc\f\4\2\2\u02bc"+
		"\u02bd\7\23\2\2\u02bd\u02bf\5\u0186\u00c4\2\u02be\u02bb\3\2\2\2\u02bf"+
		"\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1g\3\2\2\2"+
		"\u02c2\u02c0\3\2\2\2\u02c3\u02c4\5f\64\2\u02c4\u02c5\5\u0168\u00b5\2\u02c5"+
		"i\3\2\2\2\u02c6\u02c8\5l\67\2\u02c7\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2"+
		"\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02cak\3\2\2\2\u02cb\u02c9\3"+
		"\2\2\2\u02cc\u02dc\5\u00e4s\2\u02cd\u02dc\5\u00fa~\2\u02ce\u02dc\5\u00fc"+
		"\177\2\u02cf\u02dc\5\u010c\u0087\2\u02d0\u02dc\5n8\2\u02d1\u02dc\5\u00d2"+
		"j\2\u02d2\u02dc\5\u00e6t\2\u02d3\u02dc\5\u00d0i\2\u02d4\u02dc\5\u0134"+
		"\u009b\2\u02d5\u02dc\5\u00c4c\2\u02d6\u02dc\5\u00ba^\2\u02d7\u02dc\5\u00c0"+
		"a\2\u02d8\u02dc\5\u00bc_\2\u02d9\u02dc\5\u00d6l\2\u02da\u02dc\5\u00d4"+
		"k\2\u02db\u02cc\3\2\2\2\u02db\u02cd\3\2\2\2\u02db\u02ce\3\2\2\2\u02db"+
		"\u02cf\3\2\2\2\u02db\u02d0\3\2\2\2\u02db\u02d1\3\2\2\2\u02db\u02d2\3\2"+
		"\2\2\u02db\u02d3\3\2\2\2\u02db\u02d4\3\2\2\2\u02db\u02d5\3\2\2\2\u02db"+
		"\u02d6\3\2\2\2\u02db\u02d7\3\2\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2"+
		"\2\2\u02db\u02da\3\2\2\2\u02dcm\3\2\2\2\u02dd\u02de\7\u00a2\2\2\u02de"+
		"\u02df\7\n\2\2\u02df\u02e0\5\u0156\u00ac\2\u02e0\u02e2\7\f\2\2\u02e1\u02e3"+
		"\7\r\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u039f\3\2\2\2\u02e4"+
		"\u02e5\7\u00a1\2\2\u02e5\u02e6\7\n\2\2\u02e6\u02e7\5\u0086D\2\u02e7\u02e9"+
		"\7\f\2\2\u02e8\u02ea\7\r\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u039f\3\2\2\2\u02eb\u02ec\7\u00a0\2\2\u02ec\u02ed\7\n\2\2\u02ed\u02ef"+
		"\5|?\2\u02ee\u02f0\7\r\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f3\7\f\2\2\u02f2\u02f4\7\r\2\2\u02f3\u02f2\3\2"+
		"\2\2\u02f3\u02f4\3\2\2\2\u02f4\u039f\3\2\2\2\u02f5\u02f6\7\u00a4\2\2\u02f6"+
		"\u02f7\7\n\2\2\u02f7\u02f9\5\u00f4{\2\u02f8\u02fa\7\r\2\2\u02f9\u02f8"+
		"\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\7\f\2\2\u02fc"+
		"\u02fe\7\r\2\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u039f\3\2"+
		"\2\2\u02ff\u0300\7\u00a5\2\2\u0300\u0301\7\n\2\2\u0301\u0303\5\u00eav"+
		"\2\u0302\u0304\7\r\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305"+
		"\3\2\2\2\u0305\u0307\7\f\2\2\u0306\u0308\7\r\2\2\u0307\u0306\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u039f\3\2\2\2\u0309\u030a\7\u00a6\2\2\u030a\u030b"+
		"\7\n\2\2\u030b\u030d\5r:\2\u030c\u030e\7\r\2\2\u030d\u030c\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\7\f\2\2\u0310\u0312\7\r"+
		"\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u039f\3\2\2\2\u0313"+
		"\u0314\7\u00b3\2\2\u0314\u0315\7\n\2\2\u0315\u0316\5\u0194\u00cb\2\u0316"+
		"\u0318\7\f\2\2\u0317\u0319\7\r\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2"+
		"\2\2\u0319\u039f\3\2\2\2\u031a\u031b\7\u009f\2\2\u031b\u031c\7\n\2\2\u031c"+
		"\u031d\5\u0150\u00a9\2\u031d\u031f\7\f\2\2\u031e\u0320\7\r\2\2\u031f\u031e"+
		"\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u039f\3\2\2\2\u0321\u0322\7\u009f\2"+
		"\2\u0322\u0323\7\n\2\2\u0323\u0324\5\u0104\u0083\2\u0324\u0325\7\f\2\2"+
		"\u0325\u039f\3\2\2\2\u0326\u0327\7\u009f\2\2\u0327\u0328\7\n\2\2\u0328"+
		"\u0329\5\u0106\u0084\2\u0329\u032a\7\f\2\2\u032a\u039f\3\2\2\2\u032b\u032c"+
		"\7\u009f\2\2\u032c\u032d\7\n\2\2\u032d\u032e\5\u0108\u0085\2\u032e\u032f"+
		"\7\f\2\2\u032f\u039f\3\2\2\2\u0330\u0331\7\u00b9\2\2\u0331\u0332\7\n\2"+
		"\2\u0332\u0333\5\u00f6|\2\u0333\u0334\7\f\2\2\u0334\u039f\3\2\2\2\u0335"+
		"\u0336\7\u00a7\2\2\u0336\u0337\7\n\2\2\u0337\u0338\5\u0130\u0099\2\u0338"+
		"\u033a\7\f\2\2\u0339\u033b\7\r\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u039f\3\2\2\2\u033c\u033d\7\u00a9\2\2\u033d\u033e\7\n\2\2\u033e"+
		"\u033f\5x=\2\u033f\u0341\7\f\2\2\u0340\u0342\7\r\2\2\u0341\u0340\3\2\2"+
		"\2\u0341\u0342\3\2\2\2\u0342\u039f\3\2\2\2\u0343\u0344\7\u00a8\2\2\u0344"+
		"\u0345\7\n\2\2\u0345\u0346\5\u0172\u00ba\2\u0346\u0348\7\f\2\2\u0347\u0349"+
		"\7\r\2\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u039f\3\2\2\2\u034a"+
		"\u034b\7\u00aa\2\2\u034b\u034c\7\n\2\2\u034c\u034d\5:\36\2\u034d\u034f"+
		"\7\f\2\2\u034e\u0350\7\r\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u039f\3\2\2\2\u0351\u0352\7\u00ab\2\2\u0352\u0353\7\n\2\2\u0353\u0354"+
		"\5\u00ccg\2\u0354\u0356\7\f\2\2\u0355\u0357\7\r\2\2\u0356\u0355\3\2\2"+
		"\2\u0356\u0357\3\2\2\2\u0357\u039f\3\2\2\2\u0358\u0359\7\u00ac\2\2\u0359"+
		"\u035a\7\n\2\2\u035a\u035b\5\u0138\u009d\2\u035b\u035d\7\f\2\2\u035c\u035e"+
		"\7\r\2\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u039f\3\2\2\2\u035f"+
		"\u0360\7\u00ad\2\2\u0360\u0361\7\n\2\2\u0361\u0362\5\u013a\u009e\2\u0362"+
		"\u0364\7\f\2\2\u0363\u0365\7\r\2\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u039f\3\2\2\2\u0366\u0367\7\u00ae\2\2\u0367\u0368\7\n\2\2\u0368"+
		"\u0369\5\u00c4c\2\u0369\u036b\7\f\2\2\u036a\u036c\7\r\2\2\u036b\u036a"+
		"\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u039f\3\2\2\2\u036d\u036e\7\u00af\2"+
		"\2\u036e\u036f\7\n\2\2\u036f\u0370\5\u00c0a\2\u0370\u0372\7\f\2\2\u0371"+
		"\u0373\7\r\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u039f\3\2"+
		"\2\2\u0374\u0375\7\u00b0\2\2\u0375\u0376\7\n\2\2\u0376\u0377\5t;\2\u0377"+
		"\u0379\7\f\2\2\u0378\u037a\7\r\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2"+
		"\2\2\u037a\u039f\3\2\2\2\u037b\u037c\7\u00b1\2\2\u037c\u037d\7\n\2\2\u037d"+
		"\u037e\5z>\2\u037e\u0380\7\f\2\2\u037f\u0381\7\r\2\2\u0380\u037f\3\2\2"+
		"\2\u0380\u0381\3\2\2\2\u0381\u039f\3\2\2\2\u0382\u0383\7\u00b4\2\2\u0383"+
		"\u0384\7\n\2\2\u0384\u0385\5\u00ecw\2\u0385\u0387\7\f\2\2\u0386\u0388"+
		"\7\r\2\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u039f\3\2\2\2\u0389"+
		"\u038a\7\u00b5\2\2\u038a\u038b\7\n\2\2\u038b\u038c\5\u00f0y\2\u038c\u038e"+
		"\7\f\2\2\u038d\u038f\7\r\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u039f\3\2\2\2\u0390\u0391\7\u00b8\2\2\u0391\u0392\7\n\2\2\u0392\u0393"+
		"\5~@\2\u0393\u0395\7\f\2\2\u0394\u0396\7\r\2\2\u0395\u0394\3\2\2\2\u0395"+
		"\u0396\3\2\2\2\u0396\u039f\3\2\2\2\u0397\u0398\7\u00ba\2\2\u0398\u0399"+
		"\7\n\2\2\u0399\u039a\5\62\32\2\u039a\u039c\7\f\2\2\u039b\u039d\7\r\2\2"+
		"\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039f\3\2\2\2\u039e\u02dd"+
		"\3\2\2\2\u039e\u02e4\3\2\2\2\u039e\u02eb\3\2\2\2\u039e\u02f5\3\2\2\2\u039e"+
		"\u02ff\3\2\2\2\u039e\u0309\3\2\2\2\u039e\u0313\3\2\2\2\u039e\u031a\3\2"+
		"\2\2\u039e\u0321\3\2\2\2\u039e\u0326\3\2\2\2\u039e\u032b\3\2\2\2\u039e"+
		"\u0330\3\2\2\2\u039e\u0335\3\2\2\2\u039e\u033c\3\2\2\2\u039e\u0343\3\2"+
		"\2\2\u039e\u034a\3\2\2\2\u039e\u0351\3\2\2\2\u039e\u0358\3\2\2\2\u039e"+
		"\u035f\3\2\2\2\u039e\u0366\3\2\2\2\u039e\u036d\3\2\2\2\u039e\u0374\3\2"+
		"\2\2\u039e\u037b\3\2\2\2\u039e\u0382\3\2\2\2\u039e\u0389\3\2\2\2\u039e"+
		"\u0390\3\2\2\2\u039e\u0397\3\2\2\2\u039fo\3\2\2\2\u03a0\u03a1\7\u00d0"+
		"\2\2\u03a1\u03a3\5\34\17\2\u03a2\u03a4\7\r\2\2\u03a3\u03a2\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4q\3\2\2\2\u03a5\u03ae\5\u0194\u00cb\2\u03a6\u03ae"+
		"\5\u00f6|\2\u03a7\u03ae\5p9\2\u03a8\u03ae\5\u00eav\2\u03a9\u03ae\5\u00ec"+
		"w\2\u03aa\u03ae\5\u00f0y\2\u03ab\u03ae\5\u00f8}\2\u03ac\u03ae\5\u00f4"+
		"{\2\u03ad\u03a5\3\2\2\2\u03ad\u03a6\3\2\2\2\u03ad\u03a7\3\2\2\2\u03ad"+
		"\u03a8\3\2\2\2\u03ad\u03a9\3\2\2\2\u03ad\u03aa\3\2\2\2\u03ad\u03ab\3\2"+
		"\2\2\u03ad\u03ac\3\2\2\2\u03aes\3\2\2\2\u03af\u03b0\5\u0172\u00ba\2\u03b0"+
		"u\3\2\2\2\u03b1\u03b2\7M\2\2\u03b2\u03b3\5\u0172\u00ba\2\u03b3w\3\2\2"+
		"\2\u03b4\u03b5\7d\2\2\u03b5\u03b7\5\24\13\2\u03b6\u03b8\5B\"\2\u03b7\u03b6"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\7\17\2\2"+
		"\u03ba\u03bc\5\u0172\u00ba\2\u03bb\u03bd\7\r\2\2\u03bc\u03bb\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bdy\3\2\2\2\u03be\u03bf\5\24\13\2\u03bf\u03c0\5B\"\2"+
		"\u03c0\u03c1\7\17\2\2\u03c1\u03c3\5\u0172\u00ba\2\u03c2\u03c4\7\r\2\2"+
		"\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4{\3\2\2\2\u03c5\u03d6\5"+
		"\u0084C\2\u03c6\u03d6\5\u0172\u00ba\2\u03c7\u03d6\5x=\2\u03c8\u03d6\5"+
		"z>\2\u03c9\u03d6\5\u008eH\2\u03ca\u03d6\5\u00d2j\2\u03cb\u03d6\5\\/\2"+
		"\u03cc\u03d6\5\u0092J\2\u03cd\u03d6\5\u009aN\2\u03ce\u03d6\5\u009eP\2"+
		"\u03cf\u03d6\5\u0094K\2\u03d0\u03d6\5v<\2\u03d1\u03d6\5\u00aaV\2\u03d2"+
		"\u03d6\5\u00acW\2\u03d3\u03d6\5\u0176\u00bc\2\u03d4\u03d6\5~@\2\u03d5"+
		"\u03c5\3\2\2\2\u03d5\u03c6\3\2\2\2\u03d5\u03c7\3\2\2\2\u03d5\u03c8\3\2"+
		"\2\2\u03d5\u03c9\3\2\2\2\u03d5\u03ca\3\2\2\2\u03d5\u03cb\3\2\2\2\u03d5"+
		"\u03cc\3\2\2\2\u03d5\u03cd\3\2\2\2\u03d5\u03ce\3\2\2\2\u03d5\u03cf\3\2"+
		"\2\2\u03d5\u03d0\3\2\2\2\u03d5\u03d1\3\2\2\2\u03d5\u03d2\3\2\2\2\u03d5"+
		"\u03d3\3\2\2\2\u03d5\u03d4\3\2\2\2\u03d6}\3\2\2\2\u03d7\u03d8\7b\2\2\u03d8"+
		"\u03d9\7\b\2\2\u03d9\u03da\5\u0080A\2\u03da\u03dc\7\t\2\2\u03db\u03dd"+
		"\7\r\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\177\3\2\2\2\u03de"+
		"\u03e3\5\u0082B\2\u03df\u03e0\7\16\2\2\u03e0\u03e2\5\u0082B\2\u03e1\u03df"+
		"\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u0081\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e7\5\u012a\u0096\2\u03e7\u03e8"+
		"\5\u0168\u00b5\2\u03e8\u0083\3\2\2\2\u03e9\u03eb\7\n\2\2\u03ea\u03ec\5"+
		"\u0086D\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2"+
		"\u03ed\u03ee\7\f\2\2\u03ee\u0085\3\2\2\2\u03ef\u03f1\5|?\2\u03f0\u03ef"+
		"\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f5\3\2\2\2\u03f4\u03f6\7\r\2\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2"+
		"\2\2\u03f6\u0087\3\2\2\2\u03f7\u03fa\7\32\2\2\u03f8\u03fa\5\u008aF\2\u03f9"+
		"\u03f7\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03fc\7]"+
		"\2\2\u03fc\u03fe\5\u0186\u00c4\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2"+
		"\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\7^\2\2\u0400\u0401\7\u00dc\2\2\u0401"+
		"\u0402\5\u0192\u00ca\2\u0402\u0089\3\2\2\2\u0403\u0404\5\u0186\u00c4\2"+
		"\u0404\u0405\7\16\2\2\u0405\u0407\3\2\2\2\u0406\u0403\3\2\2\2\u0406\u0407"+
		"\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\7\n\2\2\u0409\u040e\5\u0186\u00c4"+
		"\2\u040a\u040b\7\16\2\2\u040b\u040d\5\u0186\u00c4\2\u040c\u040a\3\2\2"+
		"\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411"+
		"\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0412\7\f\2\2\u0412\u008b\3\2\2\2\u0413"+
		"\u0418\5z>\2\u0414\u0415\7\16\2\2\u0415\u0417\5z>\2\u0416\u0414\3\2\2"+
		"\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u008d"+
		"\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u041c\7\r\2\2\u041c\u008f\3\2\2\2\u041d"+
		"\u041f\5\u016e\u00b8\2\u041e\u0420\7\r\2\2\u041f\u041e\3\2\2\2\u041f\u0420"+
		"\3\2\2\2\u0420\u0091\3\2\2\2\u0421\u0422\7X\2\2\u0422\u0423\7\b\2\2\u0423"+
		"\u0424\5t;\2\u0424\u0425\7\t\2\2\u0425\u0428\5|?\2\u0426\u0427\7H\2\2"+
		"\u0427\u0429\5|?\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0093"+
		"\3\2\2\2\u042a\u042b\7D\2\2\u042b\u042c\5|?\2\u042c\u042d\7R\2\2\u042d"+
		"\u042e\7\b\2\2\u042e\u042f\5\u016e\u00b8\2\u042f\u0430\7\t\2\2\u0430\u0431"+
		"\5\u0192\u00ca\2\u0431\u0472\3\2\2\2\u0432\u0433\7R\2\2\u0433\u0434\7"+
		"\b\2\2\u0434\u0435\5\u016e\u00b8\2\u0435\u0436\7\t\2\2\u0436\u0437\5|"+
		"?\2\u0437\u0472\3\2\2\2\u0438\u0439\7P\2\2\u0439\u043b\7\b\2\2\u043a\u043c"+
		"\5\u016e\u00b8\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3"+
		"\2\2\2\u043d\u043f\7\r\2\2\u043e\u0440\5\u016e\u00b8\2\u043f\u043e\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0443\7\r\2\2\u0442"+
		"\u0444\5\u016e\u00b8\2\u0443\u0442\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u0446\7\t\2\2\u0446\u0472\5|?\2\u0447\u0448\7P\2\2\u0448"+
		"\u0449\7\b\2\2\u0449\u044a\5\u0096L\2\u044a\u044b\5\u008cG\2\u044b\u044d"+
		"\7\r\2\2\u044c\u044e\5\u016e\u00b8\2\u044d\u044c\3\2\2\2\u044d\u044e\3"+
		"\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451\7\r\2\2\u0450\u0452\5\u016e\u00b8"+
		"\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454"+
		"\7\t\2\2\u0454\u0455\5|?\2\u0455\u0472\3\2\2\2\u0456\u0457\7P\2\2\u0457"+
		"\u0458\7\b\2\2\u0458\u045d\5\u0172\u00ba\2\u0459\u045e\7[\2\2\u045a\u045c"+
		"\7\u00db\2\2\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e\3\2\2"+
		"\2\u045d\u0459\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460"+
		"\5\u016e\u00b8\2\u0460\u0461\7\t\2\2\u0461\u0462\5|?\2\u0462\u0472\3\2"+
		"\2\2\u0463\u0464\7P\2\2\u0464\u0465\7\b\2\2\u0465\u0466\5\u0096L\2\u0466"+
		"\u046b\5z>\2\u0467\u046c\7[\2\2\u0468\u046a\7\u00db\2\2\u0469\u0468\3"+
		"\2\2\2\u0469\u046a\3\2\2\2\u046a\u046c\3\2\2\2\u046b\u0467\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\5\u016e\u00b8\2\u046e\u046f"+
		"\7\t\2\2\u046f\u0470\5|?\2\u0470\u0472\3\2\2\2\u0471\u042a\3\2\2\2\u0471"+
		"\u0432\3\2\2\2\u0471\u0438\3\2\2\2\u0471\u0447\3\2\2\2\u0471\u0456\3\2"+
		"\2\2\u0471\u0463\3\2\2\2\u0472\u0095\3\2\2\2\u0473\u0474\t\6\2\2\u0474"+
		"\u0097\3\2\2\2\u0475\u0477\7O\2\2\u0476\u0478\7\u00db\2\2\u0477\u0476"+
		"\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\5\u0192\u00ca"+
		"\2\u047a\u0099\3\2\2\2\u047b\u047d\7C\2\2\u047c\u047e\7\u00db\2\2\u047d"+
		"\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\5\u0192"+
		"\u00ca\2\u0480\u009b\3\2\2\2\u0481\u0482\7V\2\2\u0482\u0483\7\b\2\2\u0483"+
		"\u0484\5\u016e\u00b8\2\u0484\u0485\7\t\2\2\u0485\u0486\5|?\2\u0486\u009d"+
		"\3\2\2\2\u0487\u0488\7Q\2\2\u0488\u0489\7\b\2\2\u0489\u048a\5t;\2\u048a"+
		"\u048b\7\t\2\2\u048b\u048c\5\u00a0Q\2\u048c\u009f\3\2\2\2\u048d\u048f"+
		"\7\n\2\2\u048e\u0490\5\u00a2R\2\u048f\u048e\3\2\2\2\u048f\u0490\3\2\2"+
		"\2\u0490\u0491\3\2\2\2\u0491\u0493\5\u00a6T\2\u0492\u0494\5\u00a2R\2\u0493"+
		"\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\7\f"+
		"\2\2\u0496\u00a1\3\2\2\2\u0497\u0499\5\u00a4S\2\u0498\u0497\3\2\2\2\u0499"+
		"\u049a\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u00a3\3\2"+
		"\2\2\u049c\u049d\7G\2\2\u049d\u049e\5\u0172\u00ba\2\u049e\u049f\7\21\2"+
		"\2\u049f\u04a1\7\n\2\2\u04a0\u04a2\5\u0086D\2\u04a1\u04a0\3\2\2\2\u04a1"+
		"\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\7\f\2\2\u04a4\u04a6\7\r"+
		"\2\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04b1\3\2\2\2\u04a7"+
		"\u04a8\7G\2\2\u04a8\u04a9\5\u0172\u00ba\2\u04a9\u04ab\7\21\2\2\u04aa\u04ac"+
		"\5\u0086D\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2\2"+
		"\2\u04ad\u04af\7\r\2\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b1"+
		"\3\2\2\2\u04b0\u049c\3\2\2\2\u04b0\u04a7\3\2\2\2\u04b1\u00a5\3\2\2\2\u04b2"+
		"\u04b3\7W\2\2\u04b3\u04b4\7\21\2\2\u04b4\u04b6\7\n\2\2\u04b5\u04b7\5\u0086"+
		"D\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8"+
		"\u04ba\7\f\2\2\u04b9\u04bb\7\r\2\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2"+
		"\2\2\u04bb\u04c5\3\2\2\2\u04bc\u04bd\7W\2\2\u04bd\u04bf\7\21\2\2\u04be"+
		"\u04c0\5\u0086D\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2"+
		"\3\2\2\2\u04c1\u04c3\7\r\2\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u04c5\3\2\2\2\u04c4\u04b2\3\2\2\2\u04c4\u04bc\3\2\2\2\u04c5\u00a7\3\2"+
		"\2\2\u04c6\u04c7\7\u00db\2\2\u04c7\u04c8\7\21\2\2\u04c8\u04c9\5|?\2\u04c9"+
		"\u00a9\3\2\2\2\u04ca\u04cb\7Y\2\2\u04cb\u04cc\5\u016e\u00b8\2\u04cc\u04cd"+
		"\5\u0192\u00ca\2\u04cd\u00ab\3\2\2\2\u04ce\u04cf\7\\\2\2\u04cf\u04d5\5"+
		"\u0084C\2\u04d0\u04d2\5\u00aeX\2\u04d1\u04d3\5\u00b0Y\2\u04d2\u04d1\3"+
		"\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d6\5\u00b0Y\2"+
		"\u04d5\u04d0\3\2\2\2\u04d5\u04d4\3\2\2\2\u04d6\u00ad\3\2\2\2\u04d7\u04d8"+
		"\7K\2\2\u04d8\u04d9\7\b\2\2\u04d9\u04da\7\u00db\2\2\u04da\u04db\7\t\2"+
		"\2\u04db\u04dc\5\u0084C\2\u04dc\u00af\3\2\2\2\u04dd\u04de\7L\2\2\u04de"+
		"\u04df\5\u0084C\2\u04df\u00b1\3\2\2\2\u04e0\u04e1\7S\2\2\u04e1\u04e2\5"+
		"\u0192\u00ca\2\u04e2\u00b3\3\2\2\2\u04e3\u04e4\5\6\4\2\u04e4\u00b5\3\2"+
		"\2\2\u04e5\u04e6\7~\2\2\u04e6\u04e7\7\b\2\2\u04e7\u04e8\5\u0172\u00ba"+
		"\2\u04e8\u04e9\7\t\2\2\u04e9\u04ea\7\r\2\2\u04ea\u00b7\3\2\2\2\u04eb\u04ec"+
		"\5\u0156\u00ac\2\u04ec\u04ed\5\u00b6\\\2\u04ed\u00b9\3\2\2\2\u04ee\u04ef"+
		"\7}\2\2\u04ef\u04f1\5\u012a\u0096\2\u04f0\u04f2\5\u0150\u00a9\2\u04f1"+
		"\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\7a"+
		"\2\2\u04f4\u04f5\7\u00d0\2\2\u04f5\u04f6\7\n\2\2\u04f6\u04f7\5\u00b8]"+
		"\2\u04f7\u04f8\7\f\2\2\u04f8\u00bb\3\2\2\2\u04f9\u04fa\7\177\2\2\u04fa"+
		"\u04fb\7o\2\2\u04fb\u04fc\5\u0128\u0095\2\u04fc\u04fe\5\u00c2b\2\u04fd"+
		"\u04ff\7\r\2\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u00bd\3\2"+
		"\2\2\u0500\u0501\5x=\2\u0501\u00bf\3\2\2\2\u0502\u0503\7o\2\2\u0503\u0504"+
		"\5\u0128\u0095\2\u0504\u0506\5\u00c2b\2\u0505\u0507\7\r\2\2\u0506\u0505"+
		"\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u00c1\3\2\2\2\u0508\u0509\7\n\2\2\u0509"+
		"\u050a\5\u00c6d\2\u050a\u050b\5\u00ccg\2\u050b\u050c\5\u00c8e\2\u050c"+
		"\u050d\5\u00caf\2\u050d\u050e\7\f\2\2\u050e\u00c3\3\2\2\2\u050f\u0510"+
		"\7m\2\2\u0510\u0511\5\u0126\u0094\2\u0511\u0512\7\n\2\2\u0512\u0513\5"+
		"\u00c6d\2\u0513\u0514\5\u00ccg\2\u0514\u0515\5\u00caf\2\u0515\u0517\7"+
		"\f\2\2\u0516\u0518\7\r\2\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u00c5\3\2\2\2\u0519\u051b\5\u00be`\2\u051a\u0519\3\2\2\2\u051b\u051e"+
		"\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u00c7\3\2\2\2\u051e"+
		"\u051c\3\2\2\2\u051f\u0521\5\u013a\u009e\2\u0520\u051f\3\2\2\2\u0521\u0524"+
		"\3\2\2\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u00c9\3\2\2\2\u0524"+
		"\u0522\3\2\2\2\u0525\u0527\5\u0138\u009d\2\u0526\u0525\3\2\2\2\u0527\u052a"+
		"\3\2\2\2\u0528\u0526\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u00cb\3\2\2\2\u052a"+
		"\u0528\3\2\2\2\u052b\u052d\7\u0080\2\2\u052c\u052e\5\u0150\u00a9\2\u052d"+
		"\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\7\21"+
		"\2\2\u0530\u0531\5\u0130\u0099\2\u0531\u0532\7\n\2\2\u0532\u0533\5\u0156"+
		"\u00ac\2\u0533\u0534\7\f\2\2\u0534\u00cd\3\2\2\2\u0535\u0536\7\u00d2\2"+
		"\2\u0536\u00cf\3\2\2\2\u0537\u0538\7l\2\2\u0538\u053a\5\u00ceh\2\u0539"+
		"\u053b\5\u0150\u00a9\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c"+
		"\3\2\2\2\u053c\u053d\7\n\2\2\u053d\u053e\5\u0102\u0082\2\u053e\u0540\7"+
		"\f\2\2\u053f\u0541\7\r\2\2\u0540\u053f\3\2\2\2\u0540\u0541\3\2\2\2\u0541"+
		"\u00d1\3\2\2\2\u0542\u0543\7f\2\2\u0543\u0544\7\u00d4\2\2\u0544\u0545"+
		"\7\n\2\2\u0545\u0546\5\6\4\2\u0546\u0548\7\f\2\2\u0547\u0549\7\r\2\2\u0548"+
		"\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u00d3\3\2\2\2\u054a\u054b\7g"+
		"\2\2\u054b\u054c\7\u00d5\2\2\u054c\u054d\7\n\2\2\u054d\u054e\5\6\4\2\u054e"+
		"\u0550\7\f\2\2\u054f\u0551\7\r\2\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2"+
		"\2\2\u0551\u00d5\3\2\2\2\u0552\u0553\7e\2\2\u0553\u0554\5\u00d8m\2\u0554"+
		"\u0555\7 \2\2\u0555\u0556\7\u00d5\2\2\u0556\u0557\7!\2\2\u0557\u0559\5"+
		"\u00dco\2\u0558\u055a\7\r\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2"+
		"\u055a\u0579\3\2\2\2\u055b\u055c\7e\2\2\u055c\u055d\5\u00d8m\2\u055d\u055e"+
		"\7 \2\2\u055e\u055f\7\u00d5\2\2\u055f\u0560\7!\2\2\u0560\u0561\5\u00dc"+
		"o\2\u0561\u0563\5\u00dep\2\u0562\u0564\7\r\2\2\u0563\u0562\3\2\2\2\u0563"+
		"\u0564\3\2\2\2\u0564\u0579\3\2\2\2\u0565\u0566\7e\2\2\u0566\u0567\5\u00d8"+
		"m\2\u0567\u0568\7 \2\2\u0568\u0569\5\u00dan\2\u0569\u056a\7!\2\2\u056a"+
		"\u056c\5\u00dco\2\u056b\u056d\7\r\2\2\u056c\u056b\3\2\2\2\u056c\u056d"+
		"\3\2\2\2\u056d\u0579\3\2\2\2\u056e\u056f\7e\2\2\u056f\u0570\5\u00d8m\2"+
		"\u0570\u0571\7 \2\2\u0571\u0572\5\u00dan\2\u0572\u0573\7!\2\2\u0573\u0574"+
		"\5\u00dco\2\u0574\u0576\5\u00dep\2\u0575\u0577\7\r\2\2\u0576\u0575\3\2"+
		"\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u0552\3\2\2\2\u0578"+
		"\u055b\3\2\2\2\u0578\u0565\3\2\2\2\u0578\u056e\3\2\2\2\u0579\u00d7\3\2"+
		"\2\2\u057a\u057b\7\u00d7\2\2\u057b\u00d9\3\2\2\2\u057c\u057d\t\7\2\2\u057d"+
		"\u00db\3\2\2\2\u057e\u057f\7c\2\2\u057f\u0580\5\u00e0q\2\u0580\u00dd\3"+
		"\2\2\2\u0581\u0582\7\n\2\2\u0582\u0583\5:\36\2\u0583\u0584\7\f\2\2\u0584"+
		"\u00df\3\2\2\2\u0585\u058a\5\u00e2r\2\u0586\u0587\7\16\2\2\u0587\u0589"+
		"\5\u00e2r\2\u0588\u0586\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2"+
		"\2\u058a\u058b\3\2\2\2\u058b\u00e1\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u0594"+
		"\7\u00d7\2\2\u058e\u0594\7\u00da\2\2\u058f\u0590\7\u00da\2\2\u0590\u0591"+
		"\7 \2\2\u0591\u0592\7\u00da\2\2\u0592\u0594\7!\2\2\u0593\u058d\3\2\2\2"+
		"\u0593\u058e\3\2\2\2\u0593\u058f\3\2\2\2\u0594\u00e3\3\2\2\2\u0595\u0596"+
		"\7h\2\2\u0596\u0597\7\u00cd\2\2\u0597\u0598\7\n\2\2\u0598\u0599\5\6\4"+
		"\2\u0599\u059b\7\f\2\2\u059a\u059c\7\r\2\2\u059b\u059a\3\2\2\2\u059b\u059c"+
		"\3\2\2\2\u059c\u00e5\3\2\2\2\u059d\u059e\7\u0097\2\2\u059e\u059f\7\u00da"+
		"\2\2\u059f\u05a0\7\n\2\2\u05a0\u05a1\5\6\4\2\u05a1\u05a3\7\f\2\2\u05a2"+
		"\u05a4\7\r\2\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u00e7\3\2"+
		"\2\2\u05a5\u05a6\5\u011e\u0090\2\u05a6\u00e9\3\2\2\2\u05a7\u05a8\5\u00e8"+
		"u\2\u05a8\u05a9\7\b\2\2\u05a9\u05aa\7\n\2\2\u05aa\u05ab\5\b\5\2\u05ab"+
		"\u05ac\7\f\2\2\u05ac\u05ad\7\t\2\2\u05ad\u00eb\3\2\2\2\u05ae\u05af\5\u0126"+
		"\u0094\2\u05af\u05b0\5\u00eex\2\u05b0\u00ed\3\2\2\2\u05b1\u05b2\7\b\2"+
		"\2\u05b2\u05b3\7\n\2\2\u05b3\u05b4\5\b\5\2\u05b4\u05b5\7\f\2\2\u05b5\u05b6"+
		"\7\t\2\2\u05b6\u05bc\3\2\2\2\u05b7\u05b8\7\b\2\2\u05b8\u05b9\5\u0172\u00ba"+
		"\2\u05b9\u05ba\7\t\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05b1\3\2\2\2\u05bb\u05b7"+
		"\3\2\2\2\u05bc\u00ef\3\2\2\2\u05bd\u05be\5\u0128\u0095\2\u05be\u05bf\5"+
		"\u00eex\2\u05bf\u00f1\3\2\2\2\u05c0\u05c1\7\u00da\2\2\u05c1\u00f3\3\2"+
		"\2\2\u05c2\u05c3\5\u00f2z\2\u05c3\u05c4\7\b\2\2\u05c4\u05c5\7\n\2\2\u05c5"+
		"\u05c6\5\b\5\2\u05c6\u05c7\7\f\2\2\u05c7\u05c8\7\t\2\2\u05c8\u00f5\3\2"+
		"\2\2\u05c9\u05cc\5\64\33\2\u05ca\u05cb\7\23\2\2\u05cb\u05cd\5\24\13\2"+
		"\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0"+
		"\5\34\17\2\u05cf\u05d1\7\r\2\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2"+
		"\u05d1\u00f7\3\2\2\2\u05d2\u05d3\7\n\2\2\u05d3\u05d4\7\b\2\2\u05d4\u05d5"+
		"\5\16\b\2\u05d5\u05d6\5\b\5\2\u05d6\u05d7\7\f\2\2\u05d7\u05d8\7\t\2\2"+
		"\u05d8\u00f9\3\2\2\2\u05d9\u05da\7t\2\2\u05da\u05dc\5\u00fe\u0080\2\u05db"+
		"\u05dd\5\u0150\u00a9\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de"+
		"\3\2\2\2\u05de\u05e0\7\n\2\2\u05df\u05e1\5\b\5\2\u05e0\u05df\3\2\2\2\u05e0"+
		"\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\7\f\2\2\u05e3\u05e5\7\r"+
		"\2\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u00fb\3\2\2\2\u05e6"+
		"\u05e7\7u\2\2\u05e7\u05e9\5\u0100\u0081\2\u05e8\u05ea\5\u0150\u00a9\2"+
		"\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed"+
		"\7\n\2\2\u05ec\u05ee\5\b\5\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05ef\3\2\2\2\u05ef\u05f1\7\f\2\2\u05f0\u05f2\7\r\2\2\u05f1\u05f0\3\2"+
		"\2\2\u05f1\u05f2\3\2\2\2\u05f2\u00fd\3\2\2\2\u05f3\u05f4\7\u00d8\2\2\u05f4"+
		"\u00ff\3\2\2\2\u05f5\u05f6\7\u00d8\2\2\u05f6\u0101\3\2\2\2\u05f7\u05f9"+
		"\7\u009b\2\2\u05f8\u05fa\5\u0150\u00a9\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa"+
		"\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\7\21\2\2\u05fc\u05fd\5\u0130"+
		"\u0099\2\u05fd\u05fe\7\n\2\2\u05fe\u05ff\5\u0156\u00ac\2\u05ff\u0600\7"+
		"\f\2\2\u0600\u0103\3\2\2\2\u0601\u0602\7\u00db\2\2\u0602\u0603\7\16\2"+
		"\2\u0603\u0604\7\u00db\2\2\u0604\u0105\3\2\2\2\u0605\u0606\7\u009b\2\2"+
		"\u0606\u0607\7\b\2\2\u0607\u0608\5\u0104\u0083\2\u0608\u0609\7\t\2\2\u0609"+
		"\u060a\7\n\2\2\u060a\u060b\5\u0156\u00ac\2\u060b\u060c\7\f\2\2\u060c\u0107"+
		"\3\2\2\2\u060d\u060e\7\u00c0\2\2\u060e\u060f\7\21\2\2\u060f\u0611\5\u010a"+
		"\u0086\2\u0610\u0612\7\r\2\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612"+
		"\u0109\3\2\2\2\u0613\u0614\t\b\2\2\u0614\u010b\3\2\2\2\u0615\u0616\7i"+
		"\2\2\u0616\u0617\7\u00d1\2\2\u0617\u0618\5\u0150\u00a9\2\u0618\u0619\7"+
		"\n\2\2\u0619\u061a\5\u0108\u0085\2\u061a\u061b\5\u0106\u0084\2\u061b\u061d"+
		"\7\f\2\2\u061c\u061e\7\r\2\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e"+
		"\u062a\3\2\2\2\u061f\u0620\7j\2\2\u0620\u0621\7\u00d1\2\2\u0621\u0622"+
		"\5\u0150\u00a9\2\u0622\u0623\7\n\2\2\u0623\u0624\5\u010e\u0088\2\u0624"+
		"\u0625\5\u0118\u008d\2\u0625\u0627\7\f\2\2\u0626\u0628\7\r\2\2\u0627\u0626"+
		"\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a\3\2\2\2\u0629\u0615\3\2\2\2\u0629"+
		"\u061f\3\2\2\2\u062a\u010d\3\2\2\2\u062b\u062d\5\u0110\u0089\2\u062c\u062e"+
		"\5\u0112\u008a\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u010f\3"+
		"\2\2\2\u062f\u0630\7\u00c7\2\2\u0630\u0631\7\21\2\2\u0631\u0632\5\u0116"+
		"\u008c\2\u0632\u0633\7\r\2\2\u0633\u0111\3\2\2\2\u0634\u0635\7\u00c8\2"+
		"\2\u0635\u0636\7\21\2\2\u0636\u0637\5\u0114\u008b\2\u0637\u0638\7\r\2"+
		"\2\u0638\u0113\3\2\2\2\u0639\u063a\7\u00cd\2\2\u063a\u0115\3\2\2\2\u063b"+
		"\u063c\t\t\2\2\u063c\u0117\3\2\2\2\u063d\u063e\7\u009b\2\2\u063e\u063f"+
		"\7\b\2\2\u063f\u0640\5\u011a\u008e\2\u0640\u0641\7\t\2\2\u0641\u0642\7"+
		"\21\2\2\u0642\u0643\5\u011c\u008f\2\u0643\u0644\7\n\2\2\u0644\u0645\5"+
		"\u0156\u00ac\2\u0645\u0646\7\f\2\2\u0646\u0119\3\2\2\2\u0647\u0648\7\u00db"+
		"\2\2\u0648\u011b\3\2\2\2\u0649\u064a\7\u00cd\2\2\u064a\u011d\3\2\2\2\u064b"+
		"\u064c\7\u00cd\2\2\u064c\u011f\3\2\2\2\u064d\u0652\5\u011e\u0090\2\u064e"+
		"\u064f\7*\2\2\u064f\u0651\5\u011e\u0090\2\u0650\u064e\3\2\2\2\u0651\u0654"+
		"\3\2\2\2\u0652\u0650\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0121\3\2\2\2\u0654"+
		"\u0652\3\2\2\2\u0655\u0656\7\u00d0\2\2\u0656\u0123\3\2\2\2\u0657\u065c"+
		"\5\u0122\u0092\2\u0658\u0659\7*\2\2\u0659\u065b\5\u0122\u0092\2\u065a"+
		"\u0658\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065c\u065d\3\2"+
		"\2\2\u065d\u0125\3\2\2\2\u065e\u065c\3\2\2\2\u065f\u0660\7\u00ce\2\2\u0660"+
		"\u0127\3\2\2\2\u0661\u0662\7\u00cf\2\2\u0662\u0129\3\2\2\2\u0663\u0664"+
		"\7\u00d6\2\2\u0664\u012b\3\2\2\2\u0665\u0666\7x\2\2\u0666\u0667\7\b\2"+
		"\2\u0667\u0668\5\62\32\2\u0668\u0669\7\t\2\2\u0669\u012d\3\2\2\2\u066a"+
		"\u066b\7y\2\2\u066b\u066d\7\b\2\2\u066c\u066e\5\u0124\u0093\2\u066d\u066c"+
		"\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670\7\t\2\2\u0670"+
		"\u012f\3\2\2\2\u0671\u0672\7\b\2\2\u0672\u0673\5\u012c\u0097\2\u0673\u0674"+
		"\7\16\2\2\u0674\u0675\5\u012e\u0098\2\u0675\u0676\7\t\2\2\u0676\u0131"+
		"\3\2\2\2\u0677\u0678\7\u00d3\2\2\u0678\u0133\3\2\2\2\u0679\u067a\7{\2"+
		"\2\u067a\u067b\5\u0132\u009a\2\u067b\u067c\7\n\2\2\u067c\u067d\5:\36\2"+
		"\u067d\u067e\7\f\2\2\u067e\u0135\3\2\2\2\u067f\u0682\5\u013a\u009e\2\u0680"+
		"\u0682\5\u0138\u009d\2\u0681\u067f\3\2\2\2\u0681\u0680\3\2\2\2\u0682\u0137"+
		"\3\2\2\2\u0683\u0685\7\u0082\2\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2"+
		"\2\u0685\u0686\3\2\2\2\u0686\u0688\5\24\13\2\u0687\u0689\5\u0150\u00a9"+
		"\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068b"+
		"\5\u013e\u00a0\2\u068b\u068c\7\n\2\2\u068c\u068d\5\u0156\u00ac\2\u068d"+
		"\u068e\7\f\2\2\u068e\u0139\3\2\2\2\u068f\u0691\7\u0083\2\2\u0690\u068f"+
		"\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0694\5\24\13\2"+
		"\u0693\u0695\5\u0150\u00a9\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695"+
		"\u0696\3\2\2\2\u0696\u0697\5\u013c\u009f\2\u0697\u0698\7\n\2\2\u0698\u0699"+
		"\5\u0156\u00ac\2\u0699\u069a\7\f\2\2\u069a\u013b\3\2\2\2\u069b\u069c\7"+
		"\21\2\2\u069c\u069d\5\u0130\u0099\2\u069d\u013d\3\2\2\2\u069e\u06a2\5"+
		"B\"\2\u069f\u06a0\7\21\2\2\u06a0\u06a2\5\u0130\u0099\2\u06a1\u069e\3\2"+
		"\2\2\u06a1\u069f\3\2\2\2\u06a2\u013f\3\2\2\2\u06a3\u06a5\5P)\2\u06a4\u06a3"+
		"\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a7\3\2\2\2\u06a6\u06a8\7\u0085\2"+
		"\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u0141\3\2\2\2\u06a9\u06aa"+
		"\5T+\2\u06aa\u06ab\7\r\2\2\u06ab\u0143\3\2\2\2\u06ac\u06ae\7\32\2\2\u06ad"+
		"\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b0\7\u00db"+
		"\2\2\u06b0\u06b2\7\b\2\2\u06b1\u06b3\5\u0150\u00a9\2\u06b2\u06b1\3\2\2"+
		"\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\7\t\2\2\u06b5\u06b6"+
		"\7\n\2\2\u06b6\u06b7\5\u0156\u00ac\2\u06b7\u06b8\7\f\2\2\u06b8\u0145\3"+
		"\2\2\2\u06b9\u06ba\7T\2\2\u06ba\u06bc\7\32\2\2\u06bb\u06bd\7\u00db\2\2"+
		"\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c0"+
		"\7\b\2\2\u06bf\u06c1\5\u0150\u00a9\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3"+
		"\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\7\t\2\2\u06c3\u06c4\7\n\2\2\u06c4"+
		"\u06c5\5\u0156\u00ac\2\u06c5\u06c6\7\f\2\2\u06c6\u0147\3\2\2\2\u06c7\u06c8"+
		"\7\n\2\2\u06c8\u06cd\5\u014a\u00a6\2\u06c9\u06ca\7\16\2\2\u06ca\u06cc"+
		"\5\u014a\u00a6\2\u06cb\u06c9\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3"+
		"\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0"+
		"\u06d2\7\16\2\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\3"+
		"\2\2\2\u06d3\u06d4\7\f\2\2\u06d4\u0149\3\2\2\2\u06d5\u06d6\7\32\2\2\u06d6"+
		"\u06d7\5\u014e\u00a8\2\u06d7\u014b\3\2\2\2\u06d8\u06d9\7\n\2\2\u06d9\u06de"+
		"\5\u014e\u00a8\2\u06da\u06db\7\16\2\2\u06db\u06dd\5\u014e\u00a8\2\u06dc"+
		"\u06da\3\2\2\2\u06dd\u06e0\3\2\2\2\u06de\u06dc\3\2\2\2\u06de\u06df\3\2"+
		"\2\2\u06df\u06e2\3\2\2\2\u06e0\u06de\3\2\2\2\u06e1\u06e3\7\16\2\2\u06e2"+
		"\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\7\f"+
		"\2\2\u06e5\u014d\3\2\2\2\u06e6\u06e7\7\6\2\2\u06e7\u06e8\5\u0172\u00ba"+
		"\2\u06e8\u06e9\7\7\2\2\u06e9\u06eb\7\b\2\2\u06ea\u06ec\5\u0150\u00a9\2"+
		"\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee"+
		"\7\t\2\2\u06ee\u06ef\7\n\2\2\u06ef\u06f0\5\u0156\u00ac\2\u06f0\u06f1\7"+
		"\f\2\2\u06f1\u014f\3\2\2\2\u06f2\u06f3\7\b\2\2\u06f3\u0706\7\t\2\2\u06f4"+
		"\u0702\7\b\2\2\u06f5\u06fa\5\u0152\u00aa\2\u06f6\u06f7\7\16\2\2\u06f7"+
		"\u06f9\5\u0152\u00aa\2\u06f8\u06f6\3\2\2\2\u06f9\u06fc\3\2\2\2\u06fa\u06f8"+
		"\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06ff\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd"+
		"\u06fe\7\16\2\2\u06fe\u0700\5\u0154\u00ab\2\u06ff\u06fd\3\2\2\2\u06ff"+
		"\u0700\3\2\2\2\u0700\u0703\3\2\2\2\u0701\u0703\5\u0154\u00ab\2\u0702\u06f5"+
		"\3\2\2\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704\3\2\2\2\u0704"+
		"\u0706\7\t\2\2\u0705\u06f2\3\2\2\2\u0705\u06f4\3\2\2\2\u0706\u0151\3\2"+
		"\2\2\u0707\u0709\5d\63\2\u0708\u0707\3\2\2\2\u0708\u0709\3\2\2\2\u0709"+
		"\u070b\3\2\2\2\u070a\u070c\5P)\2\u070b\u070a\3\2\2\2\u070b\u070c\3\2\2"+
		"\2\u070c\u070d\3\2\2\2\u070d\u070f\5\u0188\u00c5\2\u070e\u0710\5B\"\2"+
		"\u070f\u070e\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0713\3\2\2\2\u0711\u0712"+
		"\7\17\2\2\u0712\u0714\5\u0172\u00ba\2\u0713\u0711\3\2\2\2\u0713\u0714"+
		"\3\2\2\2\u0714\u0153\3\2\2\2\u0715\u0716\7\22\2\2\u0716\u0717\7\u00db"+
		"\2\2\u0717\u0155\3\2\2\2\u0718\u071a\5\u0086D\2\u0719\u0718\3\2\2\2\u0719"+
		"\u071a\3\2\2\2\u071a\u0157\3\2\2\2\u071b\u071d\7\6\2\2\u071c\u071e\5\u015a"+
		"\u00ae\2\u071d\u071c\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u071f\3\2\2\2\u071f"+
		"\u0720\7\7\2\2\u0720\u0159\3\2\2\2\u0721\u0726\5\u0172\u00ba\2\u0722\u0723"+
		"\7\16\2\2\u0723\u0725\5\u0172\u00ba\2\u0724\u0722\3\2\2\2\u0725\u0728"+
		"\3\2\2\2\u0726\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u015b\3\2\2\2\u0728"+
		"\u0726\3\2\2\2\u0729\u0735\7\n\2\2\u072a\u072f\5\u0160\u00b1\2\u072b\u072c"+
		"\7\16\2\2\u072c\u072e\5\u0160\u00b1\2\u072d\u072b\3\2\2\2\u072e\u0731"+
		"\3\2\2\2\u072f\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0733\3\2\2\2\u0731"+
		"\u072f\3\2\2\2\u0732\u0734\7\16\2\2\u0733\u0732\3\2\2\2\u0733\u0734\3"+
		"\2\2\2\u0734\u0736\3\2\2\2\u0735\u072a\3\2\2\2\u0735\u0736\3\2\2\2\u0736"+
		"\u0737\3\2\2\2\u0737\u0738\7\f\2\2\u0738\u015d\3\2\2\2\u0739\u073a\5\u0172"+
		"\u00ba\2\u073a\u015f\3\2\2\2\u073b\u073c\5\u0166\u00b4\2\u073c\u073d\t"+
		"\n\2\2\u073d\u073e\5\u015e\u00b0\2\u073e\u074b\3\2\2\2\u073f\u0740\7\6"+
		"\2\2\u0740\u0741\5\u015e\u00b0\2\u0741\u0742\7\7\2\2\u0742\u0743\7\21"+
		"\2\2\u0743\u0744\5\u015e\u00b0\2\u0744\u074b\3\2\2\2\u0745\u074b\5\u0162"+
		"\u00b2\2\u0746\u074b\5\u0164\u00b3\2\u0747\u074b\5\u0144\u00a3\2\u0748"+
		"\u074b\5\u0188\u00c5\2\u0749\u074b\5L\'\2\u074a\u073b\3\2\2\2\u074a\u073f"+
		"\3\2\2\2\u074a\u0745\3\2\2\2\u074a\u0746\3\2\2\2\u074a\u0747\3\2\2\2\u074a"+
		"\u0748\3\2\2\2\u074a\u0749\3\2\2\2\u074b\u0161\3\2\2\2\u074c\u074d\5\u018e"+
		"\u00c8\2\u074d\u074e\7\b\2\2\u074e\u0750\7\t\2\2\u074f\u0751\5B\"\2\u0750"+
		"\u074f\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\7\n"+
		"\2\2\u0753\u0754\5\u0156\u00ac\2\u0754\u0755\7\f\2\2\u0755\u0163\3\2\2"+
		"\2\u0756\u0757\5\u0190\u00c9\2\u0757\u075a\7\b\2\2\u0758\u075b\7\u00db"+
		"\2\2\u0759\u075b\5\4\3\2\u075a\u0758\3\2\2\2\u075a\u0759\3\2\2\2\u075b"+
		"\u075d\3\2\2\2\u075c\u075e\5B\"\2\u075d\u075c\3\2\2\2\u075d\u075e\3\2"+
		"\2\2\u075e\u075f\3\2\2\2\u075f\u0760\7\t\2\2\u0760\u0761\7\n\2\2\u0761"+
		"\u0762\5\u0156\u00ac\2\u0762\u0763\7\f\2\2\u0763\u0165\3\2\2\2\u0764\u0768"+
		"\5\u0186\u00c4\2\u0765\u0768\7\u00dc\2\2\u0766\u0768\5\u0184\u00c3\2\u0767"+
		"\u0764\3\2\2\2\u0767\u0765\3\2\2\2\u0767\u0766\3\2\2\2\u0768\u0167\3\2"+
		"\2\2\u0769\u076e\7\b\2\2\u076a\u076c\5\u016a\u00b6\2\u076b\u076d\7\16"+
		"\2\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076f\3\2\2\2\u076e"+
		"\u076a\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771\7\t"+
		"\2\2\u0771\u0169\3\2\2\2\u0772\u0777\5\u016c\u00b7\2\u0773\u0774\7\16"+
		"\2\2\u0774\u0776\5\u016c\u00b7\2\u0775\u0773\3\2\2\2\u0776\u0779\3\2\2"+
		"\2\u0777\u0775\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u016b\3\2\2\2\u0779\u0777"+
		"\3\2\2\2\u077a\u077b\5\u015e\u00b0\2\u077b\u016d\3\2\2\2\u077c\u0781\5"+
		"\u0172\u00ba\2\u077d\u077e\7\16\2\2\u077e\u0780\5\u0172\u00ba\2\u077f"+
		"\u077d\3\2\2\2\u0780\u0783\3\2\2\2\u0781\u077f\3\2\2\2\u0781\u0782\3\2"+
		"\2\2\u0782\u016f\3\2\2\2\u0783\u0781\3\2\2\2\u0784\u0786\7T\2\2\u0785"+
		"\u0787\7\u00db\2\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788"+
		"\3\2\2\2\u0788\u078a\7\b\2\2\u0789\u078b\5\u0150\u00a9\2\u078a\u0789\3"+
		"\2\2\2\u078a\u078b\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078e\7\t\2\2\u078d"+
		"\u078f\5B\"\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2"+
		"\2\2\u0790\u0791\7\n\2\2\u0791\u0792\5\u0156\u00ac\2\u0792\u0793\7\f\2"+
		"\2\u0793\u0171\3\2\2\2\u0794\u0795\b\u00ba\1\2\u0795\u0796\7\31\2\2\u0796"+
		"\u07a1\5\u0172\u00ba\25\u0797\u0798\7\b\2\2\u0798\u0799\5\u0172\u00ba"+
		"\2\u0799\u079a\7\t\2\2\u079a\u07a1\3\2\2\2\u079b\u07a1\5\u017e\u00c0\2"+
		"\u079c\u07a1\5r:\2\u079d\u07a1\5\"\22\2\u079e\u07a1\5\u0158\u00ad\2\u079f"+
		"\u07a1\7U\2\2\u07a0\u0794\3\2\2\2\u07a0\u0797\3\2\2\2\u07a0\u079b\3\2"+
		"\2\2\u07a0\u079c\3\2\2\2\u07a0\u079d\3\2\2\2\u07a0\u079e\3\2\2\2\u07a0"+
		"\u079f\3\2\2\2\u07a1\u07cb\3\2\2\2\u07a2\u07a3\f\17\2\2\u07a3\u07a4\t"+
		"\13\2\2\u07a4\u07ca\5\u0172\u00ba\20\u07a5\u07a6\f\16\2\2\u07a6\u07a7"+
		"\t\f\2\2\u07a7\u07ca\5\u0172\u00ba\17\u07a8\u07a9\f\r\2\2\u07a9\u07aa"+
		"\t\r\2\2\u07aa\u07ca\5\u0172\u00ba\16\u07ab\u07ac\f\f\2\2\u07ac\u07ad"+
		"\t\16\2\2\u07ad\u07ca\5\u0172\u00ba\r\u07ae\u07af\f\13\2\2\u07af\u07b0"+
		"\7+\2\2\u07b0\u07ca\5\u0172\u00ba\f\u07b1\u07b2\f\n\2\2\u07b2\u07b3\7"+
		",\2\2\u07b3\u07ca\5\u0172\u00ba\13\u07b4\u07b5\f\t\2\2\u07b5\u07b6\7-"+
		"\2\2\u07b6\u07ca\5\u0172\u00ba\n\u07b7\u07b8\f\b\2\2\u07b8\u07b9\7\17"+
		"\2\2\u07b9\u07ca\5\u0172\u00ba\t\u07ba\u07bb\f\23\2\2\u07bb\u07bc\7\23"+
		"\2\2\u07bc\u07ca\5\"\22\2\u07bd\u07be\f\22\2\2\u07be\u07ca\5\34\17\2\u07bf"+
		"\u07c0\f\21\2\2\u07c0\u07c1\7\23\2\2\u07c1\u07c2\7\u00bd\2\2\u07c2\u07c3"+
		"\7\b\2\2\u07c3\u07ca\7\t\2\2\u07c4\u07c5\f\20\2\2\u07c5\u07c6\7\23\2\2"+
		"\u07c6\u07c7\7\u00be\2\2\u07c7\u07c8\7\b\2\2\u07c8\u07ca\7\t\2\2\u07c9"+
		"\u07a2\3\2\2\2\u07c9\u07a5\3\2\2\2\u07c9\u07a8\3\2\2\2\u07c9\u07ab\3\2"+
		"\2\2\u07c9\u07ae\3\2\2\2\u07c9\u07b1\3\2\2\2\u07c9\u07b4\3\2\2\2\u07c9"+
		"\u07b7\3\2\2\2\u07c9\u07ba\3\2\2\2\u07c9\u07bd\3\2\2\2\u07c9\u07bf\3\2"+
		"\2\2\u07c9\u07c4\3\2\2\2\u07ca\u07cd\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cb"+
		"\u07cc\3\2\2\2\u07cc\u0173\3\2\2\2\u07cd\u07cb\3\2\2\2\u07ce\u07d1\5\66"+
		"\34\2\u07cf\u07d0\7\6\2\2\u07d0\u07d2\7\7\2\2\u07d1\u07cf\3\2\2\2\u07d1"+
		"\u07d2\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3\u07d5\5\u0172\u00ba\2\u07d4\u07ce"+
		"\3\2\2\2\u07d4\u07d3\3\2\2\2\u07d5\u0175\3\2\2\2\u07d6\u07d8\7`\2\2\u07d7"+
		"\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07db\5\u0178"+
		"\u00bd\2\u07da\u07dc\5B\"\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc"+
		"\u07dd\3\2\2\2\u07dd\u07de\79\2\2\u07de\u07df\5\u017a\u00be\2\u07df\u0177"+
		"\3\2\2\2\u07e0\u07e7\7\u00db\2\2\u07e1\u07e3\7\b\2\2\u07e2\u07e4\5\u0150"+
		"\u00a9\2\u07e3\u07e2\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5"+
		"\u07e7\7\t\2\2\u07e6\u07e0\3\2\2\2\u07e6\u07e1\3\2\2\2\u07e7\u0179\3\2"+
		"\2\2\u07e8\u07ee\5\u0172\u00ba\2\u07e9\u07ea\7\n\2\2\u07ea\u07eb\5\u0156"+
		"\u00ac\2\u07eb\u07ec\7\f\2\2\u07ec\u07ee\3\2\2\2\u07ed\u07e8\3\2\2\2\u07ed"+
		"\u07e9\3\2\2\2\u07ee\u017b\3\2\2\2\u07ef\u07f0\t\17\2\2\u07f0\u017d\3"+
		"\2\2\2\u07f1\u07f8\7:\2\2\u07f2\u07f8\7;\2\2\u07f3\u07f8\7\u00dc\2\2\u07f4"+
		"\u07f8\5\u0180\u00c1\2\u07f5\u07f8\7\5\2\2\u07f6\u07f8\5\u0184\u00c3\2"+
		"\u07f7\u07f1\3\2\2\2\u07f7\u07f2\3\2\2\2\u07f7\u07f3\3\2\2\2\u07f7\u07f4"+
		"\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f7\u07f6\3\2\2\2\u07f8\u017f\3\2\2\2\u07f9"+
		"\u07fd\7\u00dd\2\2\u07fa\u07fc\5\u0182\u00c2\2\u07fb\u07fa\3\2\2\2\u07fc"+
		"\u07ff\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u0800\3\2"+
		"\2\2\u07ff\u07fd\3\2\2\2\u0800\u0801\7\u00dd\2\2\u0801\u0181\3\2\2\2\u0802"+
		"\u0808\7\u00e4\2\2\u0803\u0804\7\u00e3\2\2\u0804\u0805\5\u0172\u00ba\2"+
		"\u0805\u0806\7\13\2\2\u0806\u0808\3\2\2\2\u0807\u0802\3\2\2\2\u0807\u0803"+
		"\3\2\2\2\u0808\u0183\3\2\2\2\u0809\u080c\7<\2\2\u080a\u080c\7=\2\2\u080b"+
		"\u0809\3\2\2\2\u080b\u080a\3\2\2\2\u080c\u0185\3\2\2\2\u080d\u080e\7\u00db"+
		"\2\2\u080e\u0187\3\2\2\2\u080f\u0810\t\20\2\2\u0810\u0189\3\2\2\2\u0811"+
		"\u0815\5\u018c\u00c7\2\u0812\u0815\7:\2\2\u0813\u0815\7;\2\2\u0814\u0811"+
		"\3\2\2\2\u0814\u0812\3\2\2\2\u0814\u0813\3\2\2\2\u0815\u018b\3\2\2\2\u0816"+
		"\u0817\t\21\2\2\u0817\u018d\3\2\2\2\u0818\u0819\7\u0099\2\2\u0819\u081a"+
		"\5\u0166\u00b4\2\u081a\u018f\3\2\2\2\u081b\u081c\7\u009a\2\2\u081c\u081d"+
		"\5\u0166\u00b4\2\u081d\u0191\3\2\2\2\u081e\u081f\t\22\2\2\u081f\u0193"+
		"\3\2\2\2\u0820\u0821\5\"\22\2\u0821\u0822\7\u00bc\2\2\u0822\u0824\5\u0196"+
		"\u00cc\2\u0823\u0825\7\r\2\2\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2\2\u0825"+
		"\u0195\3\2\2\2\u0826\u0827\7\u00cc\2\2\u0827\u0197\3\2\2\2\u00d9\u019d"+
		"\u01a4\u01ae\u01b2\u01ba\u01ca\u01dc\u01df\u01ee\u01fd\u0206\u020d\u0216"+
		"\u021b\u0220\u022e\u0232\u023d\u0242\u0244\u024b\u0250\u0253\u0256\u025b"+
		"\u025e\u0261\u0266\u0269\u026c\u0270\u0276\u0281\u0288\u028e\u0294\u029c"+
		"\u02a1\u02ac\u02b1\u02b9\u02c0\u02c9\u02db\u02e2\u02e9\u02ef\u02f3\u02f9"+
		"\u02fd\u0303\u0307\u030d\u0311\u0318\u031f\u033a\u0341\u0348\u034f\u0356"+
		"\u035d\u0364\u036b\u0372\u0379\u0380\u0387\u038e\u0395\u039c\u039e\u03a3"+
		"\u03ad\u03b7\u03bc\u03c3\u03d5\u03dc\u03e3\u03eb\u03f2\u03f5\u03f9\u03fd"+
		"\u0406\u040e\u0418\u041f\u0428\u043b\u043f\u0443\u044d\u0451\u045b\u045d"+
		"\u0469\u046b\u0471\u0477\u047d\u048f\u0493\u049a\u04a1\u04a5\u04ab\u04ae"+
		"\u04b0\u04b6\u04ba\u04bf\u04c2\u04c4\u04d2\u04d5\u04f1\u04fe\u0506\u0517"+
		"\u051c\u0522\u0528\u052d\u053a\u0540\u0548\u0550\u0559\u0563\u056c\u0576"+
		"\u0578\u058a\u0593\u059b\u05a3\u05bb\u05cc\u05d0\u05dc\u05e0\u05e4\u05e9"+
		"\u05ed\u05f1\u05f9\u0611\u061d\u0627\u0629\u062d\u0652\u065c\u066d\u0681"+
		"\u0684\u0688\u0690\u0694\u06a1\u06a4\u06a7\u06ad\u06b2\u06bc\u06c0\u06cd"+
		"\u06d1\u06de\u06e2\u06eb\u06fa\u06ff\u0702\u0705\u0708\u070b\u070f\u0713"+
		"\u0719\u071d\u0726\u072f\u0733\u0735\u074a\u0750\u075a\u075d\u0767\u076c"+
		"\u076e\u0777\u0781\u0786\u078a\u078e\u07a0\u07c9\u07cb\u07d1\u07d4\u07d7"+
		"\u07db\u07e3\u07e6\u07ed\u07f7\u07fd\u0807\u080b\u0814\u0824";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}