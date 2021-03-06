package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesBarPointersBorder extends js.Object {
  /** Specifies the border Color of bar pointer
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the border Width of bar pointer
    * @Default {1.5}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesBarPointersBorder {
  @scala.inline
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): ScalesBarPointersBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesBarPointersBorder]
  }
}

