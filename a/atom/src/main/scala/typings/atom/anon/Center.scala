package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Center extends js.Object {
  var center: js.UndefOr[Boolean] = js.undefined
}

object Center {
  @scala.inline
  def apply(center: js.UndefOr[Boolean] = js.undefined): Center = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
}

