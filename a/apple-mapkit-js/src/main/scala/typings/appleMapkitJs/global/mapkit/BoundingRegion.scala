package typings.appleMapkitJs.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a map, defined by coordinates of the rectangle's
  * northeast and southwest corners.
  */
@JSGlobal("mapkit.BoundingRegion")
@js.native
class BoundingRegion protected ()
  extends typings.appleMapkitJs.mapkit.BoundingRegion {
  /**
    * Creates a rectangular bounding region defined by the latitude and
    * longitude coordinates of the rectangle's northeast and southwest corners.
    *
    * @param northLatitude The north latitude of the bounding region.
    * @param eastLongitude The east longitude of the bounding region.
    * @param southLatitude The south latitude of the bounding region.
    * @param westLongitude The west longitude of the bounding region.
    */
  def this(northLatitude: Double, eastLongitude: Double, southLatitude: Double, westLongitude: Double) = this()
  /**
    * The east longitude of the bounding region.
    */
  /* CompleteClass */
  override var eastLongitude: Double = js.native
  /**
    * The north latitude of the bounding region.
    */
  /* CompleteClass */
  override var northLatitude: Double = js.native
  /**
    * The south latitude of the bounding region.
    */
  /* CompleteClass */
  override var southLatitude: Double = js.native
  /**
    * The west longitude of the bounding region.
    */
  /* CompleteClass */
  override var westLongitude: Double = js.native
  /**
    * Returns a copy of the calling bounding region.
    */
  /* CompleteClass */
  override def copy(): typings.appleMapkitJs.mapkit.BoundingRegion = js.native
  /**
    * Returns the coordinate region that corresponds to the calling bounding region.
    */
  /* CompleteClass */
  override def toCoordinateRegion(): typings.appleMapkitJs.mapkit.CoordinateRegion = js.native
}

