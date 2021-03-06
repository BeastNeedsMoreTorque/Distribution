package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.devextremeStrings.after
import typings.devextreme.devextremeStrings.before
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.expand
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.overlap
import typings.devextreme.devextremeStrings.push
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.shrink
import typings.devextreme.devextremeStrings.slide
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDrawerOptions extends WidgetOptions[dxDrawer] {
  /** @name dxDrawer.Options.animationDuration */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /** @name dxDrawer.Options.animationEnabled */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxDrawer.Options.closeOnOutsideClick */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.undefined
  /** @name dxDrawer.Options.maxSize */
  var maxSize: js.UndefOr[Double] = js.undefined
  /** @name dxDrawer.Options.minSize */
  var minSize: js.UndefOr[Double] = js.undefined
  /** @name dxDrawer.Options.opened */
  var opened: js.UndefOr[Boolean] = js.undefined
  /** @name dxDrawer.Options.openedStateMode */
  var openedStateMode: js.UndefOr[overlap | shrink | push] = js.undefined
  /** @name dxDrawer.Options.position */
  var position: js.UndefOr[left | right | top | bottom | before | after] = js.undefined
  /** @name dxDrawer.Options.revealMode */
  var revealMode: js.UndefOr[slide | expand] = js.undefined
  /** @name dxDrawer.Options.shading */
  var shading: js.UndefOr[Boolean] = js.undefined
  /** @name dxDrawer.Options.target */
  var target: js.UndefOr[String | Element | JQuery] = js.undefined
  /** @name dxDrawer.Options.template */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ dxElement, _])
  ] = js.undefined
}

object dxDrawerOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    closeOnOutsideClick: Boolean | (js.Function1[/* event */ event, Boolean]) = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    onContentReady: /* e */ ComponentElement[dxDrawer] => _ = null,
    onDisposing: /* e */ Model[dxDrawer] => _ = null,
    onInitialized: /* e */ typings.devextreme.anon.Element[dxDrawer] => _ = null,
    onOptionChanged: /* e */ Name[dxDrawer] => _ = null,
    opened: js.UndefOr[Boolean] = js.undefined,
    openedStateMode: overlap | shrink | push = null,
    position: left | right | top | bottom | before | after = null,
    revealMode: slide | expand = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    shading: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    target: String | Element | JQuery = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function1[/* Element */ dxElement, _]) = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDrawerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened.get.asInstanceOf[js.Any])
    if (openedStateMode != null) __obj.updateDynamic("openedStateMode")(openedStateMode.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (revealMode != null) __obj.updateDynamic("revealMode")(revealMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDrawerOptions]
  }
}

