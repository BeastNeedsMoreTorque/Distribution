package typings.gapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicFilter extends js.Object {
  /**
    * The criteria for showing/hiding values per column.
    * The map's key is the column index, and the value is the criteria for
    * that column.
    */
  var criteria: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.sheets.gapi.client.sheets.FilterCriteria}
    */ typings.gapiClientSheets.gapiClientSheetsStrings.BasicFilter with TopLevel[js.Any]
  ] = js.undefined
  /** The range the filter covers. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The sort order per column. Later specifications are used when values
    * are equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
}

object BasicFilter {
  @scala.inline
  def apply(
    criteria: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.sheets.gapi.client.sheets.FilterCriteria}
    */ typings.gapiClientSheets.gapiClientSheetsStrings.BasicFilter with TopLevel[js.Any] = null,
    range: GridRange = null,
    sortSpecs: js.Array[SortSpec] = null
  ): BasicFilter = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicFilter]
  }
}

