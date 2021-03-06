package typings.antDesignReactNative.listMod

import typings.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.listPropsTypeMod.ListPropsType
import typings.antDesignReactNative.listStyleMod.ListStyle
import typings.react.mod.ReactType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps
  extends ListPropsType
     with WithThemeStyles[ListStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: `false` | Element | js.Array[Element] = null,
    renderFooter: js.Function0[ReactType[_]] | String | Element = null,
    renderHeader: js.Function0[ReactType[_]] | String | Element = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: Partial[ListStyle] = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

