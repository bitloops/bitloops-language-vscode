# Welcome to your VS Code Extension

## What's in the folder

- This folder contains all of the files necessary for your extension.
- `package.json` - this is the manifest file in which you declare your language support and define the location of the grammar file that has been copied into your extension.
- `syntaxes/bitloops.tmLanguage.json` - this is the Text mate grammar file that is used for tokenization.
- `language-configuration.json` - this is the language configuration, defining the tokens that are used for comments and brackets.

The project has a monorepo structure with separate "client" and "server" projects, and the root project serves as the entry point for the VS Code extension. This means that the root project depends on the "client" and "server" projects, and they will be built before the root project. (references in tsconfig)  
By default, when you run `yarn` in the root project, it will execute the installation process recursively for all the projects referenced in the tsconfig.json file's "references" section.  
When you run `tsc -b` in the root project, it will recursively build all the referenced projects defined in the root tsconfig.json file. This means that it will compile the TypeScript files in the root project as well as the "client" and "server" projects, and any other projects referenced in the tsconfig.json files of the referenced projects.

## Get up and running straight away

- `yarn`
- `yarn compile`
- Make sure the language configuration settings in `language-configuration.json` are accurate.
- Press `F5` to open a new window with your extension loaded.
- Create a new file with a file name suffix matching your language.
- Verify that syntax highlighting works and that the language configuration settings are working.

## Make changes

- You can start the watch task with Cmd+B
- You can launch the extension from the debug toolbar after making changes to the files listed above. (Client + Server)
- You can also reload (`Ctrl+R` or `Cmd+R` on Mac) the VS Code window with your extension to load your changes.
- For debugging the best is to first start `Launch Client`, and then `Attach to Server`. See [docs](https://code.visualstudio.com/api/language-extensions/language-server-extension-guide#debugging-both-client-and-server)

## Add more language features

- To add features such as IntelliSense, hovers and validators check out the VS Code extenders documentation at https://code.visualstudio.com/docs

## Install your extension

- To start using your extension with Visual Studio Code copy it into the `<user home>/.vscode/extensions` folder and restart Code.
- To share your extension with the world, read on https://code.visualstudio.com/docs about publishing an extension.
