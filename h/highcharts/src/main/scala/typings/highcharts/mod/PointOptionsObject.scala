package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptionsObject extends js.Object {
  /**
    * (Highcharts) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[
    PointAccessibilityOptionsObject with typings.highcharts.accessibilityMod.highchartsAugmentingMod.PointAccessibilityOptionsObject
  ] = js.undefined
  /**
    * (Highcharts, Highstock) The color of the border surrounding the column or
    * bar.
    *
    * In styled mode, the border stroke can be set with the `.highcharts-point`
    * rule.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) The width of the border surrounding the column or
    * bar.
    *
    * In styled mode, the stroke width can be set with the `.highcharts-point`
    * rule.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The dash style of the box.
    */
  var boxDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The closing value of each data point.
    */
  var close: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual color for the point. By default
    * the color is pulled from the global `colors` array.
    *
    * In styled mode, the `color` option doesn't take effect. Instead, use
    * `colorIndex`.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Gantt) A specific color index to use for the point, so its
    * graphic representations are given the class name `highcharts-color-{n}`.
    * In styled mode this will change the color of the graphic. In non-styled
    * mode, the color by is set by the `fill` attribute, so the change in class
    * name won't have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Serves a purpose only if a `colorAxis` object is defined in
    * the chart options. This value will decide which color the point gets from
    * the scale of the colorAxis.
    */
  var colorValue: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Color of the line that connects the dumbbell
    * point's values. By default it is the series' color.
    */
  var connectorColor: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) Pixel width of the line that connects the
    * dumbbell point's values.
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.undefined
  /**
    * (Highcharts) A name for the dash style to use for the column or bar.
    * Overrides dashStyle on the series.
    *
    * In styled mode, the stroke dash-array can be set with the same classes as
    * listed under data.color.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual data label for each point. The
    * options are the same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[
    DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesPieDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject | (js.Array[
      DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject
    ])
  ] = js.undefined
  /**
    * (Highcharts) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) The wind direction in degrees, where 0 is north
    * (pointing towards south).
    */
  var direction: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Point specific options for the draggable-points module.
    * Overrides options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesLineDataDragDropOptions] = js.undefined
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The individual point events.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.undefined
  /**
    * (Highstock) The fill color of an individual flag. By default it inherits
    * from the series color.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The node that the link runs from.
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) By deafult sides fill is set to a gradient through this
    * option being set to `true`. Set to `false` to get solid color for the
    * sides.
    */
  var gradientForSides: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The high or maximum value for each data point.
    */
  var high: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The inner radius of an individual point in a solid gauge.
    * Can be given as a number (pixels) or percentage string.
    */
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) When this property is true, the points acts as a summary
    * column for the values added or substracted since the last intermediate
    * sum, or since the start of the series. The `y` value is ignored.
    */
  var isIntermediateSum: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) When this property is true, the point display the total sum
    * across the entire series. The `y` value is ignored.
    */
  var isSum: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The label of event.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The rank for this point's data label in case of collision.
    * If two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The sequential index of the data point in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The length of the vector. The rendered length
    * will relate to the `vectorLength` setting.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The low or minimum value for each data point.
    */
  var low: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
    */
  var lowColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) Options for the point markers of line-like
    * series.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  /**
    * (Highcharts) The median for each data point. This is drawn as a line
    * through the middle area of the box.
    */
  var median: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The dash style of the median.
    */
  var medianDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts) The name of the point as shown in the legend, tooltip,
    * dataLabels, etc.
    */
  var name: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highstock) The opening value of each data point.
    */
  var open: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Only for treemap. Use this option to build a tree structure.
    * The value should be the id of the point which is the parent. If no points
    * has a matching id, or this option is undefined, then the parent will be
    * set to the root.
    */
  var parent: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highmaps) Point padding for a single point.
    */
  /**
    * Heatmap series only. Point padding for a single point.
    */
  var pointPadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
    * the column or bar. Overrides pointWidth on the series.
    */
  var pointWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The lower quartile for each data point. This is the bottom
    * of the box.
    */
  var q1: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The higher quartile for each data point. This is the top of
    * the box.
    */
  var q3: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The outer radius of an individual point in a solid gauge.
    * Can be given as a number (pixels) or percentage string.
    */
  var radius: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The set or sets the options will be applied to. If a single
    * entry is defined, then it will create a new set. If more than one entry
    * is defined, then it will define the overlap between the sets in the
    * array.
    */
  var sets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highcharts) Whether to display a slice offset from the center.
    */
  var sliced: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The dash style of the stem.
    */
  var stemDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts) The target value of a point.
    */
  var target: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Individual target options for each point.
    */
  var targetOptions: js.UndefOr[SeriesBulletDataTargetOptions] = js.undefined
  /**
    * (Highstock) The longer text to be shown in the flag's tooltip.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) The short text to be shown on the flag.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The node that the link runs to.
    */
  var to: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) The wind speed in meters per second.
    */
  /**
    * Heatmap series only. The value of the point, resulting in a color
    * controled by options as set in the colorAxis configuration.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highcharts) The weighting of a word. The weight decides the relative
    * size of a word compared to the rest of the collection.
    */
  var weight: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The dash style of the whiskers.
    */
  var whiskerDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts, Highstock) The x value of the point. For datetime axes, the
    * X value is the timestamp in milliseconds since 1970.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The y value of the point.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highcharts) The relative width for each column. On a category axis, the
    * widths are distributed so they sum up to the X axis length. On linear and
    * datetime axes, the columns will be laid out from the X value and Z units
    * along the axis.
    */
  var z: js.UndefOr[Double | Null] = js.undefined
}

