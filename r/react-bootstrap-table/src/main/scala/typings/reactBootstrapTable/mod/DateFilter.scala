package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.ComparatorDate
import typings.reactBootstrapTable.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilter extends _Filter {
  /**
    * Date filter comparators
    */
  var dateComparators: js.UndefOr[js.Array[FilterComparator]] = js.undefined
  /**
    * Default value for the filter.
    */
  var defaultValue: js.UndefOr[Date] = js.undefined
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[ComparatorDate] = js.undefined
  /**
    * Filter type must be 'DateFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter
}

object DateFilter {
  @scala.inline
  def apply(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter,
    dateComparators: js.Array[FilterComparator] = null,
    defaultValue: Date = null,
    delay: js.UndefOr[Double] = js.undefined,
    style: ComparatorDate = null
  ): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dateComparators != null) __obj.updateDynamic("dateComparators")(dateComparators.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilter]
  }
}

