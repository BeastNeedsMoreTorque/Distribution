package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsSetRestrictionsForOrgResponseData extends js.Object {
  var expires_at: String
  var limit: String
  var origin: String
}

object InteractionsSetRestrictionsForOrgResponseData {
  @scala.inline
  def apply(expires_at: String, limit: String, origin: String): InteractionsSetRestrictionsForOrgResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsSetRestrictionsForOrgResponseData]
  }
}

