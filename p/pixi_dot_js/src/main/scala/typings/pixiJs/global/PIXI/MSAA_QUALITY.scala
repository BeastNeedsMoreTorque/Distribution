package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants for multi-sampling antialiasing.
  *
  * @see PIXI.Framebuffer#multisample
  *
  * @name MSAA_QUALITY
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} NONE - No multisampling for this renderTexture
  * @property {number} LOW - Try 2 samples
  * @property {number} MEDIUM - Try 4 samples
  * @property {number} HIGH - Try 8 samples
  */
@JSGlobal("PIXI.MSAA_QUALITY")
@js.native
object MSAA_QUALITY extends js.Object {
  /* 3 */ val HIGH: typings.pixiJs.PIXI.MSAA_QUALITY.HIGH with Double = js.native
  /* 1 */ val LOW: typings.pixiJs.PIXI.MSAA_QUALITY.LOW with Double = js.native
  /* 2 */ val MEDIUM: typings.pixiJs.PIXI.MSAA_QUALITY.MEDIUM with Double = js.native
  /* 0 */ val NONE: typings.pixiJs.PIXI.MSAA_QUALITY.NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.MSAA_QUALITY with Double] = js.native
}

