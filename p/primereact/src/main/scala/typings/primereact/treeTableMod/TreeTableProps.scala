package typings.primereact.treeTableMod

import typings.primereact.anon.Delta
import typings.primereact.anon.DropIndex
import typings.primereact.anon.First
import typings.primereact.anon.MultiSortMeta
import typings.primereact.anon.Node
import typings.primereact.anon.NodeOriginalEvent
import typings.primereact.anon.Value
import typings.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeTableProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined
  var autoLayout: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columnResizeMode: js.UndefOr[String] = js.undefined
  var contextMenuSelectionKey: js.UndefOr[js.Any] = js.undefined
  var currentPageReportTemplate: js.UndefOr[String] = js.undefined
  var defaultSortOrder: js.UndefOr[Double] = js.undefined
  var emptyMessage: js.UndefOr[String] = js.undefined
  var expandedKeys: js.UndefOr[js.Any] = js.undefined
  var filterLocale: js.UndefOr[String] = js.undefined
  var filterMode: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[js.Object] = js.undefined
  var first: js.UndefOr[Double] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var footerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenFooterColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenHeaderColumnGroup: js.UndefOr[js.Any] = js.undefined
  var frozenWidth: js.UndefOr[String] = js.undefined
  var globalFilter: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var headerColumnGroup: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var loadingIcon: js.UndefOr[String] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var multiSortMeta: js.UndefOr[js.Array[_]] = js.undefined
  var onColReorder: js.UndefOr[js.Function1[/* e */ DropIndex, Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var onColumnResizeEnd: js.UndefOr[js.Function1[/* e */ Delta, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.undefined
  var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onExpand: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filters */ js.Array[_], Unit]] = js.undefined
  var onPage: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.undefined
  var onRowClick: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* e */ MultiSortMeta, Unit]] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
  var onUnselect: js.UndefOr[js.Function1[/* e */ NodeOriginalEvent, Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[Double] = js.undefined
  var paginator: js.UndefOr[Boolean] = js.undefined
  var paginatorLeft: js.UndefOr[js.Any] = js.undefined
  var paginatorPosition: js.UndefOr[String] = js.undefined
  var paginatorRight: js.UndefOr[js.Any] = js.undefined
  var paginatorTemplate: js.UndefOr[String] = js.undefined
  var propagateSelectionDown: js.UndefOr[Boolean] = js.undefined
  var propagateSelectionUp: js.UndefOr[Boolean] = js.undefined
  var reorderableColumns: js.UndefOr[Boolean] = js.undefined
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* rowData */ js.Any, js.Object]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
  var scrollHeight: js.UndefOr[String] = js.undefined
  var scrollable: js.UndefOr[Boolean] = js.undefined
  var selectionKeys: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var sortField: js.UndefOr[String] = js.undefined
  var sortMode: js.UndefOr[String] = js.undefined
  var sortOrder: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var tableClassName: js.UndefOr[String] = js.undefined
  var tableStyle: js.UndefOr[js.Object] = js.undefined
  var totalRecords: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Array[TreeNode]] = js.undefined
}

