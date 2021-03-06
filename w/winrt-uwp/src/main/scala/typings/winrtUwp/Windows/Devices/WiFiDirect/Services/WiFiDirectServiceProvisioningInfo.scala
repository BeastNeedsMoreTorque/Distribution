package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains provisioning information about a Wi-Fi Direct Service. */
trait WiFiDirectServiceProvisioningInfo extends js.Object {
  /** Gets a value indicating whether Wi-Fi Direct Point to Point (P2P) group formation is needed. */
  var isGroupFormationNeeded: Boolean
  /** Gets a value describing the configuration method in use. */
  var selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod
}

object WiFiDirectServiceProvisioningInfo {
  @scala.inline
  def apply(isGroupFormationNeeded: Boolean, selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod): WiFiDirectServiceProvisioningInfo = {
    val __obj = js.Dynamic.literal(isGroupFormationNeeded = isGroupFormationNeeded.asInstanceOf[js.Any], selectedConfigurationMethod = selectedConfigurationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceProvisioningInfo]
  }
}

