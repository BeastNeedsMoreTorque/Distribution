package typings.primus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("primus", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Primus = js.native
  def apply(fn: js.Function1[/* spark */ Spark, Unit]): Primus = js.native
  def apply(fn: js.Function1[/* spark */ Spark, Unit], options: PrimusOptions): Primus = js.native
  def apply(options: PrimusOptions): Primus = js.native
}

