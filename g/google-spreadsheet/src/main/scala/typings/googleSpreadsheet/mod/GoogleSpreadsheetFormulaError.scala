package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-spreadsheet", "GoogleSpreadsheetFormulaError")
@js.native
class GoogleSpreadsheetFormulaError protected () extends CellError {
  def this(errorInfo: CellError) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var `type`: CellErrorType = js.native
}

