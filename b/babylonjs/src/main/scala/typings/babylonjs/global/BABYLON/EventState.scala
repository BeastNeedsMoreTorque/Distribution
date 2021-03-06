package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EventState")
@js.native
class EventState protected ()
  extends typings.babylonjs.BABYLON.EventState {
  /**
    * Create a new EventState
    * @param mask defines the mask associated with this state
    * @param skipNextObservers defines a flag which will instruct the observable to skip following observers when set to true
    * @param target defines the original target of the state
    * @param currentTarget defines the current target of the state
    */
  def this(mask: Double) = this()
  def this(mask: Double, skipNextObservers: Boolean) = this()
  def this(mask: Double, skipNextObservers: Boolean, target: js.Any) = this()
  def this(mask: Double, skipNextObservers: Boolean, target: js.Any, currentTarget: js.Any) = this()
}

