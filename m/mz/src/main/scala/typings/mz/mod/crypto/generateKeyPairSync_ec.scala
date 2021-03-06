package typings.mz.mod.crypto

import typings.mz.mzStrings.ec
import typings.node.cryptoMod.ECKeyPairKeyObjectOptions
import typings.node.cryptoMod.KeyPairKeyObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "crypto.generateKeyPairSync")
@js.native
object generateKeyPairSync_ec extends js.Object {
  def apply(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
}

