package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies enumerated values for the `cells` property in the cellFormat parameter of 
  * {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables#format-a-table | table formatting methods}.
  */
@JSGlobal("Office.Table")
@js.native
object Table extends js.Object {
  /* 0 */ val All: typings.officeJs.Office.Table.All with Double = js.native
  /* 1 */ val Data: typings.officeJs.Office.Table.Data with Double = js.native
  /* 2 */ val Headers: typings.officeJs.Office.Table.Headers with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.Table with Double] = js.native
}

