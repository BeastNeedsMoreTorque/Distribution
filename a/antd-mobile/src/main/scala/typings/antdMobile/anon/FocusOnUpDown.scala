package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusOnUpDown extends js.Object {
  var focusOnUpDown: Boolean
  var prefixCls: String
  var readOnly: Boolean
  var showNumber: Boolean
  var step: Double
}

object FocusOnUpDown {
  @scala.inline
  def apply(focusOnUpDown: Boolean, prefixCls: String, readOnly: Boolean, showNumber: Boolean, step: Double): FocusOnUpDown = {
    val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], showNumber = showNumber.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOnUpDown]
  }
}