object PointOptionsObject {
  @scala.inline
  def apply(
    accessibility: PointAccessibilityOptionsObject with typings.highcharts.accessibilityMod.highchartsAugmentingMod.PointAccessibilityOptionsObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    boxDashStyle: DashStyleValue = null,
    className: String = null,
    close: js.UndefOr[Double] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: js.UndefOr[Double] = js.undefined,
    colorValue: js.UndefOr[Double] = js.undefined,
    connectorColor: String = null,
    connectorWidth: js.UndefOr[Double] = js.undefined,
    custom: Dictionary[_] = null,
    dashStyle: DashStyleValue = null,
    dataLabels: DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesPieDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject | (js.Array[
      DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject
    ]) = null,
    description: String = null,
    direction: js.UndefOr[Double] = js.undefined,
    dragDrop: SeriesLineDataDragDropOptions = null,
    drilldown: String = null,
    events: PointEventsOptionsObject = null,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    from: String = null,
    gradientForSides: js.UndefOr[Boolean] = js.undefined,
    high: js.UndefOr[Double] = js.undefined,
    id: String = null,
    innerRadius: Double | String = null,
    isIntermediateSum: js.UndefOr[Boolean] = js.undefined,
    isSum: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelrank: js.UndefOr[Double] = js.undefined,
    legendIndex: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    lowColor: ColorString | GradientColorObject | PatternObject = null,
    marker: PointMarkerOptionsObject = null,
    median: js.UndefOr[Double] = js.undefined,
    medianDashStyle: DashStyleValue = null,
    name: Double | String = null,
    open: js.UndefOr[Double] = js.undefined,
    parent: String = null,
    pointPadding: js.UndefOr[Double] = js.undefined,
    pointWidth: js.UndefOr[Double] = js.undefined,
    q1: js.UndefOr[Double] = js.undefined,
    q3: js.UndefOr[Double] = js.undefined,
    radius: Double | String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    sets: js.Array[String] = null,
    sliced: js.UndefOr[Boolean] = js.undefined,
    stemDashStyle: DashStyleValue = null,
    target: js.UndefOr[Double] = js.undefined,
    targetOptions: SeriesBulletDataTargetOptions = null,
    text: String = null,
    title: String = null,
    to: String = null,
    value: js.UndefOr[Null | Double] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined,
    whiskerDashStyle: DashStyleValue = null,
    x: js.UndefOr[Double] = js.undefined,
    x2: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Null | Double] = js.undefined,
    z: js.UndefOr[Null | Double] = js.undefined
  ): PointOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (boxDashStyle != null) __obj.updateDynamic("boxDashStyle")(boxDashStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorValue)) __obj.updateDynamic("colorValue")(colorValue.get.asInstanceOf[js.Any])
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorWidth)) __obj.updateDynamic("connectorWidth")(connectorWidth.get.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientForSides)) __obj.updateDynamic("gradientForSides")(gradientForSides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(isIntermediateSum)) __obj.updateDynamic("isIntermediateSum")(isIntermediateSum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSum)) __obj.updateDynamic("isSum")(isSum.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelrank)) __obj.updateDynamic("labelrank")(labelrank.get.asInstanceOf[js.Any])
    if (!js.isUndefined(legendIndex)) __obj.updateDynamic("legendIndex")(legendIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (lowColor != null) __obj.updateDynamic("lowColor")(lowColor.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(median)) __obj.updateDynamic("median")(median.get.asInstanceOf[js.Any])
    if (medianDashStyle != null) __obj.updateDynamic("medianDashStyle")(medianDashStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(pointPadding)) __obj.updateDynamic("pointPadding")(pointPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointWidth)) __obj.updateDynamic("pointWidth")(pointWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(q1)) __obj.updateDynamic("q1")(q1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(q3)) __obj.updateDynamic("q3")(q3.get.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (sets != null) __obj.updateDynamic("sets")(sets.asInstanceOf[js.Any])
    if (!js.isUndefined(sliced)) __obj.updateDynamic("sliced")(sliced.get.asInstanceOf[js.Any])
    if (stemDashStyle != null) __obj.updateDynamic("stemDashStyle")(stemDashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.get.asInstanceOf[js.Any])
    if (targetOptions != null) __obj.updateDynamic("targetOptions")(targetOptions.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    if (whiskerDashStyle != null) __obj.updateDynamic("whiskerDashStyle")(whiskerDashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x2)) __obj.updateDynamic("x2")(x2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptionsObject]
  }
}

