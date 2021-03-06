package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoHiLoLines extends js.Object {
  val Application: js.Any
  val Border: IMsoBorder
  val Creator: Double
  val Format: IMsoChartFormat
  val Name: String
  @JSName("Office.IMsoHiLoLines_typekey")
  var OfficeDotIMsoHiLoLines_typekey: IMsoHiLoLines
  val Parent: js.Any
  def Delete(): Unit
  def Select(): Unit
}

object IMsoHiLoLines {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Unit,
    Format: IMsoChartFormat,
    Name: String,
    OfficeDotIMsoHiLoLines_typekey: IMsoHiLoLines,
    Parent: js.Any,
    Select: () => Unit
  ): IMsoHiLoLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoHiLoLines_typekey")(OfficeDotIMsoHiLoLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoHiLoLines]
  }
}

