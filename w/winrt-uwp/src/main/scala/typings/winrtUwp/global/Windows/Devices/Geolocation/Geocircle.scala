package typings.winrtUwp.global.Windows.Devices.Geolocation

import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a geographic circle with a center point and a radius. */
@JSGlobal("Windows.Devices.Geolocation.Geocircle")
@js.native
class Geocircle protected ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.Geocircle {
  /**
    * Create a geographic circle object for the given position and radius.
    * @param position The geographic position of the new circle.
    * @param radius The radius of the new circle, in meters.
    */
  def this(position: BasicGeoposition, radius: Double) = this()
  /**
    * Create a geographic circle object for the given position, radius and altitude reference system.
    * @param position The geographic position of the new circle.
    * @param radius The radius of the new circle, in meters.
    * @param altitudeReferenceSystem The altitude reference system of the new circle.
    */
  def this(
    position: BasicGeoposition,
    radius: Double,
    altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
  ) = this()
  /**
    * Create a geographic circle object for the given position, radius, altitude reference system, and spatial reference id.
    * @param position The geographic position of the new circle.
    * @param radius The radius of the new circle, in meters.
    * @param altitudeReferenceSystem The altitude reference system of the new circle.
    * @param spatialReferenceId The spatial reference Id of the new circle.
    */
  def this(
    position: BasicGeoposition,
    radius: Double,
    altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
  /** The altitude reference system of the geographic circle. */
  /* CompleteClass */
  override var altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem = js.native
  /** The center point of a geographic circle. */
  /* CompleteClass */
  override var center: BasicGeoposition = js.native
  /** The type of geographic shape. */
  /* CompleteClass */
  override var geoshapeType: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType = js.native
  /** The radius of a geographic circle in meters. */
  /* CompleteClass */
  override var radius: Double = js.native
  /** The spatial reference identifier for the geographic circle, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  /* CompleteClass */
  override var spatialReferenceId: Double = js.native
}

