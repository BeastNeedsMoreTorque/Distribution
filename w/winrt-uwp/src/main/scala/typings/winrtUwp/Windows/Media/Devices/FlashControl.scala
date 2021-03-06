package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the flash settings on a capture device. */
trait FlashControl extends js.Object {
  /** Gets or sets a value indicating whether focus assist light is enabled on the capture device. */
  var assistantLightEnabled: Boolean
  /** Gets a value indicating whether focus assist light is supported by the capture device. */
  var assistantLightSupported: Boolean
  /** Gets or sets a value that specifies if flash is automatically set. */
  var auto: Boolean
  /** Gets a value that specifies if the flash on the capture device is enabled or disabled. */
  var enabled: Boolean
  /** Gets or sets the intensity of the flash. */
  var powerPercent: Double
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  var powerSupported: Boolean
  /** Gets a value that specifies if the red eye reduction is enabled or disabled. */
  var redEyeReduction: Boolean
  /** Gets a value that specifies if the capture device supports red eye reduction. */
  var redEyeReductionSupported: Boolean
  /** Gets a value that specifies if the capture device supports the flash control. */
  var supported: Boolean
}

object FlashControl {
  @scala.inline
  def apply(
    assistantLightEnabled: Boolean,
    assistantLightSupported: Boolean,
    auto: Boolean,
    enabled: Boolean,
    powerPercent: Double,
    powerSupported: Boolean,
    redEyeReduction: Boolean,
    redEyeReductionSupported: Boolean,
    supported: Boolean
  ): FlashControl = {
    val __obj = js.Dynamic.literal(assistantLightEnabled = assistantLightEnabled.asInstanceOf[js.Any], assistantLightSupported = assistantLightSupported.asInstanceOf[js.Any], auto = auto.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], powerPercent = powerPercent.asInstanceOf[js.Any], powerSupported = powerSupported.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any], redEyeReductionSupported = redEyeReductionSupported.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashControl]
  }
}

