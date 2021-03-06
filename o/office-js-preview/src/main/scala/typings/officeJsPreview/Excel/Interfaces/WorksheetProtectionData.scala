package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.WorksheetProtectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `worksheetProtection.toJSON()`. */
trait WorksheetProtectionData extends js.Object {
  /**
    *
    * Specifies the protection options for the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var options: js.UndefOr[WorksheetProtectionOptions] = js.undefined
  /**
    *
    * Specifies if the worksheet is protected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}

object WorksheetProtectionData {
  @scala.inline
  def apply(options: WorksheetProtectionOptions = null, `protected`: js.UndefOr[Boolean] = js.undefined): WorksheetProtectionData = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProtectionData]
  }
}

