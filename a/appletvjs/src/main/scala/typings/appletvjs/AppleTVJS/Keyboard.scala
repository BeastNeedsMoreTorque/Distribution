package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  /** The text inside of a searchField or textField element. */
  var text: String
  /**
    * A callback function that is called when the text inside
    * of searchField or textField element changes.
    * */
  def onTextChange(): Unit
}

object Keyboard {
  @scala.inline
  def apply(onTextChange: () => Unit, text: String): Keyboard = {
    val __obj = js.Dynamic.literal(onTextChange = js.Any.fromFunction0(onTextChange), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyboard]
  }
}

