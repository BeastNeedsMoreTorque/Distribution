package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPaletteTileSize extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ColorPaletteTileSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): ColorPaletteTileSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPaletteTileSize]
  }
}

