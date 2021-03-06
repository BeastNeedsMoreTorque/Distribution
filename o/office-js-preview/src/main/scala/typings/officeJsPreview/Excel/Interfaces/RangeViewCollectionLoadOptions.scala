package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of RangeView objects.
  *
  * [Api set: ExcelApi 1.3]
  */
trait RangeViewCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the cell addresses of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var cellAddresses: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The number of visible columns.
    *
    * [Api set: ExcelApi 1.3]
    */
  var columnCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns a value that represents the index of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  var index: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The number of visible rows.
    *
    * [Api set: ExcelApi 1.3]
    */
  var rowCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.3]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the type of data of each cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var valueTypes: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[Boolean] = js.undefined
}

object RangeViewCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    cellAddresses: js.UndefOr[Boolean] = js.undefined,
    columnCount: js.UndefOr[Boolean] = js.undefined,
    formulas: js.UndefOr[Boolean] = js.undefined,
    formulasLocal: js.UndefOr[Boolean] = js.undefined,
    formulasR1C1: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    rowCount: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    valueTypes: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined
  ): RangeViewCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellAddresses)) __obj.updateDynamic("cellAddresses")(cellAddresses.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formulas)) __obj.updateDynamic("formulas")(formulas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formulasLocal)) __obj.updateDynamic("formulasLocal")(formulasLocal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formulasR1C1)) __obj.updateDynamic("formulasR1C1")(formulasR1C1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTypes)) __obj.updateDynamic("valueTypes")(valueTypes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeViewCollectionLoadOptions]
  }
}

