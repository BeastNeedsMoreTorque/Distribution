package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired as soon as the device detects movement of a touch..
  */
trait TableViewRowTouchmoveEvent extends TableViewRowBaseEvent {
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object TableViewRowTouchmoveEvent {
  @scala.inline
  def apply(source: TableViewRow, x: Double, y: Double): TableViewRowTouchmoveEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewRowTouchmoveEvent]
  }
}

