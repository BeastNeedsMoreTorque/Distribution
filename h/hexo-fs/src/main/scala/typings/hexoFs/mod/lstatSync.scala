package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lstatSync")
@js.native
object lstatSync extends js.Object {
  def apply(path: PathLike): typings.node.fsMod.Stats = js.native
}

