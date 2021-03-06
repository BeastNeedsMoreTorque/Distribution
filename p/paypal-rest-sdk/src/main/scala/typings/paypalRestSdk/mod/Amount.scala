package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Giftwrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  var currency: String
  var details: js.UndefOr[Giftwrap] = js.undefined
  var total: String
}

object Amount {
  @scala.inline
  def apply(currency: String, total: String, details: Giftwrap = null): Amount = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

