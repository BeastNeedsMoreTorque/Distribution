package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.Excel.ValueFilterCondition.equals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Enum representing all accepted conditions by which a value filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.exclusive` can be set to true to invert many of these conditions.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ValueFilterCondition")
@js.native
object ValueFilterCondition extends js.Object {
  /* "Between" */ val between: typings.officeJsPreview.Excel.ValueFilterCondition.between with String = js.native
  /* "BottomN" */ val bottomN: typings.officeJsPreview.Excel.ValueFilterCondition.bottomN with String = js.native
  /* "Equals" */ @JSName("equals")
  val equals_ : equals with String = js.native
  /* "GreaterThan" */ val greaterThan: typings.officeJsPreview.Excel.ValueFilterCondition.greaterThan with String = js.native
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeJsPreview.Excel.ValueFilterCondition.greaterThanOrEqualTo with String = js.native
  /* "LessThan" */ val lessThan: typings.officeJsPreview.Excel.ValueFilterCondition.lessThan with String = js.native
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeJsPreview.Excel.ValueFilterCondition.lessThanOrEqualTo with String = js.native
  /* "TopN" */ val topN: typings.officeJsPreview.Excel.ValueFilterCondition.topN with String = js.native
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.ValueFilterCondition.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ValueFilterCondition with String] = js.native
}

