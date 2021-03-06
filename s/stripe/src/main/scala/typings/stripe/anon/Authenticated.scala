package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authenticated extends js.Object {
  /**
    * Whether or not authentication was performed. 3D Secure will succeed without authentication when the
    * card is not enrolled.
    */
  var authenticated: Boolean
  /**
    * Whether or not 3D Secure succeeded.
    */
  var succeeded: Boolean
  /**
    * The version of 3D Secure that was used for this payment.
    */
  var version: String
}

object Authenticated {
  @scala.inline
  def apply(authenticated: Boolean, succeeded: Boolean, version: String): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticated]
  }
}

