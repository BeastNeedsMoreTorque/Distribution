package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SEK extends js.Object {
  var JPY: js.Array[String]
  var SEK: js.Array[String]
  var USD: js.Array[String]
}

object SEK {
  @scala.inline
  def apply(JPY: js.Array[String], SEK: js.Array[String], USD: js.Array[String]): SEK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SEK]
  }
}

