package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxBoxItem extends CollectionWidgetItem {
  /** @name dxBoxItem.baseSize */
  var baseSize: js.UndefOr[Double | auto] = js.undefined
  /** @name dxBoxItem.box */
  var box: js.UndefOr[dxBoxOptions] = js.undefined
  /** @name dxBoxItem.ratio */
  var ratio: js.UndefOr[Double] = js.undefined
  /** @name dxBoxItem.shrink */
  var shrink: js.UndefOr[Double] = js.undefined
}

object dxBoxItem {
  @scala.inline
  def apply(
    baseSize: Double | auto = null,
    box: dxBoxOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    ratio: js.UndefOr[Double] = js.undefined,
    shrink: js.UndefOr[Double] = js.undefined,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxBoxItem = {
    val __obj = js.Dynamic.literal()
    if (baseSize != null) __obj.updateDynamic("baseSize")(baseSize.asInstanceOf[js.Any])
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxBoxItem]
  }
}

