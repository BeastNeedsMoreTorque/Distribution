package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  migration_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
trait MigrationsGetStatusForAuthenticatedUserEndpoint extends js.Object {
  var mediaType: `7`
  var migration_id: Double
}

object MigrationsGetStatusForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(mediaType: `7`, migration_id: Double): MigrationsGetStatusForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetStatusForAuthenticatedUserEndpoint]
  }
}

