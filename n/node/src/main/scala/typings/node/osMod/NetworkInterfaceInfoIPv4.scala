package typings.node.osMod

import typings.node.nodeStrings.IPv4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceInfoIPv4
  extends NetworkInterfaceBase
     with NetworkInterfaceInfo {
  var family: IPv4
}

object NetworkInterfaceInfoIPv4 {
  @scala.inline
  def apply(
    address: String,
    family: IPv4,
    internal: Boolean,
    mac: String,
    netmask: String,
    cidr: String = null
  ): NetworkInterfaceInfoIPv4 = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], cidr = cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceInfoIPv4]
  }
}

