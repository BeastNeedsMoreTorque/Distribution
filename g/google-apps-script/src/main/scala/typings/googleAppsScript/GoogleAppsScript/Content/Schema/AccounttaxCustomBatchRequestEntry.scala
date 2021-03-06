package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchRequestEntry extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  var batchId: js.UndefOr[Double] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
}

object AccounttaxCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: String = null,
    accountTax: AccountTax = null,
    batchId: js.UndefOr[Double] = js.undefined,
    merchantId: String = null,
    method: String = null
  ): AccounttaxCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax.asInstanceOf[js.Any])
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccounttaxCustomBatchRequestEntry]
  }
}

