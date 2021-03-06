package typings.antdMobile.actionSheetMod

import typings.antdMobile.antdMobileStrings.large
import typings.antdMobile.antdMobileStrings.small
import typings.antdMobile.badgeMod.BadgeProps
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgesOption extends BadgeProps {
  var index: Double
}

object BadgesOption {
  @scala.inline
  def apply(
    index: Double,
    className: String = null,
    corner: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    hot: js.UndefOr[Boolean] = js.undefined,
    overflowCount: js.UndefOr[Double] = js.undefined,
    prefixCls: String = null,
    size: large | small = null,
    style: CSSProperties = null,
    text: js.Any = null
  ): BadgesOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hot)) __obj.updateDynamic("hot")(hot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowCount)) __obj.updateDynamic("overflowCount")(overflowCount.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgesOption]
  }
}

