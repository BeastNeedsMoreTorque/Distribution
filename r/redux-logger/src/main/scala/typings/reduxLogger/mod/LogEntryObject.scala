package typings.reduxLogger.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntryObject extends js.Object {
  var action: js.UndefOr[String | Boolean | ActionToString] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var nextState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var prevState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var started: js.UndefOr[Double] = js.undefined
  var startedTime: js.UndefOr[Date] = js.undefined
  var took: js.UndefOr[Double] = js.undefined
}

object LogEntryObject {
  @scala.inline
  def apply(
    action: String | Boolean | ActionToString = null,
    error: /* error */ js.Any => _ = null,
    nextState: /* state */ js.Any => _ = null,
    prevState: /* state */ js.Any => _ = null,
    started: js.UndefOr[Double] = js.undefined,
    startedTime: Date = null,
    took: js.UndefOr[Double] = js.undefined
  ): LogEntryObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (nextState != null) __obj.updateDynamic("nextState")(js.Any.fromFunction1(nextState))
    if (prevState != null) __obj.updateDynamic("prevState")(js.Any.fromFunction1(prevState))
    if (!js.isUndefined(started)) __obj.updateDynamic("started")(started.get.asInstanceOf[js.Any])
    if (startedTime != null) __obj.updateDynamic("startedTime")(startedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(took)) __obj.updateDynamic("took")(took.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntryObject]
  }
}

