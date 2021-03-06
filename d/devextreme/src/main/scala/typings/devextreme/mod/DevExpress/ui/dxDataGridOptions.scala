package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowCollapsing
import typings.devextreme.anon.AllowColumnDragging
import typings.devextreme.anon.AllowDropInsideItem
import typings.devextreme.anon.AllowExportSelectedData
import typings.devextreme.anon.AllowedPageSizes
import typings.devextreme.anon.ApplyFilter
import typings.devextreme.anon.AscendingText
import typings.devextreme.anon.AutoExpandAll
import typings.devextreme.anon.BrokenRules
import typings.devextreme.anon.CalculateCustomSummary
import typings.devextreme.anon.CancelColumn
import typings.devextreme.anon.CancelComponent
import typings.devextreme.anon.CellElement
import typings.devextreme.anon.ColumnIndex
import typings.devextreme.anon.Columns
import typings.devextreme.anon.ComponentData
import typings.devextreme.anon.ComponentDxDataGrid
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.CurrentDeselectedRowKeys
import typings.devextreme.anon.CustomLoad
import typings.devextreme.anon.CustomizeText
import typings.devextreme.anon.DataElement
import typings.devextreme.anon.DataField
import typings.devextreme.anon.Disabled
import typings.devextreme.anon.DisplayValue
import typings.devextreme.anon.EditOnKeyPress
import typings.devextreme.anon.Element
import typings.devextreme.anon.ElementFileName
import typings.devextreme.anon.ElementKey
import typings.devextreme.anon.EmptyPanelText
import typings.devextreme.anon.Enabled
import typings.devextreme.anon.Error
import typings.devextreme.anon.Filtering
import typings.devextreme.anon.FormOptions
import typings.devextreme.anon.Format
import typings.devextreme.anon.GroupColumn
import typings.devextreme.anon.GroupIndex
import typings.devextreme.anon.Handled
import typings.devextreme.anon.Height
import typings.devextreme.anon.HighlightCaseSensitive
import typings.devextreme.anon.IndicatorSrc
import typings.devextreme.anon.IsExpanded
import typings.devextreme.anon.IsNewRow
import typings.devextreme.anon.IsSelected
import typings.devextreme.anon.Items
import typings.devextreme.anon.Key
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.NewData
import typings.devextreme.anon.NewRowIndex
import typings.devextreme.anon.Promise
import typings.devextreme.anon.Row
import typings.devextreme.anon.RowElement
import typings.devextreme.anon.ToolbarOptions
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.nextColumn
import typings.devextreme.devextremeStrings.widget
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridOptions extends GridBaseOptions[dxDataGrid] {
  /** @name dxDataGrid.Options.columns */
  @JSName("columns")
  var columns_dxDataGridOptions: js.UndefOr[js.Array[dxDataGridColumn | String]] = js.undefined
  /** @name dxDataGrid.Options.customizeColumns */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[dxDataGridColumn], _]] = js.undefined
  /** @name dxDataGrid.Options.customizeExportData */
  var customizeExportData: js.UndefOr[
    js.Function2[
      /* columns */ js.Array[dxDataGridColumn], 
      /* rows */ js.Array[dxDataGridRowObject], 
      _
    ]
  ] = js.undefined
  /** @name dxDataGrid.Options.editing */
  @JSName("editing")
  var editing_dxDataGridOptions: js.UndefOr[dxDataGridEditing] = js.undefined
  /** @name dxDataGrid.Options.export */
  var export: js.UndefOr[AllowExportSelectedData] = js.undefined
  /** @name dxDataGrid.Options.groupPanel */
  var groupPanel: js.UndefOr[AllowColumnDragging] = js.undefined
  /** @name dxDataGrid.Options.grouping */
  var grouping: js.UndefOr[AllowCollapsing] = js.undefined
  /** @name dxDataGrid.Options.keyExpr */
  var keyExpr: js.UndefOr[String | js.Array[String]] = js.undefined
  /** @name dxDataGrid.Options.masterDetail */
  var masterDetail: js.UndefOr[AutoExpandAll] = js.undefined
  /** @name dxDataGrid.Options.onCellClick */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellElement, _]) | String] = js.undefined
  /** @name dxDataGrid.Options.onCellDblClick */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ ColumnIndex, _]] = js.undefined
  /** @name dxDataGrid.Options.onCellHoverChanged */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ DisplayValue, _]] = js.undefined
  /** @name dxDataGrid.Options.onCellPrepared */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ IsExpanded, _]] = js.undefined
  /** @name dxDataGrid.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ Items, _]] = js.undefined
  /** @name dxDataGrid.Options.onEditingStart */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ CancelColumn, _]] = js.undefined
  /** @name dxDataGrid.Options.onEditorPrepared */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ DataField, _]] = js.undefined
  /** @name dxDataGrid.Options.onEditorPreparing */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ Disabled, _]] = js.undefined
  /** @name dxDataGrid.Options.onExported */
  var onExported: js.UndefOr[js.Function1[/* e */ ComponentDxDataGrid, _]] = js.undefined
  /** @name dxDataGrid.Options.onExporting */
  var onExporting: js.UndefOr[js.Function1[/* e */ ElementFileName, _]] = js.undefined
  /** @name dxDataGrid.Options.onFileSaving */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ Format, _]] = js.undefined
  /** @name dxDataGrid.Options.onFocusedCellChanged */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ Row, _]] = js.undefined
  /** @name dxDataGrid.Options.onFocusedCellChanging */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ Columns, _]] = js.undefined
  /** @name dxDataGrid.Options.onFocusedRowChanged */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ RowElement, _]] = js.undefined
  /** @name dxDataGrid.Options.onFocusedRowChanging */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ NewRowIndex, _]] = js.undefined
  /** @name dxDataGrid.Options.onRowClick */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ GroupIndex, _]) | String] = js.undefined
  /** @name dxDataGrid.Options.onRowDblClick */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ IsNewRow, _]] = js.undefined
  /** @name dxDataGrid.Options.onRowPrepared */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ IsSelected, _]] = js.undefined
  /** @name dxDataGrid.Options.remoteOperations */
  var remoteOperations: js.UndefOr[Boolean | Filtering | auto] = js.undefined
  /** @name dxDataGrid.Options.rowTemplate */
  var rowTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* rowElement */ dxElement, /* rowInfo */ js.Any, _])
  ] = js.undefined
  /** @name dxDataGrid.Options.scrolling */
  @JSName("scrolling")
  var scrolling_dxDataGridOptions: js.UndefOr[dxDataGridScrolling] = js.undefined
  /** @name dxDataGrid.Options.selectionFilter */
  var selectionFilter: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** @name dxDataGrid.Options.selection */
  @JSName("selection")
  var selection_dxDataGridOptions: js.UndefOr[dxDataGridSelection] = js.undefined
  /** @name dxDataGrid.Options.sortByGroupSummaryInfo */
  var sortByGroupSummaryInfo: js.UndefOr[js.Array[GroupColumn]] = js.undefined
  /** @name dxDataGrid.Options.summary */
  var summary: js.UndefOr[CalculateCustomSummary] = js.undefined
}

object dxDataGridOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowColumnReordering: js.UndefOr[Boolean] = js.undefined,
    allowColumnResizing: js.UndefOr[Boolean] = js.undefined,
    autoNavigateToFocusedRow: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    cacheEnabled: js.UndefOr[Boolean] = js.undefined,
    cellHintEnabled: js.UndefOr[Boolean] = js.undefined,
    columnAutoWidth: js.UndefOr[Boolean] = js.undefined,
    columnChooser: EmptyPanelText = null,
    columnFixing: Enabled = null,
    columnHidingEnabled: js.UndefOr[Boolean] = js.undefined,
    columnMinWidth: js.UndefOr[Double] = js.undefined,
    columnResizingMode: nextColumn | widget = null,
    columnWidth: js.UndefOr[Double] = js.undefined,
    columns: js.Array[dxDataGridColumn | String] = null,
    customizeColumns: /* columns */ js.Array[dxDataGridColumn] => _ = null,
    customizeExportData: (/* columns */ js.Array[dxDataGridColumn], /* rows */ js.Array[dxDataGridRowObject]) => _ = null,
    dataSource: String | js.Array[_] | DataSource | DataSourceOptions = null,
    dateSerializationFormat: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editing: dxDataGridEditing = null,
    elementAttr: js.Any = null,
    errorRowEnabled: js.UndefOr[Boolean] = js.undefined,
    export: AllowExportSelectedData = null,
    filterBuilder: dxFilterBuilderOptions = null,
    filterBuilderPopup: dxPopupOptions[dxPopup] = null,
    filterPanel: CustomizeText[dxDataGrid] = null,
    filterRow: ApplyFilter = null,
    filterSyncEnabled: Boolean | auto = null,
    filterValue: String | js.Array[_] | js.Function = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedColumnIndex: js.UndefOr[Double] = js.undefined,
    focusedRowEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedRowIndex: js.UndefOr[Double] = js.undefined,
    focusedRowKey: js.Any = null,
    groupPanel: AllowColumnDragging = null,
    grouping: AllowCollapsing = null,
    headerFilter: Height = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    highlightChanges: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    keyExpr: String | js.Array[String] = null,
    keyboardNavigation: EditOnKeyPress = null,
    loadPanel: IndicatorSrc = null,
    masterDetail: AutoExpandAll = null,
    noDataText: String = null,
    onAdaptiveDetailRowPreparing: /* e */ FormOptions[dxDataGrid] => _ = null,
    onCellClick: (js.Function1[/* e */ CellElement, _]) | String = null,
    onCellDblClick: /* e */ ColumnIndex => _ = null,
    onCellHoverChanged: /* e */ DisplayValue => _ = null,
    onCellPrepared: /* e */ IsExpanded => _ = null,
    onContentReady: /* e */ ComponentElement[dxDataGrid] => _ = null,
    onContextMenuPreparing: /* e */ Items => _ = null,
    onDataErrorOccurred: /* e */ Error[dxDataGrid] => _ = null,
    onDisposing: /* e */ Model[dxDataGrid] => _ = null,
    onEditingStart: /* e */ CancelColumn => _ = null,
    onEditorPrepared: /* options */ DataField => _ = null,
    onEditorPreparing: /* e */ Disabled => _ = null,
    onExported: /* e */ ComponentDxDataGrid => _ = null,
    onExporting: /* e */ ElementFileName => _ = null,
    onFileSaving: /* e */ Format => _ = null,
    onFocusedCellChanged: /* e */ Row => _ = null,
    onFocusedCellChanging: /* e */ Columns => _ = null,
    onFocusedRowChanged: /* e */ RowElement => _ = null,
    onFocusedRowChanging: /* e */ NewRowIndex => _ = null,
    onInitNewRow: /* e */ Promise[dxDataGrid] => _ = null,
    onInitialized: /* e */ Element[dxDataGrid] => _ = null,
    onKeyDown: /* e */ Handled[dxDataGrid] => _ = null,
    onOptionChanged: /* e */ Name[dxDataGrid] => _ = null,
    onRowClick: (js.Function1[/* e */ GroupIndex, _]) | String = null,
    onRowCollapsed: /* e */ Key[dxDataGrid] => _ = null,
    onRowCollapsing: /* e */ CancelComponent[dxDataGrid] => _ = null,
    onRowDblClick: /* e */ IsNewRow => _ = null,
    onRowExpanded: /* e */ Key[dxDataGrid] => _ = null,
    onRowExpanding: /* e */ CancelComponent[dxDataGrid] => _ = null,
    onRowInserted: /* e */ ComponentData[dxDataGrid] => _ = null,
    onRowInserting: /* e */ DataElement[dxDataGrid] => _ = null,
    onRowPrepared: /* e */ IsSelected => _ = null,
    onRowRemoved: /* e */ ComponentData[dxDataGrid] => _ = null,
    onRowRemoving: /* e */ ElementKey[dxDataGrid] => _ = null,
    onRowUpdated: /* e */ ComponentData[dxDataGrid] => _ = null,
    onRowUpdating: /* e */ NewData[dxDataGrid] => _ = null,
    onRowValidating: /* e */ BrokenRules[dxDataGrid] => _ = null,
    onSelectionChanged: /* e */ CurrentDeselectedRowKeys[dxDataGrid] => _ = null,
    onToolbarPreparing: /* e */ ToolbarOptions[dxDataGrid] => _ = null,
    pager: AllowedPageSizes = null,
    paging: GridBasePaging = null,
    remoteOperations: Boolean | Filtering | auto = null,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined,
    rowDragging: AllowDropInsideItem = null,
    rowTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* rowElement */ dxElement, /* rowInfo */ js.Any, _]) = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: dxDataGridScrolling = null,
    searchPanel: HighlightCaseSensitive = null,
    selectedRowKeys: js.Array[_] = null,
    selection: dxDataGridSelection = null,
    selectionFilter: String | js.Array[_] | js.Function = null,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showColumnHeaders: js.UndefOr[Boolean] = js.undefined,
    showColumnLines: js.UndefOr[Boolean] = js.undefined,
    showRowLines: js.UndefOr[Boolean] = js.undefined,
    sortByGroupSummaryInfo: js.Array[GroupColumn] = null,
    sorting: AscendingText = null,
    stateStoring: CustomLoad = null,
    summary: CalculateCustomSummary = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    twoWayBindingEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxDataGridOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnReordering)) __obj.updateDynamic("allowColumnReordering")(allowColumnReordering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnResizing)) __obj.updateDynamic("allowColumnResizing")(allowColumnResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoNavigateToFocusedRow)) __obj.updateDynamic("autoNavigateToFocusedRow")(autoNavigateToFocusedRow.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheEnabled)) __obj.updateDynamic("cacheEnabled")(cacheEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHintEnabled)) __obj.updateDynamic("cellHintEnabled")(cellHintEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnAutoWidth)) __obj.updateDynamic("columnAutoWidth")(columnAutoWidth.get.asInstanceOf[js.Any])
    if (columnChooser != null) __obj.updateDynamic("columnChooser")(columnChooser.asInstanceOf[js.Any])
    if (columnFixing != null) __obj.updateDynamic("columnFixing")(columnFixing.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHidingEnabled)) __obj.updateDynamic("columnHidingEnabled")(columnHidingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnMinWidth)) __obj.updateDynamic("columnMinWidth")(columnMinWidth.get.asInstanceOf[js.Any])
    if (columnResizingMode != null) __obj.updateDynamic("columnResizingMode")(columnResizingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (customizeColumns != null) __obj.updateDynamic("customizeColumns")(js.Any.fromFunction1(customizeColumns))
    if (customizeExportData != null) __obj.updateDynamic("customizeExportData")(js.Any.fromFunction2(customizeExportData))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(errorRowEnabled)) __obj.updateDynamic("errorRowEnabled")(errorRowEnabled.get.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (filterBuilder != null) __obj.updateDynamic("filterBuilder")(filterBuilder.asInstanceOf[js.Any])
    if (filterBuilderPopup != null) __obj.updateDynamic("filterBuilderPopup")(filterBuilderPopup.asInstanceOf[js.Any])
    if (filterPanel != null) __obj.updateDynamic("filterPanel")(filterPanel.asInstanceOf[js.Any])
    if (filterRow != null) __obj.updateDynamic("filterRow")(filterRow.asInstanceOf[js.Any])
    if (filterSyncEnabled != null) __obj.updateDynamic("filterSyncEnabled")(filterSyncEnabled.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedColumnIndex)) __obj.updateDynamic("focusedColumnIndex")(focusedColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedRowEnabled)) __obj.updateDynamic("focusedRowEnabled")(focusedRowEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedRowIndex)) __obj.updateDynamic("focusedRowIndex")(focusedRowIndex.get.asInstanceOf[js.Any])
    if (focusedRowKey != null) __obj.updateDynamic("focusedRowKey")(focusedRowKey.asInstanceOf[js.Any])
    if (groupPanel != null) __obj.updateDynamic("groupPanel")(groupPanel.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightChanges)) __obj.updateDynamic("highlightChanges")(highlightChanges.get.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (loadPanel != null) __obj.updateDynamic("loadPanel")(loadPanel.asInstanceOf[js.Any])
    if (masterDetail != null) __obj.updateDynamic("masterDetail")(masterDetail.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAdaptiveDetailRowPreparing != null) __obj.updateDynamic("onAdaptiveDetailRowPreparing")(js.Any.fromFunction1(onAdaptiveDetailRowPreparing))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(onCellClick.asInstanceOf[js.Any])
    if (onCellDblClick != null) __obj.updateDynamic("onCellDblClick")(js.Any.fromFunction1(onCellDblClick))
    if (onCellHoverChanged != null) __obj.updateDynamic("onCellHoverChanged")(js.Any.fromFunction1(onCellHoverChanged))
    if (onCellPrepared != null) __obj.updateDynamic("onCellPrepared")(js.Any.fromFunction1(onCellPrepared))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onContextMenuPreparing != null) __obj.updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1(onContextMenuPreparing))
    if (onDataErrorOccurred != null) __obj.updateDynamic("onDataErrorOccurred")(js.Any.fromFunction1(onDataErrorOccurred))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEditingStart != null) __obj.updateDynamic("onEditingStart")(js.Any.fromFunction1(onEditingStart))
    if (onEditorPrepared != null) __obj.updateDynamic("onEditorPrepared")(js.Any.fromFunction1(onEditorPrepared))
    if (onEditorPreparing != null) __obj.updateDynamic("onEditorPreparing")(js.Any.fromFunction1(onEditorPreparing))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onFocusedCellChanged != null) __obj.updateDynamic("onFocusedCellChanged")(js.Any.fromFunction1(onFocusedCellChanged))
    if (onFocusedCellChanging != null) __obj.updateDynamic("onFocusedCellChanging")(js.Any.fromFunction1(onFocusedCellChanging))
    if (onFocusedRowChanged != null) __obj.updateDynamic("onFocusedRowChanged")(js.Any.fromFunction1(onFocusedRowChanged))
    if (onFocusedRowChanging != null) __obj.updateDynamic("onFocusedRowChanging")(js.Any.fromFunction1(onFocusedRowChanging))
    if (onInitNewRow != null) __obj.updateDynamic("onInitNewRow")(js.Any.fromFunction1(onInitNewRow))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick.asInstanceOf[js.Any])
    if (onRowCollapsed != null) __obj.updateDynamic("onRowCollapsed")(js.Any.fromFunction1(onRowCollapsed))
    if (onRowCollapsing != null) __obj.updateDynamic("onRowCollapsing")(js.Any.fromFunction1(onRowCollapsing))
    if (onRowDblClick != null) __obj.updateDynamic("onRowDblClick")(js.Any.fromFunction1(onRowDblClick))
    if (onRowExpanded != null) __obj.updateDynamic("onRowExpanded")(js.Any.fromFunction1(onRowExpanded))
    if (onRowExpanding != null) __obj.updateDynamic("onRowExpanding")(js.Any.fromFunction1(onRowExpanding))
    if (onRowInserted != null) __obj.updateDynamic("onRowInserted")(js.Any.fromFunction1(onRowInserted))
    if (onRowInserting != null) __obj.updateDynamic("onRowInserting")(js.Any.fromFunction1(onRowInserting))
    if (onRowPrepared != null) __obj.updateDynamic("onRowPrepared")(js.Any.fromFunction1(onRowPrepared))
    if (onRowRemoved != null) __obj.updateDynamic("onRowRemoved")(js.Any.fromFunction1(onRowRemoved))
    if (onRowRemoving != null) __obj.updateDynamic("onRowRemoving")(js.Any.fromFunction1(onRowRemoving))
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(js.Any.fromFunction1(onRowUpdated))
    if (onRowUpdating != null) __obj.updateDynamic("onRowUpdating")(js.Any.fromFunction1(onRowUpdating))
    if (onRowValidating != null) __obj.updateDynamic("onRowValidating")(js.Any.fromFunction1(onRowValidating))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onToolbarPreparing != null) __obj.updateDynamic("onToolbarPreparing")(js.Any.fromFunction1(onToolbarPreparing))
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (remoteOperations != null) __obj.updateDynamic("remoteOperations")(remoteOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowAlternationEnabled)) __obj.updateDynamic("rowAlternationEnabled")(rowAlternationEnabled.get.asInstanceOf[js.Any])
    if (rowDragging != null) __obj.updateDynamic("rowDragging")(rowDragging.asInstanceOf[js.Any])
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (searchPanel != null) __obj.updateDynamic("searchPanel")(searchPanel.asInstanceOf[js.Any])
    if (selectedRowKeys != null) __obj.updateDynamic("selectedRowKeys")(selectedRowKeys.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionFilter != null) __obj.updateDynamic("selectionFilter")(selectionFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnHeaders)) __obj.updateDynamic("showColumnHeaders")(showColumnHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnLines)) __obj.updateDynamic("showColumnLines")(showColumnLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowLines)) __obj.updateDynamic("showRowLines")(showRowLines.get.asInstanceOf[js.Any])
    if (sortByGroupSummaryInfo != null) __obj.updateDynamic("sortByGroupSummaryInfo")(sortByGroupSummaryInfo.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (stateStoring != null) __obj.updateDynamic("stateStoring")(stateStoring.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(twoWayBindingEnabled)) __obj.updateDynamic("twoWayBindingEnabled")(twoWayBindingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridOptions]
  }
}

