package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "copyFileSync")
@js.native
object copyFileSync extends js.Object {
  def apply(src: PathLike, dest: PathLike): Unit = js.native
  def apply(src: PathLike, dest: PathLike, flags: Double): Unit = js.native
}

