package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForPullRequestReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForPullRequestReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsListForPullRequestReviewCommentEndpoint extends js.Object {
  var parameters: ReactionsListForPullRequestReviewCommentEndpoint
  var response: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData]
}

object ParametersReactionsListForPullRequestReviewCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForPullRequestReviewCommentEndpoint,
    response: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData]
  ): ParametersReactionsListForPullRequestReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForPullRequestReviewCommentEndpoint]
  }
}

