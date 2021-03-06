package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a scoped collection of PivotTables. The PivotTables are sorted based on the location of the PivotTable's top-left corner. They are ordered top to bottom and then left to right.
  *
  * [Api set: ExcelApiOnline 1.1]
  */
trait PivotTableScopedCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotTable allows the application of multiple PivotFilters on a given PivotField in the table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Id of the PivotTable.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The PivotLayout describing the layout and visual structure of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layout: js.UndefOr[PivotLayoutLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The worksheet containing the current PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

object PivotTableScopedCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.undefined,
    enableDataValueEditing: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    layout: PivotLayoutLoadOptions = null,
    name: js.UndefOr[Boolean] = js.undefined,
    useCustomSortLists: js.UndefOr[Boolean] = js.undefined,
    worksheet: WorksheetLoadOptions = null
  ): PivotTableScopedCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultipleFiltersPerField)) __obj.updateDynamic("allowMultipleFiltersPerField")(allowMultipleFiltersPerField.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDataValueEditing)) __obj.updateDynamic("enableDataValueEditing")(enableDataValueEditing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomSortLists)) __obj.updateDynamic("useCustomSortLists")(useCustomSortLists.get.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableScopedCollectionLoadOptions]
  }
}

