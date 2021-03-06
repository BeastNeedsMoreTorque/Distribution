package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartColorAxis extends js.Object {
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var legend: js.UndefOr[ChartLegend] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object ChartColorAxis {
  @scala.inline
  def apply(
    colors: js.Array[String] = null,
    legend: ChartLegend = null,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    values: js.Array[Double] = null
  ): ChartColorAxis = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorAxis]
  }
}

