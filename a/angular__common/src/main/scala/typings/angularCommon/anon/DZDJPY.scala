package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DZDJPY extends js.Object {
  var DZD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object DZDJPY {
  @scala.inline
  def apply(DZD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): DZDJPY = {
    val __obj = js.Dynamic.literal(DZD = DZD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DZDJPY]
  }
}

