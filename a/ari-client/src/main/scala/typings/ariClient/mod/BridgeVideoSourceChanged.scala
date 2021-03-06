package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeVideoSourceChanged extends Event {
  /**
    * Bridge.
    */
  var bridge: Bridge
  /**
    * Old_video_source_id.
    */
  var old_video_source_id: js.UndefOr[String] = js.undefined
}

object BridgeVideoSourceChanged {
  @scala.inline
  def apply(
    application: String,
    bridge: Bridge,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null,
    old_video_source_id: String = null
  ): BridgeVideoSourceChanged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (old_video_source_id != null) __obj.updateDynamic("old_video_source_id")(old_video_source_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeVideoSourceChanged]
  }
}

