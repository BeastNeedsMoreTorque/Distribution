package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanOptions extends js.Object {
  var addButtonClassName: js.UndefOr[String] = js.undefined
   // IGeocoder
  var addWaypoints: js.UndefOr[Boolean] = js.undefined
  var createGeocoder: js.UndefOr[
    js.Function3[/* waypointIndex */ Double, /* numberWaypoints */ Double, /* plan */ Plan_, js.Object]
  ] = js.undefined
  var createMarker: js.UndefOr[
    js.Function3[
      /* waypointIndex */ Double, 
      /* waypoint */ Waypoint_, 
      /* numberWaypoints */ Double, 
      Marker_[_]
    ]
  ] = js.undefined
  var dragStyles: js.UndefOr[js.Array[PathOptions]] = js.undefined
  var draggableWaypoints: js.UndefOr[Boolean] = js.undefined
  var geocoder: js.UndefOr[js.Any] = js.undefined
  var geocoderClass: js.UndefOr[js.Function2[/* waypointIndex */ Double, /* numberWaypoints */ Double, Unit]] = js.undefined
  var geocoderPlaceholder: js.UndefOr[js.Function2[/* waypointIndex */ Double, /* numberWaypoints */ Double, String]] = js.undefined
  var geocodersClassName: js.UndefOr[String] = js.undefined
  var maxGeocoderTolerance: js.UndefOr[Double] = js.undefined
  var reverseWaypoints: js.UndefOr[Boolean] = js.undefined
  var routeWhileDragging: js.UndefOr[Boolean] = js.undefined
  var waypointNameFallback: js.UndefOr[js.Function1[/* latLng */ LatLng_, String]] = js.undefined
}

object PlanOptions {
  @scala.inline
  def apply(
    addButtonClassName: String = null,
    addWaypoints: js.UndefOr[Boolean] = js.undefined,
    createGeocoder: (/* waypointIndex */ Double, /* numberWaypoints */ Double, /* plan */ Plan_) => js.Object = null,
    createMarker: (/* waypointIndex */ Double, /* waypoint */ Waypoint_, /* numberWaypoints */ Double) => Marker_[_] = null,
    dragStyles: js.Array[PathOptions] = null,
    draggableWaypoints: js.UndefOr[Boolean] = js.undefined,
    geocoder: js.Any = null,
    geocoderClass: (/* waypointIndex */ Double, /* numberWaypoints */ Double) => Unit = null,
    geocoderPlaceholder: (/* waypointIndex */ Double, /* numberWaypoints */ Double) => String = null,
    geocodersClassName: String = null,
    maxGeocoderTolerance: js.UndefOr[Double] = js.undefined,
    reverseWaypoints: js.UndefOr[Boolean] = js.undefined,
    routeWhileDragging: js.UndefOr[Boolean] = js.undefined,
    waypointNameFallback: /* latLng */ LatLng_ => String = null
  ): PlanOptions = {
    val __obj = js.Dynamic.literal()
    if (addButtonClassName != null) __obj.updateDynamic("addButtonClassName")(addButtonClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(addWaypoints)) __obj.updateDynamic("addWaypoints")(addWaypoints.get.asInstanceOf[js.Any])
    if (createGeocoder != null) __obj.updateDynamic("createGeocoder")(js.Any.fromFunction3(createGeocoder))
    if (createMarker != null) __obj.updateDynamic("createMarker")(js.Any.fromFunction3(createMarker))
    if (dragStyles != null) __obj.updateDynamic("dragStyles")(dragStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(draggableWaypoints)) __obj.updateDynamic("draggableWaypoints")(draggableWaypoints.get.asInstanceOf[js.Any])
    if (geocoder != null) __obj.updateDynamic("geocoder")(geocoder.asInstanceOf[js.Any])
    if (geocoderClass != null) __obj.updateDynamic("geocoderClass")(js.Any.fromFunction2(geocoderClass))
    if (geocoderPlaceholder != null) __obj.updateDynamic("geocoderPlaceholder")(js.Any.fromFunction2(geocoderPlaceholder))
    if (geocodersClassName != null) __obj.updateDynamic("geocodersClassName")(geocodersClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxGeocoderTolerance)) __obj.updateDynamic("maxGeocoderTolerance")(maxGeocoderTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseWaypoints)) __obj.updateDynamic("reverseWaypoints")(reverseWaypoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(routeWhileDragging)) __obj.updateDynamic("routeWhileDragging")(routeWhileDragging.get.asInstanceOf[js.Any])
    if (waypointNameFallback != null) __obj.updateDynamic("waypointNameFallback")(js.Any.fromFunction1(waypointNameFallback))
    __obj.asInstanceOf[PlanOptions]
  }
}

