package typings.storybookAddonJest.provideJestResultMod

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HocProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var api: API
}

object HocProps {
  @scala.inline
  def apply(api: API, active: js.UndefOr[Boolean] = js.undefined): HocProps = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HocProps]
  }
}

