package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends js.Object {
  /**
    * The data you're wanting to persist to Firebase.
    */
  var data: js.Any
  /**
    * A callback that will get invoked once the new data has been saved to
    * Firebase. If there is an error, it will be the only argument to this
    * function.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(data: js.Any, `then`: /* result */ js.Any => Unit = null): UpdateOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[UpdateOptions]
  }
}

