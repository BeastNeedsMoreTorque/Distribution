package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPaneTitle extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartPaneTitleBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double | ChartPaneTitleMargin] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartPaneTitle {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartPaneTitleBorder = null,
    color: String = null,
    font: String = null,
    margin: Double | ChartPaneTitleMargin = null,
    position: String = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartPaneTitle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPaneTitle]
  }
}

