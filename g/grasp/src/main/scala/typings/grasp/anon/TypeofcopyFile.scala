package typings.grasp.anon

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcopyFile extends js.Object {
  def apply(src: PathLike, dest: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(src: PathLike, dest: PathLike, flags: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
    * No arguments other than a possible exception are given to the callback function.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation.
    * The only supported flag is fs.constants.COPYFILE_EXCL,
    * which causes the copy operation to fail if dest already exists.
    */
  def __promisify__(src: PathLike, dst: PathLike): js.Promise[Unit] = js.native
  def __promisify__(src: PathLike, dst: PathLike, flags: Double): js.Promise[Unit] = js.native
}

