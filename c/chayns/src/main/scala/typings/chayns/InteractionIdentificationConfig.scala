package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.startInteractionIdentification()
trait InteractionIdentificationConfig extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var callback: js.Any
  var delay: js.UndefOr[Double] = js.undefined
  var duration: Double
  var foregroundColor: String
  var resetOnInteraction: js.UndefOr[Boolean] = js.undefined
}

object InteractionIdentificationConfig {
  @scala.inline
  def apply(
    callback: js.Any,
    duration: Double,
    foregroundColor: String,
    backgroundColor: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    resetOnInteraction: js.UndefOr[Boolean] = js.undefined
  ): InteractionIdentificationConfig = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnInteraction)) __obj.updateDynamic("resetOnInteraction")(resetOnInteraction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIdentificationConfig]
  }
}

