package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.anon.Automobile
import typings.appleMapkitJs.mapkit.DirectionsConstructorOptions
import typings.appleMapkitJs.mapkit.DirectionsRequest
import typings.appleMapkitJs.mapkit.DirectionsResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a directions object with options that you may provide.
  */
@JSGlobal("mapkit.Directions")
@js.native
/**
  * Creates a directions object with options that you may provide.
  *
  * @param An object containing the options for creating a directions object.
  * This parameter is optional.
  */
class Directions ()
  extends typings.appleMapkitJs.mapkit.Directions {
  def this(options: DirectionsConstructorOptions) = this()
  /**
    * Cancels a previous request for route directions.
    *
    * @param id The ID returned by a call to route.
    */
  /* CompleteClass */
  override def cancel(id: Double): Boolean = js.native
  /**
    * Retrieves directions and estimated travel time for the specified start
    * and end points.
    *
    * @param request DirectionsRequest object that specifies details for the
    * directions you want to retrieve.
    * @param callback A callback function that receives the directions,
    * returned asynchronously.
    * @return A request ID, which you can pass to cancel to abort a pending request.
    */
  /* CompleteClass */
  override def route(
    request: DirectionsRequest,
    callback: js.Function2[/* error */ Error | Null, /* data */ DirectionsResponse, Unit]
  ): Double = js.native
}

/* static members */
@JSGlobal("mapkit.Directions")
@js.native
object Directions extends js.Object {
  /**
    * The modes of transportation.
    */
  val Transport: Automobile = js.native
}

