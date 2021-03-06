package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJournalKinesisStreamRequest extends js.Object {
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.qldbMod.LedgerName = js.native
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: UniqueId = js.native
}

object CancelJournalKinesisStreamRequest {
  @scala.inline
  def apply(LedgerName: LedgerName, StreamId: UniqueId): CancelJournalKinesisStreamRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJournalKinesisStreamRequest]
  }
}

