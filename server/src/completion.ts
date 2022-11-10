import { CompletionItem, CompletionItemKind, TextDocumentPositionParams } from 'vscode-languageserver/node.js';
import { documentation } from './information/documentation.js';
import { details } from './information/details.js';
import { components } from './types/keywords.js';

export class BitloopsCompletionItemProvider {
  // constructor(connection: Connection) {
  //   super();
  // }
  public static onCompletion(_textDocumentPosition: TextDocumentPositionParams) {
    const keywords = BitloopsCompletionItemProvider.completeKeyword();
    return keywords;
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

  private static completeKeyword(): CompletionItem[] {
    const keywordsList = Object.keys(components);
    return keywordsList.map((symbol) => {
      return {
        label: symbol,
        kind: CompletionItemKind.Keyword,
        data: 1,
      };
    });
  }
}
