package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpListener
  extends BaseListener
     with SocketListener {
  /**
    * IP port being listened on.
    */
  var port: Double
}

object TcpListener {
  @scala.inline
  def apply(accept: () => js.Promise[SocketConnection], close: () => js.Promise[Unit], port: Double): TcpListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpListener]
  }
}

