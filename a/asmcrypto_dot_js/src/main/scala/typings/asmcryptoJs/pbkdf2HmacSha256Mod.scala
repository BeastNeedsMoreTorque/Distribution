package typings.asmcryptoJs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/pbkdf2/pbkdf2-hmac-sha256", JSImport.Namespace)
@js.native
object pbkdf2HmacSha256Mod extends js.Object {
  def Pbkdf2HmacSha256(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = js.native
}

