package typings.fsExtra.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingFlag extends js.Object {
  var encoding: String
  var flag: js.UndefOr[String] = js.undefined
}

object EncodingFlag {
  @scala.inline
  def apply(encoding: String, flag: String = null): EncodingFlag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingFlag]
  }
}

