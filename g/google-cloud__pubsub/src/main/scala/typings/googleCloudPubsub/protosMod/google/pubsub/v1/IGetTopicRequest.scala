package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetTopicRequest. */
trait IGetTopicRequest extends js.Object {
  /** GetTopicRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}

object IGetTopicRequest {
  @scala.inline
  def apply(topic: js.UndefOr[Null | String] = js.undefined): IGetTopicRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(topic)) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetTopicRequest]
  }
}

