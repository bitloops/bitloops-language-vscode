/**
 *  Bitloops Language
 *  Copyright (C) 2022 Bitloops S.A.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 *  For further information you can contact legal(at)bitloops.com.
 */

// We use FileUri as file identifier, it's different from the file path
export type TFileId = string;

type TFileContents = string;

export type TParserCoreInputData = {
  boundedContext: TBoundedContextName;
  module: TModuleName;
  fileId: TFileId;
  fileContents: TFileContents;
};

export type TParserSetupInputData = {
  fileId: TFileId;
  fileContents: TFileContents;
};

export type TModuleName = string;

export type TBoundedContextName = string;
