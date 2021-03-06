package typings.primereact.slideMenuMod

import typings.primereact.menuItemMod.MenuItem
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideMenuProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  var backLabel: js.UndefOr[String] = js.undefined
  var baseZIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var effectDuration: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var menuWidth: js.UndefOr[Double] = js.undefined
  var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var popup: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var viewportHeight: js.UndefOr[Double] = js.undefined
}

object SlideMenuProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    backLabel: String = null,
    baseZIndex: js.UndefOr[Double] = js.undefined,
    className: String = null,
    easing: String = null,
    effectDuration: js.UndefOr[Double] = js.undefined,
    id: String = null,
    menuWidth: js.UndefOr[Double] = js.undefined,
    model: js.Array[MenuItem] = null,
    onHide: /* e */ Event => Unit = null,
    onShow: /* e */ Event => Unit = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    viewportHeight: js.UndefOr[Double] = js.undefined
  ): SlideMenuProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.get.asInstanceOf[js.Any])
    if (backLabel != null) __obj.updateDynamic("backLabel")(backLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(baseZIndex)) __obj.updateDynamic("baseZIndex")(baseZIndex.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(effectDuration)) __obj.updateDynamic("effectDuration")(effectDuration.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(menuWidth)) __obj.updateDynamic("menuWidth")(menuWidth.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportHeight)) __obj.updateDynamic("viewportHeight")(viewportHeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideMenuProps]
  }
}

