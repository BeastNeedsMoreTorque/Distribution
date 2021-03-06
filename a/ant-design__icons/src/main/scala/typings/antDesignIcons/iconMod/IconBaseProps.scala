package typings.antDesignIcons.iconMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps
  extends AllHTMLAttributes[HTMLSpanElement]
     with ClassAttributes[HTMLSpanElement] {
  var rotate: js.UndefOr[Double] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLSpanElement] = null,
    ClassAttributes: ClassAttributes[HTMLSpanElement] = null,
    rotate: js.UndefOr[Double] = js.undefined,
    spin: js.UndefOr[Boolean] = js.undefined
  ): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBaseProps]
  }
}

