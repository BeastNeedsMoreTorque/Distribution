package typings.firebaseFunctionsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsCallableOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object HttpsCallableOptions {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): HttpsCallableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsCallableOptions]
  }
}

