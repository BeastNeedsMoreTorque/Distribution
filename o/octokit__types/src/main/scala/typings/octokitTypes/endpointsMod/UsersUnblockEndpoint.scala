package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersUnblockEndpoint extends js.Object {
  var username: String
}

object UsersUnblockEndpoint {
  @scala.inline
  def apply(username: String): UsersUnblockEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersUnblockEndpoint]
  }
}

