package typings.babylonjs.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/index", "CameraInputsManager")
@js.native
class CameraInputsManager[TCamera /* <: typings.babylonjs.cameraMod.Camera */] protected ()
  extends typings.babylonjs.cameraInputsManagerMod.CameraInputsManager[TCamera] {
  /**
    * Instantiate a new Camera Input Manager.
    * @param camera Defines the camera the input manager blongs to
    */
  def this(camera: TCamera) = this()
}

