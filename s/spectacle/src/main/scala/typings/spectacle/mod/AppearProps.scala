package typings.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearProps extends js.Object {
  var easing: js.UndefOr[easeType] = js.undefined
  var endValue: js.UndefOr[js.Object] = js.undefined
  var fid: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var startValue: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object AppearProps {
  @scala.inline
  def apply(
    easing: easeType = null,
    endValue: js.Object = null,
    fid: String = null,
    order: js.UndefOr[Double] = js.undefined,
    startValue: js.Object = null,
    style: CSSProperties = null,
    transitionDuration: js.UndefOr[Double] = js.undefined
  ): AppearProps = {
    val __obj = js.Dynamic.literal()
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (fid != null) __obj.updateDynamic("fid")(fid.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearProps]
  }
}

