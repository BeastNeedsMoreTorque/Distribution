package typings.stripe.mod.sources

import typings.stripe.anon.Acceptance
import typings.stripe.anon.AddressEmail
import typings.stripe.anon.Bank
import typings.stripe.anon.Iban
import typings.stripe.anon.Refundattributesmethod
import typings.stripe.anon.ReturnurlString
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.ach_credit_transfer
import typings.stripe.stripeStrings.ach_debit
import typings.stripe.stripeStrings.alipay
import typings.stripe.stripeStrings.bancontact
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.card_present
import typings.stripe.stripeStrings.code_verification
import typings.stripe.stripeStrings.eps
import typings.stripe.stripeStrings.giropay
import typings.stripe.stripeStrings.ideal
import typings.stripe.stripeStrings.multibanco
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.p24
import typings.stripe.stripeStrings.receiver
import typings.stripe.stripeStrings.redirect
import typings.stripe.stripeStrings.reusable
import typings.stripe.stripeStrings.sepa_debit
import typings.stripe.stripeStrings.single_use
import typings.stripe.stripeStrings.sofort
import typings.stripe.stripeStrings.three_d_secure
import typings.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceCreationOptions extends IDataOptionsWithMetadata {
  var amount: js.UndefOr[Double] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var flow: js.UndefOr[redirect | receiver | code_verification | none] = js.undefined
  var ideal: js.UndefOr[Bank] = js.undefined
  var mandate: js.UndefOr[Acceptance] = js.undefined
  @JSName("metadata")
  var metadata_ISourceCreationOptions: js.UndefOr[IMetadata] = js.undefined
  var owner: js.UndefOr[AddressEmail] = js.undefined
  var receiver: js.UndefOr[Refundattributesmethod] = js.undefined
  var redirect: js.UndefOr[ReturnurlString] = js.undefined
  var sepa_debit: js.UndefOr[Iban] = js.undefined
  var statement_descriptor: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
  var usage: js.UndefOr[reusable | single_use] = js.undefined
}

object ISourceCreationOptions {
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat,
    amount: js.UndefOr[Double] = js.undefined,
    currency: String = null,
    expand: js.Array[String] = null,
    flow: redirect | receiver | code_verification | none = null,
    ideal: Bank = null,
    include: js.Array[String] = null,
    mandate: Acceptance = null,
    metadata: IMetadata = null,
    owner: AddressEmail = null,
    receiver: Refundattributesmethod = null,
    redirect: ReturnurlString = null,
    sepa_debit: Iban = null,
    statement_descriptor: String = null,
    token: String = null,
    usage: reusable | single_use = null
  ): ISourceCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (flow != null) __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (mandate != null) __obj.updateDynamic("mandate")(mandate.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceCreationOptions]
  }
}

