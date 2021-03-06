package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPageBreak extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.HPageBreak_typekey")
  var ExcelDotHPageBreak_typekey: HPageBreak = js.native
  val Extent: XlPageBreakExtent = js.native
  @JSName("Location")
  var Location_Original: Range = js.native
  val Parent: Worksheet = js.native
  var Type: XlPageBreak = js.native
  def Delete(): Unit = js.native
  def DragOff(Direction: XlDirection, RegionIndex: Double): Unit = js.native
  def Location(Address: String): Range = js.native
  def Location(RowIndex: Double): Range = js.native
  def Location(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

