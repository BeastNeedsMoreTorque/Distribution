package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to specify whether the camera driver can dynamically adjust the frame rate of video capture in order to improve video quality in low-light conditions. */
@JSGlobal("Windows.Media.Devices.ExposurePriorityVideoControl")
@js.native
abstract class ExposurePriorityVideoControl ()
  extends typings.winrtUwp.Windows.Media.Devices.ExposurePriorityVideoControl {
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is enabled. */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is supported on the current device. */
  /* CompleteClass */
  override var supported: Boolean = js.native
}

