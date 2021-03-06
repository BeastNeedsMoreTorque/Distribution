package typings.winrtUwp.global.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a infrared frame arrived event. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameArrivedEventArgs")
@js.native
abstract class PerceptionInfraredFrameArrivedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameArrivedEventArgs {
  /** Gets the relative time of this frame. */
  /* CompleteClass */
  override var relativeTime: Double = js.native
  /**
    * Attempts to open the infrared frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived infrared frame. If the attempt is unsuccessful, this value is unchanged.
    */
  /* CompleteClass */
  override def tryOpenFrame(): typings.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrame = js.native
}

