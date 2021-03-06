package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.setOptions
import typings.stellarSdk.stellarSdkNumbers.`1`
import typings.stellarSdk.stellarSdkNumbers.`2`
import typings.stellarSdk.stellarSdkStrings.auth_required_flag
import typings.stellarSdk.stellarSdkStrings.auth_revocable_flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptionsOperationResponse
  extends BaseOperationResponse[
      setOptions, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.setOptions
    ] {
  var clear_flags: js.Array[`1` | `2`]
  var clear_flags_s: js.Array[auth_required_flag | auth_revocable_flag]
  var high_threshold: js.UndefOr[Double] = js.undefined
  var home_domain: js.UndefOr[String] = js.undefined
  var low_threshold: js.UndefOr[Double] = js.undefined
  var master_key_weight: js.UndefOr[Double] = js.undefined
  var med_threshold: js.UndefOr[Double] = js.undefined
  var set_flags: js.Array[`1` | `2`]
  var set_flags_s: js.Array[auth_required_flag | auth_revocable_flag]
  var signer_key: js.UndefOr[String] = js.undefined
  var signer_weight: js.UndefOr[Double] = js.undefined
}

object SetOptionsOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    clear_flags: js.Array[`1` | `2`],
    clear_flags_s: js.Array[auth_required_flag | auth_revocable_flag],
    created_at: String,
    id: String,
    paging_token: String,
    set_flags: js.Array[`1` | `2`],
    set_flags_s: js.Array[auth_required_flag | auth_revocable_flag],
    source_account: String,
    transaction_hash: String,
    `type`: setOptions,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.setOptions,
    high_threshold: js.UndefOr[Double] = js.undefined,
    home_domain: String = null,
    low_threshold: js.UndefOr[Double] = js.undefined,
    master_key_weight: js.UndefOr[Double] = js.undefined,
    med_threshold: js.UndefOr[Double] = js.undefined,
    signer_key: String = null,
    signer_weight: js.UndefOr[Double] = js.undefined
  ): SetOptionsOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], clear_flags = clear_flags.asInstanceOf[js.Any], clear_flags_s = clear_flags_s.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], set_flags = set_flags.asInstanceOf[js.Any], set_flags_s = set_flags_s.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(high_threshold)) __obj.updateDynamic("high_threshold")(high_threshold.get.asInstanceOf[js.Any])
    if (home_domain != null) __obj.updateDynamic("home_domain")(home_domain.asInstanceOf[js.Any])
    if (!js.isUndefined(low_threshold)) __obj.updateDynamic("low_threshold")(low_threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(master_key_weight)) __obj.updateDynamic("master_key_weight")(master_key_weight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(med_threshold)) __obj.updateDynamic("med_threshold")(med_threshold.get.asInstanceOf[js.Any])
    if (signer_key != null) __obj.updateDynamic("signer_key")(signer_key.asInstanceOf[js.Any])
    if (!js.isUndefined(signer_weight)) __obj.updateDynamic("signer_weight")(signer_weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptionsOperationResponse]
  }
}

