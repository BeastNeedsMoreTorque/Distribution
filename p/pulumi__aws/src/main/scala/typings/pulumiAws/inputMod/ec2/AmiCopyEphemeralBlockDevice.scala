package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiCopyEphemeralBlockDevice extends js.Object {
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: js.UndefOr[Input[String]] = js.native
  /**
    * A name for the ephemeral device, of the form "ephemeralN" where
    * *N* is a volume number starting from zero.
    */
  var virtualName: js.UndefOr[Input[String]] = js.native
}

object AmiCopyEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String] = null, virtualName: Input[String] = null): AmiCopyEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiCopyEphemeralBlockDevice]
  }
}

