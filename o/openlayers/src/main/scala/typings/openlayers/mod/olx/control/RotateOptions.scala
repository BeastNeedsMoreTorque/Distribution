package typings.openlayers.mod.olx.control

import typings.openlayers.mod.MapEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String | Element] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
  var resetNorth: js.UndefOr[js.Function0[_]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    label: String | Element = null,
    render: /* event */ MapEvent => _ = null,
    resetNorth: () => _ = null,
    target: Element = null,
    tipLabel: String = null
  ): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (resetNorth != null) __obj.updateDynamic("resetNorth")(js.Any.fromFunction0(resetNorth))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

