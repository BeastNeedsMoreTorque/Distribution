package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListItemSecondaryAction.ListItemSecondaryActionClassKey>> */
@js.native
trait PartialStyleRulesListItem extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesListItem {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesListItem = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesListItem]
  }
}

