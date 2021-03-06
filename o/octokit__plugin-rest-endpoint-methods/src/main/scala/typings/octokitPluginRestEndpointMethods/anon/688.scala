package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitGetTreeEndpoint
import typings.octokitTypes.endpointsMod.GitGetTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `688` extends js.Object {
  var parameters: RequestParameters with (Omit[GitGetTreeEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GitGetTreeResponseData]
}

object `688` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitGetTreeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetTreeResponseData]
  ): `688` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`688`]
  }
}

