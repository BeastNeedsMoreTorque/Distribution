package typings.gapiClientDoubleclicksearch.anon

import typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Column to perform the filter on. This can be a DoubleClick Search column or a saved column. */
  var column: js.UndefOr[ReportApiColumnSpec] = js.undefined
  /** Operator to use in the filter. See the filter reference for a list of available operators. */
  var operator: js.UndefOr[String] = js.undefined
  /** A list of values to filter the column value against. */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object Column {
  @scala.inline
  def apply(column: ReportApiColumnSpec = null, operator: String = null, values: js.Array[_] = null): Column = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

