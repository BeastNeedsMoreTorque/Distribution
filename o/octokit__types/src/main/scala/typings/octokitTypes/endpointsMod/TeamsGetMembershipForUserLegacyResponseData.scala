package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipForUserLegacyResponseData extends js.Object {
  var role: String
  var state: String
  var url: String
}

object TeamsGetMembershipForUserLegacyResponseData {
  @scala.inline
  def apply(role: String, state: String, url: String): TeamsGetMembershipForUserLegacyResponseData = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetMembershipForUserLegacyResponseData]
  }
}

