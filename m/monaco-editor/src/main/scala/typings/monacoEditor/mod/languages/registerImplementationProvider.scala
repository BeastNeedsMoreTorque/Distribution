package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerImplementationProvider")
@js.native
object registerImplementationProvider extends js.Object {
  def apply(languageId: String, provider: ImplementationProvider): IDisposable = js.native
}

