package typings.winston.transportsMod

import typings.logform.mod.Format_
import typings.node.NodeJS.WritableStream
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamTransportOptions extends TransportStreamOptions {
  var eol: js.UndefOr[String] = js.undefined
  var stream: WritableStream
}

object StreamTransportOptions {
  @scala.inline
  def apply(
    stream: WritableStream,
    close: () => Unit = null,
    eol: String = null,
    format: Format_ = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): StreamTransportOptions = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamTransportOptions]
  }
}

