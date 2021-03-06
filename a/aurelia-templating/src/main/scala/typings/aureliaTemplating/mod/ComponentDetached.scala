package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDetached extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic if/when the component is removed from the the DOM.
    */
  def detached(): Unit
}

object ComponentDetached {
  @scala.inline
  def apply(detached: () => Unit): ComponentDetached = {
    val __obj = js.Dynamic.literal(detached = js.Any.fromFunction0(detached))
    __obj.asInstanceOf[ComponentDetached]
  }
}

