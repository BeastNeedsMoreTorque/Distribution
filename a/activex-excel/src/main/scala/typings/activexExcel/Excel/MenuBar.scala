package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuBar extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val BuiltIn: Boolean = js.native
  var Caption: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.MenuBar_typekey")
  var ExcelDotMenuBar_typekey: MenuBar = js.native
  val Index: Double = js.native
  @JSName("Menus")
  val Menus_Original: Menus = js.native
  val Parent: js.Any = js.native
  def Activate(): Unit = js.native
  def Delete(): Unit = js.native
  def Menus(Index: js.Any): Menu = js.native
  def Reset(): Unit = js.native
}

