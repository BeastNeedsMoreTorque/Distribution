package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends Observable {
  var connectors: js.Any = js.native
  var dataItem: js.Any = js.native
  var options: ShapeOptions = js.native
  var shapeVisual: js.Any = js.native
  var visual: Group = js.native
  def connections(`type`: String): Unit = js.native
  def getConnector(): Unit = js.native
  def getPosition(side: String): Unit = js.native
  def position(): Unit = js.native
  def position(point: Point): Unit = js.native
  def redraw(options: js.Any): Unit = js.native
  def redrawVisual(): Unit = js.native
  def select(value: Boolean): Unit = js.native
}

