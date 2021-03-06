package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TetheringOperationalState extends js.Object

/** Defines values used by the TetheringOperationalState property to indicate the operational state of a device's tethering capabilities. */
@JSGlobal("Windows.Networking.NetworkOperators.TetheringOperationalState")
@js.native
object TetheringOperationalState extends js.Object {
  /** The tethering feature is currently in transition between the On and Off states. */
  @js.native
  sealed trait inTransition extends TetheringOperationalState
  
  /** Tethering is off. */
  @js.native
  sealed trait off extends TetheringOperationalState
  
  /** Tethering is on. */
  @js.native
  sealed trait on extends TetheringOperationalState
  
  /** Current operational state is unknown. */
  @js.native
  sealed trait unknown extends TetheringOperationalState
  
}

