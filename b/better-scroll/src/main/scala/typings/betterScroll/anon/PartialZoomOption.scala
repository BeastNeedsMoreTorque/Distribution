package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.ZoomOption> */
trait PartialZoomOption extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object PartialZoomOption {
  @scala.inline
  def apply(
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): PartialZoomOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialZoomOption]
  }
}

