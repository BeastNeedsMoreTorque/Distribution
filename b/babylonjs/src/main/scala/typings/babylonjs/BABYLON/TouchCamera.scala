package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchCamera extends FreeCamera {
  /**
    * Defines the touch sensibility for rotation.
    * The higher the faster.
    */
  def touchAngularSensibility: Double = js.native
  def touchAngularSensibility(value: Double): js.Any = js.native
  /**
    * Defines the touch sensibility for move.
    * The higher the faster.
    */
  def touchMoveSensibility: Double = js.native
  def touchMoveSensibility(value: Double): js.Any = js.native
}

