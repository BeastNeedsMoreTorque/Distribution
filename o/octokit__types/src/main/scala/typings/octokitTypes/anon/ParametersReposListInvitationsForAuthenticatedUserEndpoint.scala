package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListInvitationsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ReposListInvitationsForAuthenticatedUserEndpoint
  var request: ReposListInvitationsForAuthenticatedUserRequestOptions
  var response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
}

object ParametersReposListInvitationsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListInvitationsForAuthenticatedUserEndpoint,
    request: ReposListInvitationsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
  ): ParametersReposListInvitationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsForAuthenticatedUserEndpoint]
  }
}

