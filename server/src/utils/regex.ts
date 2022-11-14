import { TextDocument } from 'vscode-languageserver-textdocument';
import { Range } from 'vscode-languageserver/node.js';

export const negateRegex = (re: RegExp): RegExp => {
  return new RegExp(`^(?!${re.source})`, 'g');
};
export const getMatchRange = (document: TextDocument, match: RegExpExecArray): Range => {
  const matchStart = match.index;
  const matchEnd = matchStart + match[0].length;
  return { start: document.positionAt(matchStart), end: document.positionAt(matchEnd) };
};
