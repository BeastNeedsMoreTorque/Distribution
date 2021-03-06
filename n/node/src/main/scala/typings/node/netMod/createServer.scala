package typings.node.netMod

import typings.node.anon.AllowHalfOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server = js.native
  def apply(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def apply(options: AllowHalfOpen): Server = js.native
  def apply(options: AllowHalfOpen, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
}

