package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.getModelMarkers")
@js.native
object getModelMarkers extends js.Object {
  def apply(filter: Owner): js.Array[IMarker] = js.native
}

