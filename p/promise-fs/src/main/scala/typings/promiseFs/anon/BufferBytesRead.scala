package typings.promiseFs.anon

import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferBytesRead extends js.Object {
  var buffer: Uint16Array
  var bytesRead: Double
}

object BufferBytesRead {
  @scala.inline
  def apply(buffer: Uint16Array, bytesRead: Double): BufferBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesRead]
  }
}

