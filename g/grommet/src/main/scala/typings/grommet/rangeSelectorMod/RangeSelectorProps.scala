package typings.grommet.rangeSelectorMod

import typings.grommet.anon.Lower
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.weak
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorProps extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var invert: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messages: js.UndefOr[Lower] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var opacity: js.UndefOr[weak | medium | strong | String | Boolean] = js.undefined
  var round: js.UndefOr[xsmall | small | medium | large | full | String] = js.undefined
  var size: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var values: js.Array[Double]
}

object RangeSelectorProps {
  @scala.inline
  def apply(
    values: js.Array[Double],
    color: ColorType = null,
    direction: horizontal | vertical = null,
    invert: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    messages: Lower = null,
    min: js.UndefOr[Double] = js.undefined,
    onChange: /* repeated */ js.Any => Unit = null,
    opacity: weak | medium | strong | String | Boolean = null,
    round: xsmall | small | medium | large | full | String = null,
    size: xxsmall | xsmall | small | medium | large | xlarge | full | String = null,
    step: js.UndefOr[Double] = js.undefined
  ): RangeSelectorProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorProps]
  }
}

