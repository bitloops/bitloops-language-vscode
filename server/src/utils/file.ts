export class FileUtils {
  // TODO check how this works on windows
  static pathToDocumentUri(path: string): string {
    const fileScheme = 'file://';
    if (path.startsWith(fileScheme)) {
      return path;
    }
    return `${fileScheme}${path}`;
  }
}
