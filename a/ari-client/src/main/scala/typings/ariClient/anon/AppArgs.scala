package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppArgs extends js.Object {
  var app: js.UndefOr[String] = js.undefined
  var appArgs: js.UndefOr[String] = js.undefined
  var callerId: js.UndefOr[String] = js.undefined
  var channelId: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var endpoint: String
  var extension: js.UndefOr[String] = js.undefined
  var formats: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var originator: js.UndefOr[String] = js.undefined
  var otherChannelId: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var variables: js.UndefOr[Containers] = js.undefined
}

object AppArgs {
  @scala.inline
  def apply(
    endpoint: String,
    app: String = null,
    appArgs: String = null,
    callerId: String = null,
    channelId: String = null,
    context: String = null,
    extension: String = null,
    formats: String = null,
    label: String = null,
    originator: String = null,
    otherChannelId: String = null,
    priority: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    variables: Containers = null
  ): AppArgs = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (appArgs != null) __obj.updateDynamic("appArgs")(appArgs.asInstanceOf[js.Any])
    if (callerId != null) __obj.updateDynamic("callerId")(callerId.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (originator != null) __obj.updateDynamic("originator")(originator.asInstanceOf[js.Any])
    if (otherChannelId != null) __obj.updateDynamic("otherChannelId")(otherChannelId.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppArgs]
  }
}

