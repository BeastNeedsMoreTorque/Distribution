package typings.baseui.anon

import typings.baseui.baseuiStrings.DZ
import typings.baseui.baseuiStrings.Plussign213
import typings.baseui.baseuiStrings.`Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialCodeId extends js.Object {
  var dialCode: Plussign213
  var id: DZ
  var label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`
}

object DialCodeId {
  @scala.inline
  def apply(dialCode: Plussign213, id: DZ, label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`): DialCodeId = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCodeId]
  }
}

