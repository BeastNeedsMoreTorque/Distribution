package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.PaginationOptions> */
trait ListQueuesOptions extends js.Object {
  var skip: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object ListQueuesOptions {
  @scala.inline
  def apply(skip: js.UndefOr[Double] = js.undefined, top: js.UndefOr[Double] = js.undefined): ListQueuesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesOptions]
  }
}

