package typings.reactEasyChart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Y extends js.Object {
  var x: js.UndefOr[String] = js.undefined
  var y: js.UndefOr[String] = js.undefined
}

object Y {
  @scala.inline
  def apply(x: String = null, y: String = null): Y = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
}

