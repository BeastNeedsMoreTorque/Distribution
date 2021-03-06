package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairValueItem class.
  */
trait ASPxClientCrosshairValueItem extends js.Object {
  /**
    * Gets an index of a point for which this crosshair value item is displayed.
    */
  var pointIndex: Double
  /**
    * Gets the value that is displayed in a crosshair label.
    */
  var value: Double
}

object ASPxClientCrosshairValueItem {
  @scala.inline
  def apply(pointIndex: Double, value: Double): ASPxClientCrosshairValueItem = {
    val __obj = js.Dynamic.literal(pointIndex = pointIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairValueItem]
  }
}

