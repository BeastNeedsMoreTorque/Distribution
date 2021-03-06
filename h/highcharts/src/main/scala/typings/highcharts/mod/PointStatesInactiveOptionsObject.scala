package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStatesInactiveOptionsObject extends js.Object {
  /**
    * (Highcharts) Animation when not hovering over the node.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PointStatesInactiveOptionsObject {
  @scala.inline
  def apply(animation: Boolean | AnimationOptionsObject = null, opacity: js.UndefOr[Double] = js.undefined): PointStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointStatesInactiveOptionsObject]
  }
}

