package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `895` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreatePagesSiteEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposCreatePagesSiteResponseData]
}

object `895` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreatePagesSiteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreatePagesSiteResponseData]
  ): `895` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`895`]
  }
}

