package typings.clndr.mod

import typings.moment.mod.Moment
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var date: Moment
  var element: Element
  var events: js.Array[_]
}

object Target {
  @scala.inline
  def apply(date: Moment, element: Element, events: js.Array[_]): Target = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

