package typings.fsExtra.mod

import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "lchmodSync")
@js.native
object lchmodSync extends js.Object {
  def apply(path: PathLike, mode: Mode): Unit = js.native
}

