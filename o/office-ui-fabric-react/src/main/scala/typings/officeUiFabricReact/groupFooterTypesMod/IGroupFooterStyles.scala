package typings.officeUiFabricReact.groupFooterTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupFooterStyles extends js.Object {
  var root: IStyle
}

object IGroupFooterStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IGroupFooterStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupFooterStyles]
  }
}

