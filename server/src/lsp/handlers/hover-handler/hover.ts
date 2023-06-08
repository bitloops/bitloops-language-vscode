import { Hover, HoverParams, Position, _Connection } from 'vscode-languageserver/node.js';
import { StateManager } from '../../services/StateManager.js';
import { TextDocument } from 'vscode-languageserver-textdocument';
import { IAnalyzer } from '../document-text-changed-handler/interface.js';
import { TSymbolTableSemantics } from '@bitloops/bl-transpiler';

export const handleHover = (
  stateManager: StateManager,
  analyzer: IAnalyzer,
  params: HoverParams,
): Hover | null => {
  const fileContent = stateManager.getFileContent(params.textDocument.uri);
  const document = TextDocument.create(params.textDocument.uri, 'bitloops', 1, fileContent);
  const position = params.position;
  const boundedContext = stateManager.getBoundedContext(params.textDocument.uri);
  if (boundedContext === 'unknown') return null; //if the bounded context is unknown, we don't want to have hover provider
  let word = findWord(document, position);
  const symbolTable = analyzer.getSymbolTable();
  if (!symbolTable) return null;
  const testSymbolTable = symbolTable.symbolTables[boundedContext];
  const typeOfKeyword = testSymbolTable?.findTypeOfKeyword(word, {
    line: position.line,
    column: position.character,
    fileId: params.textDocument.uri,
  });
  let { type, isConst } = typeOfKeyword || { type: null, isConst: null };
  if (type) {
    if (type === '') type = 'unknown'; //if the type is empty string, it means that the variable is unknown
    if (isConst) word = 'const ' + word; //add const keyword to the hover info if the word is a constant
    const hoverInfo: Hover = {
      contents: {
        kind: 'markdown',
        value: `${word}: ${type}`,
      },
    };

    const hoverResponse: Hover = hoverInfo;
    return hoverResponse;
  }
  return null;
};

const findWord = (document: TextDocument, position: Position): string => {
  const line = document.getText().split('\n')[position.line]; //get the current line
  let currentPosition = line.indexOf(line.trimStart()[0]); //get the position of the first non-whitespace character
  const wordRegExp = /\b[\w.]+\b\(?/g; //find all words, including those which contain dots or opening parentheses
  const matches = line.match(wordRegExp) || [];
  const allMatches = []; //this array will contain all the matches, including the words which contain dots incrementally
  //for example: if the word is this.accountRepo.getById(accountId).ifError(), the array will contain the following elements:
  //[this, this.accountRepo, this.accountRepo.getById(), accountId, this.accountRepo.getById().ifError()] in this order
  for (const match of matches) {
    try {
      if (match.includes('.')) {
        const separateMatches = match.split('.');
        let i = 1;
        allMatches.push(separateMatches[0]);
        while (i < separateMatches.length - 1) {
          allMatches.push(allMatches[allMatches.length - 1] + '.' + separateMatches[i]);
          i++;
        }
      }
      if (match === 'ifError(') allMatches.push(allMatches[allMatches.length - 2] + '.ifError()');
      //special case for ifError: we want to concatenate with the previous method called, but without the variable in the parenthesis
      else if (match.includes('(')) allMatches.push(match + ')');
      //for methods: we keep the opening parenthesis in the matched word so we can separate the method from the variable and then we add the closing parenthesis
      //because in the symbolTable it is stored as a method call, for example this.accountRepo.getById()
      else allMatches.push(match);
    } catch (e) {}
  }
  for (let i = 0; i < allMatches.length; i++) {
    try {
      let myLength = allMatches[i].length;
      if (allMatches[i].includes('.')) {
        myLength -= allMatches[i - 1].length;
      } //if the word contains a dot, we subtract the length of the previous word from the length of the current word, as we keep the dot member in the previous word
      if (
        currentPosition + myLength >= position.character &&
        currentPosition <= position.character
      ) {
        return allMatches[i];
      } else {
        currentPosition += myLength + 1;
      }
    } catch (e) {}
  }
  return undefined;
};
