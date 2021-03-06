package typings.ftpd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var string: js.UndefOr[String] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(encoding: String = null, flags: String = null, string: String = null): Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

