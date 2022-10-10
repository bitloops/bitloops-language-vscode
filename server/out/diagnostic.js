"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DiagnosticFactory = void 0;
class DiagnosticFactory {
    static create(severity, range, message, addRelatedInformation) {
        message = this.prefixMessage(message, severity);
        const diagnostic = {
            severity: severity,
            range: range,
            message: message,
            source: 'ex',
        };
        if (addRelatedInformation) {
            diagnostic.relatedInformation = [];
            for (const related of addRelatedInformation) {
                diagnostic.relatedInformation.push({
                    location: {
                        // TODO? add TextDocument uri?
                        uri: '',
                        range: range,
                    },
                    message: related,
                });
            }
        }
        return diagnostic;
    }
    static prefixMessage(message, severity) {
        switch (severity) {
            case 1:
                return `Error: ${message}`;
            case 2:
                return `Warning: ${message}`;
            case 3:
                return `Information: ${message}`;
            case 4:
                return `Hint: ${message}`;
            default:
                return message;
        }
    }
}
exports.DiagnosticFactory = DiagnosticFactory;
//# sourceMappingURL=diagnostic.js.map