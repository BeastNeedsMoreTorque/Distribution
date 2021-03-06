package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an inclinometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
abstract class Inclinometer ()
  extends typings.winrtUwp.Windows.Devices.Sensors.Inclinometer

/* static members */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
object Inclinometer extends js.Object {
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Inclinometer = js.native
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  def getDefaultForRelativeReadings(): typings.winrtUwp.Windows.Devices.Sensors.Inclinometer = js.native
}

