package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "AnaglyphFreeCamera")
@js.native
class AnaglyphFreeCamera protected ()
  extends typings.babylonjs.babylonjsMod.AnaglyphFreeCamera {
  /**
    * Creates a new AnaglyphFreeCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    interaxialDistance: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}

