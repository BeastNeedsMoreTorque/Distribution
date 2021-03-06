package typings.exceljs.anon

import typings.exceljs.exceljsStrings.NA
import typings.exceljs.exceljsStrings.None
import typings.exceljs.exceljsStrings.asDisplayed
import typings.exceljs.exceljsStrings.atEnd
import typings.exceljs.exceljsStrings.blank
import typings.exceljs.exceljsStrings.dash
import typings.exceljs.exceljsStrings.displayed
import typings.exceljs.exceljsStrings.downThenOver
import typings.exceljs.exceljsStrings.landscape
import typings.exceljs.exceljsStrings.overThenDown
import typings.exceljs.exceljsStrings.portrait
import typings.exceljs.mod.Margins
import typings.exceljs.mod.PaperSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.PageSetup> */
trait PartialPageSetup extends js.Object {
  var blackAndWhite: js.UndefOr[Boolean] = js.undefined
  var cellComments: js.UndefOr[atEnd | asDisplayed | None] = js.undefined
  var draft: js.UndefOr[Boolean] = js.undefined
  var errors: js.UndefOr[dash | blank | NA | displayed] = js.undefined
  var firstPageNumber: js.UndefOr[Double] = js.undefined
  var fitToHeight: js.UndefOr[Double] = js.undefined
  var fitToPage: js.UndefOr[Boolean] = js.undefined
  var fitToWidth: js.UndefOr[Double] = js.undefined
  var horizontalCentered: js.UndefOr[Boolean] = js.undefined
  var horizontalDpi: js.UndefOr[Double] = js.undefined
  var margins: js.UndefOr[Margins] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var pageOrder: js.UndefOr[downThenOver | overThenDown] = js.undefined
  var paperSize: js.UndefOr[PaperSize] = js.undefined
  var printArea: js.UndefOr[String] = js.undefined
  var printTitlesColumn: js.UndefOr[String] = js.undefined
  var printTitlesRow: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var showGridLines: js.UndefOr[Boolean] = js.undefined
  var showRowColHeaders: js.UndefOr[Boolean] = js.undefined
  var verticalCentered: js.UndefOr[Boolean] = js.undefined
  var verticalDpi: js.UndefOr[Double] = js.undefined
}

object PartialPageSetup {
  @scala.inline
  def apply(
    blackAndWhite: js.UndefOr[Boolean] = js.undefined,
    cellComments: atEnd | asDisplayed | None = null,
    draft: js.UndefOr[Boolean] = js.undefined,
    errors: dash | blank | NA | displayed = null,
    firstPageNumber: js.UndefOr[Double] = js.undefined,
    fitToHeight: js.UndefOr[Double] = js.undefined,
    fitToPage: js.UndefOr[Boolean] = js.undefined,
    fitToWidth: js.UndefOr[Double] = js.undefined,
    horizontalCentered: js.UndefOr[Boolean] = js.undefined,
    horizontalDpi: js.UndefOr[Double] = js.undefined,
    margins: Margins = null,
    orientation: portrait | landscape = null,
    pageOrder: downThenOver | overThenDown = null,
    paperSize: PaperSize = null,
    printArea: String = null,
    printTitlesColumn: String = null,
    printTitlesRow: String = null,
    scale: js.UndefOr[Double] = js.undefined,
    showGridLines: js.UndefOr[Boolean] = js.undefined,
    showRowColHeaders: js.UndefOr[Boolean] = js.undefined,
    verticalCentered: js.UndefOr[Boolean] = js.undefined,
    verticalDpi: js.UndefOr[Double] = js.undefined
  ): PartialPageSetup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blackAndWhite)) __obj.updateDynamic("blackAndWhite")(blackAndWhite.get.asInstanceOf[js.Any])
    if (cellComments != null) __obj.updateDynamic("cellComments")(cellComments.asInstanceOf[js.Any])
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft.get.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(firstPageNumber)) __obj.updateDynamic("firstPageNumber")(firstPageNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToHeight)) __obj.updateDynamic("fitToHeight")(fitToHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToPage)) __obj.updateDynamic("fitToPage")(fitToPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToWidth)) __obj.updateDynamic("fitToWidth")(fitToWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalCentered)) __obj.updateDynamic("horizontalCentered")(horizontalCentered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalDpi)) __obj.updateDynamic("horizontalDpi")(horizontalDpi.get.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pageOrder != null) __obj.updateDynamic("pageOrder")(pageOrder.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    if (printArea != null) __obj.updateDynamic("printArea")(printArea.asInstanceOf[js.Any])
    if (printTitlesColumn != null) __obj.updateDynamic("printTitlesColumn")(printTitlesColumn.asInstanceOf[js.Any])
    if (printTitlesRow != null) __obj.updateDynamic("printTitlesRow")(printTitlesRow.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowColHeaders)) __obj.updateDynamic("showRowColHeaders")(showRowColHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalCentered)) __obj.updateDynamic("verticalCentered")(verticalCentered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalDpi)) __obj.updateDynamic("verticalDpi")(verticalDpi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPageSetup]
  }
}

