package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ResponseInit
trait ResponseInit extends js.Object {
  var headers: js.UndefOr[Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object ResponseInit {
  @scala.inline
  def apply(
    headers: Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String] = null,
    status: Int | Double = null,
    statusText: String = null
  ): ResponseInit = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInit]
  }
}

