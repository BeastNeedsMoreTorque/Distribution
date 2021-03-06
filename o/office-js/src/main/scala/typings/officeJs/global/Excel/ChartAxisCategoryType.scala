package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the type of the category axis.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisCategoryType")
@js.native
object ChartAxisCategoryType extends js.Object {
  /* "Automatic" */ val automatic: typings.officeJs.Excel.ChartAxisCategoryType.automatic with String = js.native
  /* "DateAxis" */ val dateAxis: typings.officeJs.Excel.ChartAxisCategoryType.dateAxis with String = js.native
  /* "TextAxis" */ val textAxis: typings.officeJs.Excel.ChartAxisCategoryType.textAxis with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartAxisCategoryType with String] = js.native
}

