package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartServerRequest extends js.Object {
  /**
    * A system-assigned unique identifier for a file transfer protocol-enabled server that you start.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
}

object StartServerRequest {
  @scala.inline
  def apply(ServerId: ServerId): StartServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartServerRequest]
  }
}

