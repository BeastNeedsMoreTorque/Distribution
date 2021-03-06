package typings.ejWebAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerSettings extends js.Object {
  /** Options for customizing the border of the marker shape.
    */
  var border: js.UndefOr[MarkerSettingsBorder] = js.undefined
  /** Color of the marker shape.
    * @Default {white}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Controls the opacity of the marker.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Controls the visibility of the marker shape.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** width of the marker shape.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object MarkerSettings {
  @scala.inline
  def apply(
    border: MarkerSettingsBorder = null,
    fill: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): MarkerSettings = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSettings]
  }
}

