package typings.rcSlider.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonApiProps extends js.Object {
  /**
    * The style used for the active dots.
    */
  var activeDotStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Additional CSS class for the root DOM node
    *  @default ''
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * If true, handles can't be moved.
    *  @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The style used for the dots.
    */
  var dotStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * When the step value is greater than 1, you can set the dots to true if you want to render the slider with dots.
    *  @default false
    */
  var dots: js.UndefOr[Boolean] = js.undefined
  /**
    * A handle generator which could be used to customized handle.
    */
  var handle: js.UndefOr[js.Function1[/* props */ js.Any, ReactNode]] = js.undefined
  /**
    * The style used for handle. (both for slider(Object) and range(Array of Object), the array will be used for mutli handle follow element order)
    */
  var handleStyle: js.UndefOr[js.Array[CSSProperties] | CSSProperties] = js.undefined
  /**
    * If the value is true, it means a continuous value interval, otherwise, it is a independent value.
    *  @default true
    */
  var included: js.UndefOr[Boolean] = js.undefined
  /**
    * Marks on the slider. The key determines the position, and the value determines what will show.
    * If you want to set the style of a specific mark point, the value should be an object which contains style and label properties.
    *  @default '{}' | {number: { style, label }}
    */
  var marks: js.UndefOr[Marks] = js.undefined
  /**
    * The maximum value of the slider
    *  @default 100
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value of the slider
    *  @default 0
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The style used for the track base color.
    */
  var railStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Reverse the direction of the slider.
    * From Left to Right To Right to Left
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Value to be added or subtracted on each step the slider makes. Must be greater than zero, and max - min should be evenly divisible by the step value.
    *  @default 1
    */
  var step: js.UndefOr[Double | Null] = js.undefined
  /**
    * The style used for the background and container. (both for slider(Object) and range(Array of Object), the array will be used for mutli handle follow element order)
    */
  var style: js.UndefOr[js.Array[CSSProperties] | CSSProperties] = js.undefined
  /**
    * @deprecated in version ^6.0.0. Use rc-tooltip
    * Tooltip formatter
    */
  var tipFormatter: js.UndefOr[(js.Function1[/* value */ js.Any, js.UndefOr[_]]) | Null] = js.undefined
  /**
    * @deprecated in version ^6.0.0. Use rc-tooltip
    * Tooltip transition class name
    */
  var tipTransitionName: js.UndefOr[String] = js.undefined
  /**
    * The style used for track. (both for slider(Object) and range(Array of Object), the array will be used for mutli track follow element order)
    */
  var trackStyle: js.UndefOr[js.Array[CSSProperties] | CSSProperties] = js.undefined
  /**
    * If vertical is true, the slider will be vertical.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object CommonApiProps {
  @scala.inline
  def apply(
    activeDotStyle: CSSProperties = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: /* props */ js.Any => ReactNode = null,
    handleStyle: js.Array[CSSProperties] | CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: Marks = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    railStyle: CSSProperties = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Null | Double] = js.undefined,
    style: js.Array[CSSProperties] | CSSProperties = null,
    tipFormatter: js.UndefOr[Null | (/* value */ js.Any => js.UndefOr[_])] = js.undefined,
    tipTransitionName: String = null,
    trackStyle: js.Array[CSSProperties] | CSSProperties = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): CommonApiProps = {
    val __obj = js.Dynamic.literal()
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(js.Any.fromFunction1(handle))
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.get.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tipFormatter)) __obj.updateDynamic("tipFormatter")(if (tipFormatter != null) js.Any.fromFunction1(tipFormatter.asInstanceOf[/* value */ js.Any => js.UndefOr[_]]) else null)
    if (tipTransitionName != null) __obj.updateDynamic("tipTransitionName")(tipTransitionName.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonApiProps]
  }
}