object TreeTableProps {
  @scala.inline
  def apply(
    alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined,
    autoLayout: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    columnResizeMode: String = null,
    contextMenuSelectionKey: js.Any = null,
    currentPageReportTemplate: String = null,
    defaultSortOrder: js.UndefOr[Double] = js.undefined,
    emptyMessage: String = null,
    expandedKeys: js.Any = null,
    filterLocale: String = null,
    filterMode: String = null,
    filters: js.Object = null,
    first: js.UndefOr[Double] = js.undefined,
    footer: js.Any = null,
    footerColumnGroup: js.Any = null,
    frozenFooterColumnGroup: js.Any = null,
    frozenHeaderColumnGroup: js.Any = null,
    frozenWidth: String = null,
    globalFilter: js.Any = null,
    header: js.Any = null,
    headerColumnGroup: js.Any = null,
    id: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingIcon: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    multiSortMeta: js.Array[_] = null,
    onColReorder: /* e */ DropIndex => Unit = null,
    onCollapse: /* e */ NodeOriginalEvent => Unit = null,
    onColumnResizeEnd: /* e */ Delta => Unit = null,
    onContextMenu: /* e */ Node => Unit = null,
    onContextMenuSelectionChange: /* e */ Value => Unit = null,
    onExpand: /* e */ NodeOriginalEvent => Unit = null,
    onFilter: /* filters */ js.Array[_] => Unit = null,
    onPage: /* e */ First => Unit = null,
    onRowClick: /* e */ NodeOriginalEvent => Unit = null,
    onSelect: /* e */ NodeOriginalEvent => Unit = null,
    onSelectionChange: /* e */ Value => Unit = null,
    onSort: /* e */ MultiSortMeta => Unit = null,
    onToggle: /* e */ Value => Unit = null,
    onUnselect: /* e */ NodeOriginalEvent => Unit = null,
    pageLinkSize: js.UndefOr[Double] = js.undefined,
    paginator: js.UndefOr[Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: String = null,
    propagateSelectionDown: js.UndefOr[Boolean] = js.undefined,
    propagateSelectionUp: js.UndefOr[Boolean] = js.undefined,
    reorderableColumns: js.UndefOr[Boolean] = js.undefined,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    rowClassName: /* rowData */ js.Any => js.Object = null,
    rows: js.UndefOr[Double] = js.undefined,
    rowsPerPageOptions: js.Array[Double] = null,
    scrollHeight: String = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    selectionKeys: js.Any = null,
    selectionMode: String = null,
    sortField: String = null,
    sortMode: String = null,
    sortOrder: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    tabIndex: String = null,
    tableClassName: String = null,
    tableStyle: js.Object = null,
    totalRecords: js.UndefOr[Double] = js.undefined,
    value: js.Array[TreeNode] = null
  ): TreeTableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLayout)) __obj.updateDynamic("autoLayout")(autoLayout.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnResizeMode != null) __obj.updateDynamic("columnResizeMode")(columnResizeMode.asInstanceOf[js.Any])
    if (contextMenuSelectionKey != null) __obj.updateDynamic("contextMenuSelectionKey")(contextMenuSelectionKey.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSortOrder)) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.get.asInstanceOf[js.Any])
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage.asInstanceOf[js.Any])
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys.asInstanceOf[js.Any])
    if (filterLocale != null) __obj.updateDynamic("filterLocale")(filterLocale.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerColumnGroup != null) __obj.updateDynamic("footerColumnGroup")(footerColumnGroup.asInstanceOf[js.Any])
    if (frozenFooterColumnGroup != null) __obj.updateDynamic("frozenFooterColumnGroup")(frozenFooterColumnGroup.asInstanceOf[js.Any])
    if (frozenHeaderColumnGroup != null) __obj.updateDynamic("frozenHeaderColumnGroup")(frozenHeaderColumnGroup.asInstanceOf[js.Any])
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth.asInstanceOf[js.Any])
    if (globalFilter != null) __obj.updateDynamic("globalFilter")(globalFilter.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerColumnGroup != null) __obj.updateDynamic("headerColumnGroup")(headerColumnGroup.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.get.asInstanceOf[js.Any])
    if (multiSortMeta != null) __obj.updateDynamic("multiSortMeta")(multiSortMeta.asInstanceOf[js.Any])
    if (onColReorder != null) __obj.updateDynamic("onColReorder")(js.Any.fromFunction1(onColReorder))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onColumnResizeEnd != null) __obj.updateDynamic("onColumnResizeEnd")(js.Any.fromFunction1(onColumnResizeEnd))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuSelectionChange != null) __obj.updateDynamic("onContextMenuSelectionChange")(js.Any.fromFunction1(onContextMenuSelectionChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (onPage != null) __obj.updateDynamic("onPage")(js.Any.fromFunction1(onPage))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1(onUnselect))
    if (!js.isUndefined(pageLinkSize)) __obj.updateDynamic("pageLinkSize")(pageLinkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator.get.asInstanceOf[js.Any])
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft.asInstanceOf[js.Any])
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition.asInstanceOf[js.Any])
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight.asInstanceOf[js.Any])
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSelectionDown)) __obj.updateDynamic("propagateSelectionDown")(propagateSelectionDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSelectionUp)) __obj.updateDynamic("propagateSelectionUp")(propagateSelectionUp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reorderableColumns)) __obj.updateDynamic("reorderableColumns")(reorderableColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns.get.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.get.asInstanceOf[js.Any])
    if (selectionKeys != null) __obj.updateDynamic("selectionKeys")(selectionKeys.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortMode != null) __obj.updateDynamic("sortMode")(sortMode.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOrder)) __obj.updateDynamic("sortOrder")(sortOrder.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRecords)) __obj.updateDynamic("totalRecords")(totalRecords.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableProps]
  }
}

