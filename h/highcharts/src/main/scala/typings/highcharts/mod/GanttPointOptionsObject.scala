package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttPointOptionsObject extends js.Object {
  /**
    * (Gantt) Accessibility options for a data point.
    */
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] = js.undefined
  /**
    * (Gantt) Whether the grid node belonging to this point should start as
    * collapsed. Used in axes of type treegrid.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Progress indicator, how much of the task completed. If it is a
    * number, the `fill` will be applied automatically.
    */
  var completed: js.UndefOr[Double | XrangePointPartialFillOptionsObject] = js.undefined
  /**
    * (Gantt) A reserved subspace to store options and values for customized
    * functionality. Here you can add additional data for your own event
    * callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.undefined
  /**
    * (Gantt) The ID of the point (task) that this point depends on in Gantt
    * charts. Aliases connect. Can also be an object, specifying further
    * connecting options between the points. Multiple connections can be
    * specified by providing an array.
    */
  var dependency: js.UndefOr[
    String | XrangePointConnectorsOptionsObject | (js.Array[String | XrangePointConnectorsOptionsObject])
  ] = js.undefined
  /**
    * (Gantt) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) Point specific options for the draggable-points module. Overrides
    * options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesLineDataDragDropOptions] = js.undefined
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The end time of a task.
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The rank for this point's data label in case of collision. If two
    * data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Options for the point markers of line-like
    * series.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  /**
    * (Gantt) Whether this point is a milestone. If so, only the `start` option
    * is handled, while `end` is ignored.
    */
  var milestone: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) The name of a task. If a `treegrid` y-axis is used (default in
    * Gantt charts), this will be picked up automatically, and used to
    * calculate the y-value.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
    */
  var parent: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The start time of a task.
    */
  var start: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) The Y value of a task.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object GanttPointOptionsObject {
  @scala.inline
  def apply(
    accessibility: PointAccessibilityOptionsObject = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    completed: Double | XrangePointPartialFillOptionsObject = null,
    custom: Dictionary[_] = null,
    dependency: String | XrangePointConnectorsOptionsObject | (js.Array[String | XrangePointConnectorsOptionsObject]) = null,
    description: String = null,
    dragDrop: SeriesLineDataDragDropOptions = null,
    drilldown: String = null,
    end: js.UndefOr[Double] = js.undefined,
    id: String = null,
    labelrank: js.UndefOr[Double] = js.undefined,
    marker: PointMarkerOptionsObject = null,
    milestone: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    parent: String = null,
    start: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): GanttPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (dependency != null) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(labelrank)) __obj.updateDynamic("labelrank")(labelrank.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(milestone)) __obj.updateDynamic("milestone")(milestone.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttPointOptionsObject]
  }
}

