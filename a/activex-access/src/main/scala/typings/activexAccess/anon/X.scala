package typings.activexAccess.anon

import typings.activexStdole.stdole.OLE_XPOS_PIXELS
import typings.activexStdole.stdole.OLE_YPOS_PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends js.Object {
  val Button: Double
  val FieldList: Double
  val Shift: Double
  val X: OLE_XPOS_PIXELS
  val Y: OLE_YPOS_PIXELS
}

object X {
  @scala.inline
  def apply(Button: Double, FieldList: Double, Shift: Double, X: OLE_XPOS_PIXELS, Y: OLE_YPOS_PIXELS): X = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], FieldList = FieldList.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

