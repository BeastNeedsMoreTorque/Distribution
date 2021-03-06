package typings.winrtUwp.global.Windows.Devices.Geolocation

import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a geographic point. */
@JSGlobal("Windows.Devices.Geolocation.Geopoint")
@js.native
class Geopoint protected ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.Geopoint {
  /**
    * Create a geographic point object for the given position.
    * @param position Create a geographic point object for the given position.
    */
  def this(position: BasicGeoposition) = this()
  /**
    * Create a geographic point object for the given position and altitude reference system.
    * @param position Create a geographic point object for the given position.
    * @param altitudeReferenceSystem The altitude reference system of the new point.
    */
  def this(
    position: BasicGeoposition,
    altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
  ) = this()
  /**
    * Create a geographic point object for the given position, altitude reference system, and spatial reference Id.
    * @param position Create a geographic point object for the given position.
    * @param altitudeReferenceSystem The altitude reference system of the new point.
    * @param spatialReferenceId The spatial reference Id of the new point.
    */
  def this(
    position: BasicGeoposition,
    altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
  /** The altitude reference system of the geographic point. */
  /* CompleteClass */
  override var altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem = js.native
  /** The type of geographic shape. */
  /* CompleteClass */
  override var geoshapeType: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType = js.native
  /** The position of a geographic point. */
  /* CompleteClass */
  override var position: BasicGeoposition = js.native
  /** The spatial reference identifier for the geographic point, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  /* CompleteClass */
  override var spatialReferenceId: Double = js.native
}

