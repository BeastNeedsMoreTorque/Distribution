package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendCellsRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[RowData]] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
}

object AppendCellsRequest {
  @scala.inline
  def apply(fields: String = null, rows: js.Array[RowData] = null, sheetId: js.UndefOr[Double] = js.undefined): AppendCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendCellsRequest]
  }
}

