package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RuntimeAnimation")
@js.native
class RuntimeAnimation protected ()
  extends typings.babylonjs.BABYLON.RuntimeAnimation {
  /**
    * Create a new RuntimeAnimation object
    * @param target defines the target of the animation
    * @param animation defines the source animation object
    * @param scene defines the hosting scene
    * @param host defines the initiating Animatable
    */
  def this(
    target: js.Any,
    animation: typings.babylonjs.BABYLON.Animation,
    scene: typings.babylonjs.BABYLON.Scene,
    host: typings.babylonjs.BABYLON.Animatable
  ) = this()
}

