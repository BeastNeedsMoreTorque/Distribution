package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device detects a two-finger tap against the view.
  */
trait ProgressIndicatorTwofingertapEvent extends ProgressIndicatorBaseEvent {
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object ProgressIndicatorTwofingertapEvent {
  @scala.inline
  def apply(source: ProgressIndicator, x: Double, y: Double): ProgressIndicatorTwofingertapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorTwofingertapEvent]
  }
}

