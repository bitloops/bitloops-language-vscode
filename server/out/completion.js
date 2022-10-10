"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BitloopsCompletionItemProvider = void 0;
const node_1 = require("vscode-languageserver/node");
const documentation_1 = require("./information/documentation");
const details_1 = require("./information/details");
const keywords_1 = require("./types/keywords");
class BitloopsCompletionItemProvider {
    // constructor(connection: Connection) {
    //   super();
    // }
    static onCompletion(_textDocumentPosition) {
        const keywords = BitloopsCompletionItemProvider.completeKeyword();
        return keywords;
    }
    static onCompletionResolve(item) {
        const label = item.label;
        if (documentation_1.documentation[item.label]) {
            item.documentation = documentation_1.documentation[item.label];
        }
        if (details_1.details[item.label]) {
            item.detail = details_1.details[item.label];
        }
        return item;
    }
    static completeKeyword() {
        const keywordsList = Object.keys(keywords_1.components);
        return keywordsList.map((symbol) => {
            return {
                label: symbol,
                kind: node_1.CompletionItemKind.Keyword,
                data: 1,
            };
        });
    }
}
exports.BitloopsCompletionItemProvider = BitloopsCompletionItemProvider;
//# sourceMappingURL=completion.js.map