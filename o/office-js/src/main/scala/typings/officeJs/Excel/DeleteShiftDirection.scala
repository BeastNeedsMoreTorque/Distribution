package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeleteShiftDirection extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.DeleteShiftDirection")
@js.native
object DeleteShiftDirection extends js.Object {
  @js.native
  sealed trait left extends DeleteShiftDirection
  
  @js.native
  sealed trait up extends DeleteShiftDirection
  
}

