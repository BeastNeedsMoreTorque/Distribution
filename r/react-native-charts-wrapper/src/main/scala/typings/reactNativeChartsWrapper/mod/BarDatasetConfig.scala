package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  var barShadowColor: js.UndefOr[Color] = js.undefined
  var highlightAlpha: js.UndefOr[Double] = js.undefined
  var stackLabels: js.UndefOr[js.Array[String]] = js.undefined
}

object BarDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    barShadowColor: js.UndefOr[Color] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    colors: js.Array[Color] = null,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    highlightAlpha: js.UndefOr[Double] = js.undefined,
    highlightColor: js.UndefOr[Color] = js.undefined,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    stackLabels: js.Array[String] = null,
    valueFormatter: ValueFormatter = null,
    valueTextColor: js.UndefOr[Color] = js.undefined,
    valueTextSize: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BarDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (!js.isUndefined(barShadowColor)) __obj.updateDynamic("barShadowColor")(barShadowColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightAlpha)) __obj.updateDynamic("highlightAlpha")(highlightAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightColor)) __obj.updateDynamic("highlightColor")(highlightColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.get.asInstanceOf[js.Any])
    if (stackLabels != null) __obj.updateDynamic("stackLabels")(stackLabels.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextColor)) __obj.updateDynamic("valueTextColor")(valueTextColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextSize)) __obj.updateDynamic("valueTextSize")(valueTextSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarDatasetConfig]
  }
}

