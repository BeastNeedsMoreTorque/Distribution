package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSankeyPointOptionsObject extends js.Object {
  /**
    * (Highcharts) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] = js.undefined
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The color for the individual _link_. By default, the link
    * color is the same as the node it extends from. The `series.fillOpacity`
    * option also applies to the points, so when setting a specific link color,
    * consider setting the `fillOpacity` to 1.
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
    * (Highcharts) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.undefined
  /**
    * (Highcharts) Individual data label for each point. The options are the
    * same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[
    DataLabelsOptions | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject])
  ] = js.undefined
  /**
    * (Highcharts) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The individual point events.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.undefined
  /**
    * (Highcharts) The node that the link runs from.
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The rank for this point's data label in case of collision.
    * If two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The name of the point as shown in the legend, tooltip,
    * dataLabels, etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Whether the link goes out of the system.
    */
  var outgoing: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The node that the link runs to.
    */
  var to: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The weight of the link.
    */
  var weight: js.UndefOr[Double | Null] = js.undefined
}

object SeriesSankeyPointOptionsObject {
  @scala.inline
  def apply(
    accessibility: PointAccessibilityOptionsObject = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: js.UndefOr[Double] = js.undefined,
    custom: Dictionary[_] = null,
    dataLabels: DataLabelsOptions | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | (js.Array[SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject]) = null,
    description: String = null,
    events: PointEventsOptionsObject = null,
    from: String = null,
    id: String = null,
    labelrank: js.UndefOr[Double] = js.undefined,
    name: String = null,
    outgoing: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    to: String = null,
    weight: js.UndefOr[Null | Double] = js.undefined
  ): SeriesSankeyPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.get.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(labelrank)) __obj.updateDynamic("labelrank")(labelrank.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(outgoing)) __obj.updateDynamic("outgoing")(outgoing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSankeyPointOptionsObject]
  }
}

