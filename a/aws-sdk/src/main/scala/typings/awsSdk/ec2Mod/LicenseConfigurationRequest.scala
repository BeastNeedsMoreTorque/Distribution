package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
}

object LicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String = null): LicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurationArn != null) __obj.updateDynamic("LicenseConfigurationArn")(LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseConfigurationRequest]
  }
}

