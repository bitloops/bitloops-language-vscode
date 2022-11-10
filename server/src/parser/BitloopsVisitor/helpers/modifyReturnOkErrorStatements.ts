import {
  TStatement,
  TOkErrorReturnType,
  TStatements,
  TReturnStatement,
  TEvaluation,
  TEvaluationValues,
  TErrorEvaluation,
  TIfStatement,
} from '../../../types.js';
const isIfStatement = (value: TStatement): value is TIfStatement => {
  if (typeof value === 'string') return false;
  if ('ifStatement' in value) return true;
  return false;
};

const isErrorEvaluation = (evaluationValue: TEvaluationValues): evaluationValue is TErrorEvaluation => {
  if ('errorEvaluation' in evaluationValue) {
    return true;
  }
  return false;
};

const isReturnOkErrorType = (returnType: TOkErrorReturnType) => {
  return returnType.ok !== undefined && returnType.errors !== undefined;
};

const isReturnStatement = (statement: TStatement): boolean => {
  return (statement as TReturnStatement).return !== undefined;
};

const isReturnOKStatement = (statement: TReturnStatement): boolean => {
  return !isReturnErrorStatement(statement);
};

const isReturnErrorStatement = (statement: TReturnStatement): boolean => {
  const returnEvaluation = (statement.return.expression as TEvaluation).evaluation;

  if (isErrorEvaluation(returnEvaluation)) {
    return true;
  }
  return false;
};

const modifyReturnOkErrorStatement = (statement: TStatement, returnType: TOkErrorReturnType) => {
  if (isReturnStatement(statement)) {
    const returnStatement = statement as TReturnStatement;
    if (isReturnOkErrorType(returnType)) {
      if (isReturnOKStatement(returnStatement)) {
        statement = {
          returnOK: returnStatement.return,
        };
      } else if (isReturnErrorStatement(returnStatement)) {
        statement = {
          returnError: returnStatement.return,
        };
      }
    }
  }
  return statement;
};

export const modifyReturnOkErrorStatements = (statements: TStatements, returnType: TOkErrorReturnType) => {
  const newStatements = statements.map((statement) => {
    // TODO this has to be called recursively (if inside an if etc)
    if (isIfStatement(statement)) {
      const { thenStatements, elseStatements } = statement.ifStatement;

      for (let i = 0; i < thenStatements.length; i += 1) {
        thenStatements[i] = modifyReturnOkErrorStatement(thenStatements[i], returnType);
      }
      if (elseStatements && elseStatements.length > 0) {
        for (let i = 0; i < elseStatements.length; i += 1) {
          elseStatements[i] = modifyReturnOkErrorStatement(elseStatements[i], returnType);
        }
      }
    }
    return modifyReturnOkErrorStatement(statement, returnType);
  });
  return newStatements;
};
