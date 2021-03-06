package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropDownOpenedEventUIParam extends js.Object {
  /**
    * A reference to the drop down.
    */
  var dropDownElement: js.UndefOr[String] = js.undefined
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[js.Any] = js.undefined
}

object FilterDropDownOpenedEventUIParam {
  @scala.inline
  def apply(dropDownElement: String = null, hierarchy: js.Any = null): FilterDropDownOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dropDownElement != null) __obj.updateDynamic("dropDownElement")(dropDownElement.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropDownOpenedEventUIParam]
  }
}

