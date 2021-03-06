package typings.rnFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobWriteStream extends js.Object {
  var append: Boolean
  var encoding: String
  var id: String
  def close(): Unit
  def write(data: String): js.Promise[Unit]
}

object RNFetchBlobWriteStream {
  @scala.inline
  def apply(
    append: Boolean,
    close: () => Unit,
    encoding: String,
    id: String,
    write: String => js.Promise[Unit]
  ): RNFetchBlobWriteStream = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), encoding = encoding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RNFetchBlobWriteStream]
  }
}

