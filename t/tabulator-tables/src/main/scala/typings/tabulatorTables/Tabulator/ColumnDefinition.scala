package typings.tabulatorTables.Tabulator

import typings.std.UIEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.alphanum
import typings.tabulatorTables.tabulatorTablesStrings.array
import typings.tabulatorTables.tabulatorTablesStrings.boolean
import typings.tabulatorTables.tabulatorTablesStrings.clipboard
import typings.tabulatorTables.tabulatorTablesStrings.data
import typings.tabulatorTables.tabulatorTablesStrings.date
import typings.tabulatorTables.tabulatorTablesStrings.datetime
import typings.tabulatorTables.tabulatorTablesStrings.download
import typings.tabulatorTables.tabulatorTablesStrings.edit
import typings.tabulatorTables.tabulatorTablesStrings.exists
import typings.tabulatorTables.tabulatorTablesStrings.flip
import typings.tabulatorTables.tabulatorTablesStrings.number
import typings.tabulatorTables.tabulatorTablesStrings.string
import typings.tabulatorTables.tabulatorTablesStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition
  extends ColumnLayout
     with CellCallbacks
     with _ColumnLookup {
  /**  Accessors are used to alter data as it is extracted from the table, through commands, the clipboard, or download.
    You can set accessors on a per column basis using the accessor option in the column definition object.*/
  var accessor: js.UndefOr[CustomAccessor] = js.undefined
  /** only called when data is being copied into the clipboard. */
  var accessorClipboard: js.UndefOr[CustomAccessor] = js.undefined
  /**  additional parameters you can pass to the accessorClipboard*/
  var accessorClipboardParams: js.UndefOr[CustomAccessorParams] = js.undefined
  /** only called when data is being converted into a downloadable file. */
  var accessorDownload: js.UndefOr[CustomAccessor] = js.undefined
  /** additional parameters you can pass to the accessorDownload */
  var accessorDownloadParams: js.UndefOr[CustomAccessorParams] = js.undefined
  /**You can use the accessorHtmlOutput and accessorHtmlOutputParams options on a column definition to alter the value of data in a column before the html is generated. */
  var accessorHtmlOutput: js.UndefOr[CustomAccessor] = js.undefined
  var accessorHtmlOutputParams: js.UndefOr[CustomAccessorParams] = js.undefined
  /**  Each accessor function has its own matching params option, for example accessorDownload has accessorDownloadParams.*/
  var accessorParams: js.UndefOr[CustomAccessorParams] = js.undefined
  /**You can use the accessorPrint and accessorPrintParams options on a column definition to alter the value of data in a column before it is printed */
  var accessorPrint: js.UndefOr[CustomAccessor] = js.undefined
  var accessorPrintParams: js.UndefOr[CustomAccessorParams] = js.undefined
  var bottomCalc: js.UndefOr[ColumnCalc] = js.undefined
  var bottomCalcFormatter: js.UndefOr[Formatter] = js.undefined
  /**  additional parameters you can pass to the bottomCalcFormatter function */
  var bottomCalcFormatterParams: js.UndefOr[FormatterParams] = js.undefined
  var bottomCalcParams: js.UndefOr[ColumnCalcParams] = js.undefined
  /** If you don't want to show a particular column in the clipboard output you can set the clipboard property in its column definition object to false */
  var clipboard: js.UndefOr[Boolean] = js.undefined
  /** A column can be a "group" of columns (Example: group header column -> Measurements, grouped column -> Length, Width, Height) */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  /**You can add a right click context menu to any columns cells by passing an array of menu items to the contextMenu option in that columns definition. */
  var contextMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
  /** sets css classes on header and cells in this column. (value should be a string containing space separated class names) */
  var cssClass: js.UndefOr[String] = js.undefined
  /** show or hide column in downloaded data */
  var download: js.UndefOr[Boolean] = js.undefined
  /**  There are some circumstances where you may want to block editibility of a cell for one reason or another. To meet this need you can use the editable option. This lets you set a callback that is executed before the editor is built, if this callback returns true the editor is added, if it returns false the edit is aborted and the cell remains a non editable cell. The function is passed one parameter, the CellComponent of the cell about to be edited. You can also pass a boolean value instead of a function to this property.*/
  var editable: js.UndefOr[Boolean | (js.Function1[/* cell */ CellComponent, Boolean])] = js.undefined
  /** allows the user to edit the header titles */
  var editableTitle: js.UndefOr[Boolean] = js.undefined
  /** When a user clicks on an editable column the will be able to edit the value for that cell.
    By default Tabulator will use an editor that matches the current formatter for that cell. if you wish to specify a specific editor, you can set them per column using the editor option in the column definition. Passing a value of true to this option will result in Tabulator applying the editor that best matches the columns formatter, if present.
    You can pass an optional additional parameter with the editor, editorParams that should contain an object with additional information for configuring the editor. */
  var editor: js.UndefOr[Editor] = js.undefined
  /** additional parameters you can pass to the editor   */
  var editorParams: js.UndefOr[EditorParams] = js.undefined
  /**  set how you would like the data to be formatted*/
  var formatter: js.UndefOr[Formatter] = js.undefined
  /**When copying to the clipboard you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterClipboard column definition option. You can use the formatterClipboardParams to pass in any additional params to the formatter */
  var formatterClipboard: js.UndefOr[Formatter | `false`] = js.undefined
  var formatterClipboardParams: js.UndefOr[FormatterParams] = js.undefined
  /**When the getHtml function is called you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterHtmlOutput column definition option */
  var formatterHtmlOutput: js.UndefOr[Formatter | `false`] = js.undefined
  var formatterHtmlOutputParams: js.UndefOr[FormatterParams] = js.undefined
  /**  You can pass an optional additional parameter with the formatter, formatterParams that should contain an object with additional information for configuring the formatter.*/
  var formatterParams: js.UndefOr[FormatterParams] = js.undefined
  /**When printing you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterPrint column definition option. You can use the formatterPrintParams to pass in any additional params to the formatter */
  var formatterPrint: js.UndefOr[Formatter | `false`] = js.undefined
  var formatterPrintParams: js.UndefOr[FormatterParams] = js.undefined
  /** You can freeze the position of columns on the left and right of the table using the frozen property in the column definition array. This will keep the column still when the table is scrolled horizontally. */
  var frozen: js.UndefOr[Boolean] = js.undefined
  /**   callback for when user clicks on the header for this column*/
  var headerClick: js.UndefOr[ColumnEventCallback] = js.undefined
  /** callback for when user right clicks on the header for this column  */
  var headerContext: js.UndefOr[ColumnEventCallback] = js.undefined
  /**You can add a right click context menu to any column by passing an array of menu items to the headerContextMenu option in that columns definition. */
  var headerContextMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.undefined
  /**  callback for when user double clicks on the header for this column */
  var headerDblClick: js.UndefOr[ColumnEventCallback] = js.undefined
  /** callback for when user double taps on a header for this column, triggered in touch displays when a user taps the same header twice in under 300ms */
  var headerDblTap: js.UndefOr[ColumnEventCallback] = js.undefined
  /**  filtering of columns from elements in the header */
  var headerFilter: js.UndefOr[Editor] = js.undefined
  /**  function to check when the header filter is empty */
  var headerFilterEmptyCheck: js.UndefOr[ValueBooleanCallback] = js.undefined
  /**  By default Tabulator will try and match the comparison type to the type of element used for the header filter.
    Standard input elements will use the "like" filter, this allows for the matches to be displayed as the user types.
    For all other element types (select boxes, check boxes, input elements of type number) an "=" filter type is used.
    If you want to specify the type of filter used you can pass it to the headerFilterFunc option in the column definition object. This will take any of the standard filters outlined above or a custom function*/
  var headerFilterFunc: js.UndefOr[
    FilterType | (js.Function4[
      /* headerValue */ js.Any, 
      /* rowValue */ js.Any, 
      /* rowdata */ js.Any, 
      /* filterparams */ js.Any, 
      Boolean
    ])
  ] = js.undefined
  /**  additional parameters object passed to the headerFilterFunc function  */
  var headerFilterFuncParams: js.UndefOr[js.Any] = js.undefined
  /** disable live filtering of the table  */
  var headerFilterLiveFilter: js.UndefOr[Boolean] = js.undefined
  /** additional parameters you can pass to the header filter */
  var headerFilterParams: js.UndefOr[EditorParams] = js.undefined
  /**  placeholder text for the header filter */
  var headerFilterPlaceholder: js.UndefOr[String] = js.undefined
  /**You can add a menu to any column by passing an array of menu items to the headerMenu option in that columns definition. */
  var headerMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.undefined
  // Column Header
  /** By default all columns in a table are sortable by clicking on the column header, if you want to disable this behaviour, set the headerSort property to false in the column definition array: */
  var headerSort: js.UndefOr[Boolean] = js.undefined
  /** set the starting sort direction when a user first clicks on a header */
  var headerSortStartingDir: js.UndefOr[SortDirection] = js.undefined
  /** allow tristate toggling of column header sort direction */
  var headerSortTristate: js.UndefOr[Boolean] = js.undefined
  /**  callback for when user taps on a header for this column, triggered in touch displays. */
  var headerTap: js.UndefOr[ColumnEventCallback] = js.undefined
  /** callback for when user taps and holds on a header for this column, triggered in touch displays when a user taps and holds the same header for 1 second. */
  var headerTapHold: js.UndefOr[ColumnEventCallback] = js.undefined
  /** sets the on hover tooltip for the column header* * The tooltip headerTooltip can take three different types of value
    boolean - a value of false disables the tooltip, a value of true sets the tooltip of the column header to its title value.
    string - a string that will be displayed for the tooltip.
    function - a callback function that returns the string for the column header*
    */
  var headerTooltip: js.UndefOr[Boolean | String | (js.Function1[/* column */ ColumnComponent, String])] = js.undefined
  /** change the orientation of the column header to vertical* * The headerVertical property can take one of three values:
    false - vertical columns disabled (default value)
    true - vertical columns enabled
    "flip" - vertical columns enabled, with text direction flipped by 180 degrees*
    */
  var headerVertical: js.UndefOr[Boolean | flip] = js.undefined
  /** When the getHtml function is called, hide the column from the output. */
  var hideInHtml: js.UndefOr[Boolean] = js.undefined
  /**If you want to set the horizontal alignment on a column by column basis, */
  var hozAlign: js.UndefOr[ColumnDefinitionAlign] = js.undefined
  /** Show/Hide a particular column in the HTML output*/
  var htmlOutput: js.UndefOr[Boolean] = js.undefined
  /** sets the minimum width of this column, this should be set in pixels (this takes priority over the global option of columnMinWidth) */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** Mutators are used to alter data as it is parsed into Tabulator. For example if you wanted to convert a numeric column into a boolean based on its value, before the data is used to build the table.
    You can set mutators on a per column basis using the mutator option in the column definition object.
    You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator. */
  var mutator: js.UndefOr[CustomMutator] = js.undefined
  /** only called when data is changed via a user editing a cell. */
  var mutatorClipboard: js.UndefOr[CustomMutator] = js.undefined
  var mutatorClipboardParams: js.UndefOr[CustomMutatorParams] = js.undefined
  /**  only called when data is loaded via a command {eg. setData). */
  var mutatorData: js.UndefOr[CustomMutator] = js.undefined
  var mutatorDataParams: js.UndefOr[CustomMutatorParams] = js.undefined
  /** only called when data is changed via a user editing a cell. */
  var mutatorEdit: js.UndefOr[CustomMutator] = js.undefined
  var mutatorEditParams: js.UndefOr[CustomMutatorParams] = js.undefined
  /** You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator. */
  var mutatorParams: js.UndefOr[CustomMutatorParams] = js.undefined
  /** set whether column can be resized by user dragging its edges */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /** an integer to determine when the column should be hidden in responsive mode */
  var responsive: js.UndefOr[Double] = js.undefined
  /** sets the column as a row handle, allowing it to be used to drag movable rows. */
  var rowHandle: js.UndefOr[Boolean] = js.undefined
  // Data Manipulation
  /**  By default Tabulator will attempt to guess which sorter should be applied to a column based on the data contained in the first row. It can determine sorters for strings, numbers, alphanumeric sequences and booleans, anything else will be treated as a string.
  To specify a sorter to be used on a column use the sorter property in the columns definition object
  You can pass an optional additional property with sorter, sorterParams that should contain an object with additional information for configuring the sorter*/
  var sorter: js.UndefOr[
    string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* aRow */ RowComponent, 
      /* bRow */ RowComponent, 
      /* column */ ColumnComponent, 
      /* dir */ SortDirection, 
      /* sorterParams */ js.Object, 
      Double
    ])
  ] = js.undefined
  /** If you want to dynamically generate the sorterParams at the time the sort is called you can pass a function into the property that should return the params object. */
  var sorterParams: js.UndefOr[ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction] = js.undefined
  /**When copying to clipboard you may want to apply a different columnheader title from the one usualy used in the table. You can now do this using the titleClipboard column definition option, which takes the same inputs as the standard title property. */
  var titleClipboard: js.UndefOr[String] = js.undefined
  /** set custom title for column in download */
  var titleDownload: js.UndefOr[String] = js.undefined
  /**  formatter function for header title */
  var titleFormatter: js.UndefOr[Formatter] = js.undefined
  /** additional parameters you can pass to the header title formatter */
  var titleFormatterParams: js.UndefOr[FormatterParams] = js.undefined
  /**When the getHtml function is called you may want to apply a different columnheader title from the one usualy used in the table. You can now do this using the titleHtmlOutput column definition option, which takes the same inputs as the standard title property. */
  var titleHtmlOutput: js.UndefOr[String] = js.undefined
  /**When printing you may want to apply a different columnheader title from the one usualy used in the table. You can now do this using the titlePrint column definition option, which takes the same inputs as the standard title property. */
  var titlePrint: js.UndefOr[String] = js.undefined
  /** sets the on hover tooltip for each cell in this column * * The tooltip parameter can take three different types of value
    boolean - a value of false disables the tooltip, a value of true sets the tooltip of the cell to its value
    string - a string that will be displayed for all cells in the matching column/table.
    function - a callback function that returns the string for the cell
    * Note: setting a tooltip value on a column will override the global setting.
    */
  var tooltip: js.UndefOr[String | GlobalTooltipOption] = js.undefined
  /**  the column calculation to be displayed at the top of this column(see Column Calculations for more details) */
  var topCalc: js.UndefOr[ColumnCalc] = js.undefined
  /** formatter for the topCalc calculation cell  */
  var topCalcFormatter: js.UndefOr[Formatter] = js.undefined
  /**  additional parameters you can pass to the topCalcFormatter function */
  var topCalcFormatterParams: js.UndefOr[FormatterParams] = js.undefined
  /** additional parameters you can pass to the topCalc calculation function (see Column Calculations for more details) */
  var topCalcParams: js.UndefOr[ColumnCalcParams] = js.undefined
  /** Validators are used to ensure that any user input into your editable cells matches your requirements.
    Validators can be applied by using the validator property in a columns definition object (see Define Columns for more details). */
  var validator: js.UndefOr[
    StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String
  ] = js.undefined
  /** alter the row height to fit the contents of the cell instead of hiding overflow */
  var variableHeight: js.UndefOr[Boolean] = js.undefined
  /**If you want to set the vertical alignment on a column by column basis */
  var vertAlign: js.UndefOr[VerticalAlign] = js.undefined
  /** The widthGrow property should be used on columns without a width property set. The value is used to work out what fraction of the available will be allocated to the column. The value should be set to a number greater than 0, by default any columns with no width set have a widthGrow value of 1 */
  var widthGrow: js.UndefOr[Double] = js.undefined
  /** The widthShrink property should be used on columns with a width property set. The value is used to work out how to shrink columns with a fixed width when the table is too narrow to fit in all the columns. The value should be set to a number greater than 0, by default columns with a width set have a widthShrink value of 0, meaning they will not be shrunk if the table gets too narrow, and may cause the horizontal scrollbar to appear. */
  var widthShrink: js.UndefOr[Double] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    title: String,
    accessor: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any = null,
    accessorClipboard: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any = null,
    accessorClipboardParams: CustomAccessorParams = null,
    accessorDownload: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any = null,
    accessorDownloadParams: CustomAccessorParams = null,
    accessorHtmlOutput: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any = null,
    accessorHtmlOutputParams: CustomAccessorParams = null,
    accessorParams: CustomAccessorParams = null,
    accessorPrint: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent]) => js.Any = null,
    accessorPrintParams: CustomAccessorParams = null,
    bottomCalc: ColumnCalc = null,
    bottomCalcFormatter: Formatter = null,
    bottomCalcFormatterParams: FormatterParams = null,
    bottomCalcParams: (/* values */ js.Any, /* data */ js.Any) => js.Any = null,
    cellClick: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellContext: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellDblClick: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellDblTap: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellEditCancelled: /* cell */ CellComponent => Unit = null,
    cellEdited: /* cell */ CellComponent => Unit = null,
    cellEditing: /* cell */ CellComponent => Unit = null,
    cellMouseEnter: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellMouseLeave: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellMouseMove: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellMouseOut: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellMouseOver: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellTap: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellTapHold: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    clipboard: js.UndefOr[Boolean] = js.undefined,
    columns: js.Array[ColumnDefinition] = null,
    contextMenu: js.Array[MenuObject[CellComponent] | MenuSeparator] = null,
    cssClass: String = null,
    download: js.UndefOr[Boolean] = js.undefined,
    editable: Boolean | (js.Function1[/* cell */ CellComponent, Boolean]) = null,
    editableTitle: js.UndefOr[Boolean] = js.undefined,
    editor: Editor = null,
    editorParams: EditorParams = null,
    field: String = null,
    formatter: Formatter = null,
    formatterClipboard: Formatter | `false` = null,
    formatterClipboardParams: FormatterParams = null,
    formatterHtmlOutput: Formatter | `false` = null,
    formatterHtmlOutputParams: FormatterParams = null,
    formatterParams: FormatterParams = null,
    formatterPrint: Formatter | `false` = null,
    formatterPrintParams: FormatterParams = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    headerClick: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit = null,
    headerContext: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit = null,
    headerContextMenu: js.Array[MenuObject[ColumnComponent] | MenuSeparator] = null,
    headerDblClick: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit = null,
    headerDblTap: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit = null,
    headerFilter: Editor = null,
    headerFilterEmptyCheck: /* value */ js.Any => Boolean = null,
    headerFilterFunc: FilterType | (js.Function4[
      /* headerValue */ js.Any, 
      /* rowValue */ js.Any, 
      /* rowdata */ js.Any, 
      /* filterparams */ js.Any, 
      Boolean
    ]) = null,
    headerFilterFuncParams: js.Any = null,
    headerFilterLiveFilter: js.UndefOr[Boolean] = js.undefined,
    headerFilterParams: EditorParams = null,
    headerFilterPlaceholder: String = null,
    headerMenu: js.Array[MenuObject[ColumnComponent] | MenuSeparator] = null,
    headerSort: js.UndefOr[Boolean] = js.undefined,
    headerSortStartingDir: SortDirection = null,
    headerSortTristate: js.UndefOr[Boolean] = js.undefined,
    headerTap: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit = null,
    headerTapHold: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit = null,
    headerTooltip: Boolean | String | (js.Function1[/* column */ ColumnComponent, String]) = null,
    headerVertical: Boolean | flip = null,
    hideInHtml: js.UndefOr[Boolean] = js.undefined,
    hozAlign: ColumnDefinitionAlign = null,
    htmlOutput: js.UndefOr[Boolean] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    mutator: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any = null,
    mutatorClipboard: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any = null,
    mutatorClipboardParams: CustomMutatorParams = null,
    mutatorData: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any = null,
    mutatorDataParams: CustomMutatorParams = null,
    mutatorEdit: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any = null,
    mutatorEditParams: CustomMutatorParams = null,
    mutatorParams: CustomMutatorParams = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Double] = js.undefined,
    rowHandle: js.UndefOr[Boolean] = js.undefined,
    sorter: string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* aRow */ RowComponent, 
      /* bRow */ RowComponent, 
      /* column */ ColumnComponent, 
      /* dir */ SortDirection, 
      /* sorterParams */ js.Object, 
      Double
    ]) = null,
    sorterParams: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction = null,
    titleClipboard: String = null,
    titleDownload: String = null,
    titleFormatter: Formatter = null,
    titleFormatterParams: FormatterParams = null,
    titleHtmlOutput: String = null,
    titlePrint: String = null,
    tooltip: String | GlobalTooltipOption = null,
    topCalc: ColumnCalc = null,
    topCalcFormatter: Formatter = null,
    topCalcFormatterParams: FormatterParams = null,
    topCalcParams: (/* values */ js.Any, /* data */ js.Any) => js.Any = null,
    validator: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String = null,
    variableHeight: js.UndefOr[Boolean] = js.undefined,
    vertAlign: VerticalAlign = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    widthGrow: js.UndefOr[Double] = js.undefined,
    widthShrink: js.UndefOr[Double] = js.undefined
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (accessor != null) __obj.updateDynamic("accessor")(js.Any.fromFunction5(accessor))
    if (accessorClipboard != null) __obj.updateDynamic("accessorClipboard")(js.Any.fromFunction5(accessorClipboard))
    if (accessorClipboardParams != null) __obj.updateDynamic("accessorClipboardParams")(accessorClipboardParams.asInstanceOf[js.Any])
    if (accessorDownload != null) __obj.updateDynamic("accessorDownload")(js.Any.fromFunction5(accessorDownload))
    if (accessorDownloadParams != null) __obj.updateDynamic("accessorDownloadParams")(accessorDownloadParams.asInstanceOf[js.Any])
    if (accessorHtmlOutput != null) __obj.updateDynamic("accessorHtmlOutput")(js.Any.fromFunction5(accessorHtmlOutput))
    if (accessorHtmlOutputParams != null) __obj.updateDynamic("accessorHtmlOutputParams")(accessorHtmlOutputParams.asInstanceOf[js.Any])
    if (accessorParams != null) __obj.updateDynamic("accessorParams")(accessorParams.asInstanceOf[js.Any])
    if (accessorPrint != null) __obj.updateDynamic("accessorPrint")(js.Any.fromFunction5(accessorPrint))
    if (accessorPrintParams != null) __obj.updateDynamic("accessorPrintParams")(accessorPrintParams.asInstanceOf[js.Any])
    if (bottomCalc != null) __obj.updateDynamic("bottomCalc")(bottomCalc.asInstanceOf[js.Any])
    if (bottomCalcFormatter != null) __obj.updateDynamic("bottomCalcFormatter")(bottomCalcFormatter.asInstanceOf[js.Any])
    if (bottomCalcFormatterParams != null) __obj.updateDynamic("bottomCalcFormatterParams")(bottomCalcFormatterParams.asInstanceOf[js.Any])
    if (bottomCalcParams != null) __obj.updateDynamic("bottomCalcParams")(js.Any.fromFunction2(bottomCalcParams))
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction2(cellClick))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction2(cellContext))
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(js.Any.fromFunction2(cellDblClick))
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(js.Any.fromFunction2(cellDblTap))
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(js.Any.fromFunction1(cellEditCancelled))
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(js.Any.fromFunction1(cellEdited))
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(js.Any.fromFunction1(cellEditing))
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction2(cellMouseEnter))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction2(cellMouseLeave))
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(js.Any.fromFunction2(cellMouseMove))
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(js.Any.fromFunction2(cellMouseOut))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction2(cellMouseOver))
    if (cellTap != null) __obj.updateDynamic("cellTap")(js.Any.fromFunction2(cellTap))
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(js.Any.fromFunction2(cellTapHold))
    if (!js.isUndefined(clipboard)) __obj.updateDynamic("clipboard")(clipboard.get.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.get.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(editableTitle)) __obj.updateDynamic("editableTitle")(editableTitle.get.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (editorParams != null) __obj.updateDynamic("editorParams")(editorParams.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formatterClipboard != null) __obj.updateDynamic("formatterClipboard")(formatterClipboard.asInstanceOf[js.Any])
    if (formatterClipboardParams != null) __obj.updateDynamic("formatterClipboardParams")(formatterClipboardParams.asInstanceOf[js.Any])
    if (formatterHtmlOutput != null) __obj.updateDynamic("formatterHtmlOutput")(formatterHtmlOutput.asInstanceOf[js.Any])
    if (formatterHtmlOutputParams != null) __obj.updateDynamic("formatterHtmlOutputParams")(formatterHtmlOutputParams.asInstanceOf[js.Any])
    if (formatterParams != null) __obj.updateDynamic("formatterParams")(formatterParams.asInstanceOf[js.Any])
    if (formatterPrint != null) __obj.updateDynamic("formatterPrint")(formatterPrint.asInstanceOf[js.Any])
    if (formatterPrintParams != null) __obj.updateDynamic("formatterPrintParams")(formatterPrintParams.asInstanceOf[js.Any])
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen.get.asInstanceOf[js.Any])
    if (headerClick != null) __obj.updateDynamic("headerClick")(js.Any.fromFunction2(headerClick))
    if (headerContext != null) __obj.updateDynamic("headerContext")(js.Any.fromFunction2(headerContext))
    if (headerContextMenu != null) __obj.updateDynamic("headerContextMenu")(headerContextMenu.asInstanceOf[js.Any])
    if (headerDblClick != null) __obj.updateDynamic("headerDblClick")(js.Any.fromFunction2(headerDblClick))
    if (headerDblTap != null) __obj.updateDynamic("headerDblTap")(js.Any.fromFunction2(headerDblTap))
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (headerFilterEmptyCheck != null) __obj.updateDynamic("headerFilterEmptyCheck")(js.Any.fromFunction1(headerFilterEmptyCheck))
    if (headerFilterFunc != null) __obj.updateDynamic("headerFilterFunc")(headerFilterFunc.asInstanceOf[js.Any])
    if (headerFilterFuncParams != null) __obj.updateDynamic("headerFilterFuncParams")(headerFilterFuncParams.asInstanceOf[js.Any])
    if (!js.isUndefined(headerFilterLiveFilter)) __obj.updateDynamic("headerFilterLiveFilter")(headerFilterLiveFilter.get.asInstanceOf[js.Any])
    if (headerFilterParams != null) __obj.updateDynamic("headerFilterParams")(headerFilterParams.asInstanceOf[js.Any])
    if (headerFilterPlaceholder != null) __obj.updateDynamic("headerFilterPlaceholder")(headerFilterPlaceholder.asInstanceOf[js.Any])
    if (headerMenu != null) __obj.updateDynamic("headerMenu")(headerMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSort)) __obj.updateDynamic("headerSort")(headerSort.get.asInstanceOf[js.Any])
    if (headerSortStartingDir != null) __obj.updateDynamic("headerSortStartingDir")(headerSortStartingDir.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSortTristate)) __obj.updateDynamic("headerSortTristate")(headerSortTristate.get.asInstanceOf[js.Any])
    if (headerTap != null) __obj.updateDynamic("headerTap")(js.Any.fromFunction2(headerTap))
    if (headerTapHold != null) __obj.updateDynamic("headerTapHold")(js.Any.fromFunction2(headerTapHold))
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip.asInstanceOf[js.Any])
    if (headerVertical != null) __obj.updateDynamic("headerVertical")(headerVertical.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInHtml)) __obj.updateDynamic("hideInHtml")(hideInHtml.get.asInstanceOf[js.Any])
    if (hozAlign != null) __obj.updateDynamic("hozAlign")(hozAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlOutput)) __obj.updateDynamic("htmlOutput")(htmlOutput.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (mutator != null) __obj.updateDynamic("mutator")(js.Any.fromFunction5(mutator))
    if (mutatorClipboard != null) __obj.updateDynamic("mutatorClipboard")(js.Any.fromFunction5(mutatorClipboard))
    if (mutatorClipboardParams != null) __obj.updateDynamic("mutatorClipboardParams")(mutatorClipboardParams.asInstanceOf[js.Any])
    if (mutatorData != null) __obj.updateDynamic("mutatorData")(js.Any.fromFunction5(mutatorData))
    if (mutatorDataParams != null) __obj.updateDynamic("mutatorDataParams")(mutatorDataParams.asInstanceOf[js.Any])
    if (mutatorEdit != null) __obj.updateDynamic("mutatorEdit")(js.Any.fromFunction5(mutatorEdit))
    if (mutatorEditParams != null) __obj.updateDynamic("mutatorEditParams")(mutatorEditParams.asInstanceOf[js.Any])
    if (mutatorParams != null) __obj.updateDynamic("mutatorParams")(mutatorParams.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHandle)) __obj.updateDynamic("rowHandle")(rowHandle.get.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (sorterParams != null) __obj.updateDynamic("sorterParams")(sorterParams.asInstanceOf[js.Any])
    if (titleClipboard != null) __obj.updateDynamic("titleClipboard")(titleClipboard.asInstanceOf[js.Any])
    if (titleDownload != null) __obj.updateDynamic("titleDownload")(titleDownload.asInstanceOf[js.Any])
    if (titleFormatter != null) __obj.updateDynamic("titleFormatter")(titleFormatter.asInstanceOf[js.Any])
    if (titleFormatterParams != null) __obj.updateDynamic("titleFormatterParams")(titleFormatterParams.asInstanceOf[js.Any])
    if (titleHtmlOutput != null) __obj.updateDynamic("titleHtmlOutput")(titleHtmlOutput.asInstanceOf[js.Any])
    if (titlePrint != null) __obj.updateDynamic("titlePrint")(titlePrint.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (topCalc != null) __obj.updateDynamic("topCalc")(topCalc.asInstanceOf[js.Any])
    if (topCalcFormatter != null) __obj.updateDynamic("topCalcFormatter")(topCalcFormatter.asInstanceOf[js.Any])
    if (topCalcFormatterParams != null) __obj.updateDynamic("topCalcFormatterParams")(topCalcFormatterParams.asInstanceOf[js.Any])
    if (topCalcParams != null) __obj.updateDynamic("topCalcParams")(js.Any.fromFunction2(topCalcParams))
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (!js.isUndefined(variableHeight)) __obj.updateDynamic("variableHeight")(variableHeight.get.asInstanceOf[js.Any])
    if (vertAlign != null) __obj.updateDynamic("vertAlign")(vertAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(widthGrow)) __obj.updateDynamic("widthGrow")(widthGrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthShrink)) __obj.updateDynamic("widthShrink")(widthShrink.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

