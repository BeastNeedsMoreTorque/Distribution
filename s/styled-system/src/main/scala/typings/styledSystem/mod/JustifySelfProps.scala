package typings.styledSystem.mod

import typings.csstype.mod.JustifySelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifySelfProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS justify-self property set the way a box is justified inside its alignment container along
    * the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self)
    */
  var justifySelf: js.UndefOr[ResponsiveValue[JustifySelfProperty, ThemeType]] = js.undefined
}

object JustifySelfProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](justifySelf: js.UndefOr[Null | (ResponsiveValue[JustifySelfProperty, ThemeType])] = js.undefined): JustifySelfProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(justifySelf)) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifySelfProps[ThemeType]]
  }
}

