package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartMarkerStyle
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Circle
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.Diamond
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Picture
import typings.officeJs.officeJsStrings.Plus
import typings.officeJs.officeJsStrings.Square
import typings.officeJs.officeJsStrings.Star
import typings.officeJs.officeJsStrings.Triangle
import typings.officeJs.officeJsStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPoint.toJSON()`. */
trait ChartPointData extends js.Object {
  /**
    *
    * Returns the data label of a chart point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelData] = js.undefined
  /**
    *
    * Encapsulates the format properties chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatData] = js.undefined
  /**
    *
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representation of the marker background color of data point (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * HTML color code representation of the marker foreground color of data point (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.undefined
  /**
    *
    * Returns the value of a chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartPointData {
  @scala.inline
  def apply(
    dataLabel: ChartDataLabelData = null,
    format: ChartPointFormatData = null,
    hasDataLabel: js.UndefOr[Boolean] = js.undefined,
    markerBackgroundColor: String = null,
    markerForegroundColor: String = null,
    markerSize: js.UndefOr[Double] = js.undefined,
    markerStyle: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture = null,
    value: js.Any = null
  ): ChartPointData = {
    val __obj = js.Dynamic.literal()
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(dataLabel.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDataLabel)) __obj.updateDynamic("hasDataLabel")(hasDataLabel.get.asInstanceOf[js.Any])
    if (markerBackgroundColor != null) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor.asInstanceOf[js.Any])
    if (markerForegroundColor != null) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize.get.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPointData]
  }
}

