import {
  CompletionItem,
  CompletionItemKind,
  Connection,
  TextDocumentPositionParams,
} from 'vscode-languageserver/node';
import { BitloopsServer } from './server';
import { documentation } from './information/documentation';
import { details } from './information/details';
import { components } from './types/keywords';

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
