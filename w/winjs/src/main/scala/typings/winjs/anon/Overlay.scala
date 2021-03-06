package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlay extends js.Object {
  /**
    * When the pane is open, it occupies space leaving less room for the SplitView's content.
    **/
  var `inline`: String
  /**
    * When the pane is open, it doesn't take up any space and it is light dismissable.
    **/
  var overlay: String
}

object Overlay {
  @scala.inline
  def apply(`inline`: String, overlay: String): Overlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
}

