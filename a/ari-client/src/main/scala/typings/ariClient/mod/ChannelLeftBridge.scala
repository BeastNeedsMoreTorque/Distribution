package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelLeftBridge extends Event {
  /**
    * Bridge.
    */
  var bridge: Bridge
  /**
    * Channel.
    */
  var channel: Channel
}

object ChannelLeftBridge {
  @scala.inline
  def apply(
    application: String,
    bridge: Bridge,
    channel: Channel,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ChannelLeftBridge = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelLeftBridge]
  }
}

