package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/dropdown.html#optional-javascript-configuration
trait DropdownOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.undefined
  var align: js.UndefOr[String] = js.undefined
  var closed: js.UndefOr[js.Function0[_]] = js.undefined
  var disabled_class: js.UndefOr[String] = js.undefined
  var hover_timeout: js.UndefOr[Double] = js.undefined
  var is_hover: js.UndefOr[Boolean] = js.undefined
  var mega_class: js.UndefOr[String] = js.undefined
  var opened: js.UndefOr[js.Function0[_]] = js.undefined
}

object DropdownOptions {
  @scala.inline
  def apply(
    active_class: String = null,
    align: String = null,
    closed: () => _ = null,
    disabled_class: String = null,
    hover_timeout: js.UndefOr[Double] = js.undefined,
    is_hover: js.UndefOr[Boolean] = js.undefined,
    mega_class: String = null,
    opened: () => _ = null
  ): DropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (active_class != null) __obj.updateDynamic("active_class")(active_class.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction0(closed))
    if (disabled_class != null) __obj.updateDynamic("disabled_class")(disabled_class.asInstanceOf[js.Any])
    if (!js.isUndefined(hover_timeout)) __obj.updateDynamic("hover_timeout")(hover_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_hover)) __obj.updateDynamic("is_hover")(is_hover.get.asInstanceOf[js.Any])
    if (mega_class != null) __obj.updateDynamic("mega_class")(mega_class.asInstanceOf[js.Any])
    if (opened != null) __obj.updateDynamic("opened")(js.Any.fromFunction0(opened))
    __obj.asInstanceOf[DropdownOptions]
  }
}

