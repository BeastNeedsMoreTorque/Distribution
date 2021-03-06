package typings.jasmineAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxRequestStubErrorOptions extends js.Object {
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object JasmineAjaxRequestStubErrorOptions {
  @scala.inline
  def apply(status: js.UndefOr[Double] = js.undefined, statusText: String = null): JasmineAjaxRequestStubErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineAjaxRequestStubErrorOptions]
  }
}

