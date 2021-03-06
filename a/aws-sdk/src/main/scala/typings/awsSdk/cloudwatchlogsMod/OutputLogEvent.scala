package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputLogEvent extends js.Object {
  /**
    * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var ingestionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The data contained in the log event.
    */
  var message: js.UndefOr[EventMessage] = js.native
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: js.UndefOr[Timestamp] = js.native
}

object OutputLogEvent {
  @scala.inline
  def apply(
    ingestionTime: js.UndefOr[Timestamp] = js.undefined,
    message: EventMessage = null,
    timestamp: js.UndefOr[Timestamp] = js.undefined
  ): OutputLogEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ingestionTime)) __obj.updateDynamic("ingestionTime")(ingestionTime.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputLogEvent]
  }
}

