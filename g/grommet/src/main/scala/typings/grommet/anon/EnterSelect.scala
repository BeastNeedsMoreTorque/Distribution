package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterSelect extends js.Object {
  var enterSelect: js.UndefOr[String] = js.undefined
  var suggestionIsOpen: js.UndefOr[String] = js.undefined
  var suggestionsCount: js.UndefOr[String] = js.undefined
  var suggestionsExist: js.UndefOr[String] = js.undefined
}

object EnterSelect {
  @scala.inline
  def apply(
    enterSelect: String = null,
    suggestionIsOpen: String = null,
    suggestionsCount: String = null,
    suggestionsExist: String = null
  ): EnterSelect = {
    val __obj = js.Dynamic.literal()
    if (enterSelect != null) __obj.updateDynamic("enterSelect")(enterSelect.asInstanceOf[js.Any])
    if (suggestionIsOpen != null) __obj.updateDynamic("suggestionIsOpen")(suggestionIsOpen.asInstanceOf[js.Any])
    if (suggestionsCount != null) __obj.updateDynamic("suggestionsCount")(suggestionsCount.asInstanceOf[js.Any])
    if (suggestionsExist != null) __obj.updateDynamic("suggestionsExist")(suggestionsExist.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterSelect]
  }
}

