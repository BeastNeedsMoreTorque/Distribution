package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid
import typings.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFields extends js.Object {
  var area: js.UndefOr[String] = js.undefined
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.undefined
  var cellElement: js.UndefOr[dxElement] = js.undefined
  var columnFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxPivotGrid] = js.undefined
  var dataFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var field: js.UndefOr[PivotGridDataSourceField] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var rowFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object ColumnFields {
  @scala.inline
  def apply(
    area: String = null,
    cell: dxPivotGridPivotGridCell = null,
    cellElement: dxElement = null,
    columnFields: js.Array[PivotGridDataSourceField] = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    component: dxPivotGrid = null,
    dataFields: js.Array[PivotGridDataSourceField] = null,
    element: dxElement = null,
    field: PivotGridDataSourceField = null,
    items: js.Array[_] = null,
    model: js.Any = null,
    rowFields: js.Array[PivotGridDataSourceField] = null,
    rowIndex: js.UndefOr[Double] = js.undefined
  ): ColumnFields = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (columnFields != null) __obj.updateDynamic("columnFields")(columnFields.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataFields != null) __obj.updateDynamic("dataFields")(dataFields.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (rowFields != null) __obj.updateDynamic("rowFields")(rowFields.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFields]
  }
}

