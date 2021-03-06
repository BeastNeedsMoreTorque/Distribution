package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Table extends js.Object

/**
  * Specifies enumerated values for the `cells` property in the cellFormat parameter of
  * {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | table formatting methods}.
  */
@JSGlobal("Office.Table")
@js.native
object Table extends js.Object {
  /**
    * The entire table, including column headers, data, and totals (if any).
    */
  @js.native
  sealed trait All extends Table
  
  /**
    * Only the data (no headers and totals).
    */
  @js.native
  sealed trait Data extends Table
  
  /**
    * Only the header row.
    */
  @js.native
  sealed trait Headers extends Table
  
}

