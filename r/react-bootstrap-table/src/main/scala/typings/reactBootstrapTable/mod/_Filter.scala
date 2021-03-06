package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable.anon.Comparator
import typings.reactBootstrapTable.anon.ComparatorDate
import typings.reactBootstrapTable.anon.Date
import typings.reactBootstrapTable.anon.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Filter extends js.Object

object _Filter {
  @scala.inline
  def RegexFilter(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter,
    defaultValue: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    placeholder: String = null,
    style: CSSProperties = null
  ): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  @scala.inline
  def TextFilter(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter,
    condition: FilterCondition = null,
    defaultValue: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    placeholder: String = null,
    style: CSSProperties = null
  ): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  @scala.inline
  def DateFilter(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter,
    dateComparators: js.Array[FilterComparator] = null,
    defaultValue: Date = null,
    delay: js.UndefOr[Double] = js.undefined,
    style: ComparatorDate = null
  ): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dateComparators != null) __obj.updateDynamic("dateComparators")(dateComparators.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  @scala.inline
  def NumberFilter(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    defaultValue: Comparator = null,
    delay: js.UndefOr[Double] = js.undefined,
    numberComparators: js.Array[FilterComparator] = null,
    options: js.Array[Double] = null,
    placeholder: String = null,
    style: Number = null,
    withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined,
    withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined,
    withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  ): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (numberComparators != null) __obj.updateDynamic("numberComparators")(numberComparators.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyComparatorOption)) __obj.updateDynamic("withoutEmptyComparatorOption")(withoutEmptyComparatorOption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyNumberOption)) __obj.updateDynamic("withoutEmptyNumberOption")(withoutEmptyNumberOption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  @scala.inline
  def SelectFilter(
    options: SelectFilterOptionsType,
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter,
    condition: FilterCondition = null,
    defaultValue: String | Double | Boolean = null,
    selectText: String = null,
    style: CSSProperties = null,
    withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  ): _Filter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (selectText != null) __obj.updateDynamic("selectText")(selectText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
}

