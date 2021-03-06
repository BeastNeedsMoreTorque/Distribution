package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies which part of the shape retains its position when the shape is scaled.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeScaleFrom")
@js.native
object ShapeScaleFrom extends js.Object {
  /* "ScaleFromBottomRight" */ val scaleFromBottomRight: typings.officeJs.Excel.ShapeScaleFrom.scaleFromBottomRight with String = js.native
  /* "ScaleFromMiddle" */ val scaleFromMiddle: typings.officeJs.Excel.ShapeScaleFrom.scaleFromMiddle with String = js.native
  /* "ScaleFromTopLeft" */ val scaleFromTopLeft: typings.officeJs.Excel.ShapeScaleFrom.scaleFromTopLeft with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ShapeScaleFrom with String] = js.native
}

