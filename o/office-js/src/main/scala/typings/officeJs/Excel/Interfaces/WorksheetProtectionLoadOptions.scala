package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the protection of a sheet object.
  *
  * [Api set: ExcelApi 1.2]
  */
trait WorksheetProtectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the protection options for the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var options: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the worksheet is protected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}

object WorksheetProtectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    options: js.UndefOr[Boolean] = js.undefined,
    `protected`: js.UndefOr[Boolean] = js.undefined
  ): WorksheetProtectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProtectionLoadOptions]
  }
}

