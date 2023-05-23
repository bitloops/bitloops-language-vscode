import { LspConnection } from './lsp/connection.js';

new LspConnection().registerLspEvents().listen();
