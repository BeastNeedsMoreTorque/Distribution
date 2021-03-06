package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Surface extends Observable {
  var element: JQuery = js.native
  var options: SurfaceOptions = js.native
  def clear(): Unit = js.native
  def draw(element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  def eventTarget(e: js.Any): typings.kendoUi.kendo.drawing.Element = js.native
  def hideTooltip(): Unit = js.native
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  def showTooltip(element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  def showTooltip(element: typings.kendoUi.kendo.drawing.Element, options: js.Any): Unit = js.native
}

