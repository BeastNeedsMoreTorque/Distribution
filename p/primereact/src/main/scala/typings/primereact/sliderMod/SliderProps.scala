package typings.primereact.sliderMod

import typings.primereact.anon.OriginalEventEventValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ OriginalEventEventValue, Unit]] = js.undefined
  var onSlideEnd: js.UndefOr[js.Function1[/* e */ OriginalEventEventValue, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    ariaLabelledBy: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onChange: /* e */ OriginalEventEventValue => Unit = null,
    onSlideEnd: /* e */ OriginalEventEventValue => Unit = null,
    orientation: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    tabIndex: String = null,
    value: Double | (js.Tuple2[Double, Double]) = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSlideEnd != null) __obj.updateDynamic("onSlideEnd")(js.Any.fromFunction1(onSlideEnd))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

