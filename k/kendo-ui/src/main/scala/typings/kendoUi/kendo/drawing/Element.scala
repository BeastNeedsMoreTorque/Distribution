package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.Class
import typings.kendoUi.kendo.geometry.Point
import typings.kendoUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends Class {
  var options: ElementOptions = js.native
  var parent: Group = js.native
  def bbox(): typings.kendoUi.kendo.geometry.Rect = js.native
  def clip(): Path = js.native
  def clip(clip: Path): Unit = js.native
  def clippedBBox(): typings.kendoUi.kendo.geometry.Rect = js.native
  def containsPoint(point: Point): Boolean = js.native
  def opacity(): Double = js.native
  def opacity(opacity: Double): Unit = js.native
  def transform(): Transformation = js.native
  def transform(transform: Transformation): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

