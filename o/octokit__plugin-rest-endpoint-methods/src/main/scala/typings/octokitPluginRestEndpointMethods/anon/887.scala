package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponse202Data
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponse409Data
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `887` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateDeploymentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[
    ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
  ]
}

object `887` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateDeploymentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
    ]
  ): `887` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`887`]
  }
}

