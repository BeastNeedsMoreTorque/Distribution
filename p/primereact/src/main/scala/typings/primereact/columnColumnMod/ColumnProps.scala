package typings.primereact.columnColumnMod

import typings.primereact.anon.Field
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var bodyClassName: js.UndefOr[String] = js.undefined
  var bodyStyle: js.UndefOr[js.Object] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var columnKey: js.UndefOr[String] = js.undefined
  var editor: js.UndefOr[js.Function1[/* props */ js.Any, js.UndefOr[Element]]] = js.undefined
  var editorValidator: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.undefined
  var editorValidatorEvent: js.UndefOr[String] = js.undefined
  var excludeGlobalFilter: js.UndefOr[Boolean] = js.undefined
  var expander: js.UndefOr[Boolean] = js.undefined
  var exportable: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filterElement: js.UndefOr[js.Object] = js.undefined
  var filterField: js.UndefOr[String] = js.undefined
  var filterFunction: js.UndefOr[js.Function2[/* value */ js.Any, /* filter */ js.Any, Unit]] = js.undefined
  var filterHeaderClassName: js.UndefOr[String] = js.undefined
  var filterHeaderStyle: js.UndefOr[js.Object] = js.undefined
  var filterMatchMode: js.UndefOr[String] = js.undefined
  var filterMaxLength: js.UndefOr[Double] = js.undefined
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var filterType: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var footerClassName: js.UndefOr[String] = js.undefined
  var footerStyle: js.UndefOr[js.Object] = js.undefined
  var frozen: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerClassName: js.UndefOr[String] = js.undefined
  var headerStyle: js.UndefOr[js.Object] = js.undefined
  var loadingBody: js.UndefOr[js.Any] = js.undefined
  var onEditorCancel: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
  var onEditorSubmit: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
  var reorderable: js.UndefOr[Boolean] = js.undefined
  var rowEditor: js.UndefOr[Boolean] = js.undefined
  var rowReorder: js.UndefOr[Boolean] = js.undefined
  var rowReorderIcon: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var sortField: js.UndefOr[String] = js.undefined
  var sortFunction: js.UndefOr[js.Function1[/* e */ Field, Unit]] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply(
    body: js.Any = null,
    bodyClassName: String = null,
    bodyStyle: js.Object = null,
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    editor: /* props */ js.Any => js.UndefOr[Element] = null,
    editorValidator: /* props */ js.Any => Boolean = null,
    editorValidatorEvent: String = null,
    excludeGlobalFilter: js.UndefOr[Boolean] = js.undefined,
    expander: js.UndefOr[Boolean] = js.undefined,
    exportable: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterElement: js.Object = null,
    filterField: String = null,
    filterFunction: (/* value */ js.Any, /* filter */ js.Any) => Unit = null,
    filterHeaderClassName: String = null,
    filterHeaderStyle: js.Object = null,
    filterMatchMode: String = null,
    filterMaxLength: js.UndefOr[Double] = js.undefined,
    filterPlaceholder: String = null,
    filterType: String = null,
    footer: js.Any = null,
    footerClassName: String = null,
    footerStyle: js.Object = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    headerClassName: String = null,
    headerStyle: js.Object = null,
    loadingBody: js.Any = null,
    onEditorCancel: /* props */ js.Any => Unit = null,
    onEditorSubmit: /* props */ js.Any => Unit = null,
    reorderable: js.UndefOr[Boolean] = js.undefined,
    rowEditor: js.UndefOr[Boolean] = js.undefined,
    rowReorder: js.UndefOr[Boolean] = js.undefined,
    rowReorderIcon: String = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    selectionMode: String = null,
    sortField: String = null,
    sortFunction: /* e */ Field => Unit = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(js.Any.fromFunction1(editor))
    if (editorValidator != null) __obj.updateDynamic("editorValidator")(js.Any.fromFunction1(editorValidator))
    if (editorValidatorEvent != null) __obj.updateDynamic("editorValidatorEvent")(editorValidatorEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeGlobalFilter)) __obj.updateDynamic("excludeGlobalFilter")(excludeGlobalFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expander)) __obj.updateDynamic("expander")(expander.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exportable)) __obj.updateDynamic("exportable")(exportable.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (filterElement != null) __obj.updateDynamic("filterElement")(filterElement.asInstanceOf[js.Any])
    if (filterField != null) __obj.updateDynamic("filterField")(filterField.asInstanceOf[js.Any])
    if (filterFunction != null) __obj.updateDynamic("filterFunction")(js.Any.fromFunction2(filterFunction))
    if (filterHeaderClassName != null) __obj.updateDynamic("filterHeaderClassName")(filterHeaderClassName.asInstanceOf[js.Any])
    if (filterHeaderStyle != null) __obj.updateDynamic("filterHeaderStyle")(filterHeaderStyle.asInstanceOf[js.Any])
    if (filterMatchMode != null) __obj.updateDynamic("filterMatchMode")(filterMatchMode.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMaxLength)) __obj.updateDynamic("filterMaxLength")(filterMaxLength.get.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerClassName != null) __obj.updateDynamic("footerClassName")(footerClassName.asInstanceOf[js.Any])
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (loadingBody != null) __obj.updateDynamic("loadingBody")(loadingBody.asInstanceOf[js.Any])
    if (onEditorCancel != null) __obj.updateDynamic("onEditorCancel")(js.Any.fromFunction1(onEditorCancel))
    if (onEditorSubmit != null) __obj.updateDynamic("onEditorSubmit")(js.Any.fromFunction1(onEditorSubmit))
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowEditor)) __obj.updateDynamic("rowEditor")(rowEditor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowReorder)) __obj.updateDynamic("rowReorder")(rowReorder.get.asInstanceOf[js.Any])
    if (rowReorderIcon != null) __obj.updateDynamic("rowReorderIcon")(rowReorderIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortFunction != null) __obj.updateDynamic("sortFunction")(js.Any.fromFunction1(sortFunction))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
}

