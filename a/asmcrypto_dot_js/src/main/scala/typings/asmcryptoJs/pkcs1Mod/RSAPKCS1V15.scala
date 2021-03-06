package typings.asmcryptoJs.pkcs1Mod

import typings.asmcryptoJs.sha1Mod.Sha1
import typings.asmcryptoJs.sha256Mod.Sha256
import typings.asmcryptoJs.sha512Mod.Sha512
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_PKCS1_v1_5")
@js.native
class RSAPKCS1V15 protected () extends js.Object {
  def this(key: js.Array[Uint8Array], hash: Sha1) = this()
  def this(key: js.Array[Uint8Array], hash: Sha256) = this()
  def this(key: js.Array[Uint8Array], hash: Sha512) = this()
  val hash: js.Any = js.native
  val rsa: js.Any = js.native
  def sign(data: Uint8Array): Uint8Array = js.native
  def verify(signature: Uint8Array, data: Uint8Array): Unit = js.native
}

