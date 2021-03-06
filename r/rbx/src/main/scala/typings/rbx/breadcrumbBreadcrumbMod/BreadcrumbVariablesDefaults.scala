package typings.rbx.breadcrumbBreadcrumbMod

import typings.rbx.rbxStrings.arrow
import typings.rbx.rbxStrings.bullet
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.dot
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbVariablesDefaults extends js.Object {
  var alignments: centered | right
  var separators: arrow | bullet | dot | succeeds
  var sizes: small | medium | large
}

object BreadcrumbVariablesDefaults {
  @scala.inline
  def apply(
    alignments: centered | right,
    separators: arrow | bullet | dot | succeeds,
    sizes: small | medium | large
  ): BreadcrumbVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbVariablesDefaults]
  }
}

