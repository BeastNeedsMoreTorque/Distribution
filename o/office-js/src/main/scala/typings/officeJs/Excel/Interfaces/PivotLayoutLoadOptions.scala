package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the visual layout of the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
trait PivotLayoutLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if formatting will be automatically formatted when it’s refreshed or when fields are moved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the field list can be shown in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: js.UndefOr[Boolean] = js.undefined
}

object PivotLayoutLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    autoFormat: js.UndefOr[Boolean] = js.undefined,
    enableFieldList: js.UndefOr[Boolean] = js.undefined,
    layoutType: js.UndefOr[Boolean] = js.undefined,
    preserveFormatting: js.UndefOr[Boolean] = js.undefined,
    showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showRowGrandTotals: js.UndefOr[Boolean] = js.undefined,
    subtotalLocation: js.UndefOr[Boolean] = js.undefined
  ): PivotLayoutLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFormat)) __obj.updateDynamic("autoFormat")(autoFormat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFieldList)) __obj.updateDynamic("enableFieldList")(enableFieldList.get.asInstanceOf[js.Any])
    if (!js.isUndefined(layoutType)) __obj.updateDynamic("layoutType")(layoutType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFormatting)) __obj.updateDynamic("preserveFormatting")(preserveFormatting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnGrandTotals)) __obj.updateDynamic("showColumnGrandTotals")(showColumnGrandTotals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowGrandTotals)) __obj.updateDynamic("showRowGrandTotals")(showRowGrandTotals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subtotalLocation)) __obj.updateDynamic("subtotalLocation")(subtotalLocation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotLayoutLoadOptions]
  }
}

