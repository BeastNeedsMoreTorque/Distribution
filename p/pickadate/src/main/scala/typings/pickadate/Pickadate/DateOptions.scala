package typings.pickadate.Pickadate

import typings.pickadate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends Options {
   // default 'Today'
  var close: js.UndefOr[String] = js.undefined
  /**
    * Disable a specific or arbitrary set of dates selectable on the
    * picker. Accepts an array of Date objects, arrays formatted as
    * [YEAR, MONTH, DATE], integers representing days of the week
    * (from 1 to 7), or objects with a range of dates. Switch to a
    * whitelist by setting `true` as the first item in the collection.
    * Enable dates that fall within a range of disabled dates by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The first day of the week can be set to either Sunday or Monday.
    * True or 1 sets it as Monday and false or 0 as Sunday.
    */
  var firstDay: js.UndefOr[Boolean | Double] = js.undefined
  // Classes
  var klass: js.UndefOr[DateKlassOptions] = js.undefined
   // default 'Close'
  // Accessibility labels
  var labelMonthNext: js.UndefOr[String] = js.undefined
   // default 'Next month'
  var labelMonthPrev: js.UndefOr[String] = js.undefined
   // default 'Previous month'
  var labelMonthSelect: js.UndefOr[String] = js.undefined
   // default 'Select a month'
  var labelYearSelect: js.UndefOr[String] = js.undefined
  /**
    * Set the maximum selectable date on the picker.
    * Accepts the same values as the `min` property.
    */
  var max: js.UndefOr[MinOrMaxDateOption] = js.undefined
  /**
    * Set the minimum selectable date on the picker. Accepts a Date object,
    * array formatted as [YEAR, MONTH, DATE], a positive or negative integer
    * for a date relative to today, or a boolean (`true` sets it to today,
    * `false` removes any limit).
    */
  var min: js.UndefOr[MinOrMaxDateOption] = js.undefined
  // Strings and translations
  var monthsFull: js.UndefOr[js.Array[String]] = js.undefined
   // default 'January' through 'December'
  var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * True enables the dropdown selector and false replaces it with text
    */
  var selectMonths: js.UndefOr[Boolean] = js.undefined
   //default 'Select a year'
  /**
    * True enables the dropdown selector and false replaces it with text.
    * You can also specify the number of years to show in the dropdown
    * using an even integer - half before and half after the year in focus.
    * If true the value will default to 10.
    */
  var selectYears: js.UndefOr[Boolean | Double] = js.undefined
   // default 'Sun' through 'Sat'
  var showMonthsShort: js.UndefOr[Boolean] = js.undefined
  var showWeekdaysFull: js.UndefOr[Boolean] = js.undefined
  // Buttons
  var today: js.UndefOr[String] = js.undefined
   // default 'Jan' through 'Dec'
  var weekdaysFull: js.UndefOr[js.Array[String]] = js.undefined
   // default 'Sunday' through 'Saturday'
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object DateOptions {
  @scala.inline
  def apply(
    clear: String = null,
    close: String = null,
    closeOnClear: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    container: String | JQuery = null,
    containerHidden: String = null,
    disable: js.Array[_] = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    firstDay: Boolean | Double = null,
    format: String = null,
    formatSubmit: String = null,
    hiddenName: js.UndefOr[Boolean] = js.undefined,
    hiddenPrefix: String = null,
    hiddenSuffix: String = null,
    klass: DateKlassOptions = null,
    labelMonthNext: String = null,
    labelMonthPrev: String = null,
    labelMonthSelect: String = null,
    labelYearSelect: String = null,
    max: MinOrMaxDateOption = null,
    min: MinOrMaxDateOption = null,
    monthsFull: js.Array[String] = null,
    monthsShort: js.Array[String] = null,
    onClose: /* event */ js.Any => Unit = null,
    onOpen: /* event */ js.Any => Unit = null,
    onRender: /* event */ js.Any => Unit = null,
    onSet: /* event */ js.Any => Unit = null,
    onStart: /* event */ js.Any => Unit = null,
    onStop: /* event */ js.Any => Unit = null,
    selectMonths: js.UndefOr[Boolean] = js.undefined,
    selectYears: Boolean | Double = null,
    showMonthsShort: js.UndefOr[Boolean] = js.undefined,
    showWeekdaysFull: js.UndefOr[Boolean] = js.undefined,
    today: String = null,
    weekdaysFull: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): DateOptions = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClear)) __obj.updateDynamic("closeOnClear")(closeOnClear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerHidden != null) __obj.updateDynamic("containerHidden")(containerHidden.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatSubmit != null) __obj.updateDynamic("formatSubmit")(formatSubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenName)) __obj.updateDynamic("hiddenName")(hiddenName.get.asInstanceOf[js.Any])
    if (hiddenPrefix != null) __obj.updateDynamic("hiddenPrefix")(hiddenPrefix.asInstanceOf[js.Any])
    if (hiddenSuffix != null) __obj.updateDynamic("hiddenSuffix")(hiddenSuffix.asInstanceOf[js.Any])
    if (klass != null) __obj.updateDynamic("klass")(klass.asInstanceOf[js.Any])
    if (labelMonthNext != null) __obj.updateDynamic("labelMonthNext")(labelMonthNext.asInstanceOf[js.Any])
    if (labelMonthPrev != null) __obj.updateDynamic("labelMonthPrev")(labelMonthPrev.asInstanceOf[js.Any])
    if (labelMonthSelect != null) __obj.updateDynamic("labelMonthSelect")(labelMonthSelect.asInstanceOf[js.Any])
    if (labelYearSelect != null) __obj.updateDynamic("labelYearSelect")(labelYearSelect.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (monthsFull != null) __obj.updateDynamic("monthsFull")(monthsFull.asInstanceOf[js.Any])
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction1(onRender))
    if (onSet != null) __obj.updateDynamic("onSet")(js.Any.fromFunction1(onSet))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (!js.isUndefined(selectMonths)) __obj.updateDynamic("selectMonths")(selectMonths.get.asInstanceOf[js.Any])
    if (selectYears != null) __obj.updateDynamic("selectYears")(selectYears.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthsShort)) __obj.updateDynamic("showMonthsShort")(showMonthsShort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekdaysFull)) __obj.updateDynamic("showWeekdaysFull")(showWeekdaysFull.get.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (weekdaysFull != null) __obj.updateDynamic("weekdaysFull")(weekdaysFull.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOptions]
  }
}

