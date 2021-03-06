package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchAction extends js.Object {
  var action: ActionTypes
  var element: js.UndefOr[Element] = js.undefined
  var ms: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object TouchAction {
  @scala.inline
  def apply(
    action: ActionTypes,
    element: Element = null,
    ms: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): TouchAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(ms)) __obj.updateDynamic("ms")(ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAction]
  }
}

