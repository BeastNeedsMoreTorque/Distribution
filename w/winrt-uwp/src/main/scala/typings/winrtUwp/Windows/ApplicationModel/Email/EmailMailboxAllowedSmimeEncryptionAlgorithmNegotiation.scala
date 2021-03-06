package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation extends js.Object

/** Defines the type of negotiation on encryption algorithms permitted by the server. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation")
@js.native
object EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation extends js.Object {
  /** Minimal encryption is required. */
  @js.native
  sealed trait anyAlgorithm extends EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
  /** No negotiation is allowed. */
  @js.native
  sealed trait none extends EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
  /** Strong encryption is required. */
  @js.native
  sealed trait strongAlgorithm extends EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
}

