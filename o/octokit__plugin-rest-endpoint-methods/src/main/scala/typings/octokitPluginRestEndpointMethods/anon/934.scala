package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `934` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetCommitCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetCommitCommentResponseData]
}

object `934` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCommitCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitCommentResponseData]
  ): `934` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`934`]
  }
}

