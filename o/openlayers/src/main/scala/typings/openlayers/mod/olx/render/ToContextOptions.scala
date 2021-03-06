package typings.openlayers.mod.olx.render

import typings.openlayers.mod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToContextOptions extends js.Object {
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object ToContextOptions {
  @scala.inline
  def apply(pixelRatio: js.UndefOr[Double] = js.undefined, size: Size = null): ToContextOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToContextOptions]
  }
}

