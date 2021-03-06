package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PedometerStepKind extends js.Object

/** The type of step taken according to the pedometer. */
@JSGlobal("Windows.Devices.Sensors.PedometerStepKind")
@js.native
object PedometerStepKind extends js.Object {
  /** A running step. */
  @js.native
  sealed trait running extends PedometerStepKind
  
  /** An unknown step type. */
  @js.native
  sealed trait unknown extends PedometerStepKind
  
  /** A walking step. */
  @js.native
  sealed trait walking extends PedometerStepKind
  
}

