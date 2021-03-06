package typings.builderUtil.fsMod

import typings.fsExtra.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/fs", "FileCopier")
@js.native
class FileCopier () extends js.Object {
  def this(isUseHardLinkFunction: js.Function1[/* file */ String, Boolean]) = this()
  def this(isUseHardLinkFunction: js.Function1[/* file */ String, Boolean], transformer: FileTransformer) = this()
  def this(isUseHardLinkFunction: Null, transformer: FileTransformer) = this()
  var isUseHardLink: Boolean = js.native
  val isUseHardLinkFunction: js.UndefOr[js.Any] = js.native
  val transformer: js.UndefOr[js.Any] = js.native
  def copy(src: String, dest: String): js.Promise[Unit] = js.native
  def copy(src: String, dest: String, stat: Stats): js.Promise[Unit] = js.native
}

