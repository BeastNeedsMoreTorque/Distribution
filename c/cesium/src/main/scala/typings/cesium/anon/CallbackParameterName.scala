package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackParameterName extends js.Object {
  var callbackParameterName: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Any] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
}

object CallbackParameterName {
  @scala.inline
  def apply(callbackParameterName: String = null, parameters: js.Any = null, proxy: js.Any = null): CallbackParameterName = {
    val __obj = js.Dynamic.literal()
    if (callbackParameterName != null) __obj.updateDynamic("callbackParameterName")(callbackParameterName.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackParameterName]
  }
}

