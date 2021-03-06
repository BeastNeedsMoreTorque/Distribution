package typings.atom.anon

import typings.atom.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewExtent extends js.Object {
  /** A Point representing the replacement extent. */
  var newExtent: Point
  /** A String representing the replacement text. */
  var newText: String
  /** A Point representing the replaced extent. */
  var oldExtent: Point
  /** A Point representing where the change started. */
  var start: Point
}

object NewExtent {
  @scala.inline
  def apply(newExtent: Point, newText: String, oldExtent: Point, start: Point): NewExtent = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExtent]
  }
}

