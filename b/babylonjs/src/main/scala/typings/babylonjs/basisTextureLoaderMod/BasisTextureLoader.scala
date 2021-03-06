package typings.babylonjs.basisTextureLoaderMod

import typings.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/Loaders/basisTextureLoader", "_BasisTextureLoader")
@js.native
class BasisTextureLoader () extends IInternalTextureLoader {
  /**
    * Uploads the 2D texture data to the WebGL texture. It has already been bound once in the callback.
    * @param data contains the texture data
    * @param texture defines the BabylonJS internal texture
    * @param callback defines the method to call once ready to upload
    */
  def loadData(
    data: ArrayBufferView,
    texture: InternalTexture,
    callback: js.Function5[
      /* width */ Double, 
      /* height */ Double, 
      /* loadMipmap */ Boolean, 
      /* isCompressed */ Boolean, 
      /* done */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
}

