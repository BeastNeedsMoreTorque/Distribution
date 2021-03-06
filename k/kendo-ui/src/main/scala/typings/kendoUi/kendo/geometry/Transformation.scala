package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformation extends Observable {
  var options: TransformationOptions = js.native
  def equals(other: Transformation): Boolean = js.native
  def matrix(): Matrix = js.native
  def multiply(transformation: Transformation): Transformation = js.native
  def rotate(angle: Double, center: js.Any): Transformation = js.native
  def rotate(angle: Double, center: Point): Transformation = js.native
  def scale(scaleX: Double, scaleY: Double): Transformation = js.native
  def translate(x: Double, y: Double): Transformation = js.native
}

