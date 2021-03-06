package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Various GL data format types.
  *
  * @memberof PIXI
  * @static
  * @name TYPES
  * @enum {number}
  * @property {number} UNSIGNED_BYTE=5121
  * @property {number} UNSIGNED_SHORT=5123
  * @property {number} UNSIGNED_SHORT_5_6_5=33635
  * @property {number} UNSIGNED_SHORT_4_4_4_4=32819
  * @property {number} UNSIGNED_SHORT_5_5_5_1=32820
  * @property {number} FLOAT=5126
  * @property {number} HALF_FLOAT=36193
  */
@JSImport("pixi.js", "TYPES")
@js.native
object TYPES extends js.Object {
  /* 5 */ val FLOAT: typings.pixiJs.PIXI.TYPES.FLOAT with Double = js.native
  /* 6 */ val HALF_FLOAT: typings.pixiJs.PIXI.TYPES.HALF_FLOAT with Double = js.native
  /* 0 */ val UNSIGNED_BYTE: typings.pixiJs.PIXI.TYPES.UNSIGNED_BYTE with Double = js.native
  /* 1 */ val UNSIGNED_SHORT: typings.pixiJs.PIXI.TYPES.UNSIGNED_SHORT with Double = js.native
  /* 3 */ val UNSIGNED_SHORT_4_4_4_4: typings.pixiJs.PIXI.TYPES.UNSIGNED_SHORT_4_4_4_4 with Double = js.native
  /* 4 */ val UNSIGNED_SHORT_5_5_5_1: typings.pixiJs.PIXI.TYPES.UNSIGNED_SHORT_5_5_5_1 with Double = js.native
  /* 2 */ val UNSIGNED_SHORT_5_6_5: typings.pixiJs.PIXI.TYPES.UNSIGNED_SHORT_5_6_5 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.TYPES with Double] = js.native
}

