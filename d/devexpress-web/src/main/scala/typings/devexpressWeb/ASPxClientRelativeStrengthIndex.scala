package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the RelativeStrengthIndex class.
  */
trait ASPxClientRelativeStrengthIndex extends ASPxSeparatePaneIndicator {
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  var pointsCount: Double
  /**
    * Gets a value, indicating whose series point values are used to calculate the indicator's values.
    */
  var valueLevel: String
}

object ASPxClientRelativeStrengthIndex {
  @scala.inline
  def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    name: String,
    pane: String,
    pointsCount: Double,
    series: ASPxClientSeries,
    valueLevel: String
  ): ASPxClientRelativeStrengthIndex = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], pointsCount = pointsCount.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRelativeStrengthIndex]
  }
}

