package typings.grommet.anon

import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Right extends js.Object {
  var bottom: js.UndefOr[top | typings.grommet.grommetStrings.bottom] = js.undefined
  var left: js.UndefOr[right | typings.grommet.grommetStrings.left] = js.undefined
  var right: js.UndefOr[typings.grommet.grommetStrings.right | left] = js.undefined
  var top: js.UndefOr[typings.grommet.grommetStrings.top | bottom] = js.undefined
}

object Right {
  @scala.inline
  def apply(
    bottom: top | bottom = null,
    left: right | left = null,
    right: right | left = null,
    top: top | bottom = null
  ): Right = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
}

