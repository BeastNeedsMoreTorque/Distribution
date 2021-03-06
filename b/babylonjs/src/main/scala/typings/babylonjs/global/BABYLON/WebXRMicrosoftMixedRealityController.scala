package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMinimalMotionControllerObject
import typings.babylonjs.BABYLON.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRMicrosoftMixedRealityController")
@js.native
class WebXRMicrosoftMixedRealityController protected ()
  extends typings.babylonjs.BABYLON.WebXRMicrosoftMixedRealityController {
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.WebXRMicrosoftMixedRealityController")
@js.native
object WebXRMicrosoftMixedRealityController extends js.Object {
  /**
    * The base url used to load the left and right controller models
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * The name of the left controller model file
    */
  var MODEL_LEFT_FILENAME: String = js.native
  /**
    * The name of the right controller model file
    */
  var MODEL_RIGHT_FILENAME: String = js.native
}

