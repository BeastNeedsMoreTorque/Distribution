package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Eventsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateMembershipForAuthenticatedUserResponseData extends js.Object {
  var organization: Avatarurl
  var organization_url: String
  var role: String
  var state: String
  var url: String
  var user: Eventsurl
}

object OrgsUpdateMembershipForAuthenticatedUserResponseData {
  @scala.inline
  def apply(
    organization: Avatarurl,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: Eventsurl
  ): OrgsUpdateMembershipForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipForAuthenticatedUserResponseData]
  }
}

