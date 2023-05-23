# bitloops-language README

This is the README for the "bitloops-language" extension.

## Features

This extension allows for color coding of the Bitloops language syntax. You can learn more about the Bitloops language at https://bitloops.org

## Requirements

There are no additional requirements

## Extension Settings

The Bitloops Language extension adds any VS Code settings through the `contributes.configuration` extension point.

This extension contributes the following settings:

- `bitloops.enable`: Enable/disable this extension.

## Running the application

- Run `yarn` in this folder. This installs all necessary yarn modules in both the client and server folder
- Open VS Code on this folder.
- Press `Ctrl+Shift+B` to start compiling the client and server in [watch mode](https://code.visualstudio.com/docs/editor/tasks#:~:text=The%20first%20entry%20executes,the%20HelloWorld.js%20file.).
- Switch to the Run and Debug View in the Sidebar (Ctrl+Shift+D).
- Select `Launch Client` from the drop down (if it is not already).
- Press ▷ to run the launch config (F5).

## Known Issues

No known issues.

## What's New

### 0.3.3

Refactored state manager, added rebounce, updated transpiler & validator, added restart command

---

**Enjoy!**
