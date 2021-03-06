package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsGetByNameEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetByNameResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1033` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsGetByNameEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsGetByNameResponseData]
}

object `1033` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsGetByNameEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsGetByNameResponseData]
  ): `1033` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1033`]
  }
}

