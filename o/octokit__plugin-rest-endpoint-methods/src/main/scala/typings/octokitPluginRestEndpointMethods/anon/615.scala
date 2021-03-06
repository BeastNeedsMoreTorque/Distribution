package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `615` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsCreateFromManifestEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsCreateFromManifestResponseData]
}

object `615` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsCreateFromManifestEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCreateFromManifestResponseData]
  ): `615` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`615`]
  }
}

