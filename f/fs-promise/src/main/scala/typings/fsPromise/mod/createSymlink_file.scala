package typings.fsPromise.mod

import typings.fsPromise.fsPromiseStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "createSymlink")
@js.native
object createSymlink_file extends js.Object {
  def apply(srcpath: String, dstpath: String, `type`: file): js.Promise[Unit] = js.native
}

