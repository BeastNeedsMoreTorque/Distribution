package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabel extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var AutoScaleFont: js.Any = js.native
  var AutoText: Boolean = js.native
  val Border: typings.activexExcel.Excel.Border = js.native
  var Caption: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.DataLabel_typekey")
  var ExcelDotDataLabel_typekey: DataLabel = js.native
  val Fill: ChartFillFormat = js.native
  val Font: typings.activexExcel.Excel.Font = js.native
  val Format: ChartFormat = js.native
  var Formula: String = js.native
  var FormulaLocal: String = js.native
  var FormulaR1C1: String = js.native
  var FormulaR1C1Local: String = js.native
  val Height: Double = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  val Interior: typings.activexExcel.Excel.Interior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  var NumberFormat: String = js.native
  var NumberFormatLinked: Boolean = js.native
  var NumberFormatLocal: String = js.native
  var Orientation: XlOrientation = js.native
  val Parent: js.Any = js.native
  var Position: XlDataLabelPosition = js.native
  var ReadingOrder: Double = js.native
  var Separator: String | XlDataLabelSeparator = js.native
  var Shadow: Boolean = js.native
  var ShowBubbleSize: Boolean = js.native
  var ShowCategoryName: Boolean = js.native
  var ShowLegendKey: Boolean = js.native
  var ShowPercentage: Boolean = js.native
  var ShowSeriesName: Boolean = js.native
  var ShowValue: Boolean = js.native
  var Text: String = js.native
  var Top: Double = js.native
  var Type: js.Any = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  val Width: Double = js.native
  def Characters(): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typings.activexExcel.Excel.Characters = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

