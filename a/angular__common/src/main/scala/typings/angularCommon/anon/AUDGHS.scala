package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AUDGHS extends js.Object {
  var AUD: js.Array[String]
  var GHS: js.Array[String]
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var USD: js.Array[String]
}

object AUDGHS {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    GHS: js.Array[String],
    JPY: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): AUDGHS = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], GHS = GHS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDGHS]
  }
}

