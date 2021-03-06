package typings.weixinApp.wx

import typings.weixinApp.anon.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatOptions
  extends BaseOptions[js.Any, js.Any] {
  var path: String
   // 文件/目录路径
  var recursive: js.UndefOr[Boolean] = js.undefined
   // 是否递归,默认false
  @JSName("success")
  var success_StatOptions: js.UndefOr[js.Function1[/* res */ Stats, Unit]] = js.undefined
}

object StatOptions {
  @scala.inline
  def apply(
    path: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ Stats => Unit = null
  ): StatOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StatOptions]
  }
}

