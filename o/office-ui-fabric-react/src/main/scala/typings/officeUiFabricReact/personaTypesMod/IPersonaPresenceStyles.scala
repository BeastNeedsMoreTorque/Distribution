package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaPresenceStyles extends js.Object {
  var presence: IStyle
  var presenceIcon: IStyle
}

object IPersonaPresenceStyles {
  @scala.inline
  def apply(
    presence: js.UndefOr[Null | IStyle] = js.undefined,
    presenceIcon: js.UndefOr[Null | IStyle] = js.undefined
  ): IPersonaPresenceStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(presence)) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (!js.isUndefined(presenceIcon)) __obj.updateDynamic("presenceIcon")(presenceIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaPresenceStyles]
  }
}

