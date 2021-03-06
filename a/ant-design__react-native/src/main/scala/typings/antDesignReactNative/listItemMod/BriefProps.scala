package typings.antDesignReactNative.listItemMod

import typings.antDesignReactNative.anon.PickListStyleBriefBriefTe
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typings.antDesignReactNative.listPropsTypeMod.BriefProps
     with WithThemeStyles[PickListStyleBriefBriefTe]

object BriefProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    style: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    styles: Partial[PickListStyleBriefBriefTe] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefProps]
  }
}

