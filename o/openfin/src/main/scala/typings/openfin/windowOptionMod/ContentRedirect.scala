package typings.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRedirect extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object ContentRedirect {
  @scala.inline
  def apply(blacklist: js.Array[String] = null, whitelist: js.Array[String] = null): ContentRedirect = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRedirect]
  }
}

