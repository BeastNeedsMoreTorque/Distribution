package typings.reactBootstrapTable2Filter.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<string, T> & {  options  :react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterOptions | (column : react-bootstrap-table-next.react-bootstrap-table-next.ColumnDescription<T, any>): react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterOptions,   comparator ? :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator,   withoutEmptyOption ? :boolean} */
trait SelectFilterProps[T /* <: js.Object */] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var comparator: js.UndefOr[Comparator] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var getFilter: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[T]]] = js.undefined
  var options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, _], SelectFilterOptions])
  var placeholder: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * When the default unset selection is hidden from dropdown
    */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
}

object SelectFilterProps {
  @scala.inline
  def apply[/* <: js.Object */ T](
    options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, _], SelectFilterOptions]),
    className: String = null,
    comparator: Comparator = null,
    defaultValue: js.Any = null,
    delay: js.UndefOr[Double] = js.undefined,
    getFilter: /* filter */ String => Unit = null,
    id: String = null,
    onFilter: /* filterValue */ String => Unit | js.Array[T] = null,
    placeholder: String = null,
    style: CSSProperties = null,
    withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  ): SelectFilterProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (getFilter != null) __obj.updateDynamic("getFilter")(js.Any.fromFunction1(getFilter))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFilterProps[T]]
  }
}

