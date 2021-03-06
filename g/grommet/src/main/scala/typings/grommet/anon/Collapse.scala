package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collapse extends js.Object {
  var collapse: js.UndefOr[js.Any] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var expand: js.UndefOr[js.Any] = js.undefined
}

object Collapse {
  @scala.inline
  def apply(collapse: js.Any = null, color: ColorType = null, expand: js.Any = null): Collapse = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapse]
  }
}

