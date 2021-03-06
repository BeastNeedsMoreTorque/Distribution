package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.SortField
import typings.officeJs.Excel.SortMethod
import typings.officeJs.officeJsStrings.PinYin
import typings.officeJs.officeJsStrings.StrokeCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableSort.toJSON()`. */
trait TableSortData extends js.Object {
  /**
    *
    * Specifies the current conditions used to last sort the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[js.Array[SortField]] = js.undefined
  /**
    *
    * Specifies if the casing impacts the last sort of the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents Chinese character ordering method last used to sort the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var method: js.UndefOr[SortMethod | PinYin | StrokeCount] = js.undefined
}

object TableSortData {
  @scala.inline
  def apply(
    fields: js.Array[SortField] = null,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    method: SortMethod | PinYin | StrokeCount = null
  ): TableSortData = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortData]
  }
}

