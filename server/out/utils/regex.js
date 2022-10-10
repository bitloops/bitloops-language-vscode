"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getMatchRange = exports.negateRegex = void 0;
const negateRegex = (re) => {
    return new RegExp(`^(?!${re.source})`, 'g');
};
exports.negateRegex = negateRegex;
const getMatchRange = (document, match) => {
    const matchStart = match.index;
    const matchEnd = matchStart + match[0].length;
    return { start: document.positionAt(matchStart), end: document.positionAt(matchEnd) };
};
exports.getMatchRange = getMatchRange;
//# sourceMappingURL=regex.js.map