package typings.fsPromise.mod

import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "writev")
@js.native
object writev extends js.Object {
  def apply(fd: Double, buffers: js.Array[ArrayBufferView]): js.Promise[js.Tuple2[Double, js.Array[ArrayBufferView]]] = js.native
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): js.Promise[js.Tuple2[Double, js.Array[ArrayBufferView]]] = js.native
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
}

