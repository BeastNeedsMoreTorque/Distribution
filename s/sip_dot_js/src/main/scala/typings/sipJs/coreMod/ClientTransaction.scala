package typings.sipJs.coreMod

import typings.sipJs.coreTransportMod.Transport
import typings.sipJs.transactionUserMod.ClientTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typings.sipJs.transactionsMod.ClientTransaction {
  protected def this(
    _request: typings.sipJs.messagesMod.OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser,
    state: typings.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

