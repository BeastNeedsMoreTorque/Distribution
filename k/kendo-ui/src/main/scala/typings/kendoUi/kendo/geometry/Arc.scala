package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc extends Observable {
  var anticlockwise: Boolean = js.native
  var center: Point = js.native
  var endAngle: Double = js.native
  var options: ArcOptions = js.native
  var radiusX: Double = js.native
  var radiusY: Double = js.native
  var startAngle: Double = js.native
  def bbox(matrix: Matrix): Rect = js.native
  def getAnticlockwise(): Boolean = js.native
  def getCenter(): Point = js.native
  def getEndAngle(): Double = js.native
  def getRadiusX(): Double = js.native
  def getRadiusY(): Double = js.native
  def getStartAngle(): Double = js.native
  def pointAt(angle: Double): Point = js.native
  def setAnticlockwise(value: Boolean): Arc = js.native
  def setCenter(value: Point): Arc = js.native
  def setEndAngle(value: Double): Arc = js.native
  def setRadiusX(value: Double): Arc = js.native
  def setRadiusY(value: Double): Arc = js.native
  def setStartAngle(value: Double): Arc = js.native
}

