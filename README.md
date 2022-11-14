# bitloops-language README

This is the README for the "bitloops-language" extension.

## Features

This extension allows for color coding of the Bitloops language syntax. You can learn more about the Bitloops language at https://bitloops.org

## Requirements

There are no additional requirements

## Extension Settings

The Bitloops Language extension adds any VS Code settings through the `contributes.configuration` extension point.

This extension contributes the following settings:

* `bitloops.enable`: Enable/disable this extension.

## Running the application

- Run `yarn` in this folder. This installs all necessary yarn modules in both the client and server folder
- Open VS Code on this folder.
- Press `Ctrl+Shift+B` to start compiling the client and server in [watch mode](https://code.visualstudio.com/docs/editor/tasks#:~:text=The%20first%20entry%20executes,the%20HelloWorld.js%20file.).
- Switch to the Run and Debug View in the Sidebar (Ctrl+Shift+D).
- Select `Launch Client` from the drop down (if it is not already).
- Press ▷ to run the launch config (F5).

## Known Issues

No known issues.

## Release Notes

### 0.0.9

Fixed issue #5 causing comments not to display properly

### 0.0.8

Added missing language elements and relational operators

### 0.0.7

New logos and much greater syntax coverage

### 0.0.6

This version should not be used as it contains errors

### 0.0.5

Added additional grammar elements (RESTRouter, env, new, DomainError, ApplicationError, Config)

### 0.0.4

Added additional grammar elements including most protobuf data types

### 0.0.3

Added files icon and added main grammar elements

### 0.0.2

Added icon

### 0.0.1

Initial release of the Bitloops language extension

---

**Enjoy!**
