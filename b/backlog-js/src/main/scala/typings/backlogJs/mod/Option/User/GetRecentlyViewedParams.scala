package typings.backlogJs.mod.Option.User

import typings.backlogJs.mod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecentlyViewedParams extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object GetRecentlyViewedParams {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    order: Order = null
  ): GetRecentlyViewedParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecentlyViewedParams]
  }
}

