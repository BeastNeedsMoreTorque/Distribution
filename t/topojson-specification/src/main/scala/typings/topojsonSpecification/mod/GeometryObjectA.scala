package typings.topojsonSpecification.mod

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJsonGeometryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryObjectA[P /* <: Properties */] extends TopoJSON {
  var id: js.UndefOr[Double | String] = js.undefined
  var properties: js.UndefOr[P] = js.undefined
  @JSName("type")
  var type_GeometryObjectA: GeoJsonGeometryTypes | Null
}

object GeometryObjectA {
  @scala.inline
  def apply[/* <: typings.topojsonSpecification.mod.Properties */ P](
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null,
    `type`: GeoJsonGeometryTypes = null
  ): GeometryObjectA[P] = {
    val __obj = js.Dynamic.literal()
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObjectA[P]]
  }
}

