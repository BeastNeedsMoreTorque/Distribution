package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerCodeLensProvider")
@js.native
object registerCodeLensProvider extends js.Object {
  def apply(languageId: String, provider: CodeLensProvider): IDisposable = js.native
}

