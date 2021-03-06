package typings.agGrid.gridOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.anon.Instantiable
import typings.agGrid.anon.InstantiableAny
import typings.agGrid.anon.InstantiableICellRendererComp
import typings.agGrid.anon.InstantiableILoadingOverlayComp
import typings.agGrid.anon.InstantiableINoRowsOverlayComp
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.colDefMod.ColGroupDef
import typings.agGrid.colDefMod.IAggFunc
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.componentProviderMod.AgGridRegisteredComponentInput
import typings.agGrid.componentResolverMod.ComponentHolder
import typings.agGrid.eventsMod.BodyScrollEvent
import typings.agGrid.eventsMod.CellClickedEvent
import typings.agGrid.eventsMod.CellContextMenuEvent
import typings.agGrid.eventsMod.CellDoubleClickedEvent
import typings.agGrid.eventsMod.CellEditingStartedEvent
import typings.agGrid.eventsMod.CellEditingStoppedEvent
import typings.agGrid.eventsMod.CellFocusedEvent
import typings.agGrid.eventsMod.CellMouseDownEvent
import typings.agGrid.eventsMod.CellMouseOutEvent
import typings.agGrid.eventsMod.CellMouseOverEvent
import typings.agGrid.eventsMod.CellValueChangedEvent
import typings.agGrid.eventsMod.ColumnAggFuncChangeRequestEvent
import typings.agGrid.eventsMod.ColumnEverythingChangedEvent
import typings.agGrid.eventsMod.ColumnGroupOpenedEvent
import typings.agGrid.eventsMod.ColumnMovedEvent
import typings.agGrid.eventsMod.ColumnPinnedEvent
import typings.agGrid.eventsMod.ColumnPivotChangeRequestEvent
import typings.agGrid.eventsMod.ColumnPivotChangedEvent
import typings.agGrid.eventsMod.ColumnPivotModeChangedEvent
import typings.agGrid.eventsMod.ColumnResizedEvent
import typings.agGrid.eventsMod.ColumnRowGroupChangeRequestEvent
import typings.agGrid.eventsMod.ColumnRowGroupChangedEvent
import typings.agGrid.eventsMod.ColumnValueChangeRequestEvent
import typings.agGrid.eventsMod.ColumnValueChangedEvent
import typings.agGrid.eventsMod.ColumnVisibleEvent
import typings.agGrid.eventsMod.DisplayedColumnsChangedEvent
import typings.agGrid.eventsMod.DragStartedEvent
import typings.agGrid.eventsMod.DragStoppedEvent
import typings.agGrid.eventsMod.FilterChangedEvent
import typings.agGrid.eventsMod.FilterModifiedEvent
import typings.agGrid.eventsMod.GridColumnsChangedEvent
import typings.agGrid.eventsMod.GridReadyEvent
import typings.agGrid.eventsMod.ModelUpdatedEvent
import typings.agGrid.eventsMod.NewColumnsLoadedEvent
import typings.agGrid.eventsMod.PaginationChangedEvent
import typings.agGrid.eventsMod.PasteEndEvent
import typings.agGrid.eventsMod.PasteStartEvent
import typings.agGrid.eventsMod.PinnedRowDataChangedEvent
import typings.agGrid.eventsMod.RangeSelectionChangedEvent
import typings.agGrid.eventsMod.RowClickedEvent
import typings.agGrid.eventsMod.RowDataChangedEvent
import typings.agGrid.eventsMod.RowDataUpdatedEvent
import typings.agGrid.eventsMod.RowDoubleClickedEvent
import typings.agGrid.eventsMod.RowDragEvent
import typings.agGrid.eventsMod.RowEditingStartedEvent
import typings.agGrid.eventsMod.RowEditingStoppedEvent
import typings.agGrid.eventsMod.RowGroupOpenedEvent
import typings.agGrid.eventsMod.RowSelectedEvent
import typings.agGrid.eventsMod.RowValueChangedEvent
import typings.agGrid.eventsMod.SelectionChangedEvent
import typings.agGrid.eventsMod.SortChangedEvent
import typings.agGrid.eventsMod.ViewportChangedEvent
import typings.agGrid.eventsMod.VirtualColumnsChangedEvent
import typings.agGrid.eventsMod.VirtualRowRemovedEvent
import typings.agGrid.exportParamsMod.CsvExportParams
import typings.agGrid.exportParamsMod.ProcessCellForExportParams
import typings.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.gridCellMod.GridCellDef
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.iDatasourceMod.IDatasource
import typings.agGrid.iServerSideDatasourceMod.IServerSideDatasource
import typings.agGrid.iViewportDatasourceMod.IViewportDatasource
import typings.agGrid.rowNodeMod.RowNode
import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends ComponentHolder {
  var accentedSort: js.UndefOr[Boolean] = js.undefined
  var aggFuncs: js.UndefOr[StringDictionary[IAggFunc]] = js.undefined
  var aggregateOnlyChangedColumns: js.UndefOr[Boolean] = js.undefined
  var alignedGrids: js.UndefOr[js.Array[GridOptions]] = js.undefined
  var allowContextMenuWithControlKey: js.UndefOr[Boolean] = js.undefined
  var alwaysShowStatusBar: js.UndefOr[Boolean] = js.undefined
  var angularCompileFilters: js.UndefOr[Boolean] = js.undefined
  var angularCompileHeaders: js.UndefOr[Boolean] = js.undefined
  var angularCompileRows: js.UndefOr[Boolean] = js.undefined
  var animateRows: js.UndefOr[Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var api: js.UndefOr[GridApi] = js.undefined
  var autoGroupColumnDef: js.UndefOr[ColDef] = js.undefined
  var autoSizePadding: js.UndefOr[Double] = js.undefined
  var batchUpdateWaitMillis: js.UndefOr[Double] = js.undefined
  var cacheBlockSize: js.UndefOr[Double] = js.undefined
  var cacheOverflowSize: js.UndefOr[Double] = js.undefined
  var cacheQuickFilter: js.UndefOr[Boolean] = js.undefined
  var clipboardDeliminator: js.UndefOr[String] = js.undefined
  var colResizeDefault: js.UndefOr[String] = js.undefined
  var colWidth: js.UndefOr[Double] = js.undefined
  var columnApi: js.UndefOr[ColumnApi] = js.undefined
  var columnDefs: js.UndefOr[js.Array[ColDef | ColGroupDef]] = js.undefined
  var columnTypes: js.UndefOr[StringDictionary[ColDef]] = js.undefined
  var components: js.UndefOr[StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]]] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var context: js.UndefOr[js.Any] = js.undefined
  var contractColumnSelection: js.UndefOr[Boolean] = js.undefined
  var datasource: js.UndefOr[IDatasource] = js.undefined
  var dateComponent: js.UndefOr[Instantiable] = js.undefined
  var dateComponentFramework: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var defaultColDef: js.UndefOr[ColDef] = js.undefined
  var defaultColGroupDef: js.UndefOr[ColGroupDef] = js.undefined
  var defaultExportParams: js.UndefOr[CsvExportParams] = js.undefined
  var defaultGroupSortComparator: js.UndefOr[js.Function2[/* nodeA */ RowNode, /* nodeB */ RowNode, Double]] = js.undefined
  var deltaRowDataMode: js.UndefOr[Boolean] = js.undefined
  var detailCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
  var detailCellRendererFramework: js.UndefOr[js.Any] = js.undefined
  var detailCellRendererParams: js.UndefOr[js.Any] = js.undefined
  var detailRowHeight: js.UndefOr[Double] = js.undefined
  var doesDataFlower: js.UndefOr[js.Function1[/* dataItem */ js.Any, Boolean]] = js.undefined
  var doesExternalFilterPass: js.UndefOr[js.Function1[/* node */ RowNode, Boolean]] = js.undefined
  var domLayout: js.UndefOr[String] = js.undefined
  var editType: js.UndefOr[String] = js.undefined
  var embedFullWidthRows: js.UndefOr[Boolean] = js.undefined
  var enableCellChangeFlash: js.UndefOr[Boolean] = js.undefined
  var enableCellExpressions: js.UndefOr[Boolean] = js.undefined
  var enableColResize: js.UndefOr[Boolean] = js.undefined
  var enableFilter: js.UndefOr[Boolean] = js.undefined
  var enableGroupEdit: js.UndefOr[Boolean] = js.undefined
  var enableOldSetFilterModel: js.UndefOr[Boolean] = js.undefined
  var enableRangeSelection: js.UndefOr[Boolean] = js.undefined
  var enableRtl: js.UndefOr[Boolean] = js.undefined
  var enableServerSideFilter: js.UndefOr[Boolean] = js.undefined
  var enableServerSideSorting: js.UndefOr[Boolean] = js.undefined
  var enableSorting: js.UndefOr[Boolean] = js.undefined
  var enableStatusBar: js.UndefOr[Boolean] = js.undefined
  var ensureDomOrder: js.UndefOr[Boolean] = js.undefined
  var enterMovesDown: js.UndefOr[Boolean] = js.undefined
  var enterMovesDownAfterEdit: js.UndefOr[Boolean] = js.undefined
  var excelStyles: js.UndefOr[js.Array[_]] = js.undefined
  var floatingFilter: js.UndefOr[Boolean] = js.undefined
  var floatingFiltersHeight: js.UndefOr[Double] = js.undefined
  var forPrint: js.UndefOr[Boolean] = js.undefined
  var frameworkComponents: js.UndefOr[StringDictionary[InstantiableAny]] = js.undefined
  var fullWidthCellRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
  var fullWidthCellRendererFramework: js.UndefOr[js.Any] = js.undefined
  var fullWidthCellRendererParams: js.UndefOr[js.Any] = js.undefined
  var functionsPassive: js.UndefOr[Boolean] = js.undefined
  var functionsReadOnly: js.UndefOr[Boolean] = js.undefined
  var getBusinessKeyForNode: js.UndefOr[js.Function1[/* node */ RowNode, String]] = js.undefined
  var getChildCount: js.UndefOr[js.Function1[/* dataItem */ js.Any, Double]] = js.undefined
  var getContextMenuItems: js.UndefOr[GetContextMenuItems] = js.undefined
  var getDataPath: js.UndefOr[GetDataPath] = js.undefined
  var getDocument: js.UndefOr[js.Function0[Document]] = js.undefined
  var getMainMenuItems: js.UndefOr[GetMainMenuItems] = js.undefined
  var getNodeChildDetails: js.UndefOr[GetNodeChildDetails] = js.undefined
  var getRowClass: js.UndefOr[js.Function1[/* params */ js.Any, String | js.Array[String]]] = js.undefined
  var getRowHeight: js.UndefOr[js.Function] = js.undefined
  var getRowNodeId: js.UndefOr[GetRowNodeIdFunc] = js.undefined
  var getRowStyle: js.UndefOr[js.Function] = js.undefined
  var gridAutoHeight: js.UndefOr[Boolean] = js.undefined
  var groupColumnDef: js.UndefOr[ColDef] = js.undefined
  var groupDefaultExpanded: js.UndefOr[Double] = js.undefined
  var groupHeaderHeight: js.UndefOr[Double] = js.undefined
  var groupHideOpenParents: js.UndefOr[Boolean] = js.undefined
  var groupIncludeFooter: js.UndefOr[Boolean] = js.undefined
  var groupIncludeTotalFooter: js.UndefOr[Boolean] = js.undefined
  var groupMultiAutoColumn: js.UndefOr[Boolean] = js.undefined
  var groupRemoveLowestSingleChildren: js.UndefOr[Boolean] = js.undefined
  var groupRemoveSingleChildren: js.UndefOr[Boolean] = js.undefined
  var groupRowAggNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], _]] = js.undefined
  var groupRowInnerRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
  var groupRowInnerRendererFramework: js.UndefOr[js.Any] = js.undefined
  var groupRowRenderer: js.UndefOr[InstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
  var groupRowRendererFramework: js.UndefOr[js.Any] = js.undefined
  var groupRowRendererParams: js.UndefOr[js.Any] = js.undefined
  var groupSelectsChildren: js.UndefOr[Boolean] = js.undefined
  var groupSelectsFiltered: js.UndefOr[Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var groupSuppressAutoColumn: js.UndefOr[Boolean] = js.undefined
  var groupSuppressBlankHeader: js.UndefOr[Boolean] = js.undefined
  var groupSuppressRow: js.UndefOr[Boolean] = js.undefined
  var groupUseEntireRow: js.UndefOr[Boolean] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var infiniteInitialRowCount: js.UndefOr[Double] = js.undefined
  var isExternalFilterPresent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var isFullWidthCell: js.UndefOr[js.Function1[/* rowNode */ RowNode, Boolean]] = js.undefined
  var isRowMaster: js.UndefOr[IsRowMaster] = js.undefined
  var isRowSelectable: js.UndefOr[IsRowSelectable] = js.undefined
  var loadingOverlayComponent: js.UndefOr[InstantiableILoadingOverlayComp | String] = js.undefined
  var loadingOverlayComponentFramework: js.UndefOr[js.Any] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var localeText: js.UndefOr[js.Any] = js.undefined
  var localeTextFunc: js.UndefOr[js.Function] = js.undefined
  var masterDetail: js.UndefOr[Boolean] = js.undefined
  var maxBlocksInCache: js.UndefOr[Double] = js.undefined
  var maxColWidth: js.UndefOr[Double] = js.undefined
  var maxConcurrentDatasourceRequests: js.UndefOr[Double] = js.undefined
  var minColWidth: js.UndefOr[Double] = js.undefined
  var multiSortKey: js.UndefOr[String] = js.undefined
  var navigateToNextCell: js.UndefOr[js.Function1[/* params */ NavigateToNextCellParams, GridCellDef]] = js.undefined
  var noRowsOverlayComponent: js.UndefOr[InstantiableINoRowsOverlayComp | String] = js.undefined
  var noRowsOverlayComponentFramework: js.UndefOr[js.Any] = js.undefined
  var onBodyScroll: js.UndefOr[js.Function1[/* event */ BodyScrollEvent, Unit]] = js.undefined
  var onCellClicked: js.UndefOr[js.Function1[/* event */ CellClickedEvent, Unit]] = js.undefined
  var onCellContextMenu: js.UndefOr[js.Function1[/* event */ CellContextMenuEvent, Unit]] = js.undefined
  var onCellDoubleClicked: js.UndefOr[js.Function1[/* event */ CellDoubleClickedEvent, Unit]] = js.undefined
  var onCellEditingStarted: js.UndefOr[js.Function1[/* event */ CellEditingStartedEvent, Unit]] = js.undefined
  var onCellEditingStopped: js.UndefOr[js.Function1[/* event */ CellEditingStoppedEvent, Unit]] = js.undefined
  var onCellFocused: js.UndefOr[js.Function1[/* event */ CellFocusedEvent, Unit]] = js.undefined
  var onCellMouseDown: js.UndefOr[js.Function1[/* event */ CellMouseDownEvent, Unit]] = js.undefined
  var onCellMouseOut: js.UndefOr[js.Function1[/* event */ CellMouseOutEvent, Unit]] = js.undefined
  var onCellMouseOver: js.UndefOr[js.Function1[/* event */ CellMouseOverEvent, Unit]] = js.undefined
  var onCellValueChanged: js.UndefOr[js.Function1[/* event */ CellValueChangedEvent, Unit]] = js.undefined
  var onColumnAggFuncChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnAggFuncChangeRequestEvent, Unit]] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var onColumnEverythingChanged: js.UndefOr[js.Function1[/* event */ ColumnEverythingChangedEvent, Unit]] = js.undefined
  var onColumnGroupOpened: js.UndefOr[js.Function1[/* event */ ColumnGroupOpenedEvent, Unit]] = js.undefined
  var onColumnMoved: js.UndefOr[js.Function1[/* event */ ColumnMovedEvent, Unit]] = js.undefined
  var onColumnPinned: js.UndefOr[js.Function1[/* event */ ColumnPinnedEvent, Unit]] = js.undefined
  var onColumnPivotChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnPivotChangeRequestEvent, Unit]] = js.undefined
  var onColumnPivotChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotChangedEvent, Unit]] = js.undefined
  var onColumnPivotModeChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotModeChangedEvent, Unit]] = js.undefined
  var onColumnResized: js.UndefOr[js.Function1[/* event */ ColumnResizedEvent, Unit]] = js.undefined
  var onColumnRowGroupChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangeRequestEvent, Unit]] = js.undefined
  var onColumnRowGroupChanged: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangedEvent, Unit]] = js.undefined
  var onColumnValueChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnValueChangeRequestEvent, Unit]] = js.undefined
  var onColumnValueChanged: js.UndefOr[js.Function1[/* event */ ColumnValueChangedEvent, Unit]] = js.undefined
  var onColumnVisible: js.UndefOr[js.Function1[/* event */ ColumnVisibleEvent, Unit]] = js.undefined
  var onDisplayedColumnsChanged: js.UndefOr[js.Function1[/* event */ DisplayedColumnsChangedEvent, Unit]] = js.undefined
  var onDragStarted: js.UndefOr[js.Function1[/* event */ DragStartedEvent, Unit]] = js.undefined
  var onDragStopped: js.UndefOr[js.Function1[/* event */ DragStoppedEvent, Unit]] = js.undefined
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ FilterChangedEvent, Unit]] = js.undefined
  var onFilterModified: js.UndefOr[js.Function1[/* event */ FilterModifiedEvent, Unit]] = js.undefined
  var onGridColumnsChanged: js.UndefOr[js.Function1[/* event */ GridColumnsChangedEvent, Unit]] = js.undefined
  var onGridReady: js.UndefOr[js.Function1[/* event */ GridReadyEvent, Unit]] = js.undefined
  var onGridSizeChanged: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onModelUpdated: js.UndefOr[js.Function1[/* event */ ModelUpdatedEvent, Unit]] = js.undefined
  var onNewColumnsLoaded: js.UndefOr[js.Function1[/* event */ NewColumnsLoadedEvent, Unit]] = js.undefined
  var onPaginationChanged: js.UndefOr[js.Function1[/* event */ PaginationChangedEvent, Unit]] = js.undefined
  var onPasteEnd: js.UndefOr[js.Function1[/* event */ PasteEndEvent, Unit]] = js.undefined
  var onPasteStart: js.UndefOr[js.Function1[/* event */ PasteStartEvent, Unit]] = js.undefined
  var onPinnedRowDataChanged: js.UndefOr[js.Function1[/* event */ PinnedRowDataChangedEvent, Unit]] = js.undefined
  var onRangeSelectionChanged: js.UndefOr[js.Function1[/* event */ RangeSelectionChangedEvent, Unit]] = js.undefined
  var onRowClicked: js.UndefOr[js.Function1[/* event */ RowClickedEvent, Unit]] = js.undefined
  var onRowDataChanged: js.UndefOr[js.Function1[/* event */ RowDataChangedEvent, Unit]] = js.undefined
  var onRowDataUpdated: js.UndefOr[js.Function1[/* event */ RowDataUpdatedEvent, Unit]] = js.undefined
  var onRowDoubleClicked: js.UndefOr[js.Function1[/* event */ RowDoubleClickedEvent, Unit]] = js.undefined
  var onRowDragEnd: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
  var onRowDragEnter: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
  var onRowDragLeave: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
  var onRowDragMove: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
  var onRowEditingStarted: js.UndefOr[js.Function1[/* event */ RowEditingStartedEvent, Unit]] = js.undefined
  var onRowEditingStopped: js.UndefOr[js.Function1[/* event */ RowEditingStoppedEvent, Unit]] = js.undefined
  var onRowGroupOpened: js.UndefOr[js.Function1[/* event */ RowGroupOpenedEvent, Unit]] = js.undefined
  var onRowSelected: js.UndefOr[js.Function1[/* event */ RowSelectedEvent, Unit]] = js.undefined
  var onRowValueChanged: js.UndefOr[js.Function1[/* event */ RowValueChangedEvent, Unit]] = js.undefined
  var onSelectionChanged: js.UndefOr[js.Function1[/* event */ SelectionChangedEvent, Unit]] = js.undefined
  var onSortChanged: js.UndefOr[js.Function1[/* event */ SortChangedEvent, Unit]] = js.undefined
  var onViewportChanged: js.UndefOr[js.Function1[/* event */ ViewportChangedEvent, Unit]] = js.undefined
  var onVirtualColumnsChanged: js.UndefOr[js.Function1[/* event */ VirtualColumnsChangedEvent, Unit]] = js.undefined
  var onVirtualRowRemoved: js.UndefOr[js.Function1[/* event */ VirtualRowRemovedEvent, Unit]] = js.undefined
  var overlayLoadingTemplate: js.UndefOr[String] = js.undefined
  var overlayNoRowsTemplate: js.UndefOr[String] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var paginationAutoPageSize: js.UndefOr[Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var paginationNumberFormatter: js.UndefOr[js.Function1[/* params */ PaginationNumberFormatterParams, String]] = js.undefined
  var paginationPageSize: js.UndefOr[Double] = js.undefined
  var paginationStartPage: js.UndefOr[Double] = js.undefined
  var pinnedBottomRowData: js.UndefOr[js.Array[_]] = js.undefined
  var pinnedTopRowData: js.UndefOr[js.Array[_]] = js.undefined
  var pivotColumnGroupTotals: js.UndefOr[String] = js.undefined
  var pivotGroupHeaderHeight: js.UndefOr[Double] = js.undefined
  var pivotHeaderHeight: js.UndefOr[Double] = js.undefined
  var pivotMode: js.UndefOr[Boolean] = js.undefined
  var pivotPanelShow: js.UndefOr[String] = js.undefined
  var pivotRowTotals: js.UndefOr[String] = js.undefined
  var pivotTotals: js.UndefOr[Boolean] = js.undefined
  var popupParent: js.UndefOr[HTMLElement] = js.undefined
  var postProcessPopup: js.UndefOr[js.Function1[/* params */ PostProcessPopupParams, Unit]] = js.undefined
  var postSort: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], Unit]] = js.undefined
  var processCellForClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, _]] = js.undefined
  var processCellFromClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, _]] = js.undefined
  var processDataFromClipboard: js.UndefOr[
    js.Function1[/* params */ ProcessDataFromClipboardParams, js.Array[js.Array[String]]]
  ] = js.undefined
  var processHeaderForClipboard: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, _]] = js.undefined
  var processRowPostCreate: js.UndefOr[js.Function1[/* params */ ProcessRowParams, Unit]] = js.undefined
  var processSecondaryColDef: js.UndefOr[js.Function1[/* colDef */ ColDef, Unit]] = js.undefined
  var processSecondaryColGroupDef: js.UndefOr[js.Function1[/* colGroupDef */ ColGroupDef, Unit]] = js.undefined
  var purgeClosedRowNodes: js.UndefOr[Boolean] = js.undefined
  var quickFilterText: js.UndefOr[String] = js.undefined
  var rememberGroupStateWhenNewData: js.UndefOr[Boolean] = js.undefined
  var rowBuffer: js.UndefOr[Double] = js.undefined
  var rowClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var rowClassRules: js.UndefOr[StringDictionary[js.Function | String]] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var rowData: js.UndefOr[js.Array[_]] = js.undefined
  var rowDeselection: js.UndefOr[Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. PLEASE!*
    ****************************************************************/
  var rowDragManaged: js.UndefOr[Boolean] = js.undefined
  var rowGroupPanelShow: js.UndefOr[String] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var rowModelType: js.UndefOr[String] = js.undefined
  var rowMultiSelectWithClick: js.UndefOr[Boolean] = js.undefined
  var rowSelection: js.UndefOr[String] = js.undefined
  var rowStyle: js.UndefOr[js.Any] = js.undefined
  var scrollbarWidth: js.UndefOr[Double] = js.undefined
  var sendToClipboard: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.undefined
  var serverSideDatasource: js.UndefOr[IServerSideDatasource] = js.undefined
  var serverSideSortingAlwaysResets: js.UndefOr[Boolean] = js.undefined
  var showToolPanel: js.UndefOr[Boolean] = js.undefined
  var singleClickEdit: js.UndefOr[Boolean] = js.undefined
  var slaveGrids: js.UndefOr[js.Array[GridOptions]] = js.undefined
  var sortingOrder: js.UndefOr[js.Array[String]] = js.undefined
  var stopEditingWhenGridLosesFocus: js.UndefOr[Boolean] = js.undefined
  var suppressAggAtRootLevel: js.UndefOr[Boolean] = js.undefined
  var suppressAggFuncInHeader: js.UndefOr[Boolean] = js.undefined
  var suppressAnimationFrame: js.UndefOr[Boolean] = js.undefined
  var suppressAsyncEvents: js.UndefOr[Boolean] = js.undefined
  var suppressAutoSize: js.UndefOr[Boolean] = js.undefined
  var suppressCellSelection: js.UndefOr[Boolean] = js.undefined
  var suppressChangeDetection: js.UndefOr[Boolean] = js.undefined
  var suppressClickEdit: js.UndefOr[Boolean] = js.undefined
  var suppressClipboardPaste: js.UndefOr[Boolean] = js.undefined
  var suppressColumnMoveAnimation: js.UndefOr[Boolean] = js.undefined
  var suppressColumnVirtualisation: js.UndefOr[Boolean] = js.undefined
  var suppressContextMenu: js.UndefOr[Boolean] = js.undefined
  var suppressCopyRowsToClipboard: js.UndefOr[Boolean] = js.undefined
  var suppressCsvExport: js.UndefOr[Boolean] = js.undefined
  var suppressDragLeaveHidesColumns: js.UndefOr[Boolean] = js.undefined
  var suppressEnterpriseResetOnNewColumns: js.UndefOr[Boolean] = js.undefined
  var suppressExcelExport: js.UndefOr[Boolean] = js.undefined
  var suppressFieldDotNotation: js.UndefOr[Boolean] = js.undefined
  var suppressFocusAfterRefresh: js.UndefOr[Boolean] = js.undefined
  var suppressHorizontalScroll: js.UndefOr[Boolean] = js.undefined
  var suppressLoadingOverlay: js.UndefOr[Boolean] = js.undefined
  var suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[Boolean] = js.undefined
  var suppressMenuHide: js.UndefOr[Boolean] = js.undefined
  var suppressMiddleClickScrolls: js.UndefOr[Boolean] = js.undefined
  var suppressMovableColumns: js.UndefOr[Boolean] = js.undefined
  var suppressMultiRangeSelection: js.UndefOr[Boolean] = js.undefined
  var suppressMultiSort: js.UndefOr[Boolean] = js.undefined
  var suppressNoRowsOverlay: js.UndefOr[Boolean] = js.undefined
  var suppressPaginationPanel: js.UndefOr[Boolean] = js.undefined
  var suppressParentsInRowNodes: js.UndefOr[Boolean] = js.undefined
  var suppressPreventDefaultOnMouseWheel: js.UndefOr[Boolean] = js.undefined
  var suppressPropertyNamesCheck: js.UndefOr[Boolean] = js.undefined
  var suppressRowClickSelection: js.UndefOr[Boolean] = js.undefined
  var suppressRowDrag: js.UndefOr[Boolean] = js.undefined
  var suppressRowHoverHighlight: js.UndefOr[Boolean] = js.undefined
  var suppressRowTransform: js.UndefOr[Boolean] = js.undefined
  var suppressScrollOnNewData: js.UndefOr[Boolean] = js.undefined
  var suppressTabbing: js.UndefOr[Boolean] = js.undefined
  var suppressTouch: js.UndefOr[Boolean] = js.undefined
  var tabToNextCell: js.UndefOr[js.Function1[/* params */ TabToNextCellParams, GridCellDef]] = js.undefined
  var toolPanelSuppressColumnExpandAll: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressColumnFilter: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressColumnSelectAll: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressPivotMode: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressPivots: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressRowGroups: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressSideButtons: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressValues: js.UndefOr[Boolean] = js.undefined
  var treeData: js.UndefOr[Boolean] = js.undefined
  var unSortIcon: js.UndefOr[Boolean] = js.undefined
  var valueCache: js.UndefOr[Boolean] = js.undefined
  var valueCacheNeverExpires: js.UndefOr[Boolean] = js.undefined
  var viewportDatasource: js.UndefOr[IViewportDatasource] = js.undefined
  var viewportRowModelBufferSize: js.UndefOr[Double] = js.undefined
  var viewportRowModelPageSize: js.UndefOr[Double] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    ComponentHolder: ComponentHolder = null,
    accentedSort: js.UndefOr[Boolean] = js.undefined,
    aggFuncs: StringDictionary[IAggFunc] = null,
    aggregateOnlyChangedColumns: js.UndefOr[Boolean] = js.undefined,
    alignedGrids: js.Array[GridOptions] = null,
    allowContextMenuWithControlKey: js.UndefOr[Boolean] = js.undefined,
    alwaysShowStatusBar: js.UndefOr[Boolean] = js.undefined,
    angularCompileFilters: js.UndefOr[Boolean] = js.undefined,
    angularCompileHeaders: js.UndefOr[Boolean] = js.undefined,
    angularCompileRows: js.UndefOr[Boolean] = js.undefined,
    animateRows: js.UndefOr[Boolean] = js.undefined,
    api: GridApi = null,
    autoGroupColumnDef: ColDef = null,
    autoSizePadding: js.UndefOr[Double] = js.undefined,
    batchUpdateWaitMillis: js.UndefOr[Double] = js.undefined,
    cacheBlockSize: js.UndefOr[Double] = js.undefined,
    cacheOverflowSize: js.UndefOr[Double] = js.undefined,
    cacheQuickFilter: js.UndefOr[Boolean] = js.undefined,
    clipboardDeliminator: String = null,
    colResizeDefault: String = null,
    colWidth: js.UndefOr[Double] = js.undefined,
    columnApi: ColumnApi = null,
    columnDefs: js.Array[ColDef | ColGroupDef] = null,
    columnTypes: StringDictionary[ColDef] = null,
    components: StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]] = null,
    context: js.Any = null,
    contractColumnSelection: js.UndefOr[Boolean] = js.undefined,
    datasource: IDatasource = null,
    dateComponent: Instantiable = null,
    dateComponentFramework: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultColDef: ColDef = null,
    defaultColGroupDef: ColGroupDef = null,
    defaultExportParams: CsvExportParams = null,
    defaultGroupSortComparator: (/* nodeA */ RowNode, /* nodeB */ RowNode) => Double = null,
    deltaRowDataMode: js.UndefOr[Boolean] = js.undefined,
    detailCellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = null,
    detailCellRendererFramework: js.Any = null,
    detailCellRendererParams: js.Any = null,
    detailRowHeight: js.UndefOr[Double] = js.undefined,
    doesDataFlower: /* dataItem */ js.Any => Boolean = null,
    doesExternalFilterPass: /* node */ RowNode => Boolean = null,
    domLayout: String = null,
    editType: String = null,
    embedFullWidthRows: js.UndefOr[Boolean] = js.undefined,
    enableCellChangeFlash: js.UndefOr[Boolean] = js.undefined,
    enableCellExpressions: js.UndefOr[Boolean] = js.undefined,
    enableColResize: js.UndefOr[Boolean] = js.undefined,
    enableFilter: js.UndefOr[Boolean] = js.undefined,
    enableGroupEdit: js.UndefOr[Boolean] = js.undefined,
    enableOldSetFilterModel: js.UndefOr[Boolean] = js.undefined,
    enableRangeSelection: js.UndefOr[Boolean] = js.undefined,
    enableRtl: js.UndefOr[Boolean] = js.undefined,
    enableServerSideFilter: js.UndefOr[Boolean] = js.undefined,
    enableServerSideSorting: js.UndefOr[Boolean] = js.undefined,
    enableSorting: js.UndefOr[Boolean] = js.undefined,
    enableStatusBar: js.UndefOr[Boolean] = js.undefined,
    ensureDomOrder: js.UndefOr[Boolean] = js.undefined,
    enterMovesDown: js.UndefOr[Boolean] = js.undefined,
    enterMovesDownAfterEdit: js.UndefOr[Boolean] = js.undefined,
    excelStyles: js.Array[_] = null,
    floatingFilter: js.UndefOr[Boolean] = js.undefined,
    floatingFiltersHeight: js.UndefOr[Double] = js.undefined,
    forPrint: js.UndefOr[Boolean] = js.undefined,
    frameworkComponents: StringDictionary[InstantiableAny] = null,
    fullWidthCellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = null,
    fullWidthCellRendererFramework: js.Any = null,
    fullWidthCellRendererParams: js.Any = null,
    functionsPassive: js.UndefOr[Boolean] = js.undefined,
    functionsReadOnly: js.UndefOr[Boolean] = js.undefined,
    getBusinessKeyForNode: /* node */ RowNode => String = null,
    getChildCount: /* dataItem */ js.Any => Double = null,
    getContextMenuItems: /* params */ GetContextMenuItemsParams => js.Array[String | MenuItemDef] = null,
    getDataPath: /* data */ js.Any => js.Array[String] = null,
    getDocument: () => Document = null,
    getMainMenuItems: /* params */ GetMainMenuItemsParams => js.Array[String | MenuItemDef] = null,
    getNodeChildDetails: /* dataItem */ js.Any => NodeChildDetails = null,
    getRowClass: /* params */ js.Any => String | js.Array[String] = null,
    getRowHeight: js.Function = null,
    getRowNodeId: /* data */ js.Any => String = null,
    getRowStyle: js.Function = null,
    gridAutoHeight: js.UndefOr[Boolean] = js.undefined,
    groupColumnDef: ColDef = null,
    groupDefaultExpanded: js.UndefOr[Double] = js.undefined,
    groupHeaderHeight: js.UndefOr[Double] = js.undefined,
    groupHideOpenParents: js.UndefOr[Boolean] = js.undefined,
    groupIncludeFooter: js.UndefOr[Boolean] = js.undefined,
    groupIncludeTotalFooter: js.UndefOr[Boolean] = js.undefined,
    groupMultiAutoColumn: js.UndefOr[Boolean] = js.undefined,
    groupRemoveLowestSingleChildren: js.UndefOr[Boolean] = js.undefined,
    groupRemoveSingleChildren: js.UndefOr[Boolean] = js.undefined,
    groupRowAggNodes: /* nodes */ js.Array[RowNode] => _ = null,
    groupRowInnerRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = null,
    groupRowInnerRendererFramework: js.Any = null,
    groupRowRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = null,
    groupRowRendererFramework: js.Any = null,
    groupRowRendererParams: js.Any = null,
    groupSelectsChildren: js.UndefOr[Boolean] = js.undefined,
    groupSelectsFiltered: js.UndefOr[Boolean] = js.undefined,
    groupSuppressAutoColumn: js.UndefOr[Boolean] = js.undefined,
    groupSuppressBlankHeader: js.UndefOr[Boolean] = js.undefined,
    groupSuppressRow: js.UndefOr[Boolean] = js.undefined,
    groupUseEntireRow: js.UndefOr[Boolean] = js.undefined,
    headerHeight: js.UndefOr[Double] = js.undefined,
    icons: js.Any = null,
    infiniteInitialRowCount: js.UndefOr[Double] = js.undefined,
    isExternalFilterPresent: () => Boolean = null,
    isFullWidthCell: /* rowNode */ RowNode => Boolean = null,
    isRowMaster: /* dataItem */ js.Any => Boolean = null,
    isRowSelectable: /* node */ RowNode => Boolean = null,
    loadingOverlayComponent: InstantiableILoadingOverlayComp | String = null,
    loadingOverlayComponentFramework: js.Any = null,
    localeText: js.Any = null,
    localeTextFunc: js.Function = null,
    masterDetail: js.UndefOr[Boolean] = js.undefined,
    maxBlocksInCache: js.UndefOr[Double] = js.undefined,
    maxColWidth: js.UndefOr[Double] = js.undefined,
    maxConcurrentDatasourceRequests: js.UndefOr[Double] = js.undefined,
    minColWidth: js.UndefOr[Double] = js.undefined,
    multiSortKey: String = null,
    navigateToNextCell: /* params */ NavigateToNextCellParams => GridCellDef = null,
    noRowsOverlayComponent: InstantiableINoRowsOverlayComp | String = null,
    noRowsOverlayComponentFramework: js.Any = null,
    onBodyScroll: /* event */ BodyScrollEvent => Unit = null,
    onCellClicked: /* event */ CellClickedEvent => Unit = null,
    onCellContextMenu: /* event */ CellContextMenuEvent => Unit = null,
    onCellDoubleClicked: /* event */ CellDoubleClickedEvent => Unit = null,
    onCellEditingStarted: /* event */ CellEditingStartedEvent => Unit = null,
    onCellEditingStopped: /* event */ CellEditingStoppedEvent => Unit = null,
    onCellFocused: /* event */ CellFocusedEvent => Unit = null,
    onCellMouseDown: /* event */ CellMouseDownEvent => Unit = null,
    onCellMouseOut: /* event */ CellMouseOutEvent => Unit = null,
    onCellMouseOver: /* event */ CellMouseOverEvent => Unit = null,
    onCellValueChanged: /* event */ CellValueChangedEvent => Unit = null,
    onColumnAggFuncChangeRequest: /* event */ ColumnAggFuncChangeRequestEvent => Unit = null,
    onColumnEverythingChanged: /* event */ ColumnEverythingChangedEvent => Unit = null,
    onColumnGroupOpened: /* event */ ColumnGroupOpenedEvent => Unit = null,
    onColumnMoved: /* event */ ColumnMovedEvent => Unit = null,
    onColumnPinned: /* event */ ColumnPinnedEvent => Unit = null,
    onColumnPivotChangeRequest: /* event */ ColumnPivotChangeRequestEvent => Unit = null,
    onColumnPivotChanged: /* event */ ColumnPivotChangedEvent => Unit = null,
    onColumnPivotModeChanged: /* event */ ColumnPivotModeChangedEvent => Unit = null,
    onColumnResized: /* event */ ColumnResizedEvent => Unit = null,
    onColumnRowGroupChangeRequest: /* event */ ColumnRowGroupChangeRequestEvent => Unit = null,
    onColumnRowGroupChanged: /* event */ ColumnRowGroupChangedEvent => Unit = null,
    onColumnValueChangeRequest: /* event */ ColumnValueChangeRequestEvent => Unit = null,
    onColumnValueChanged: /* event */ ColumnValueChangedEvent => Unit = null,
    onColumnVisible: /* event */ ColumnVisibleEvent => Unit = null,
    onDisplayedColumnsChanged: /* event */ DisplayedColumnsChangedEvent => Unit = null,
    onDragStarted: /* event */ DragStartedEvent => Unit = null,
    onDragStopped: /* event */ DragStoppedEvent => Unit = null,
    onFilterChanged: /* event */ FilterChangedEvent => Unit = null,
    onFilterModified: /* event */ FilterModifiedEvent => Unit = null,
    onGridColumnsChanged: /* event */ GridColumnsChangedEvent => Unit = null,
    onGridReady: /* event */ GridReadyEvent => Unit = null,
    onGridSizeChanged: /* event */ js.Any => Unit = null,
    onModelUpdated: /* event */ ModelUpdatedEvent => Unit = null,
    onNewColumnsLoaded: /* event */ NewColumnsLoadedEvent => Unit = null,
    onPaginationChanged: /* event */ PaginationChangedEvent => Unit = null,
    onPasteEnd: /* event */ PasteEndEvent => Unit = null,
    onPasteStart: /* event */ PasteStartEvent => Unit = null,
    onPinnedRowDataChanged: /* event */ PinnedRowDataChangedEvent => Unit = null,
    onRangeSelectionChanged: /* event */ RangeSelectionChangedEvent => Unit = null,
    onRowClicked: /* event */ RowClickedEvent => Unit = null,
    onRowDataChanged: /* event */ RowDataChangedEvent => Unit = null,
    onRowDataUpdated: /* event */ RowDataUpdatedEvent => Unit = null,
    onRowDoubleClicked: /* event */ RowDoubleClickedEvent => Unit = null,
    onRowDragEnd: /* event */ RowDragEvent => Unit = null,
    onRowDragEnter: /* event */ RowDragEvent => Unit = null,
    onRowDragLeave: /* event */ RowDragEvent => Unit = null,
    onRowDragMove: /* event */ RowDragEvent => Unit = null,
    onRowEditingStarted: /* event */ RowEditingStartedEvent => Unit = null,
    onRowEditingStopped: /* event */ RowEditingStoppedEvent => Unit = null,
    onRowGroupOpened: /* event */ RowGroupOpenedEvent => Unit = null,
    onRowSelected: /* event */ RowSelectedEvent => Unit = null,
    onRowValueChanged: /* event */ RowValueChangedEvent => Unit = null,
    onSelectionChanged: /* event */ SelectionChangedEvent => Unit = null,
    onSortChanged: /* event */ SortChangedEvent => Unit = null,
    onViewportChanged: /* event */ ViewportChangedEvent => Unit = null,
    onVirtualColumnsChanged: /* event */ VirtualColumnsChangedEvent => Unit = null,
    onVirtualRowRemoved: /* event */ VirtualRowRemovedEvent => Unit = null,
    overlayLoadingTemplate: String = null,
    overlayNoRowsTemplate: String = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    paginationAutoPageSize: js.UndefOr[Boolean] = js.undefined,
    paginationNumberFormatter: /* params */ PaginationNumberFormatterParams => String = null,
    paginationPageSize: js.UndefOr[Double] = js.undefined,
    paginationStartPage: js.UndefOr[Double] = js.undefined,
    pinnedBottomRowData: js.Array[_] = null,
    pinnedTopRowData: js.Array[_] = null,
    pivotColumnGroupTotals: String = null,
    pivotGroupHeaderHeight: js.UndefOr[Double] = js.undefined,
    pivotHeaderHeight: js.UndefOr[Double] = js.undefined,
    pivotMode: js.UndefOr[Boolean] = js.undefined,
    pivotPanelShow: String = null,
    pivotRowTotals: String = null,
    pivotTotals: js.UndefOr[Boolean] = js.undefined,
    popupParent: HTMLElement = null,
    postProcessPopup: /* params */ PostProcessPopupParams => Unit = null,
    postSort: /* nodes */ js.Array[RowNode] => Unit = null,
    processCellForClipboard: /* params */ ProcessCellForExportParams => _ = null,
    processCellFromClipboard: /* params */ ProcessCellForExportParams => _ = null,
    processDataFromClipboard: /* params */ ProcessDataFromClipboardParams => js.Array[js.Array[String]] = null,
    processHeaderForClipboard: /* params */ ProcessHeaderForExportParams => _ = null,
    processRowPostCreate: /* params */ ProcessRowParams => Unit = null,
    processSecondaryColDef: /* colDef */ ColDef => Unit = null,
    processSecondaryColGroupDef: /* colGroupDef */ ColGroupDef => Unit = null,
    purgeClosedRowNodes: js.UndefOr[Boolean] = js.undefined,
    quickFilterText: String = null,
    rememberGroupStateWhenNewData: js.UndefOr[Boolean] = js.undefined,
    rowBuffer: js.UndefOr[Double] = js.undefined,
    rowClass: String | js.Array[String] = null,
    rowClassRules: StringDictionary[js.Function | String] = null,
    rowData: js.Array[_] = null,
    rowDeselection: js.UndefOr[Boolean] = js.undefined,
    rowDragManaged: js.UndefOr[Boolean] = js.undefined,
    rowGroupPanelShow: String = null,
    rowHeight: js.UndefOr[Double] = js.undefined,
    rowModelType: String = null,
    rowMultiSelectWithClick: js.UndefOr[Boolean] = js.undefined,
    rowSelection: String = null,
    rowStyle: js.Any = null,
    scrollbarWidth: js.UndefOr[Double] = js.undefined,
    sendToClipboard: /* params */ js.Any => Unit = null,
    serverSideDatasource: IServerSideDatasource = null,
    serverSideSortingAlwaysResets: js.UndefOr[Boolean] = js.undefined,
    showToolPanel: js.UndefOr[Boolean] = js.undefined,
    singleClickEdit: js.UndefOr[Boolean] = js.undefined,
    slaveGrids: js.Array[GridOptions] = null,
    sortingOrder: js.Array[String] = null,
    stopEditingWhenGridLosesFocus: js.UndefOr[Boolean] = js.undefined,
    suppressAggAtRootLevel: js.UndefOr[Boolean] = js.undefined,
    suppressAggFuncInHeader: js.UndefOr[Boolean] = js.undefined,
    suppressAnimationFrame: js.UndefOr[Boolean] = js.undefined,
    suppressAsyncEvents: js.UndefOr[Boolean] = js.undefined,
    suppressAutoSize: js.UndefOr[Boolean] = js.undefined,
    suppressCellSelection: js.UndefOr[Boolean] = js.undefined,
    suppressChangeDetection: js.UndefOr[Boolean] = js.undefined,
    suppressClickEdit: js.UndefOr[Boolean] = js.undefined,
    suppressClipboardPaste: js.UndefOr[Boolean] = js.undefined,
    suppressColumnMoveAnimation: js.UndefOr[Boolean] = js.undefined,
    suppressColumnVirtualisation: js.UndefOr[Boolean] = js.undefined,
    suppressContextMenu: js.UndefOr[Boolean] = js.undefined,
    suppressCopyRowsToClipboard: js.UndefOr[Boolean] = js.undefined,
    suppressCsvExport: js.UndefOr[Boolean] = js.undefined,
    suppressDragLeaveHidesColumns: js.UndefOr[Boolean] = js.undefined,
    suppressEnterpriseResetOnNewColumns: js.UndefOr[Boolean] = js.undefined,
    suppressExcelExport: js.UndefOr[Boolean] = js.undefined,
    suppressFieldDotNotation: js.UndefOr[Boolean] = js.undefined,
    suppressFocusAfterRefresh: js.UndefOr[Boolean] = js.undefined,
    suppressHorizontalScroll: js.UndefOr[Boolean] = js.undefined,
    suppressLoadingOverlay: js.UndefOr[Boolean] = js.undefined,
    suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[Boolean] = js.undefined,
    suppressMenuHide: js.UndefOr[Boolean] = js.undefined
  ): GridOptions = {
    val __obj = js.Dynamic.literal()
    if (ComponentHolder != null) js.Dynamic.global.Object.assign(__obj, ComponentHolder)
    if (!js.isUndefined(accentedSort)) __obj.updateDynamic("accentedSort")(accentedSort.get.asInstanceOf[js.Any])
    if (aggFuncs != null) __obj.updateDynamic("aggFuncs")(aggFuncs.asInstanceOf[js.Any])
    if (!js.isUndefined(aggregateOnlyChangedColumns)) __obj.updateDynamic("aggregateOnlyChangedColumns")(aggregateOnlyChangedColumns.get.asInstanceOf[js.Any])
    if (alignedGrids != null) __obj.updateDynamic("alignedGrids")(alignedGrids.asInstanceOf[js.Any])
    if (!js.isUndefined(allowContextMenuWithControlKey)) __obj.updateDynamic("allowContextMenuWithControlKey")(allowContextMenuWithControlKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysShowStatusBar)) __obj.updateDynamic("alwaysShowStatusBar")(alwaysShowStatusBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularCompileFilters)) __obj.updateDynamic("angularCompileFilters")(angularCompileFilters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularCompileHeaders)) __obj.updateDynamic("angularCompileHeaders")(angularCompileHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularCompileRows)) __obj.updateDynamic("angularCompileRows")(angularCompileRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animateRows)) __obj.updateDynamic("animateRows")(animateRows.get.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (autoGroupColumnDef != null) __obj.updateDynamic("autoGroupColumnDef")(autoGroupColumnDef.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSizePadding)) __obj.updateDynamic("autoSizePadding")(autoSizePadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchUpdateWaitMillis)) __obj.updateDynamic("batchUpdateWaitMillis")(batchUpdateWaitMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheBlockSize)) __obj.updateDynamic("cacheBlockSize")(cacheBlockSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheOverflowSize)) __obj.updateDynamic("cacheOverflowSize")(cacheOverflowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheQuickFilter)) __obj.updateDynamic("cacheQuickFilter")(cacheQuickFilter.get.asInstanceOf[js.Any])
    if (clipboardDeliminator != null) __obj.updateDynamic("clipboardDeliminator")(clipboardDeliminator.asInstanceOf[js.Any])
    if (colResizeDefault != null) __obj.updateDynamic("colResizeDefault")(colResizeDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(colWidth)) __obj.updateDynamic("colWidth")(colWidth.get.asInstanceOf[js.Any])
    if (columnApi != null) __obj.updateDynamic("columnApi")(columnApi.asInstanceOf[js.Any])
    if (columnDefs != null) __obj.updateDynamic("columnDefs")(columnDefs.asInstanceOf[js.Any])
    if (columnTypes != null) __obj.updateDynamic("columnTypes")(columnTypes.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(contractColumnSelection)) __obj.updateDynamic("contractColumnSelection")(contractColumnSelection.get.asInstanceOf[js.Any])
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    if (dateComponent != null) __obj.updateDynamic("dateComponent")(dateComponent.asInstanceOf[js.Any])
    if (dateComponentFramework != null) __obj.updateDynamic("dateComponentFramework")(dateComponentFramework.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (defaultColDef != null) __obj.updateDynamic("defaultColDef")(defaultColDef.asInstanceOf[js.Any])
    if (defaultColGroupDef != null) __obj.updateDynamic("defaultColGroupDef")(defaultColGroupDef.asInstanceOf[js.Any])
    if (defaultExportParams != null) __obj.updateDynamic("defaultExportParams")(defaultExportParams.asInstanceOf[js.Any])
    if (defaultGroupSortComparator != null) __obj.updateDynamic("defaultGroupSortComparator")(js.Any.fromFunction2(defaultGroupSortComparator))
    if (!js.isUndefined(deltaRowDataMode)) __obj.updateDynamic("deltaRowDataMode")(deltaRowDataMode.get.asInstanceOf[js.Any])
    if (detailCellRenderer != null) __obj.updateDynamic("detailCellRenderer")(detailCellRenderer.asInstanceOf[js.Any])
    if (detailCellRendererFramework != null) __obj.updateDynamic("detailCellRendererFramework")(detailCellRendererFramework.asInstanceOf[js.Any])
    if (detailCellRendererParams != null) __obj.updateDynamic("detailCellRendererParams")(detailCellRendererParams.asInstanceOf[js.Any])
    if (!js.isUndefined(detailRowHeight)) __obj.updateDynamic("detailRowHeight")(detailRowHeight.get.asInstanceOf[js.Any])
    if (doesDataFlower != null) __obj.updateDynamic("doesDataFlower")(js.Any.fromFunction1(doesDataFlower))
    if (doesExternalFilterPass != null) __obj.updateDynamic("doesExternalFilterPass")(js.Any.fromFunction1(doesExternalFilterPass))
    if (domLayout != null) __obj.updateDynamic("domLayout")(domLayout.asInstanceOf[js.Any])
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (!js.isUndefined(embedFullWidthRows)) __obj.updateDynamic("embedFullWidthRows")(embedFullWidthRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellChangeFlash)) __obj.updateDynamic("enableCellChangeFlash")(enableCellChangeFlash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellExpressions)) __obj.updateDynamic("enableCellExpressions")(enableCellExpressions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColResize)) __obj.updateDynamic("enableColResize")(enableColResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFilter)) __obj.updateDynamic("enableFilter")(enableFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupEdit)) __obj.updateDynamic("enableGroupEdit")(enableGroupEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOldSetFilterModel)) __obj.updateDynamic("enableOldSetFilterModel")(enableOldSetFilterModel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRangeSelection)) __obj.updateDynamic("enableRangeSelection")(enableRangeSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRtl)) __obj.updateDynamic("enableRtl")(enableRtl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableServerSideFilter)) __obj.updateDynamic("enableServerSideFilter")(enableServerSideFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableServerSideSorting)) __obj.updateDynamic("enableServerSideSorting")(enableServerSideSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSorting)) __obj.updateDynamic("enableSorting")(enableSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableStatusBar)) __obj.updateDynamic("enableStatusBar")(enableStatusBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ensureDomOrder)) __obj.updateDynamic("ensureDomOrder")(ensureDomOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enterMovesDown)) __obj.updateDynamic("enterMovesDown")(enterMovesDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enterMovesDownAfterEdit)) __obj.updateDynamic("enterMovesDownAfterEdit")(enterMovesDownAfterEdit.get.asInstanceOf[js.Any])
    if (excelStyles != null) __obj.updateDynamic("excelStyles")(excelStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingFilter)) __obj.updateDynamic("floatingFilter")(floatingFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingFiltersHeight)) __obj.updateDynamic("floatingFiltersHeight")(floatingFiltersHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forPrint)) __obj.updateDynamic("forPrint")(forPrint.get.asInstanceOf[js.Any])
    if (frameworkComponents != null) __obj.updateDynamic("frameworkComponents")(frameworkComponents.asInstanceOf[js.Any])
    if (fullWidthCellRenderer != null) __obj.updateDynamic("fullWidthCellRenderer")(fullWidthCellRenderer.asInstanceOf[js.Any])
    if (fullWidthCellRendererFramework != null) __obj.updateDynamic("fullWidthCellRendererFramework")(fullWidthCellRendererFramework.asInstanceOf[js.Any])
    if (fullWidthCellRendererParams != null) __obj.updateDynamic("fullWidthCellRendererParams")(fullWidthCellRendererParams.asInstanceOf[js.Any])
    if (!js.isUndefined(functionsPassive)) __obj.updateDynamic("functionsPassive")(functionsPassive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(functionsReadOnly)) __obj.updateDynamic("functionsReadOnly")(functionsReadOnly.get.asInstanceOf[js.Any])
    if (getBusinessKeyForNode != null) __obj.updateDynamic("getBusinessKeyForNode")(js.Any.fromFunction1(getBusinessKeyForNode))
    if (getChildCount != null) __obj.updateDynamic("getChildCount")(js.Any.fromFunction1(getChildCount))
    if (getContextMenuItems != null) __obj.updateDynamic("getContextMenuItems")(js.Any.fromFunction1(getContextMenuItems))
    if (getDataPath != null) __obj.updateDynamic("getDataPath")(js.Any.fromFunction1(getDataPath))
    if (getDocument != null) __obj.updateDynamic("getDocument")(js.Any.fromFunction0(getDocument))
    if (getMainMenuItems != null) __obj.updateDynamic("getMainMenuItems")(js.Any.fromFunction1(getMainMenuItems))
    if (getNodeChildDetails != null) __obj.updateDynamic("getNodeChildDetails")(js.Any.fromFunction1(getNodeChildDetails))
    if (getRowClass != null) __obj.updateDynamic("getRowClass")(js.Any.fromFunction1(getRowClass))
    if (getRowHeight != null) __obj.updateDynamic("getRowHeight")(getRowHeight.asInstanceOf[js.Any])
    if (getRowNodeId != null) __obj.updateDynamic("getRowNodeId")(js.Any.fromFunction1(getRowNodeId))
    if (getRowStyle != null) __obj.updateDynamic("getRowStyle")(getRowStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(gridAutoHeight)) __obj.updateDynamic("gridAutoHeight")(gridAutoHeight.get.asInstanceOf[js.Any])
    if (groupColumnDef != null) __obj.updateDynamic("groupColumnDef")(groupColumnDef.asInstanceOf[js.Any])
    if (!js.isUndefined(groupDefaultExpanded)) __obj.updateDynamic("groupDefaultExpanded")(groupDefaultExpanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupHeaderHeight)) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupHideOpenParents)) __obj.updateDynamic("groupHideOpenParents")(groupHideOpenParents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIncludeFooter)) __obj.updateDynamic("groupIncludeFooter")(groupIncludeFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIncludeTotalFooter)) __obj.updateDynamic("groupIncludeTotalFooter")(groupIncludeTotalFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupMultiAutoColumn)) __obj.updateDynamic("groupMultiAutoColumn")(groupMultiAutoColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupRemoveLowestSingleChildren)) __obj.updateDynamic("groupRemoveLowestSingleChildren")(groupRemoveLowestSingleChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupRemoveSingleChildren)) __obj.updateDynamic("groupRemoveSingleChildren")(groupRemoveSingleChildren.get.asInstanceOf[js.Any])
    if (groupRowAggNodes != null) __obj.updateDynamic("groupRowAggNodes")(js.Any.fromFunction1(groupRowAggNodes))
    if (groupRowInnerRenderer != null) __obj.updateDynamic("groupRowInnerRenderer")(groupRowInnerRenderer.asInstanceOf[js.Any])
    if (groupRowInnerRendererFramework != null) __obj.updateDynamic("groupRowInnerRendererFramework")(groupRowInnerRendererFramework.asInstanceOf[js.Any])
    if (groupRowRenderer != null) __obj.updateDynamic("groupRowRenderer")(groupRowRenderer.asInstanceOf[js.Any])
    if (groupRowRendererFramework != null) __obj.updateDynamic("groupRowRendererFramework")(groupRowRendererFramework.asInstanceOf[js.Any])
    if (groupRowRendererParams != null) __obj.updateDynamic("groupRowRendererParams")(groupRowRendererParams.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSelectsChildren)) __obj.updateDynamic("groupSelectsChildren")(groupSelectsChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSelectsFiltered)) __obj.updateDynamic("groupSelectsFiltered")(groupSelectsFiltered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSuppressAutoColumn)) __obj.updateDynamic("groupSuppressAutoColumn")(groupSuppressAutoColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSuppressBlankHeader)) __obj.updateDynamic("groupSuppressBlankHeader")(groupSuppressBlankHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSuppressRow)) __obj.updateDynamic("groupSuppressRow")(groupSuppressRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupUseEntireRow)) __obj.updateDynamic("groupUseEntireRow")(groupUseEntireRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerHeight)) __obj.updateDynamic("headerHeight")(headerHeight.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteInitialRowCount)) __obj.updateDynamic("infiniteInitialRowCount")(infiniteInitialRowCount.get.asInstanceOf[js.Any])
    if (isExternalFilterPresent != null) __obj.updateDynamic("isExternalFilterPresent")(js.Any.fromFunction0(isExternalFilterPresent))
    if (isFullWidthCell != null) __obj.updateDynamic("isFullWidthCell")(js.Any.fromFunction1(isFullWidthCell))
    if (isRowMaster != null) __obj.updateDynamic("isRowMaster")(js.Any.fromFunction1(isRowMaster))
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(js.Any.fromFunction1(isRowSelectable))
    if (loadingOverlayComponent != null) __obj.updateDynamic("loadingOverlayComponent")(loadingOverlayComponent.asInstanceOf[js.Any])
    if (loadingOverlayComponentFramework != null) __obj.updateDynamic("loadingOverlayComponentFramework")(loadingOverlayComponentFramework.asInstanceOf[js.Any])
    if (localeText != null) __obj.updateDynamic("localeText")(localeText.asInstanceOf[js.Any])
    if (localeTextFunc != null) __obj.updateDynamic("localeTextFunc")(localeTextFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(masterDetail)) __obj.updateDynamic("masterDetail")(masterDetail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBlocksInCache)) __obj.updateDynamic("maxBlocksInCache")(maxBlocksInCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxColWidth)) __obj.updateDynamic("maxColWidth")(maxColWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentDatasourceRequests)) __obj.updateDynamic("maxConcurrentDatasourceRequests")(maxConcurrentDatasourceRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minColWidth)) __obj.updateDynamic("minColWidth")(minColWidth.get.asInstanceOf[js.Any])
    if (multiSortKey != null) __obj.updateDynamic("multiSortKey")(multiSortKey.asInstanceOf[js.Any])
    if (navigateToNextCell != null) __obj.updateDynamic("navigateToNextCell")(js.Any.fromFunction1(navigateToNextCell))
    if (noRowsOverlayComponent != null) __obj.updateDynamic("noRowsOverlayComponent")(noRowsOverlayComponent.asInstanceOf[js.Any])
    if (noRowsOverlayComponentFramework != null) __obj.updateDynamic("noRowsOverlayComponentFramework")(noRowsOverlayComponentFramework.asInstanceOf[js.Any])
    if (onBodyScroll != null) __obj.updateDynamic("onBodyScroll")(js.Any.fromFunction1(onBodyScroll))
    if (onCellClicked != null) __obj.updateDynamic("onCellClicked")(js.Any.fromFunction1(onCellClicked))
    if (onCellContextMenu != null) __obj.updateDynamic("onCellContextMenu")(js.Any.fromFunction1(onCellContextMenu))
    if (onCellDoubleClicked != null) __obj.updateDynamic("onCellDoubleClicked")(js.Any.fromFunction1(onCellDoubleClicked))
    if (onCellEditingStarted != null) __obj.updateDynamic("onCellEditingStarted")(js.Any.fromFunction1(onCellEditingStarted))
    if (onCellEditingStopped != null) __obj.updateDynamic("onCellEditingStopped")(js.Any.fromFunction1(onCellEditingStopped))
    if (onCellFocused != null) __obj.updateDynamic("onCellFocused")(js.Any.fromFunction1(onCellFocused))
    if (onCellMouseDown != null) __obj.updateDynamic("onCellMouseDown")(js.Any.fromFunction1(onCellMouseDown))
    if (onCellMouseOut != null) __obj.updateDynamic("onCellMouseOut")(js.Any.fromFunction1(onCellMouseOut))
    if (onCellMouseOver != null) __obj.updateDynamic("onCellMouseOver")(js.Any.fromFunction1(onCellMouseOver))
    if (onCellValueChanged != null) __obj.updateDynamic("onCellValueChanged")(js.Any.fromFunction1(onCellValueChanged))
    if (onColumnAggFuncChangeRequest != null) __obj.updateDynamic("onColumnAggFuncChangeRequest")(js.Any.fromFunction1(onColumnAggFuncChangeRequest))
    if (onColumnEverythingChanged != null) __obj.updateDynamic("onColumnEverythingChanged")(js.Any.fromFunction1(onColumnEverythingChanged))
    if (onColumnGroupOpened != null) __obj.updateDynamic("onColumnGroupOpened")(js.Any.fromFunction1(onColumnGroupOpened))
    if (onColumnMoved != null) __obj.updateDynamic("onColumnMoved")(js.Any.fromFunction1(onColumnMoved))
    if (onColumnPinned != null) __obj.updateDynamic("onColumnPinned")(js.Any.fromFunction1(onColumnPinned))
    if (onColumnPivotChangeRequest != null) __obj.updateDynamic("onColumnPivotChangeRequest")(js.Any.fromFunction1(onColumnPivotChangeRequest))
    if (onColumnPivotChanged != null) __obj.updateDynamic("onColumnPivotChanged")(js.Any.fromFunction1(onColumnPivotChanged))
    if (onColumnPivotModeChanged != null) __obj.updateDynamic("onColumnPivotModeChanged")(js.Any.fromFunction1(onColumnPivotModeChanged))
    if (onColumnResized != null) __obj.updateDynamic("onColumnResized")(js.Any.fromFunction1(onColumnResized))
    if (onColumnRowGroupChangeRequest != null) __obj.updateDynamic("onColumnRowGroupChangeRequest")(js.Any.fromFunction1(onColumnRowGroupChangeRequest))
    if (onColumnRowGroupChanged != null) __obj.updateDynamic("onColumnRowGroupChanged")(js.Any.fromFunction1(onColumnRowGroupChanged))
    if (onColumnValueChangeRequest != null) __obj.updateDynamic("onColumnValueChangeRequest")(js.Any.fromFunction1(onColumnValueChangeRequest))
    if (onColumnValueChanged != null) __obj.updateDynamic("onColumnValueChanged")(js.Any.fromFunction1(onColumnValueChanged))
    if (onColumnVisible != null) __obj.updateDynamic("onColumnVisible")(js.Any.fromFunction1(onColumnVisible))
    if (onDisplayedColumnsChanged != null) __obj.updateDynamic("onDisplayedColumnsChanged")(js.Any.fromFunction1(onDisplayedColumnsChanged))
    if (onDragStarted != null) __obj.updateDynamic("onDragStarted")(js.Any.fromFunction1(onDragStarted))
    if (onDragStopped != null) __obj.updateDynamic("onDragStopped")(js.Any.fromFunction1(onDragStopped))
    if (onFilterChanged != null) __obj.updateDynamic("onFilterChanged")(js.Any.fromFunction1(onFilterChanged))
    if (onFilterModified != null) __obj.updateDynamic("onFilterModified")(js.Any.fromFunction1(onFilterModified))
    if (onGridColumnsChanged != null) __obj.updateDynamic("onGridColumnsChanged")(js.Any.fromFunction1(onGridColumnsChanged))
    if (onGridReady != null) __obj.updateDynamic("onGridReady")(js.Any.fromFunction1(onGridReady))
    if (onGridSizeChanged != null) __obj.updateDynamic("onGridSizeChanged")(js.Any.fromFunction1(onGridSizeChanged))
    if (onModelUpdated != null) __obj.updateDynamic("onModelUpdated")(js.Any.fromFunction1(onModelUpdated))
    if (onNewColumnsLoaded != null) __obj.updateDynamic("onNewColumnsLoaded")(js.Any.fromFunction1(onNewColumnsLoaded))
    if (onPaginationChanged != null) __obj.updateDynamic("onPaginationChanged")(js.Any.fromFunction1(onPaginationChanged))
    if (onPasteEnd != null) __obj.updateDynamic("onPasteEnd")(js.Any.fromFunction1(onPasteEnd))
    if (onPasteStart != null) __obj.updateDynamic("onPasteStart")(js.Any.fromFunction1(onPasteStart))
    if (onPinnedRowDataChanged != null) __obj.updateDynamic("onPinnedRowDataChanged")(js.Any.fromFunction1(onPinnedRowDataChanged))
    if (onRangeSelectionChanged != null) __obj.updateDynamic("onRangeSelectionChanged")(js.Any.fromFunction1(onRangeSelectionChanged))
    if (onRowClicked != null) __obj.updateDynamic("onRowClicked")(js.Any.fromFunction1(onRowClicked))
    if (onRowDataChanged != null) __obj.updateDynamic("onRowDataChanged")(js.Any.fromFunction1(onRowDataChanged))
    if (onRowDataUpdated != null) __obj.updateDynamic("onRowDataUpdated")(js.Any.fromFunction1(onRowDataUpdated))
    if (onRowDoubleClicked != null) __obj.updateDynamic("onRowDoubleClicked")(js.Any.fromFunction1(onRowDoubleClicked))
    if (onRowDragEnd != null) __obj.updateDynamic("onRowDragEnd")(js.Any.fromFunction1(onRowDragEnd))
    if (onRowDragEnter != null) __obj.updateDynamic("onRowDragEnter")(js.Any.fromFunction1(onRowDragEnter))
    if (onRowDragLeave != null) __obj.updateDynamic("onRowDragLeave")(js.Any.fromFunction1(onRowDragLeave))
    if (onRowDragMove != null) __obj.updateDynamic("onRowDragMove")(js.Any.fromFunction1(onRowDragMove))
    if (onRowEditingStarted != null) __obj.updateDynamic("onRowEditingStarted")(js.Any.fromFunction1(onRowEditingStarted))
    if (onRowEditingStopped != null) __obj.updateDynamic("onRowEditingStopped")(js.Any.fromFunction1(onRowEditingStopped))
    if (onRowGroupOpened != null) __obj.updateDynamic("onRowGroupOpened")(js.Any.fromFunction1(onRowGroupOpened))
    if (onRowSelected != null) __obj.updateDynamic("onRowSelected")(js.Any.fromFunction1(onRowSelected))
    if (onRowValueChanged != null) __obj.updateDynamic("onRowValueChanged")(js.Any.fromFunction1(onRowValueChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onSortChanged != null) __obj.updateDynamic("onSortChanged")(js.Any.fromFunction1(onSortChanged))
    if (onViewportChanged != null) __obj.updateDynamic("onViewportChanged")(js.Any.fromFunction1(onViewportChanged))
    if (onVirtualColumnsChanged != null) __obj.updateDynamic("onVirtualColumnsChanged")(js.Any.fromFunction1(onVirtualColumnsChanged))
    if (onVirtualRowRemoved != null) __obj.updateDynamic("onVirtualRowRemoved")(js.Any.fromFunction1(onVirtualRowRemoved))
    if (overlayLoadingTemplate != null) __obj.updateDynamic("overlayLoadingTemplate")(overlayLoadingTemplate.asInstanceOf[js.Any])
    if (overlayNoRowsTemplate != null) __obj.updateDynamic("overlayNoRowsTemplate")(overlayNoRowsTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationAutoPageSize)) __obj.updateDynamic("paginationAutoPageSize")(paginationAutoPageSize.get.asInstanceOf[js.Any])
    if (paginationNumberFormatter != null) __obj.updateDynamic("paginationNumberFormatter")(js.Any.fromFunction1(paginationNumberFormatter))
    if (!js.isUndefined(paginationPageSize)) __obj.updateDynamic("paginationPageSize")(paginationPageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationStartPage)) __obj.updateDynamic("paginationStartPage")(paginationStartPage.get.asInstanceOf[js.Any])
    if (pinnedBottomRowData != null) __obj.updateDynamic("pinnedBottomRowData")(pinnedBottomRowData.asInstanceOf[js.Any])
    if (pinnedTopRowData != null) __obj.updateDynamic("pinnedTopRowData")(pinnedTopRowData.asInstanceOf[js.Any])
    if (pivotColumnGroupTotals != null) __obj.updateDynamic("pivotColumnGroupTotals")(pivotColumnGroupTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotGroupHeaderHeight)) __obj.updateDynamic("pivotGroupHeaderHeight")(pivotGroupHeaderHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotHeaderHeight)) __obj.updateDynamic("pivotHeaderHeight")(pivotHeaderHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotMode)) __obj.updateDynamic("pivotMode")(pivotMode.get.asInstanceOf[js.Any])
    if (pivotPanelShow != null) __obj.updateDynamic("pivotPanelShow")(pivotPanelShow.asInstanceOf[js.Any])
    if (pivotRowTotals != null) __obj.updateDynamic("pivotRowTotals")(pivotRowTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotTotals)) __obj.updateDynamic("pivotTotals")(pivotTotals.get.asInstanceOf[js.Any])
    if (popupParent != null) __obj.updateDynamic("popupParent")(popupParent.asInstanceOf[js.Any])
    if (postProcessPopup != null) __obj.updateDynamic("postProcessPopup")(js.Any.fromFunction1(postProcessPopup))
    if (postSort != null) __obj.updateDynamic("postSort")(js.Any.fromFunction1(postSort))
    if (processCellForClipboard != null) __obj.updateDynamic("processCellForClipboard")(js.Any.fromFunction1(processCellForClipboard))
    if (processCellFromClipboard != null) __obj.updateDynamic("processCellFromClipboard")(js.Any.fromFunction1(processCellFromClipboard))
    if (processDataFromClipboard != null) __obj.updateDynamic("processDataFromClipboard")(js.Any.fromFunction1(processDataFromClipboard))
    if (processHeaderForClipboard != null) __obj.updateDynamic("processHeaderForClipboard")(js.Any.fromFunction1(processHeaderForClipboard))
    if (processRowPostCreate != null) __obj.updateDynamic("processRowPostCreate")(js.Any.fromFunction1(processRowPostCreate))
    if (processSecondaryColDef != null) __obj.updateDynamic("processSecondaryColDef")(js.Any.fromFunction1(processSecondaryColDef))
    if (processSecondaryColGroupDef != null) __obj.updateDynamic("processSecondaryColGroupDef")(js.Any.fromFunction1(processSecondaryColGroupDef))
    if (!js.isUndefined(purgeClosedRowNodes)) __obj.updateDynamic("purgeClosedRowNodes")(purgeClosedRowNodes.get.asInstanceOf[js.Any])
    if (quickFilterText != null) __obj.updateDynamic("quickFilterText")(quickFilterText.asInstanceOf[js.Any])
    if (!js.isUndefined(rememberGroupStateWhenNewData)) __obj.updateDynamic("rememberGroupStateWhenNewData")(rememberGroupStateWhenNewData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowBuffer)) __obj.updateDynamic("rowBuffer")(rowBuffer.get.asInstanceOf[js.Any])
    if (rowClass != null) __obj.updateDynamic("rowClass")(rowClass.asInstanceOf[js.Any])
    if (rowClassRules != null) __obj.updateDynamic("rowClassRules")(rowClassRules.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (!js.isUndefined(rowDeselection)) __obj.updateDynamic("rowDeselection")(rowDeselection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowDragManaged)) __obj.updateDynamic("rowDragManaged")(rowDragManaged.get.asInstanceOf[js.Any])
    if (rowGroupPanelShow != null) __obj.updateDynamic("rowGroupPanelShow")(rowGroupPanelShow.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight.get.asInstanceOf[js.Any])
    if (rowModelType != null) __obj.updateDynamic("rowModelType")(rowModelType.asInstanceOf[js.Any])
    if (!js.isUndefined(rowMultiSelectWithClick)) __obj.updateDynamic("rowMultiSelectWithClick")(rowMultiSelectWithClick.get.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection.asInstanceOf[js.Any])
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollbarWidth)) __obj.updateDynamic("scrollbarWidth")(scrollbarWidth.get.asInstanceOf[js.Any])
    if (sendToClipboard != null) __obj.updateDynamic("sendToClipboard")(js.Any.fromFunction1(sendToClipboard))
    if (serverSideDatasource != null) __obj.updateDynamic("serverSideDatasource")(serverSideDatasource.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSideSortingAlwaysResets)) __obj.updateDynamic("serverSideSortingAlwaysResets")(serverSideSortingAlwaysResets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolPanel)) __obj.updateDynamic("showToolPanel")(showToolPanel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleClickEdit)) __obj.updateDynamic("singleClickEdit")(singleClickEdit.get.asInstanceOf[js.Any])
    if (slaveGrids != null) __obj.updateDynamic("slaveGrids")(slaveGrids.asInstanceOf[js.Any])
    if (sortingOrder != null) __obj.updateDynamic("sortingOrder")(sortingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEditingWhenGridLosesFocus)) __obj.updateDynamic("stopEditingWhenGridLosesFocus")(stopEditingWhenGridLosesFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAggAtRootLevel)) __obj.updateDynamic("suppressAggAtRootLevel")(suppressAggAtRootLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAggFuncInHeader)) __obj.updateDynamic("suppressAggFuncInHeader")(suppressAggFuncInHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAnimationFrame)) __obj.updateDynamic("suppressAnimationFrame")(suppressAnimationFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAsyncEvents)) __obj.updateDynamic("suppressAsyncEvents")(suppressAsyncEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAutoSize)) __obj.updateDynamic("suppressAutoSize")(suppressAutoSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressCellSelection)) __obj.updateDynamic("suppressCellSelection")(suppressCellSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressChangeDetection)) __obj.updateDynamic("suppressChangeDetection")(suppressChangeDetection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressClickEdit)) __obj.updateDynamic("suppressClickEdit")(suppressClickEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressClipboardPaste)) __obj.updateDynamic("suppressClipboardPaste")(suppressClipboardPaste.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressColumnMoveAnimation)) __obj.updateDynamic("suppressColumnMoveAnimation")(suppressColumnMoveAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressColumnVirtualisation)) __obj.updateDynamic("suppressColumnVirtualisation")(suppressColumnVirtualisation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContextMenu)) __obj.updateDynamic("suppressContextMenu")(suppressContextMenu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressCopyRowsToClipboard)) __obj.updateDynamic("suppressCopyRowsToClipboard")(suppressCopyRowsToClipboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressCsvExport)) __obj.updateDynamic("suppressCsvExport")(suppressCsvExport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressDragLeaveHidesColumns)) __obj.updateDynamic("suppressDragLeaveHidesColumns")(suppressDragLeaveHidesColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressEnterpriseResetOnNewColumns)) __obj.updateDynamic("suppressEnterpriseResetOnNewColumns")(suppressEnterpriseResetOnNewColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressExcelExport)) __obj.updateDynamic("suppressExcelExport")(suppressExcelExport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFieldDotNotation)) __obj.updateDynamic("suppressFieldDotNotation")(suppressFieldDotNotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFocusAfterRefresh)) __obj.updateDynamic("suppressFocusAfterRefresh")(suppressFocusAfterRefresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHorizontalScroll)) __obj.updateDynamic("suppressHorizontalScroll")(suppressHorizontalScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressLoadingOverlay)) __obj.updateDynamic("suppressLoadingOverlay")(suppressLoadingOverlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMakeColumnVisibleAfterUnGroup)) __obj.updateDynamic("suppressMakeColumnVisibleAfterUnGroup")(suppressMakeColumnVisibleAfterUnGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMenuHide)) __obj.updateDynamic("suppressMenuHide")(suppressMenuHide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions]
  }
}

