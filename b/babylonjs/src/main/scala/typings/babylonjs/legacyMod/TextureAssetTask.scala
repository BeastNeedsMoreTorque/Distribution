package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "TextureAssetTask")
@js.native
class TextureAssetTask protected ()
  extends typings.babylonjs.indexMod.TextureAssetTask {
  /**
    * Creates a new TextureAssetTask object
    * @param name defines the name of the task
    * @param url defines the location of the file to load
    * @param noMipmap defines if mipmap should not be generated (default is false)
    * @param invertY defines if texture must be inverted on Y axis (default is false)
    * @param samplingMode defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  invertY: Boolean
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String,
    /**
    * Defines if mipmap should not be generated (default is false)
    */
  noMipmap: Boolean,
    /**
    * Defines if texture must be inverted on Y axis (default is false)
    */
  invertY: Boolean,
    /**
    * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    */
  samplingMode: Double
  ) = this()
}

