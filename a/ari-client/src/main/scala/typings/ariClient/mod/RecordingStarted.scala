package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingStarted extends Event {
  /**
    * Recording control object.
    */
  var recording: LiveRecording
}

object RecordingStarted {
  @scala.inline
  def apply(
    application: String,
    recording: LiveRecording,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): RecordingStarted = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingStarted]
  }
}

