package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsHTML extends js.Object {
  var groupHeaderDownload: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.undefined
  var htmlOutputConfig: js.UndefOr[AddditionalExportOptions] = js.undefined
  /**By Default when a page is printed that includes a Tabulator it will be rendered on the page exactly as the table is drawn. While this ise useful in most cases, some users prefer tohave more controll over the print output, for example showing all rows of the table, instead of just those visible with the current position of the scroll bar.
    Tabulator provides a print styling mode that will replace the Tabulator with an HTML table for the printout giving you much more control over the look and feel of the table for the print out., to enable this mode, set the printAsHtml option to true in the table constructor. 
    
    This will replace the table (in print outs only) with a simple HTML table with the class tabulator-print-table that you can use to style the table in any way you like.
    It also has the benifit that because it is an HTML table, if it corsses a page break your browser will uatomatically add the column headers in at the top of the next page.
    */
  var printAsHtml: js.UndefOr[Boolean] = js.undefined
  /**The HTML table will contain column header groups, row groups, and column calculations.
    You can choose to remove any of these from the output data by setting the values in the printConfig option in the table definition */
  var printConfig: js.UndefOr[AddditionalExportOptions] = js.undefined
  /**You can use the printFooter table setup option to define a footer to be displayed when the table is printed. */
  var printFooter: js.UndefOr[StandardStringParam] = js.undefined
  /**The printFormatter table setup option allows you to carry out any manipulation of the print output before it is displayed to the user for printing*/
  var printFormatter: js.UndefOr[js.Function2[/* tableHolderElement */ js.Any, /* tableElement */ js.Any, _]] = js.undefined
  /**You can use the printHeader table setup option to define a header to be displayed when the table is printed. */
  var printHeader: js.UndefOr[StandardStringParam] = js.undefined
  /**By default, only the rows currently visible in the Tabulator will be added to the HTML table. For custom row ranges it is also possible to pass a function into the printRowRange option that should return an array of Row Components */
  var printRowRange: js.UndefOr[RowRangeLookup | js.Function0[js.Array[RowComponent]]] = js.undefined
  /**If you want your printed table to be styled to match your Tabulator you can set the printCopyStyle to true, this will copy key layout styling to the printed table */
  var printStyled: js.UndefOr[Boolean] = js.undefined
}

object OptionsHTML {
  @scala.inline
  def apply(
    groupHeaderDownload: (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]]) = null,
    htmlOutputConfig: AddditionalExportOptions = null,
    printAsHtml: js.UndefOr[Boolean] = js.undefined,
    printConfig: AddditionalExportOptions = null,
    printFooter: StandardStringParam = null,
    printFormatter: (/* tableHolderElement */ js.Any, /* tableElement */ js.Any) => _ = null,
    printHeader: StandardStringParam = null,
    printRowRange: RowRangeLookup | js.Function0[js.Array[RowComponent]] = null,
    printStyled: js.UndefOr[Boolean] = js.undefined
  ): OptionsHTML = {
    val __obj = js.Dynamic.literal()
    if (groupHeaderDownload != null) __obj.updateDynamic("groupHeaderDownload")(groupHeaderDownload.asInstanceOf[js.Any])
    if (htmlOutputConfig != null) __obj.updateDynamic("htmlOutputConfig")(htmlOutputConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(printAsHtml)) __obj.updateDynamic("printAsHtml")(printAsHtml.get.asInstanceOf[js.Any])
    if (printConfig != null) __obj.updateDynamic("printConfig")(printConfig.asInstanceOf[js.Any])
    if (printFooter != null) __obj.updateDynamic("printFooter")(printFooter.asInstanceOf[js.Any])
    if (printFormatter != null) __obj.updateDynamic("printFormatter")(js.Any.fromFunction2(printFormatter))
    if (printHeader != null) __obj.updateDynamic("printHeader")(printHeader.asInstanceOf[js.Any])
    if (printRowRange != null) __obj.updateDynamic("printRowRange")(printRowRange.asInstanceOf[js.Any])
    if (!js.isUndefined(printStyled)) __obj.updateDynamic("printStyled")(printStyled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsHTML]
  }
}

