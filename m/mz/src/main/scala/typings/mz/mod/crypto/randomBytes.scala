package typings.mz.mod.crypto

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "crypto.randomBytes")
@js.native
object randomBytes extends js.Object {
  def apply(size: Double): js.Promise[Buffer] = js.native
  def apply(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}

