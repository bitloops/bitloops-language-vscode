import { Connection, TextDocumentChangeEvent } from 'vscode-languageserver';
import { TextDocument } from 'vscode-languageserver-textdocument';

export interface BitloopsSettings {
  maxNumberOfProblems: number;
}

export class WorkspaceSettingsManager {
  private globalSettings: BitloopsSettings = { maxNumberOfProblems: 1000 };
  // Cache the settings of all open documents
  private documentSettings: Map<string, Thenable<BitloopsSettings>> = new Map();

  public getDocumentSettings(
    resource: string,
    hasConfigurationCapability: boolean,
    connection: Connection,
  ): Thenable<BitloopsSettings> {
    if (!hasConfigurationCapability) {
      return Promise.resolve(this.globalSettings);
    }
    let result = this.documentSettings.get(resource);
    if (!result) {
      result = connection.workspace.getConfiguration({
        scopeUri: resource,
        section: 'BitloopsServer',
      });
      this.documentSettings.set(resource, result);
    }
    return result;
  }

  public clear(e: TextDocumentChangeEvent<TextDocument>) {
    this.documentSettings.delete(e.document.uri);
  }
}
