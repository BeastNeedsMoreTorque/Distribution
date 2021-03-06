package typings.reduxPromiseListener.mod.ReduxPromiseListener

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn] extends js.Object {
  var getError: js.UndefOr[js.Function1[/* action */ RejectAction, _]] = js.undefined
  var getPayload: js.UndefOr[js.Function1[/* action */ ResolveAction, TReturn]] = js.undefined
  var reject: String | ActionMatcher
  var resolve: String | ActionMatcher
  var setPayload: js.UndefOr[js.Function2[/* action */ StartAction, /* payload */ js.Any, AnyAction]] = js.undefined
  var start: String
}

object Config {
  @scala.inline
  def apply[/* <: typings.redux.mod.AnyAction */ StartAction, /* <: typings.redux.mod.AnyAction */ ResolveAction, /* <: typings.redux.mod.AnyAction */ RejectAction, TReturn](
    reject: String | ActionMatcher,
    resolve: String | ActionMatcher,
    start: String,
    getError: /* action */ RejectAction => _ = null,
    getPayload: /* action */ ResolveAction => TReturn = null,
    setPayload: (/* action */ StartAction, /* payload */ js.Any) => AnyAction = null
  ): Config[StartAction, ResolveAction, RejectAction, TReturn] = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (getError != null) __obj.updateDynamic("getError")(js.Any.fromFunction1(getError))
    if (getPayload != null) __obj.updateDynamic("getPayload")(js.Any.fromFunction1(getPayload))
    if (setPayload != null) __obj.updateDynamic("setPayload")(js.Any.fromFunction2(setPayload))
    __obj.asInstanceOf[Config[StartAction, ResolveAction, RejectAction, TReturn]]
  }
}

