package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisPlotBandsOptions extends js.Object {
  /**
    * (Highstock) Flag to decide if plotBand should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
    * requires `borderWidth` to be set.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
    * requires `borderColor` to be set.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
    * default `highcharts-plot-band`, to apply to each individual band.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The color of the plot band.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An object defining mouse events for the
    * plot band. Supported properties are `click`, `mouseover`, `mouseout`,
    * `mousemove`.
    */
  var events: js.UndefOr[NavigatorYAxisPlotBandsEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The start position of the plot band in
    * axis units.
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
    * in Axis.removePlotBand.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) In a gauge chart, this option determines the inner radius of
    * the plot band that stretches along the perimeter. It can be given as a
    * percentage string, like `"100%"`, or as a pixel number, like `100`. By
    * default, the inner radius is controlled by the thickness option.
    */
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[NavigatorYAxisPlotBandsLabelOptions] = js.undefined
  /**
    * (Highcharts) In a gauge chart, this option determines the outer radius of
    * the plot band that stretches along the perimeter. It can be given as a
    * percentage string, like `"100%"`, or as a pixel number, like `100`.
    */
  var outerRadius: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) In a gauge chart, this option sets the width of the plot
    * band stretching along the perimeter. It can be given as a percentage
    * string, like `"10%"`, or as a pixel number, like `10`. The default value
    * 10 is the same as the default tickLength, thus making the plot band act
    * as a background for the tick markers.
    */
  var thickness: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
    * units.
    */
  var to: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The z index of the plot band within the
    * chart, relative to other elements. Using the same z index as another
    * element may give unpredictable results, as the last rendered element will
    * be on top. Values from 0 to 20 make sense.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object NavigatorYAxisPlotBandsOptions {
  @scala.inline
  def apply(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    borderColor: ColorString = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    events: NavigatorYAxisPlotBandsEventsOptions = null,
    from: js.UndefOr[Double] = js.undefined,
    id: String = null,
    innerRadius: Double | String = null,
    label: NavigatorYAxisPlotBandsLabelOptions = null,
    outerRadius: Double | String = null,
    thickness: Double | String = null,
    to: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): NavigatorYAxisPlotBandsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorYAxisPlotBandsOptions]
  }
}

