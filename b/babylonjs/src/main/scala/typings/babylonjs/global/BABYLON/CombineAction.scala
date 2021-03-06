package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CombineAction")
@js.native
class CombineAction protected ()
  extends typings.babylonjs.BABYLON.CombineAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param children defines the list of aggregated animations to run
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, children: js.Array[typings.babylonjs.BABYLON.Action]) = this()
  def this(
    triggerOptions: js.Any,
    children: js.Array[typings.babylonjs.BABYLON.Action],
    condition: typings.babylonjs.BABYLON.Condition
  ) = this()
}

