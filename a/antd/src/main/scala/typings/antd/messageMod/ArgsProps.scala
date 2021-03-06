package typings.antd.messageMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var content: ReactNode
  var duration: Double | Null
  var icon: js.UndefOr[ReactNode] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: NoticeType
}

object ArgsProps {
  @scala.inline
  def apply(
    `type`: NoticeType,
    className: String = null,
    content: ReactNode = null,
    duration: Double = null.asInstanceOf[Double],
    icon: ReactNode = null,
    key: String | Double = null,
    onClose: () => Unit = null,
    style: CSSProperties = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsProps]
  }
}

