import {
  CompletionItem,
  CompletionItemKind,
  InsertTextFormat,
  InsertTextMode,
  TextDocumentPositionParams,
  TextDocuments,
} from 'vscode-languageserver/node.js';
import { documentation } from './information/documentation.js';
import { details } from './information/details.js';
import { allKeywords, components, keywords } from './types/keywords.js';
import { TextDocument } from 'vscode-languageserver-textdocument';

//this would come from package
const StandardVOCompletion = {
  prefixes: ['StandardVO', 'StandardVO.Currency'],
  completions: {
    StandardVO: ['Currency'],
    'StandardVO.Currency': ['Value', 'Errors'],
  },
};

export class CompletionItemProvider {
  public static onCompletion(
    documents: TextDocuments<TextDocument>,
    _textDocumentPosition: TextDocumentPositionParams,
  ) {
    const document = documents.get(_textDocumentPosition.textDocument.uri);
    let text = documents.get(_textDocumentPosition.textDocument.uri).getText();
    let position = _textDocumentPosition.position;
    const offset = document.offsetAt(position);
    for (const prefix of StandardVOCompletion.prefixes) {
      const linePrefix = text.slice(offset - prefix.length - 1, offset);
      if (linePrefix.endsWith(prefix + '.')) {
        return [
          ...StandardVOCompletion.completions[prefix].map((symbol) => ({
            label: symbol,
            kind: CompletionItemKind.Keyword,
            data: 2,
            //we could check for snippets too
          })),
        ];
      }
    }
    return [
      ...allKeywords.map((symbol) => ({
        label: symbol,
        kind: CompletionItemKind.Keyword,
        data: 1,
      })),
    ];
  }

  public static onCompletionResolve(item: CompletionItem): CompletionItem {
    if (item.data == 1) {
      if (documentation[item.label as keyof typeof documentation]) {
        item.documentation = documentation[item.label as keyof typeof documentation];
      }
      if (details[item.label as keyof typeof details]) {
        item.detail = details[item.label as keyof typeof details];
      }
    }
    return item;
  }
}
