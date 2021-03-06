package typings.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Visibility mode of the add-in.
  */
@JSGlobal("Office.VisibilityMode")
@js.native
object VisibilityMode extends js.Object {
  /* "Hidden" */ val hidden: typings.officeJsPreview.Office.VisibilityMode.hidden with String = js.native
  /* "Taskpane" */ val taskpane: typings.officeJsPreview.Office.VisibilityMode.taskpane with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.VisibilityMode with String] = js.native
}

