package typings.rbx.tabGroupMod

import typings.rbx.rbxStrings.`toggle-rounded`
import typings.rbx.rbxStrings.boxed
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabGroupVariablesDefaults extends js.Object {
  var alignments: centered | right
  var kinds: boxed | toggle | `toggle-rounded`
  var sizes: small | medium | large
}

object TabGroupVariablesDefaults {
  @scala.inline
  def apply(
    alignments: centered | right,
    kinds: boxed | toggle | `toggle-rounded`,
    sizes: small | medium | large
  ): TabGroupVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], kinds = kinds.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupVariablesDefaults]
  }
}

