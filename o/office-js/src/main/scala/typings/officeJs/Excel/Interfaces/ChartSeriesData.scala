package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartAxisGroup
import typings.officeJs.Excel.ChartGradientStyle
import typings.officeJs.Excel.ChartGradientStyleType
import typings.officeJs.Excel.ChartMarkerStyle
import typings.officeJs.Excel.ChartParentLabelStrategy
import typings.officeJs.Excel.ChartSplitType
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Banner
import typings.officeJs.officeJsStrings.Circle
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.Diamond
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.ExtremeValue
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Number
import typings.officeJs.officeJsStrings.Overlapping
import typings.officeJs.officeJsStrings.Percent
import typings.officeJs.officeJsStrings.Picture
import typings.officeJs.officeJsStrings.Plus
import typings.officeJs.officeJsStrings.Primary
import typings.officeJs.officeJsStrings.Secondary
import typings.officeJs.officeJsStrings.SplitByCustomSplit
import typings.officeJs.officeJsStrings.SplitByPercentValue
import typings.officeJs.officeJsStrings.SplitByPosition
import typings.officeJs.officeJsStrings.SplitByValue
import typings.officeJs.officeJsStrings.Square
import typings.officeJs.officeJsStrings.Star
import typings.officeJs.officeJsStrings.ThreePhaseColor
import typings.officeJs.officeJsStrings.Triangle
import typings.officeJs.officeJsStrings.TwoPhaseColor
import typings.officeJs.officeJsStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartSeries.toJSON()`. */
trait ChartSeriesData extends js.Object {
  /**
    *
    * Specifies the group for the specified series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[ChartAxisGroup | Primary | Secondary] = js.undefined
  /**
    *
    * Encapsulates the bin options for histogram charts and pareto charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var binOptions: js.UndefOr[ChartBinOptionsData] = js.undefined
  /**
    *
    * Encapsulates the options for the box and whisker charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsData] = js.undefined
  /**
    *
    * This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any
  ] = js.undefined
  /**
    *
    * Represents a collection of all dataLabels in the series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsData] = js.undefined
  /**
    *
    * Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
    Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie).
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies if the series is filtered. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360.
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatData] = js.undefined
  /**
    *
    * Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
    specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the color for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the type for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: js.UndefOr[ChartGradientStyleType | ExtremeValue | Number | Percent] = js.undefined
  /**
    *
    * Specifies the maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the color for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the type for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: js.UndefOr[ChartGradientStyleType | ExtremeValue | Number | Percent] = js.undefined
  /**
    *
    * Specifies the midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the color for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the type for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: js.UndefOr[ChartGradientStyleType | ExtremeValue | Number | Percent] = js.undefined
  /**
    *
    * Specifies the minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the series gradient style of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: js.UndefOr[ChartGradientStyle | TwoPhaseColor | ThreePhaseColor] = js.undefined
  /**
    *
    * Specifies if the series has data labels.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the fill color for negative data points in a series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: js.UndefOr[String] = js.undefined
  /**
    *
    * True if Excel inverts the pattern in the item when it corresponds to a negative number.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Encapsulates the options for a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var mapOptions: js.UndefOr[ChartMapOptionsData] = js.undefined
  /**
    *
    * Specifies the markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.undefined
  /**
    *
    * Specifies the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the series parent label strategy area for a treemap chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: js.UndefOr[ChartParentLabelStrategy | None | Banner | Overlapping] = js.undefined
  /**
    *
    * Specifies the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns a collection of all points in the series.
    *
    * [Api set: ExcelApi 1.1]
    */
  var points: js.UndefOr[js.Array[ChartPointData]] = js.undefined
  /**
    *
    * Specifies the size of the secondary section of either a pie-of-pie chart or a bar-of-pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies whether connector lines are shown in waterfall charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether leader lines are displayed for each data label in the series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the series has a shadow.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the series is smooth. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the way the two sections of either a pie-of-pie chart or a bar-of-pie chart are split.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[
    ChartSplitType | SplitByPosition | SplitByValue | SplitByPercentValue | SplitByCustomSplit
  ] = js.undefined
  /**
    *
    * Specifies the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: js.UndefOr[Double] = js.undefined
  /**
    *
    * The collection of trendlines in the series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var trendlines: js.UndefOr[js.Array[ChartTrendlineData]] = js.undefined
  /**
    *
    * True if Excel assigns a different color or pattern to each data marker. The chart must contain only one series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var xErrorBars: js.UndefOr[ChartErrorBarsData] = js.undefined
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var yErrorBars: js.UndefOr[ChartErrorBarsData] = js.undefined
}

object ChartSeriesData {
  @scala.inline
  def apply(
    axisGroup: ChartAxisGroup | Primary | Secondary = null,
    binOptions: ChartBinOptionsData = null,
    boxwhiskerOptions: ChartBoxwhiskerOptionsData = null,
    bubbleScale: js.UndefOr[Double] = js.undefined,
    chartType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any = null,
    dataLabels: ChartDataLabelsData = null,
    doughnutHoleSize: js.UndefOr[Double] = js.undefined,
    explosion: js.UndefOr[Double] = js.undefined,
    filtered: js.UndefOr[Boolean] = js.undefined,
    firstSliceAngle: js.UndefOr[Double] = js.undefined,
    format: ChartSeriesFormatData = null,
    gapWidth: js.UndefOr[Double] = js.undefined,
    gradientMaximumColor: String = null,
    gradientMaximumType: ChartGradientStyleType | ExtremeValue | Number | Percent = null,
    gradientMaximumValue: js.UndefOr[Double] = js.undefined,
    gradientMidpointColor: String = null,
    gradientMidpointType: ChartGradientStyleType | ExtremeValue | Number | Percent = null,
    gradientMidpointValue: js.UndefOr[Double] = js.undefined,
    gradientMinimumColor: String = null,
    gradientMinimumType: ChartGradientStyleType | ExtremeValue | Number | Percent = null,
    gradientMinimumValue: js.UndefOr[Double] = js.undefined,
    gradientStyle: ChartGradientStyle | TwoPhaseColor | ThreePhaseColor = null,
    hasDataLabels: js.UndefOr[Boolean] = js.undefined,
    invertColor: String = null,
    invertIfNegative: js.UndefOr[Boolean] = js.undefined,
    mapOptions: ChartMapOptionsData = null,
    markerBackgroundColor: String = null,
    markerForegroundColor: String = null,
    markerSize: js.UndefOr[Double] = js.undefined,
    markerStyle: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture = null,
    name: String = null,
    overlap: js.UndefOr[Double] = js.undefined,
    parentLabelStrategy: ChartParentLabelStrategy | None | Banner | Overlapping = null,
    plotOrder: js.UndefOr[Double] = js.undefined,
    points: js.Array[ChartPointData] = null,
    secondPlotSize: js.UndefOr[Double] = js.undefined,
    showConnectorLines: js.UndefOr[Boolean] = js.undefined,
    showLeaderLines: js.UndefOr[Boolean] = js.undefined,
    showShadow: js.UndefOr[Boolean] = js.undefined,
    smooth: js.UndefOr[Boolean] = js.undefined,
    splitType: ChartSplitType | SplitByPosition | SplitByValue | SplitByPercentValue | SplitByCustomSplit = null,
    splitValue: js.UndefOr[Double] = js.undefined,
    trendlines: js.Array[ChartTrendlineData] = null,
    varyByCategories: js.UndefOr[Boolean] = js.undefined,
    xErrorBars: ChartErrorBarsData = null,
    yErrorBars: ChartErrorBarsData = null
  ): ChartSeriesData = {
    val __obj = js.Dynamic.literal()
    if (axisGroup != null) __obj.updateDynamic("axisGroup")(axisGroup.asInstanceOf[js.Any])
    if (binOptions != null) __obj.updateDynamic("binOptions")(binOptions.asInstanceOf[js.Any])
    if (boxwhiskerOptions != null) __obj.updateDynamic("boxwhiskerOptions")(boxwhiskerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbleScale)) __obj.updateDynamic("bubbleScale")(bubbleScale.get.asInstanceOf[js.Any])
    if (chartType != null) __obj.updateDynamic("chartType")(chartType.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(doughnutHoleSize)) __obj.updateDynamic("doughnutHoleSize")(doughnutHoleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(explosion)) __obj.updateDynamic("explosion")(explosion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstSliceAngle)) __obj.updateDynamic("firstSliceAngle")(firstSliceAngle.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(gapWidth)) __obj.updateDynamic("gapWidth")(gapWidth.get.asInstanceOf[js.Any])
    if (gradientMaximumColor != null) __obj.updateDynamic("gradientMaximumColor")(gradientMaximumColor.asInstanceOf[js.Any])
    if (gradientMaximumType != null) __obj.updateDynamic("gradientMaximumType")(gradientMaximumType.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMaximumValue)) __obj.updateDynamic("gradientMaximumValue")(gradientMaximumValue.get.asInstanceOf[js.Any])
    if (gradientMidpointColor != null) __obj.updateDynamic("gradientMidpointColor")(gradientMidpointColor.asInstanceOf[js.Any])
    if (gradientMidpointType != null) __obj.updateDynamic("gradientMidpointType")(gradientMidpointType.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMidpointValue)) __obj.updateDynamic("gradientMidpointValue")(gradientMidpointValue.get.asInstanceOf[js.Any])
    if (gradientMinimumColor != null) __obj.updateDynamic("gradientMinimumColor")(gradientMinimumColor.asInstanceOf[js.Any])
    if (gradientMinimumType != null) __obj.updateDynamic("gradientMinimumType")(gradientMinimumType.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMinimumValue)) __obj.updateDynamic("gradientMinimumValue")(gradientMinimumValue.get.asInstanceOf[js.Any])
    if (gradientStyle != null) __obj.updateDynamic("gradientStyle")(gradientStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDataLabels)) __obj.updateDynamic("hasDataLabels")(hasDataLabels.get.asInstanceOf[js.Any])
    if (invertColor != null) __obj.updateDynamic("invertColor")(invertColor.asInstanceOf[js.Any])
    if (!js.isUndefined(invertIfNegative)) __obj.updateDynamic("invertIfNegative")(invertIfNegative.get.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (markerBackgroundColor != null) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor.asInstanceOf[js.Any])
    if (markerForegroundColor != null) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize.get.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.get.asInstanceOf[js.Any])
    if (parentLabelStrategy != null) __obj.updateDynamic("parentLabelStrategy")(parentLabelStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(plotOrder)) __obj.updateDynamic("plotOrder")(plotOrder.get.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(secondPlotSize)) __obj.updateDynamic("secondPlotSize")(secondPlotSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showConnectorLines)) __obj.updateDynamic("showConnectorLines")(showConnectorLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLeaderLines)) __obj.updateDynamic("showLeaderLines")(showLeaderLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.get.asInstanceOf[js.Any])
    if (splitType != null) __obj.updateDynamic("splitType")(splitType.asInstanceOf[js.Any])
    if (!js.isUndefined(splitValue)) __obj.updateDynamic("splitValue")(splitValue.get.asInstanceOf[js.Any])
    if (trendlines != null) __obj.updateDynamic("trendlines")(trendlines.asInstanceOf[js.Any])
    if (!js.isUndefined(varyByCategories)) __obj.updateDynamic("varyByCategories")(varyByCategories.get.asInstanceOf[js.Any])
    if (xErrorBars != null) __obj.updateDynamic("xErrorBars")(xErrorBars.asInstanceOf[js.Any])
    if (yErrorBars != null) __obj.updateDynamic("yErrorBars")(yErrorBars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesData]
  }
}

