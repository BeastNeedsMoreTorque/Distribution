package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderPaymentMethod extends js.Object {
  var billingAddress: js.UndefOr[OrderAddress] = js.undefined
  var expirationMonth: js.UndefOr[Double] = js.undefined
  var expirationYear: js.UndefOr[Double] = js.undefined
  var lastFourDigits: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object OrderPaymentMethod {
  @scala.inline
  def apply(
    billingAddress: OrderAddress = null,
    expirationMonth: js.UndefOr[Double] = js.undefined,
    expirationYear: js.UndefOr[Double] = js.undefined,
    lastFourDigits: String = null,
    phoneNumber: String = null,
    `type`: String = null
  ): OrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationMonth)) __obj.updateDynamic("expirationMonth")(expirationMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationYear)) __obj.updateDynamic("expirationYear")(expirationYear.get.asInstanceOf[js.Any])
    if (lastFourDigits != null) __obj.updateDynamic("lastFourDigits")(lastFourDigits.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderPaymentMethod]
  }
}

