package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when updating a range of values in a spreadsheet.
  */
@js.native
trait SchemaBatchUpdateValuesByDataFilterResponse extends js.Object {
  /**
    * The response for each range updated.
    */
  var responses: js.UndefOr[js.Array[SchemaUpdateValuesByDataFilterResponse]] = js.native
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The total number of cells updated.
    */
  var totalUpdatedCells: js.UndefOr[Double] = js.native
  /**
    * The total number of columns where at least one cell in the column was
    * updated.
    */
  var totalUpdatedColumns: js.UndefOr[Double] = js.native
  /**
    * The total number of rows where at least one cell in the row was updated.
    */
  var totalUpdatedRows: js.UndefOr[Double] = js.native
  /**
    * The total number of sheets where at least one cell in the sheet was
    * updated.
    */
  var totalUpdatedSheets: js.UndefOr[Double] = js.native
}

object SchemaBatchUpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(
    responses: js.Array[SchemaUpdateValuesByDataFilterResponse] = null,
    spreadsheetId: String = null,
    totalUpdatedCells: js.UndefOr[Double] = js.undefined,
    totalUpdatedColumns: js.UndefOr[Double] = js.undefined,
    totalUpdatedRows: js.UndefOr[Double] = js.undefined,
    totalUpdatedSheets: js.UndefOr[Double] = js.undefined
  ): SchemaBatchUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (!js.isUndefined(totalUpdatedCells)) __obj.updateDynamic("totalUpdatedCells")(totalUpdatedCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalUpdatedColumns)) __obj.updateDynamic("totalUpdatedColumns")(totalUpdatedColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalUpdatedRows)) __obj.updateDynamic("totalUpdatedRows")(totalUpdatedRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalUpdatedSheets)) __obj.updateDynamic("totalUpdatedSheets")(totalUpdatedSheets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdateValuesByDataFilterResponse]
  }
}

