package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "RefractionTexture")
@js.native
class RefractionTexture protected ()
  extends typings.babylonjs.materialsIndexMod.RefractionTexture {
  /**
    * Creates a refraction texture used by refraction channel of the standard material.
    * It is like a mirror but to see through a material.
    * @see https://doc.babylonjs.com/how_to/reflect#refraction
    * @param name Define the texture name
    * @param size Define the size of the underlying texture
    * @param scene Define the scene the refraction belongs to
    * @param generateMipMaps Define if we need to generate mips level for the refraction
    */
  def this(name: String, size: Double, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, size: Double, scene: typings.babylonjs.sceneMod.Scene, generateMipMaps: Boolean) = this()
}

