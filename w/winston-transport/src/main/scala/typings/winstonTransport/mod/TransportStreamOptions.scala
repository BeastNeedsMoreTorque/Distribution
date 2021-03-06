package typings.winstonTransport.mod

import typings.logform.mod.Format_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportStreamOptions extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var format: js.UndefOr[Format_] = js.undefined
  var handleExceptions: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.undefined
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object TransportStreamOptions {
  @scala.inline
  def apply(
    close: () => Unit = null,
    format: Format_ = null,
    handleExceptions: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    log: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    logv: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _ = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): TransportStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (logv != null) __obj.updateDynamic("logv")(js.Any.fromFunction2(logv))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportStreamOptions]
  }
}

