package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var gradient: js.UndefOr[PathFillGradient] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object PathFill {
  @scala.inline
  def apply(
    color: String = null,
    gradient: PathFillGradient = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): PathFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathFill]
  }
}

