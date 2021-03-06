package typings.cordovaPluginDeviceOrientation

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class CompassError protected ()
    extends typings.cordovaPluginDeviceOrientation.CompassError {
    /** Constructor for CompassError object */
    def this(code: Double) = this()
    /**
      * One of the predefined error codes
      *     CompassError.COMPASS_INTERNAL_ERR
      *     CompassError.COMPASS_NOT_SUPPORTED
      */
    /* CompleteClass */
    override var code: Double = js.native
  }
  
  @js.native
  object CompassError
    extends /** Constructor for CompassError object */
  Instantiable1[/* code */ Double, typings.cordovaPluginDeviceOrientation.CompassError] {
    var COMPASS_INTERNAL_ERR: Double = js.native
    var COMPASS_NOT_SUPPORTED: Double = js.native
  }
  
}

