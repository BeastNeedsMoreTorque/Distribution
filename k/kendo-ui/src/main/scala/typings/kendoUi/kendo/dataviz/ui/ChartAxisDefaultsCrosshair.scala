package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisDefaultsCrosshair extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[ChartAxisDefaultsCrosshairTooltip] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartAxisDefaultsCrosshair {
  @scala.inline
  def apply(
    color: String = null,
    dashType: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    tooltip: ChartAxisDefaultsCrosshairTooltip = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ChartAxisDefaultsCrosshair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisDefaultsCrosshair]
  }
}

