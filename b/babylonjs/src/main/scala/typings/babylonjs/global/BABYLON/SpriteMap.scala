package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISpriteJSONAtlas
import typings.babylonjs.BABYLON.ISpriteMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SpriteMap")
@js.native
class SpriteMap protected ()
  extends typings.babylonjs.BABYLON.SpriteMap {
  /**
    * Creates a new SpriteMap
    * @param name defines the SpriteMaps Name
    * @param atlasJSON is the JSON file that controls the Sprites Frames and Meta
    * @param spriteSheet is the Texture that the Sprites are on.
    * @param options a basic deployment configuration
    * @param scene The Scene that the map is deployed on
    */
  def this(
    name: String,
    atlasJSON: ISpriteJSONAtlas,
    spriteSheet: typings.babylonjs.BABYLON.Texture,
    options: ISpriteMapOptions,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  /**
    * The JSON Array file from a https://www.codeandweb.com/texturepacker export.  Or similar structure.
    */
  /* CompleteClass */
  override var atlasJSON: ISpriteJSONAtlas = js.native
  /**
    * String name of the SpriteMap.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * The parameters to initialize the SpriteMap with.
    */
  /* CompleteClass */
  override var options: ISpriteMapOptions = js.native
  /**
    * Texture of the SpriteMap.
    */
  /* CompleteClass */
  override var spriteSheet: typings.babylonjs.BABYLON.Texture = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

