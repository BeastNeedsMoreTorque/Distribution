package typings.d3Geo.mod

import typings.d3Geo.anon.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedGeometryCollection[GeometryType /* <: GeoGeometryObjects */] extends js.Object {
  var bbox: js.UndefOr[js.Array[Double]] = js.undefined
  var crs: js.UndefOr[Properties] = js.undefined
  var geometries: js.Array[GeometryType]
  var `type`: String
}

object ExtendedGeometryCollection {
  @scala.inline
  def apply[/* <: typings.d3Geo.mod.GeoGeometryObjects */ GeometryType](
    geometries: js.Array[GeometryType],
    `type`: String,
    bbox: js.Array[Double] = null,
    crs: Properties = null
  ): ExtendedGeometryCollection[GeometryType] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedGeometryCollection[GeometryType]]
  }
}

