package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.Phaser.Display.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleConfig extends js.Object {
  /**
    * Color to use for drawing a filled rectangle at colliding tile locations. If set to null, colliding tiles will not be drawn.
    */
  var collidingTileColor: js.UndefOr[Color | Double | Null] = js.undefined
  /**
    * Color to use for drawing a line at interesting tile faces. If set to null, interesting tile faces will not be drawn.
    */
  var faceColor: js.UndefOr[Color | Double | Null] = js.undefined
  /**
    * Color to use for drawing a filled rectangle at non-colliding tile locations. If set to null, non-colliding tiles will not be drawn.
    */
  var tileColor: js.UndefOr[Color | Double | Null] = js.undefined
}

object StyleConfig {
  @scala.inline
  def apply(
    collidingTileColor: js.UndefOr[Null | Color | Double] = js.undefined,
    faceColor: js.UndefOr[Null | Color | Double] = js.undefined,
    tileColor: js.UndefOr[Null | Color | Double] = js.undefined
  ): StyleConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collidingTileColor)) __obj.updateDynamic("collidingTileColor")(collidingTileColor.asInstanceOf[js.Any])
    if (!js.isUndefined(faceColor)) __obj.updateDynamic("faceColor")(faceColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tileColor)) __obj.updateDynamic("tileColor")(tileColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleConfig]
  }
}

