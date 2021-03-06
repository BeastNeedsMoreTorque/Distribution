package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the save behavior for Workbook.save API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SaveBehavior")
@js.native
object SaveBehavior extends js.Object {
  /* "Prompt" */ val prompt: typings.officeJs.Excel.SaveBehavior.prompt with String = js.native
  /* "Save" */ val save: typings.officeJs.Excel.SaveBehavior.save with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SaveBehavior with String] = js.native
}

