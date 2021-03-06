package typings.stripe.mod.paymentIntents

import typings.stripe.mod.IAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentDataShipping extends js.Object {
  /**
    * Shipping address.
    */
  var address: IAddress
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. This can be unset by updating the value to null and then saving.
    */
  var carrier: js.UndefOr[String | Null] = js.undefined
  /**
    * Recipient name. This can be unset by updating the value to null and then saving.
    */
  var name: String | Null
  /**
    * Recipient phone (including extension). This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String | Null] = js.undefined
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers were generated for this purchase, please separate them with commas. This can be unset by updating the value to null and then saving.
    */
  var tracking_number: js.UndefOr[String | Null] = js.undefined
}

object IPaymentIntentDataShipping {
  @scala.inline
  def apply(
    address: IAddress,
    carrier: js.UndefOr[Null | String] = js.undefined,
    name: String = null,
    phone: js.UndefOr[Null | String] = js.undefined,
    tracking_number: js.UndefOr[Null | String] = js.undefined
  ): IPaymentIntentDataShipping = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(carrier)) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (!js.isUndefined(tracking_number)) __obj.updateDynamic("tracking_number")(tracking_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentDataShipping]
  }
}

