package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "HmacSha512")
@js.native
class HmacSha512 protected ()
  extends typings.asmcryptoJs.hmacSha512Mod.HmacSha512 {
  def this(password: Uint8Array) = this()
  def this(password: Uint8Array, verify: Uint8Array) = this()
}

