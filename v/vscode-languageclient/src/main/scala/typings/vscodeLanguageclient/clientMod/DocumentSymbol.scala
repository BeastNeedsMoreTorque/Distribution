package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentSymbol")
@js.native
object DocumentSymbol extends js.Object {
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param detail The detail of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the symbol.
    * @param selectionRange The selectionRange of the symbol.
    * @param children Children of the symbol.
    */
  def create(
    name: String,
    detail: js.UndefOr[String],
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typings.vscodeLanguageserverTypes.mod.Range
  ): typings.vscodeLanguageserverTypes.mod.DocumentSymbol = js.native
  def create(
    name: String,
    detail: js.UndefOr[String],
    kind: typings.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typings.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typings.vscodeLanguageserverTypes.mod.Range,
    children: js.Array[typings.vscodeLanguageserverTypes.mod.DocumentSymbol]
  ): typings.vscodeLanguageserverTypes.mod.DocumentSymbol = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentSymbol](#DocumentSymbol) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean = js.native
}

