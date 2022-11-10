export const bitloopsPrimitives = {
  string: 'string',
  bool: 'bool',
  double: 'double',
  float: 'float',
  int32: 'int32',
  int64: 'int64',
  uint32: 'uint32',
  uint64: 'uint64',
  sint32: 'sint32',
  sint64: 'sint64',
  fixed32: 'fixed32',
  fixed64: 'fixed64',
  sfixed32: 'sfixed32',
  sfixed64: 'sfixed64',
  bytes: 'bytes',
  regex: 'regex',
  void: 'void',
};
import { returnOKKey, TOkErrorReturnType, TStatements } from '../../../types.js';

const returnOkVoidStatement = {
  returnOK: { expression: { evaluation: { regularEvaluation: { type: 'void', value: '' } } } },
};

export const addReturnOkVoidStatement = (statements: TStatements, returnType: TOkErrorReturnType) => {
  if (returnType.ok === bitloopsPrimitives.void) {
    const lastStatement = statements[statements.length - 1];
    if (lastStatement) {
      const lastStatementKey = Object.keys(lastStatement)[0];
      if (lastStatementKey !== returnOKKey) {
        statements.push(returnOkVoidStatement);
      }
    } else {
      statements.push(returnOkVoidStatement);
    }
  }
};
