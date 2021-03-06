package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessLocation extends js.Object {
  var accessLocation: UriParam
  var accessMethod: OidString
}

object AccessLocation {
  @scala.inline
  def apply(accessLocation: UriParam, accessMethod: OidString): AccessLocation = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLocation]
  }
}

