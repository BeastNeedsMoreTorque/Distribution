package typings.esquery.mod

import typings.esquery.esqueryStrings.has
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Has
  extends MultiSelectorAtom
     with MultiSelector
     with Selector {
  @JSName("type")
  var type_Has: has
}

object Has {
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: has, subject: js.UndefOr[Boolean] = js.undefined): Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Has]
  }
}

