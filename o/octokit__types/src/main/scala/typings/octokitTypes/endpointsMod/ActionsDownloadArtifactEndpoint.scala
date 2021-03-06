package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDownloadArtifactEndpoint extends js.Object {
  var archive_format: String
  var artifact_id: Double
  var owner: String
  var repo: String
}

object ActionsDownloadArtifactEndpoint {
  @scala.inline
  def apply(archive_format: String, artifact_id: Double, owner: String, repo: String): ActionsDownloadArtifactEndpoint = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDownloadArtifactEndpoint]
  }
}

