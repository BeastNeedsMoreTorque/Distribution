package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Dual/index", JSImport.Namespace)
@js.native
object dualIndexMod extends js.Object {
  @js.native
  class FogBlock protected ()
    extends typings.babylonjs.fogBlockMod.FogBlock {
    /**
      * Create a new FogBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  
  @js.native
  class LightBlock protected ()
    extends typings.babylonjs.lightBlockMod.LightBlock {
    /**
      * Create a new LightBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  
  @js.native
  class ReflectionTextureBlock protected ()
    extends typings.babylonjs.reflectionTextureBlockMod.ReflectionTextureBlock {
    /**
      * Create a new TextureBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  
  @js.native
  class TextureBlock protected ()
    extends typings.babylonjs.textureBlockMod.TextureBlock {
    /**
      * Create a new TextureBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
  }
  
}

