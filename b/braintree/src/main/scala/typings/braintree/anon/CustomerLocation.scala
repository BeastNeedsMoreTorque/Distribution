package typings.braintree.anon

import typings.braintree.mod.DurbinRegulated
import typings.braintree.mod.HealthCare
import typings.braintree.mod.Payroll
import typings.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerLocation extends js.Object {
  var bin: String
  var cardType: String
  var cardholderName: String
  var commercial: typings.braintree.mod.Commercial
  var countryOfIssuance: String
  var customerLocation: typings.braintree.mod.CustomerLocation
  var debit: typings.braintree.mod.Debit
  var durbinRegulated: DurbinRegulated
  var expirationDate: String
  var expirationMonth: String
  var expirationYear: String
  var healthcare: HealthCare
  var imageUrl: String
  var issuingBank: String
  var last4: String
  var maskedNumber: String
  var payroll: Payroll
  var prepaid: Prepaid
  var productId: String
  var sourceCardLast4: String
  var token: String
}

object CustomerLocation {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    cardholderName: String,
    commercial: typings.braintree.mod.Commercial,
    countryOfIssuance: String,
    customerLocation: typings.braintree.mod.CustomerLocation,
    debit: typings.braintree.mod.Debit,
    durbinRegulated: DurbinRegulated,
    expirationDate: String,
    expirationMonth: String,
    expirationYear: String,
    healthcare: HealthCare,
    imageUrl: String,
    issuingBank: String,
    last4: String,
    maskedNumber: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    token: String
  ): CustomerLocation = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], maskedNumber = maskedNumber.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceCardLast4 = sourceCardLast4.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerLocation]
  }
}

