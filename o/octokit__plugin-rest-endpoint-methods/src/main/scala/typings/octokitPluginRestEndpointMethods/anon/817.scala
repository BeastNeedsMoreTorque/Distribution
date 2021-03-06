package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `817` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsListForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsListForOrgResponseData]
}

object `817` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsListForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListForOrgResponseData]
  ): `817` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`817`]
  }
}

