package typings.jjv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var checkRequired: js.UndefOr[Boolean] = js.undefined
  var removeAdditional: js.UndefOr[Boolean] = js.undefined
  var useCoerce: js.UndefOr[Boolean] = js.undefined
  var useDefault: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    checkRequired: js.UndefOr[Boolean] = js.undefined,
    removeAdditional: js.UndefOr[Boolean] = js.undefined,
    useCoerce: js.UndefOr[Boolean] = js.undefined,
    useDefault: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkRequired)) __obj.updateDynamic("checkRequired")(checkRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeAdditional)) __obj.updateDynamic("removeAdditional")(removeAdditional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCoerce)) __obj.updateDynamic("useCoerce")(useCoerce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefault)) __obj.updateDynamic("useDefault")(useDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

