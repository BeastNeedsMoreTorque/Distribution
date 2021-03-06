package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogShowHideOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var effect: String
}

object DialogShowHideOptions {
  @scala.inline
  def apply(
    effect: String,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String = null
  ): DialogShowHideOptions = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogShowHideOptions]
  }
}

