package typings.ionicCliFramework.loggerMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  val handlers: js.UndefOr[Set[LoggerHandler]] = js.undefined
  val level: js.UndefOr[LoggerLevelWeight] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(handlers: Set[LoggerHandler] = null, level: js.UndefOr[LoggerLevelWeight] = js.undefined): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

