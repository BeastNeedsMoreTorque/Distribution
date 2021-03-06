package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayReadyHardwareDRMFeatures extends js.Object

/** Indicates the valid list of hardware digital rights management (DRM) feature values that can be queried. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyHardwareDRMFeatures")
@js.native
object PlayReadyHardwareDRMFeatures extends js.Object {
  /** Hardware DRM is supported on the machine. */
  @js.native
  sealed trait hardwareDRM extends PlayReadyHardwareDRMFeatures
  
  /** Indicates the hardware supports High Efficiency Video Coding (HEVC)/H.265 codec. */
  @js.native
  sealed trait hevc extends PlayReadyHardwareDRMFeatures
  
}

