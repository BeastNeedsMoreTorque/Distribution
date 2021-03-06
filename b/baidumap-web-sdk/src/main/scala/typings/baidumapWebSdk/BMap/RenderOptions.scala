package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var autoViewport: js.UndefOr[Boolean] = js.undefined
  var highlightMode: js.UndefOr[HighlightModes] = js.undefined
  var map: Map
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  var selectFirstResult: js.UndefOr[Boolean] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    map: Map,
    autoViewport: js.UndefOr[Boolean] = js.undefined,
    highlightMode: js.UndefOr[HighlightModes] = js.undefined,
    panel: String | HTMLElement = null,
    selectFirstResult: js.UndefOr[Boolean] = js.undefined
  ): RenderOptions = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (!js.isUndefined(autoViewport)) __obj.updateDynamic("autoViewport")(autoViewport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMode)) __obj.updateDynamic("highlightMode")(highlightMode.get.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstResult)) __obj.updateDynamic("selectFirstResult")(selectFirstResult.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

