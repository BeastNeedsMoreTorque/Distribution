package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MOP extends js.Object {
  var JPY: js.Array[String]
  var MOP: js.Array[String]
  var USD: js.Array[String]
}

object MOP {
  @scala.inline
  def apply(JPY: js.Array[String], MOP: js.Array[String], USD: js.Array[String]): MOP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MOP = MOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MOP]
  }
}

