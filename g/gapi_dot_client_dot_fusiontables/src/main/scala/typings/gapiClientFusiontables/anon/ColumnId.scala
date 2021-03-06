package typings.gapiClientFusiontables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnId extends js.Object {
  /** The id of the column in the base table from which this column is derived. */
  var columnId: js.UndefOr[Double] = js.undefined
  /** Offset to the entry in the list of base tables in the table definition. */
  var tableIndex: js.UndefOr[Double] = js.undefined
}

object ColumnId {
  @scala.inline
  def apply(columnId: js.UndefOr[Double] = js.undefined, tableIndex: js.UndefOr[Double] = js.undefined): ColumnId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnId)) __obj.updateDynamic("columnId")(columnId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tableIndex)) __obj.updateDynamic("tableIndex")(tableIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnId]
  }
}

