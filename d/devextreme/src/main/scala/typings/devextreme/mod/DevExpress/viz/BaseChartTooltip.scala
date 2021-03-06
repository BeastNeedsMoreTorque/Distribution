package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Blur
import typings.devextreme.anon.DashStyleOpacity
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseChart.Options.tooltip */
trait BaseChartTooltip extends BaseWidgetTooltip {
  /** @name BaseChart.Options.tooltip.argumentFormat */
  var argumentFormat: js.UndefOr[format] = js.undefined
  /** @name BaseChart.Options.tooltip.contentTemplate */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* pointInfo */ js.Any, /* element */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name BaseChart.Options.tooltip.customizeTooltip */
  var customizeTooltip: js.UndefOr[js.Function1[/* pointInfo */ js.Any, _]] = js.undefined
  /** @name BaseChart.Options.tooltip.shared */
  var shared: js.UndefOr[Boolean] = js.undefined
}

object BaseChartTooltip {
  @scala.inline
  def apply(
    argumentFormat: format = null,
    arrowLength: js.UndefOr[Double] = js.undefined,
    border: DashStyleOpacity = null,
    color: String = null,
    container: String | Element | JQuery = null,
    contentTemplate: template | (js.Function2[/* pointInfo */ js.Any, /* element */ dxElement, String | Element | JQuery]) = null,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    customizeTooltip: /* pointInfo */ js.Any => _ = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    font: Font = null,
    format: format = null,
    opacity: js.UndefOr[Double] = js.undefined,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    shadow: Blur = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): BaseChartTooltip = {
    val __obj = js.Dynamic.literal()
    if (argumentFormat != null) __obj.updateDynamic("argumentFormat")(argumentFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowLength)) __obj.updateDynamic("arrowLength")(arrowLength.get.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (customizeTooltip != null) __obj.updateDynamic("customizeTooltip")(js.Any.fromFunction1(customizeTooltip))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChartTooltip]
  }
}

