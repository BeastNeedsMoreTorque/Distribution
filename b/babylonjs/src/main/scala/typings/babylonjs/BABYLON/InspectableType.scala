package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InspectableType extends js.Object

@JSGlobal("BABYLON.InspectableType")
@js.native
object InspectableType extends js.Object {
  /**
    * Checkbox for booleans
    */
  @js.native
  sealed trait Checkbox extends InspectableType
  
  /**
    * Color3
    */
  @js.native
  sealed trait Color3 extends InspectableType
  
  /**
    * Quaternions
    */
  @js.native
  sealed trait Quaternion extends InspectableType
  
  /**
    * Sliders for numbers
    */
  @js.native
  sealed trait Slider extends InspectableType
  
  /**
    * String
    */
  @js.native
  sealed trait String extends InspectableType
  
  /**
    * Vector3
    */
  @js.native
  sealed trait Vector3 extends InspectableType
  
}

