package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Location")
@js.native
object Location extends js.Object {
  /**
    * Creates a Location literal.
    * @param uri The location's uri.
    * @param range The location's range.
    */
  def create(uri: DocumentUri, range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.Location = js.native
  /**
    * Checks whether the given literal conforms to the [Location](#Location) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Location */ Boolean = js.native
}

