package typings.aceBuilds.mod.Ace

import typings.aceBuilds.anon.Mac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  var bindKey: js.UndefOr[String | Mac] = js.native
  var name: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  def exec(editor: Editor): Unit = js.native
  def exec(editor: Editor, args: js.Any): Unit = js.native
}

