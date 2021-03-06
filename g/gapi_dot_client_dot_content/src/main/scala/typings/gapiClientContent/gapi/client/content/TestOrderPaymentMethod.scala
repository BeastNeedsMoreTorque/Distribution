package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderPaymentMethod extends js.Object {
  /** The card expiration month (January = 1, February = 2 etc.). */
  var expirationMonth: js.UndefOr[Double] = js.undefined
  /** The card expiration year (4-digit, e.g. 2015). */
  var expirationYear: js.UndefOr[Double] = js.undefined
  /** The last four digits of the card number. */
  var lastFourDigits: js.UndefOr[String] = js.undefined
  /** The billing address. */
  var predefinedBillingAddress: js.UndefOr[String] = js.undefined
  /** The type of instrument. Note that real orders might have different values than the four values accepted by createTestOrder. */
  var `type`: js.UndefOr[String] = js.undefined
}

object TestOrderPaymentMethod {
  @scala.inline
  def apply(
    expirationMonth: js.UndefOr[Double] = js.undefined,
    expirationYear: js.UndefOr[Double] = js.undefined,
    lastFourDigits: String = null,
    predefinedBillingAddress: String = null,
    `type`: String = null
  ): TestOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expirationMonth)) __obj.updateDynamic("expirationMonth")(expirationMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationYear)) __obj.updateDynamic("expirationYear")(expirationYear.get.asInstanceOf[js.Any])
    if (lastFourDigits != null) __obj.updateDynamic("lastFourDigits")(lastFourDigits.asInstanceOf[js.Any])
    if (predefinedBillingAddress != null) __obj.updateDynamic("predefinedBillingAddress")(predefinedBillingAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOrderPaymentMethod]
  }
}

