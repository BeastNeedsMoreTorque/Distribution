package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitDropdownOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var boundary: js.UndefOr[String] = js.undefined
  var `boundary-align`: js.UndefOr[Boolean] = js.undefined
  var `delay-hide`: js.UndefOr[Double] = js.undefined
  var `delay-show`: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[Boolean | String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var pos: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[String | Boolean] = js.undefined
}

object UIkitDropdownOptions {
  @scala.inline
  def apply(
    animation: String = null,
    boundary: String = null,
    `boundary-align`: js.UndefOr[Boolean] = js.undefined,
    `delay-hide`: js.UndefOr[Double] = js.undefined,
    `delay-show`: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    flip: Boolean | String = null,
    mode: String = null,
    offset: js.UndefOr[Double] = js.undefined,
    pos: String = null,
    toggle: String | Boolean = null
  ): UIkitDropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (!js.isUndefined(`boundary-align`)) __obj.updateDynamic("boundary-align")(`boundary-align`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`delay-hide`)) __obj.updateDynamic("delay-hide")(`delay-hide`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`delay-show`)) __obj.updateDynamic("delay-show")(`delay-show`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitDropdownOptions]
  }
}

