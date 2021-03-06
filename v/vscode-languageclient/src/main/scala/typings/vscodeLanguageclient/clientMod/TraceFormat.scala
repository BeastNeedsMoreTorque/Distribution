package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TraceFormat")
@js.native
object TraceFormat extends js.Object {
  /* "json" */ val JSON: typings.vscodeJsonrpc.mod.TraceFormat.JSON with String = js.native
  /* "text" */ val Text: typings.vscodeJsonrpc.mod.TraceFormat.Text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.vscodeJsonrpc.mod.TraceFormat with String] = js.native
  def fromString(value: String): typings.vscodeJsonrpc.mod.TraceFormat = js.native
}

