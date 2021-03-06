package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.RenameFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "RenameFile")
@js.native
object RenameFile extends js.Object {
  def create(oldUri: DocumentUri, newUri: DocumentUri): typings.vscodeLanguageserverTypes.mod.RenameFile = js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): typings.vscodeLanguageserverTypes.mod.RenameFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}

