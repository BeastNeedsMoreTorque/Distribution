package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCollaboratorPermissionLevelEndpoint extends js.Object {
  var owner: String
  var repo: String
  var username: String
}

object ReposGetCollaboratorPermissionLevelEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposGetCollaboratorPermissionLevelEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCollaboratorPermissionLevelEndpoint]
  }
}

