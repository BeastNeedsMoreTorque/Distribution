package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies whether to select (highlight) the location to navigate to (when using the {@link Office.Document | Document}.goToByIdAsync method).
  */
@JSGlobal("Office.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  /* 0 */ val Default: typings.officeJs.Office.SelectionMode.Default with Double = js.native
  /* 2 */ val None: typings.officeJs.Office.SelectionMode.None with Double = js.native
  /* 1 */ val Selected: typings.officeJs.Office.SelectionMode.Selected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.SelectionMode with Double] = js.native
}

