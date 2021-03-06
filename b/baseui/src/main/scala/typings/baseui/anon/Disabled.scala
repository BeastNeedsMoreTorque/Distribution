package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  @JSName("$selected")
  var $selected: js.UndefOr[Boolean] = js.undefined
}

object Disabled {
  @scala.inline
  def apply(
    $disabled: js.UndefOr[Boolean] = js.undefined,
    $isHighlighted: js.UndefOr[Boolean] = js.undefined,
    $selected: js.UndefOr[Boolean] = js.undefined
  ): Disabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted.get.asInstanceOf[js.Any])
    if (!js.isUndefined($selected)) __obj.updateDynamic("$selected")($selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

