package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 键盘输入框的当前值
    */
  var value: String
}

object FailSuccess {
  @scala.inline
  def apply(value: String, complete: () => Unit = null, fail: () => Unit = null, success: () => Unit = null): FailSuccess = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[FailSuccess]
  }
}

