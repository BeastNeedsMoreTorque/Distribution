package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsAddCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ProjectsAddCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsAddCollaboratorEndpoint extends js.Object {
  var parameters: ProjectsAddCollaboratorEndpoint
  var request: ProjectsAddCollaboratorRequestOptions
  var response: OctokitResponse[_]
}

object ParametersProjectsAddCollaboratorEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsAddCollaboratorEndpoint,
    request: ProjectsAddCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsAddCollaboratorEndpoint]
  }
}

