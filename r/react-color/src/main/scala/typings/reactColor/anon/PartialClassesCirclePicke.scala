package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/circle/Circle.CirclePickerStylesProps>> */
trait PartialClassesCirclePicke extends js.Object {
  var default: js.UndefOr[PartialCirclePickerStyles] = js.undefined
}

object PartialClassesCirclePicke {
  @scala.inline
  def apply(default: PartialCirclePickerStyles = null): PartialClassesCirclePicke = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesCirclePicke]
  }
}

