package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCmfParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The id of another series to use its data as volume data for
    * the indiator calculation.
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object PlotCmfParamsOptions {
  @scala.inline
  def apply(
    index: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    volumeSeriesID: String = null
  ): PlotCmfParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (volumeSeriesID != null) __obj.updateDynamic("volumeSeriesID")(volumeSeriesID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCmfParamsOptions]
  }
}

