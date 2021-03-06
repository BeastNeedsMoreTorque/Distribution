package typings.pixiJs.mod

import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Simple Mesh class mimics Mesh in PixiJS v4, providing easy-to-use constructor arguments.
  * For more robust customization, use {@link PIXI.Mesh}.
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  */
@JSImport("pixi.js", "SimpleMesh")
@js.native
class SimpleMesh ()
  extends typings.pixiJs.PIXI.SimpleMesh {
  def this(texture: typings.pixiJs.PIXI.Texture) = this()
  def this(texture: typings.pixiJs.PIXI.Texture, vertices: Float32Array) = this()
  def this(texture: typings.pixiJs.PIXI.Texture, vertices: Float32Array, uvs: Float32Array) = this()
  def this(
    texture: typings.pixiJs.PIXI.Texture,
    vertices: Float32Array,
    uvs: Float32Array,
    indices: Uint16Array
  ) = this()
  def this(
    texture: typings.pixiJs.PIXI.Texture,
    vertices: Float32Array,
    uvs: Float32Array,
    indices: Uint16Array,
    drawMode: Double
  ) = this()
}

