package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateWebhookEndpoint extends js.Object {
  /**
    * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Key/value pairs to provide settings for this webhook. [These are defined below](https://developer.github.com/v3/orgs/hooks/#update-hook-config-params).
    */
  var config: js.UndefOr[OrgsUpdateWebhookParamsConfig] = js.undefined
  /**
    * Determines what [events](https://developer.github.com/webhooks/event-payloads) the hook is triggered for.
    */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var hook_id: Double
  @JSName("org")
  var org_ : String
}

object OrgsUpdateWebhookEndpoint {
  @scala.inline
  def apply(
    hook_id: Double,
    org_ : String,
    active: js.UndefOr[Boolean] = js.undefined,
    config: OrgsUpdateWebhookParamsConfig = null,
    events: js.Array[String] = null
  ): OrgsUpdateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateWebhookEndpoint]
  }
}

