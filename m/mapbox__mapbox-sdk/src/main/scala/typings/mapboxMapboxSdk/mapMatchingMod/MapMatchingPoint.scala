package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMatchingPoint extends Point {
  /**
    * Whether this coordinate is waypoint or not. The first and last coordinates will always be waypoints.
    */
  var isWaypoint: js.UndefOr[Boolean] = js.undefined
  /**
    * A number in meters indicating the assumed precision of the used tracking device.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * Datetime corresponding to the coordinate.
    */
  var timestamp: js.UndefOr[String | Double | Date] = js.undefined
  /**
    * Custom name for the waypoint used for the arrival instruction in banners and voice instructions.
    * Will be ignored unless isWaypoint is true.
    */
  var waypointName: js.UndefOr[Boolean] = js.undefined
}

object MapMatchingPoint {
  @scala.inline
  def apply(
    coordinates: LngLatLike,
    approach: DirectionsApproach = null,
    isWaypoint: js.UndefOr[Boolean] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    timestamp: String | Double | Date = null,
    waypointName: js.UndefOr[Boolean] = js.undefined
  ): MapMatchingPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    if (approach != null) __obj.updateDynamic("approach")(approach.asInstanceOf[js.Any])
    if (!js.isUndefined(isWaypoint)) __obj.updateDynamic("isWaypoint")(isWaypoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(waypointName)) __obj.updateDynamic("waypointName")(waypointName.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMatchingPoint]
  }
}

