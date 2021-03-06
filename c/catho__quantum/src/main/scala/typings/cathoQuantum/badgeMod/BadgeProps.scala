package typings.cathoQuantum.badgeMod

import typings.cathoQuantum.anon.Components
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var skin: js.UndefOr[primary | secondary | success | error | neutral] = js.undefined
  var theme: js.UndefOr[Components] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    number: js.UndefOr[Double] = js.undefined,
    skin: primary | secondary | success | error | neutral = null,
    theme: Components = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

