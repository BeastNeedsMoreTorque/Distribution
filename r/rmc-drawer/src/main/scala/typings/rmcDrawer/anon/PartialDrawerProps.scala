package typings.rmcDrawer.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcDrawer.rmcDrawerStrings.bottom
import typings.rmcDrawer.rmcDrawerStrings.left
import typings.rmcDrawer.rmcDrawerStrings.right
import typings.rmcDrawer.rmcDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rmc-drawer.rmc-drawer.DrawerProps> */
trait PartialDrawerProps extends js.Object {
  var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var docked: js.UndefOr[Boolean] = js.undefined
  var dragHandleStyle: js.UndefOr[CSSProperties] = js.undefined
  var dragToggleDistance: js.UndefOr[Double] = js.undefined
  var enableDragHandle: js.UndefOr[Boolean] = js.undefined
  var onOpenChange: js.UndefOr[js.Function2[/* open */ Boolean, /* overlay */ js.UndefOr[OverlayClicked], Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var position: js.UndefOr[left | right | top | bottom] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var sidebar: js.UndefOr[ReactNode] = js.undefined
  var sidebarStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var touch: js.UndefOr[Boolean] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
}

object PartialDrawerProps {
  @scala.inline
  def apply(
    children: ReactNode | js.Array[ReactNode] = null,
    className: String = null,
    contentStyle: CSSProperties = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    dragHandleStyle: CSSProperties = null,
    dragToggleDistance: js.UndefOr[Double] = js.undefined,
    enableDragHandle: js.UndefOr[Boolean] = js.undefined,
    onOpenChange: (/* open */ Boolean, /* overlay */ js.UndefOr[OverlayClicked]) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    overlayStyle: CSSProperties = null,
    position: left | right | top | bottom = null,
    prefixCls: String = null,
    sidebar: ReactNode = null,
    sidebarStyle: CSSProperties = null,
    style: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    transitions: js.UndefOr[Boolean] = js.undefined
  ): PartialDrawerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.get.asInstanceOf[js.Any])
    if (dragHandleStyle != null) __obj.updateDynamic("dragHandleStyle")(dragHandleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dragToggleDistance)) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDragHandle)) __obj.updateDynamic("enableDragHandle")(enableDragHandle.get.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction2(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    if (sidebarStyle != null) __obj.updateDynamic("sidebarStyle")(sidebarStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDrawerProps]
  }
}

