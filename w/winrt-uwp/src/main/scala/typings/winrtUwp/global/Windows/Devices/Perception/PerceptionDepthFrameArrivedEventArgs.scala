package typings.winrtUwp.global.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a depth frame arrived event. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameArrivedEventArgs")
@js.native
abstract class PerceptionDepthFrameArrivedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameArrivedEventArgs {
  /** Gets the relative time of this frame. */
  /* CompleteClass */
  override var relativeTime: Double = js.native
  /**
    * Attempts to open the depth frame that has arrived. Existing frames should be closed before opening new frames. If an app has three or more frames still open when this method is called, TryOpenFrame will fail.
    * @return If the attempt is successful, this method returns the newly-arrived depth frame. If the attempt is unsuccessful, this value is unchanged.
    */
  /* CompleteClass */
  override def tryOpenFrame(): typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrame = js.native
}

