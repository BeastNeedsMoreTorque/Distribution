package typings.rxDom.mod.rxAugmentingMod.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object GeolocationOptions {
  @scala.inline
  def apply(
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    maximumAge: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): GeolocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumAge)) __obj.updateDynamic("maximumAge")(maximumAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationOptions]
  }
}

