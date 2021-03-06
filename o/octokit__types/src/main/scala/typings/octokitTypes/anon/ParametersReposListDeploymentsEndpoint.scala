package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListDeploymentsEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListDeploymentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListDeploymentsEndpoint extends js.Object {
  var parameters: ReposListDeploymentsEndpoint
  var request: ReposListDeploymentsRequestOptions
  var response: OctokitResponse[ReposListDeploymentsResponseData]
}

object ParametersReposListDeploymentsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListDeploymentsEndpoint,
    request: ReposListDeploymentsRequestOptions,
    response: OctokitResponse[ReposListDeploymentsResponseData]
  ): ParametersReposListDeploymentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeploymentsEndpoint]
  }
}

