package typings.blueprintjsCore.reactUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamed extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object INamed {
  @scala.inline
  def apply(name: String = null): INamed = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamed]
  }
}

