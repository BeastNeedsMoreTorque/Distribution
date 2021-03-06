package typings.fsPromise.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "pathExists")
@js.native
object pathExists extends js.Object {
  def apply(path: String): js.Promise[Boolean] = js.native
  def apply(path: String, callback: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Unit = js.native
}

