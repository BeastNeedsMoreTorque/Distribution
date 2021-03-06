package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForIssueRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsListForIssueEndpoint extends js.Object {
  var parameters: ReactionsListForIssueEndpoint
  var request: ReactionsListForIssueRequestOptions
  var response: OctokitResponse[ReactionsListForIssueResponseData]
}

object ParametersReactionsListForIssueEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForIssueEndpoint,
    request: ReactionsListForIssueRequestOptions,
    response: OctokitResponse[ReactionsListForIssueResponseData]
  ): ParametersReactionsListForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueEndpoint]
  }
}

