package typings.openlayers.mod.olx.animation

import typings.openlayers.mod.Coordinate_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Animation options. Multiple animations can be run in series by passing
  * multiple options objects. To run multiple animations in parallel, call
  * the method multiple times. An optional callback can be provided as a
  * final argument. The callback will be called with a boolean indicating
  * whether the animation completed without being cancelled.
  */
trait AnimateOptions extends js.Object {
  var anchor: js.UndefOr[Coordinate_] = js.undefined
  var center: js.UndefOr[Coordinate_] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object AnimateOptions {
  @scala.inline
  def apply(
    anchor: Coordinate_ = null,
    center: Coordinate_ = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* t */ Double => Double = null,
    resolution: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateOptions]
  }
}

