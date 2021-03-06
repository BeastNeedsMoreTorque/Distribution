package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait None extends js.Object {
  /**
    * The dialog was dismissed without the user selecting any of the commands. The user may have dismissed the dialog by hitting the escape key or pressing the hardware back button.
    **/
  var none: String
  /**
    * The user dismissed the dialog by pressing the primary command.
    **/
  var primary: String
  /**
    * The user dismissed the dialog by pressing the secondary command.
    **/
  var secondary: String
}

object None {
  @scala.inline
  def apply(none: String, primary: String, secondary: String): None = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[None]
  }
}

