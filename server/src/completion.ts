import {
  CompletionItem,
  CompletionItemKind,
  TextDocumentPositionParams,
} from 'vscode-languageserver/node.js';
import { documentation } from './information/documentation.js';
import { details } from './information/details.js';
import { allKeywords, components, keywords } from './types/keywords.js';

export class CompletionItemProvider {
  public static onCompletion(_textDocumentPosition: TextDocumentPositionParams) {
    return allKeywords.map((symbol) => ({
      label: symbol,
      kind: CompletionItemKind.Keyword,
      data: 1,
    }));
  }

  public static onCompletionResolve(item: CompletionItem): CompletionItem {
    const label: string = item.label;
    if (documentation[item.label as keyof typeof documentation]) {
      item.documentation = documentation[item.label as keyof typeof documentation];
    }
    if (details[item.label as keyof typeof details]) {
      item.detail = details[item.label as keyof typeof details];
    }

    return item;
  }
}
