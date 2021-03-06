package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies whether the shape is scaled relative to its original or current size.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleType")
@js.native
object ShapeScaleType extends js.Object {
  /* "CurrentSize" */ val currentSize: typings.officeJs.Excel.ShapeScaleType.currentSize with String = js.native
  /* "OriginalSize" */ val originalSize: typings.officeJs.Excel.ShapeScaleType.originalSize with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeScaleType with String] = js.native
}

