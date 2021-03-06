package typings.postmark.outboundMessageEventsMod

import typings.postmark.anon.BounceID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceEvent extends MessageEvent {
  @JSName("Details")
  var Details_BounceEvent: BounceID
}

object BounceEvent {
  @scala.inline
  def apply(Details: BounceID, ReceivedAt: String, Recipient: String, Type: String): BounceEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceEvent]
  }
}

