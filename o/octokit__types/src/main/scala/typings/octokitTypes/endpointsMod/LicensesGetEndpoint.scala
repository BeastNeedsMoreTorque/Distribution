package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesGetEndpoint extends js.Object {
  var license: String
}

object LicensesGetEndpoint {
  @scala.inline
  def apply(license: String): LicensesGetEndpoint = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensesGetEndpoint]
  }
}

