package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBaseChart
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Event which is raised before data binding.
    * Return false in order to cancel data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  /**
    * Event which is raised after data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.data to obtain reference to array actual data which is displayed by chart.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  /**
    * Gets sets a valid data source.
    * That can be instance of array or primitives, array of objects, instance of $.ig.DataSource, or any other data accepted by $.ig.DataSource.
    * Note: if it is set to string and "dataSourceType" option is not set, then $.ig.JSONPDataSource is used.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets sets data source type (such as "json", "xml", etc). Please refer to the documentation of $.ig.DataSource and its type property
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
    * Gets sets url which is used for sending JSON on request for remote data.
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
    * The height of the chart.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Event which is raised before tooltip is hidden.
    * Return false in order to cancel hiding and keep tooltip visible.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.item to obtain reference to item.
    * Use ui.element to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
    */
  var hideTooltip: js.UndefOr[HideTooltipEvent] = js.undefined
  /**
    * Gets sets maximum number of displayed records in chart.
    */
  var maxRecCount: js.UndefOr[Double] = js.undefined
  /**
    * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
    * See $.ig.DataSource. property in the response specifying the total number of records on the server.
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  /**
    * Gets sets template for tooltip associated with chart item.
    * Example: "Value: $(ValueMemberPathInDataSource)"
    */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /**
    * Event which is raised before tooltip is updated.
    * Return false in order to cancel updating and hide tooltip.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.text to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
    * Use ui.item to obtain reference to item. Value of that member can be modified or replaced by custom item.
    * Use ui.x to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
    * Use ui.y to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
    * Use ui.element to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
    */
  var updateTooltip: js.UndefOr[UpdateTooltipEvent] = js.undefined
  /**
    * The width of the chart.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IgBaseChart {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    dataBinding: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit = null,
    dataBound: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hideTooltip: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit = null,
    maxRecCount: js.UndefOr[Double] = js.undefined,
    responseDataKey: String = null,
    responseTotalRecCountKey: String = null,
    tooltipTemplate: String = null,
    updateTooltip: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit = null,
    width: js.UndefOr[Double] = js.undefined
  ): IgBaseChart = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction2(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction2(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hideTooltip != null) __obj.updateDynamic("hideTooltip")(js.Any.fromFunction2(hideTooltip))
    if (!js.isUndefined(maxRecCount)) __obj.updateDynamic("maxRecCount")(maxRecCount.get.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (responseTotalRecCountKey != null) __obj.updateDynamic("responseTotalRecCountKey")(responseTotalRecCountKey.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (updateTooltip != null) __obj.updateDynamic("updateTooltip")(js.Any.fromFunction2(updateTooltip))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgBaseChart]
  }
}

