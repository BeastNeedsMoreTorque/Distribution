package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMargin extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object ColorMargin {
  @scala.inline
  def apply(background: BackgroundType = null, color: ColorType = null, margin: MarginType = null): ColorMargin = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMargin]
  }
}

