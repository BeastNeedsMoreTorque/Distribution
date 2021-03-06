package typings.socketioJwt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwtAuthOptions extends js.Object {
   // In milliseconds to handle the second round trip.
  var callback: js.UndefOr[Boolean] = js.undefined
   // To disconnect socket server-side without a client-side callback if no valid token.
  var decodedPropertyName: js.UndefOr[String] = js.undefined
   // Property to store the decoded token to.
  var handshake: js.UndefOr[Boolean] = js.undefined
  var secret: String | JwtSecretFunc
  var timeout: js.UndefOr[Double] = js.undefined
}

object JwtAuthOptions {
  @scala.inline
  def apply(
    secret: String | JwtSecretFunc,
    callback: js.UndefOr[Boolean] = js.undefined,
    decodedPropertyName: String = null,
    handshake: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): JwtAuthOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (!js.isUndefined(callback)) __obj.updateDynamic("callback")(callback.get.asInstanceOf[js.Any])
    if (decodedPropertyName != null) __obj.updateDynamic("decodedPropertyName")(decodedPropertyName.asInstanceOf[js.Any])
    if (!js.isUndefined(handshake)) __obj.updateDynamic("handshake")(handshake.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtAuthOptions]
  }
}

