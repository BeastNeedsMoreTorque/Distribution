package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonizeOptions extends js.Object {
  var connectedness: js.UndefOr[Double] = js.undefined
  var dst: Layer
  var mask: js.UndefOr[RasterBand] = js.undefined
  var pixValField: Double
  var src: RasterBand
  var useFloats: js.UndefOr[Boolean] = js.undefined
}

object PolygonizeOptions {
  @scala.inline
  def apply(
    dst: Layer,
    pixValField: Double,
    src: RasterBand,
    connectedness: js.UndefOr[Double] = js.undefined,
    mask: RasterBand = null,
    useFloats: js.UndefOr[Boolean] = js.undefined
  ): PolygonizeOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], pixValField = pixValField.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(connectedness)) __obj.updateDynamic("connectedness")(connectedness.get.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(useFloats)) __obj.updateDynamic("useFloats")(useFloats.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonizeOptions]
  }
}

