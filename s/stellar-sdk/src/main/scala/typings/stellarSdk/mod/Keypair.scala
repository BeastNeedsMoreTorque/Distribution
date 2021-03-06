package typings.stellarSdk.mod

import typings.node.Buffer
import typings.stellarBase.anon.PublicKey
import typings.stellarBase.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Keypair")
@js.native
class Keypair protected ()
  extends typings.stellarBase.mod.Keypair {
  def this(keys: PublicKey) = this()
  def this(keys: Type) = this()
}

/* static members */
@JSImport("stellar-sdk", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: String): typings.stellarBase.mod.Keypair = js.native
  def fromPublicKey(publicKey: String): typings.stellarBase.mod.Keypair = js.native
  def fromRawEd25519Seed(secretSeed: Buffer): typings.stellarBase.mod.Keypair = js.native
  def fromSecret(secretKey: String): typings.stellarBase.mod.Keypair = js.native
  def master(): typings.stellarBase.mod.Keypair = js.native
  def master(networkPassphrase: String): typings.stellarBase.mod.Keypair = js.native
  def random(): typings.stellarBase.mod.Keypair = js.native
}

