package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteResponseData extends js.Object {
  var documentation_url: String
  var message: String
}

object ReposDeleteResponseData {
  @scala.inline
  def apply(documentation_url: String, message: String): ReposDeleteResponseData = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteResponseData]
  }
}

