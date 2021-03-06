package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a touch gesture is interrupted by the device.
  */
trait TableViewTouchcancelEvent extends TableViewBaseEvent {
  /**
    * A value which indicates the stylus angle on the screen. If the stylus is perpendicular to the screen or no stylus is
    * being used, the value will be Pi/2. If the stylus is parallel to the screen, the value will be 0.
    * Note: This property is only available for iOS devices that support 3D-Touch and are 9.1 or later.
    */
  var altitudeAngle: Double
  /**
    * The current force value of the touch event.
    * Note: This property only available for iOS devices that support 3D-Touch and run 9.0 or later.
    */
  var force: Double
  /**
    * Maximum possible value of the force property.
    * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
    */
  var maximumPossibleForce: Double
  /**
    * The time (in seconds) when the touch was used in correlation with the system start up.
    *  Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
    */
  var timestamp: Double
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object TableViewTouchcancelEvent {
  @scala.inline
  def apply(
    altitudeAngle: Double,
    force: Double,
    maximumPossibleForce: Double,
    source: TableView,
    timestamp: Double,
    x: Double,
    y: Double
  ): TableViewTouchcancelEvent = {
    val __obj = js.Dynamic.literal(altitudeAngle = altitudeAngle.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], maximumPossibleForce = maximumPossibleForce.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewTouchcancelEvent]
  }
}

