package typings.rbx.buttonGroupMod

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupVariablesDefaults extends js.Object {
  var alignments: centered | right
  var sizes: small | medium | large
}

object ButtonGroupVariablesDefaults {
  @scala.inline
  def apply(alignments: centered | right, sizes: small | medium | large): ButtonGroupVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupVariablesDefaults]
  }
}

