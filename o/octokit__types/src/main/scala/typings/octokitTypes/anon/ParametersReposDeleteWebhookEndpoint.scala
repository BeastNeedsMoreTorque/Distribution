package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteWebhookEndpoint extends js.Object {
  var parameters: ReposDeleteWebhookEndpoint
  var request: ReposDeleteWebhookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteWebhookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteWebhookEndpoint,
    request: ReposDeleteWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteWebhookEndpoint]
  }
}

