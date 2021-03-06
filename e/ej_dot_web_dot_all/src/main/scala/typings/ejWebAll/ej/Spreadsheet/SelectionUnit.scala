package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionUnit extends js.Object

@JSGlobal("ej.Spreadsheet.SelectionUnit")
@js.native
object SelectionUnit extends js.Object {
  ///To enable MultiRange selection in Spreadsheet
  @js.native
  sealed trait MultiRange extends SelectionUnit
  
  ///To enable Range selection in Spreadsheet
  @js.native
  sealed trait Range extends SelectionUnit
  
  ///To enable Single selection in Spreadsheet
  @js.native
  sealed trait Single extends SelectionUnit
  
}

