package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrientiationOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
  var freq: js.UndefOr[Double] = js.undefined
}

object OrientiationOption {
  @scala.inline
  def apply(controller: String = null, freq: js.UndefOr[Double] = js.undefined): OrientiationOption = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientiationOption]
  }
}

