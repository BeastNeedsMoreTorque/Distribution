package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoicePayOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * In cases where the source used to pay the invoice has insufficient
    * funds, passing forgive=true controls whether a charge should be
    * attempted for the full amount available on the source, up to the
    * amount to fully pay the invoice. This effectively forgives the
    * difference between the amount available on the source and the amount due.
    * Passing forgive=false will fail the charge if the source hasn’t
    * been pre-funded with the right amount. An example for this case is
    * with ACH Credit Transfers and wires: if the amount wired is less
    * than the amount due by a small amount, you might want to forgive
    * the difference.
    */
  var forgive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Boolean representing whether an invoice is paid outside of Stripe.
    * This will result in no charge being made.
    */
  var paid_out_of_band: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A payment source to be charged. The source must be the ID of a source
    * belonging to the customer associated with the invoice being paid.
    */
  var source: js.UndefOr[java.lang.String | stripeLib.stripeMod.cardsNs.ICardSourceCreationOptions] = js.undefined
}

object IInvoicePayOptions {
  @scala.inline
  def apply(
    expand: js.Array[java.lang.String] = null,
    forgive: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    paid_out_of_band: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String | stripeLib.stripeMod.cardsNs.ICardSourceCreationOptions = null
  ): IInvoicePayOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(forgive)) __obj.updateDynamic("forgive")(forgive)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(paid_out_of_band)) __obj.updateDynamic("paid_out_of_band")(paid_out_of_band)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoicePayOptions]
  }
}

