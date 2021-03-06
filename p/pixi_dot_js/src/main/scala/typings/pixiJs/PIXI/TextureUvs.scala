package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores a texture's frame in UV coordinates, in
  * which everything lies in the rectangle `[(0,0), (1,0),
  * (1,1), (0,1)]`.
  *
  * | Corner       | Coordinates |
  * |--------------|-------------|
  * | Top-Left     | `(x0,y0)`   |
  * | Top-Right    | `(x1,y1)`   |
  * | Bottom-Right | `(x2,y2)`   |
  * | Bottom-Left  | `(x3,y3)`   |
  *
  * @class
  * @protected
  * @memberof PIXI
  */
trait TextureUvs extends js.Object {
  /**
    * X-component of top-left corner `(x0,y0)`.
    *
    * @member {number} PIXI.TextureUvs#x0
    */
  var x0: Double
  /**
    * X-component of top-right corner `(x1,y1)`.
    *
    * @member {number} PIXI.TextureUvs#x1
    */
  var x1: Double
  /**
    * X-component of bottom-right corner `(x2,y2)`.
    *
    * @member {number} PIXI.TextureUvs#x2
    */
  var x2: Double
  /**
    * X-component of bottom-left corner `(x3,y3)`.
    *
    * @member {number} PIXI.TextureUvs#x3
    */
  var x3: Double
  /**
    * Y-component of top-left corner `(x0,y0)`.
    *
    * @member {number} PIXI.TextureUvs#y0
    */
  var y0: Double
  /**
    * Y-component of top-right corner `(x1,y1)`.
    *
    * @member {number} PIXI.TextureUvs#y1
    */
  var y1: Double
  /**
    * Y-component of bottom-right corner `(x2,y2)`.
    *
    * @member {number} PIXI.TextureUvs#y2
    */
  var y2: Double
  /**
    * Y-component of bottom-right corner `(x3,y3)`.
    *
    * @member {number} PIXI.TextureUvs#y3
    */
  var y3: Double
  /**
    * Sets the texture Uvs based on the given frame information.
    *
    * @protected
    * @param {PIXI.Rectangle} frame - The frame of the texture
    * @param {PIXI.Rectangle} baseFrame - The base frame of the texture
    * @param {number} rotate - Rotation of frame, see {@link PIXI.groupD8}
    */
  /* protected */ def set(frame: Rectangle, baseFrame: Rectangle, rotate: Double): Unit
}

object TextureUvs {
  @scala.inline
  def apply(
    set: (Rectangle, Rectangle, Double) => Unit,
    x0: Double,
    x1: Double,
    x2: Double,
    x3: Double,
    y0: Double,
    y1: Double,
    y2: Double,
    y3: Double
  ): TextureUvs = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction3(set), x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], x3 = x3.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any], y3 = y3.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureUvs]
  }
}

