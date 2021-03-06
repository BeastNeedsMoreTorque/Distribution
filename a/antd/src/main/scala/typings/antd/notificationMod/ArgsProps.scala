package typings.antd.notificationMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var btn: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var description: js.UndefOr[ReactNode] = js.undefined
  var duration: js.UndefOr[Double | Null] = js.undefined
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var message: ReactNode
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placement: js.UndefOr[NotificationPlacement] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  val `type`: js.UndefOr[IconType] = js.undefined
}

object ArgsProps {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    btn: ReactNode = null,
    className: String = null,
    closeIcon: ReactNode = null,
    description: ReactNode = null,
    duration: js.UndefOr[Null | Double] = js.undefined,
    getContainer: () => HTMLElement = null,
    icon: ReactNode = null,
    key: String = null,
    message: ReactNode = null,
    onClick: () => Unit = null,
    onClose: () => Unit = null,
    placement: NotificationPlacement = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    top: js.UndefOr[Double] = js.undefined,
    `type`: IconType = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (btn != null) __obj.updateDynamic("btn")(btn.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsProps]
  }
}

