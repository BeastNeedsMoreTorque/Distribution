package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "StereoscopicGamepadCamera")
@js.native
class StereoscopicGamepadCamera protected ()
  extends typings.babylonjs.babylonjsMod.StereoscopicGamepadCamera {
  /**
    * Creates a new StereoscopicGamepadCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}

