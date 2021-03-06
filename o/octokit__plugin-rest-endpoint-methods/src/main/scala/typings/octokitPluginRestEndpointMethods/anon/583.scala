package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `583` extends js.Object {
  var parameters: RequestParameters with (Omit[ActivityGetRepoSubscriptionEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
}

object `583` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityGetRepoSubscriptionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
  ): `583` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`583`]
  }
}

