package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Basic extends js.Object {
  var basic: js.UndefOr[Boolean] = js.undefined
  var `mem-store`: js.UndefOr[Boolean] = js.undefined
  var transport: js.UndefOr[Boolean] = js.undefined
  var web: js.UndefOr[Boolean] = js.undefined
}

object Basic {
  @scala.inline
  def apply(
    basic: js.UndefOr[Boolean] = js.undefined,
    `mem-store`: js.UndefOr[Boolean] = js.undefined,
    transport: js.UndefOr[Boolean] = js.undefined,
    web: js.UndefOr[Boolean] = js.undefined
  ): Basic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`mem-store`)) __obj.updateDynamic("mem-store")(`mem-store`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transport)) __obj.updateDynamic("transport")(transport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(web)) __obj.updateDynamic("web")(web.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basic]
  }
}

