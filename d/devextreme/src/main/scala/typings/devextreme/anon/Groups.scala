package typings.devextreme.anon

import typings.devextreme.devextremeStrings.containers
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.flowchart
import typings.devextreme.devextremeStrings.general
import typings.devextreme.devextremeStrings.orgChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var groups: js.UndefOr[js.Array[general | flowchart | orgChart | containers | custom | Category]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Groups {
  @scala.inline
  def apply(
    groups: js.Array[general | flowchart | orgChart | containers | custom | Category] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

