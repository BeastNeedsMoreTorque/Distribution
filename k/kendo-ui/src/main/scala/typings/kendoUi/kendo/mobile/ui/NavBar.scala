package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavBar
  extends typings.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_NavBar: NavBarOptions = js.native
  var wrapper: JQuery = js.native
  def title(value: String): Unit = js.native
}

