package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CNYJPY extends js.Object {
  var CNY: js.Array[String]
  var JPY: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var XXX: js.Array[scala.Nothing]
}

object CNYJPY {
  @scala.inline
  def apply(
    CNY: js.Array[String],
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    XXX: js.Array[scala.Nothing]
  ): CNYJPY = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNYJPY]
  }
}

