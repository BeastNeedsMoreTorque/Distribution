package typings.primereact.toggleButtonMod

import typings.primereact.anon.TargetNameType
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var offIcon: js.UndefOr[String] = js.undefined
  var offLabel: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ TargetNameType, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onIcon: js.UndefOr[String] = js.undefined
  var onLabel: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
}

object ToggleButtonProps {
  @scala.inline
  def apply(
    ariaLabelledBy: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    id: String = null,
    offIcon: String = null,
    offLabel: String = null,
    onBlur: /* event */ Event => Unit = null,
    onChange: /* e */ TargetNameType => Unit = null,
    onFocus: /* event */ Event => Unit = null,
    onIcon: String = null,
    onLabel: String = null,
    style: js.Object = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null
  ): ToggleButtonProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (offIcon != null) __obj.updateDynamic("offIcon")(offIcon.asInstanceOf[js.Any])
    if (offLabel != null) __obj.updateDynamic("offLabel")(offLabel.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onIcon != null) __obj.updateDynamic("onIcon")(onIcon.asInstanceOf[js.Any])
    if (onLabel != null) __obj.updateDynamic("onLabel")(onLabel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleButtonProps]
  }
}

