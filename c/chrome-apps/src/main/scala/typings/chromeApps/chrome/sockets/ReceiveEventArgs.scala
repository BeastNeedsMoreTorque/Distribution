package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveEventArgs extends js.Object {
  /** The data received, with a maxium size of *bufferSize*. */
  var data: ArrayBuffer
  /** The socket identifier. */
  var socketId: integer
}

object ReceiveEventArgs {
  @scala.inline
  def apply(data: ArrayBuffer, socketId: integer): ReceiveEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveEventArgs]
  }
}

