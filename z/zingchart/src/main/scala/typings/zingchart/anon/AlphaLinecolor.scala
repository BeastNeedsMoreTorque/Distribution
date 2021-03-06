package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaLinecolor extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that values require the leading zero before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the line color of the object. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the line width of the object. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.undefined
}

object AlphaLinecolor {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    `line-color`: String = null,
    `line-style`: String = null,
    `line-width`: js.Any = null
  ): AlphaLinecolor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-style` != null) __obj.updateDynamic("line-style")(`line-style`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaLinecolor]
  }
}

