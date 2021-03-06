package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsListForTeamDiscussionInOrgEndpoint extends js.Object {
  var parameters: ReactionsListForTeamDiscussionInOrgEndpoint
  var request: ReactionsListForTeamDiscussionInOrgRequestOptions
  var response: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]
}

object ParametersReactionsListForTeamDiscussionInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionInOrgEndpoint,
    request: ReactionsListForTeamDiscussionInOrgRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]
  ): ParametersReactionsListForTeamDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionInOrgEndpoint]
  }
}

