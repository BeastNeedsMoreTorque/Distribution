package typings.winrtUwp.Windows.Networking.Vpn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnDomainNameType extends js.Object

/** Describes whether a name is a domain name suffix or a fully qualified domain name. */
@JSGlobal("Windows.Networking.Vpn.VpnDomainNameType")
@js.native
object VpnDomainNameType extends js.Object {
  /** Fully qualified domain name (FQDN) */
  @js.native
  sealed trait fullyQualified extends VpnDomainNameType
  
  /** Reserved */
  @js.native
  sealed trait reserved extends VpnDomainNameType
  
  /** Domain name suffix */
  @js.native
  sealed trait suffix extends VpnDomainNameType
  
}

