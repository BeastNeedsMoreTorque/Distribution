package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MXNMYR extends js.Object {
  var CAD: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var MXN: js.Array[js.UndefOr[String]]
  var MYR: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[js.UndefOr[String]]
}

object MXNMYR {
  @scala.inline
  def apply(
    CAD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    MYR: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[js.UndefOr[String]]
  ): MXNMYR = {
    val __obj = js.Dynamic.literal(CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MXNMYR]
  }
}

