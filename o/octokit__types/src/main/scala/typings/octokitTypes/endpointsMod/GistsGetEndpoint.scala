package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetEndpoint extends js.Object {
  var gist_id: String
}

object GistsGetEndpoint {
  @scala.inline
  def apply(gist_id: String): GistsGetEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetEndpoint]
  }
}

