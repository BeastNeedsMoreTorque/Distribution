package typings.openlayers.mod.olx.control

import typings.openlayers.mod.MapEvent
import typings.openlayers.mod.control.ScaleLine.Units
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleLineOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var units: js.UndefOr[Units | String] = js.undefined
}

object ScaleLineOptions {
  @scala.inline
  def apply(
    className: String = null,
    minWidth: js.UndefOr[Double] = js.undefined,
    render: /* event */ MapEvent => _ = null,
    target: Element = null,
    units: Units | String = null
  ): ScaleLineOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleLineOptions]
  }
}

