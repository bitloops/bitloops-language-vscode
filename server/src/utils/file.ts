export class FileUtils {
  // TODO check how this works on windows
  static pathToDocumentUri(path: string): string {
    return `file://${path}`;
  }
}
