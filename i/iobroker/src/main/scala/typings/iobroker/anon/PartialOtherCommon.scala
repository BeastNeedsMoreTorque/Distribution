package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker.<global>.ioBroker.OtherCommon> */
trait PartialOtherCommon extends js.Object {
  var custom: js.UndefOr[scala.Nothing] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object PartialOtherCommon {
  @scala.inline
  def apply(icon: String = null, name: String = null, role: String = null): PartialOtherCommon = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOtherCommon]
  }
}

