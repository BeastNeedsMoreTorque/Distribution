package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A simple enum for Top/Bottom filters to select whether to filter by the top N or bottom N percent, number, or sum of values.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TopBottomSelectionType")
@js.native
object TopBottomSelectionType extends js.Object {
  /* "Items" */ val items: typings.officeJsPreview.Excel.TopBottomSelectionType.items with String = js.native
  /* "Percent" */ val percent: typings.officeJsPreview.Excel.TopBottomSelectionType.percent with String = js.native
  /* "Sum" */ val sum: typings.officeJsPreview.Excel.TopBottomSelectionType.sum with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.TopBottomSelectionType with String] = js.native
}

