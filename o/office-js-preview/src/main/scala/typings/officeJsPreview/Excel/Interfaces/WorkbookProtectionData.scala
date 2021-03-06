package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `workbookProtection.toJSON()`. */
trait WorkbookProtectionData extends js.Object {
  /**
    *
    * Specifies if the workbook is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}

object WorkbookProtectionData {
  @scala.inline
  def apply(`protected`: js.UndefOr[Boolean] = js.undefined): WorkbookProtectionData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookProtectionData]
  }
}

