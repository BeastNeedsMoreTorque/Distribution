package typings.motionSensorsPolyfill

import typings.motionSensorsPolyfill.mod.AccelerometerLocalCoordinateSystem
import typings.motionSensorsPolyfill.mod.GyroscopeLocalCoordinateSystem
import typings.motionSensorsPolyfill.mod.OrientationSensorLocalCoordinateSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object motionSensorsPolyfillStrings {
  @js.native
  sealed trait device
    extends AccelerometerLocalCoordinateSystem
       with GyroscopeLocalCoordinateSystem
       with OrientationSensorLocalCoordinateSystem
  
  @js.native
  sealed trait screen
    extends AccelerometerLocalCoordinateSystem
       with GyroscopeLocalCoordinateSystem
       with OrientationSensorLocalCoordinateSystem
  
  @scala.inline
  def device: device = "device".asInstanceOf[device]
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
}

