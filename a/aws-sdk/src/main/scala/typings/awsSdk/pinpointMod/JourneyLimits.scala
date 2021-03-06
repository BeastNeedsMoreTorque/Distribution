package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyLimits extends js.Object {
  /**
    * The maximum number of messages that the journey can send to a single participant during a 24-hour period. The maximum value is 100.
    */
  var DailyCap: js.UndefOr[integer] = js.native
  /**
    * The maximum number of times that a participant can enter the journey. The maximum value is 100. To allow participants to enter the journey an unlimited number of times, set this value to 0.
    */
  var EndpointReentryCap: js.UndefOr[integer] = js.native
  /**
    * The maximum number of messages that the journey can send each second.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
}

object JourneyLimits {
  @scala.inline
  def apply(
    DailyCap: js.UndefOr[integer] = js.undefined,
    EndpointReentryCap: js.UndefOr[integer] = js.undefined,
    MessagesPerSecond: js.UndefOr[integer] = js.undefined
  ): JourneyLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DailyCap)) __obj.updateDynamic("DailyCap")(DailyCap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EndpointReentryCap)) __obj.updateDynamic("EndpointReentryCap")(EndpointReentryCap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MessagesPerSecond)) __obj.updateDynamic("MessagesPerSecond")(MessagesPerSecond.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyLimits]
  }
}

