package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Select/Select.SelectClassKey>> */
@js.native
trait PartialClassNameMapSelect extends js.Object {
  var disabled: js.UndefOr[String] = js.native
  var filled: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var outlined: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var select: js.UndefOr[String] = js.native
  var selectMenu: js.UndefOr[String] = js.native
}

object PartialClassNameMapSelect {
  @scala.inline
  def apply(
    disabled: String = null,
    filled: String = null,
    icon: String = null,
    outlined: String = null,
    root: String = null,
    select: String = null,
    selectMenu: String = null
  ): PartialClassNameMapSelect = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filled != null) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (outlined != null) __obj.updateDynamic("outlined")(outlined.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (selectMenu != null) __obj.updateDynamic("selectMenu")(selectMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapSelect]
  }
}

