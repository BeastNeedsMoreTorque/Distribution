package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ETBJPY extends js.Object {
  var ETB: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object ETBJPY {
  @scala.inline
  def apply(ETB: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): ETBJPY = {
    val __obj = js.Dynamic.literal(ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ETBJPY]
  }
}

