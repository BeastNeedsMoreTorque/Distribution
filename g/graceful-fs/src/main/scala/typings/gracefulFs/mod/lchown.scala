package typings.gracefulFs.mod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "lchown")
@js.native
object lchown extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
}

