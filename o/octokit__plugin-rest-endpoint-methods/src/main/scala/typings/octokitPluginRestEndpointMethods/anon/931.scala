package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `931` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetCombinedStatusForRefEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
}

object `931` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCombinedStatusForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
  ): `931` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`931`]
  }
}

