package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel DataPivotHierarchy.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataPivotHierarchyLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldLoadOptions] = js.undefined
  /**
    *
    * Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the data should be shown as a specific summary calculation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if all items of the DataPivotHierarchy are shown.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[Boolean] = js.undefined
}

object DataPivotHierarchyLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    field: PivotFieldLoadOptions = null,
    id: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    showAs: js.UndefOr[Boolean] = js.undefined,
    summarizeBy: js.UndefOr[Boolean] = js.undefined
  ): DataPivotHierarchyLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAs)) __obj.updateDynamic("showAs")(showAs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(summarizeBy)) __obj.updateDynamic("summarizeBy")(summarizeBy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyLoadOptions]
  }
}

