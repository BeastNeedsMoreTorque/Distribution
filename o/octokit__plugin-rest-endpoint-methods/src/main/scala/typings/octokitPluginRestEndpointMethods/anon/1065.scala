package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersGetContextForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersGetContextForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1065` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersGetContextForUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersGetContextForUserResponseData]
}

object `1065` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersGetContextForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersGetContextForUserResponseData]
  ): `1065` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1065`]
  }
}

