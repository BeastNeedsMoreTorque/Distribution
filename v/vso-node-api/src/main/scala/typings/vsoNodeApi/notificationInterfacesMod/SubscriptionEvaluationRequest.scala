package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionEvaluationRequest extends js.Object {
  /**
    * The min created date for the events used for matching in UTC. Use all events created since this date
    */
  var minEventsCreatedDate: Date
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria. If not specified, defaults to the calling user.
    */
  var subscriptionCreateParameters: NotificationSubscriptionCreateParameters
}

object SubscriptionEvaluationRequest {
  @scala.inline
  def apply(minEventsCreatedDate: Date, subscriptionCreateParameters: NotificationSubscriptionCreateParameters): SubscriptionEvaluationRequest = {
    val __obj = js.Dynamic.literal(minEventsCreatedDate = minEventsCreatedDate.asInstanceOf[js.Any], subscriptionCreateParameters = subscriptionCreateParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionEvaluationRequest]
  }
}

