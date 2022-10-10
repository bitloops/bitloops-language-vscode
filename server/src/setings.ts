import { Connection } from 'vscode-languageserver';

interface BitloopsSettings {
  maxNumberOfProblems: number;
}

// The global settings, used when the `workspace/configuration` request is not supported by the client.
// Please note that this is not the case when using this server with the client provided in this example
// but could happen with other clients.
const defaultSettings: BitloopsSettings = { maxNumberOfProblems: 1000 };
let globalSettings: BitloopsSettings = defaultSettings;
// Cache the settings of all open documents
const documentSettings: Map<string, Thenable<BitloopsSettings>> = new Map();
export function getDocumentSettings(
  resource: string,
  hasConfigurationCapability: boolean,
  connection: Connection,
): Thenable<BitloopsSettings> {
  if (!hasConfigurationCapability) {
    return Promise.resolve(globalSettings);
  }
  let result = documentSettings.get(resource);
  if (!result) {
    result = connection.workspace.getConfiguration({
      scopeUri: resource,
      section: 'BitloopsServer',
    });
    documentSettings.set(resource, result);
  }
  return result;
}
export function onDidClose(e: any) {
  documentSettings.delete(e.document.uri);
}
