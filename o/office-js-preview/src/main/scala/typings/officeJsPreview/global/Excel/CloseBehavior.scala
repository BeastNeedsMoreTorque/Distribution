package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the close behavior for Workbook.close API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CloseBehavior")
@js.native
object CloseBehavior extends js.Object {
  /* "Save" */ val save: typings.officeJsPreview.Excel.CloseBehavior.save with String = js.native
  /* "SkipSave" */ val skipSave: typings.officeJsPreview.Excel.CloseBehavior.skipSave with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.CloseBehavior with String] = js.native
}

