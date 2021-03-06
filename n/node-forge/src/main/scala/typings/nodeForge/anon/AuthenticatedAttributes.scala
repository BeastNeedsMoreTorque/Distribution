package typings.nodeForge.anon

import typings.nodeForge.mod.pki.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatedAttributes extends js.Object {
  var authenticatedAttributes: js.Array[Type]
  var certificate: Certificate | String
  var digestAlgorithm: String
  var key: String
}

object AuthenticatedAttributes {
  @scala.inline
  def apply(
    authenticatedAttributes: js.Array[Type],
    certificate: Certificate | String,
    digestAlgorithm: String,
    key: String
  ): AuthenticatedAttributes = {
    val __obj = js.Dynamic.literal(authenticatedAttributes = authenticatedAttributes.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatedAttributes]
  }
}

