package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an video media stream. */
trait VideoStreamDescriptor extends js.Object {
  /** Gets the encoding properties on the video stream. */
  var encodingProperties: VideoEncodingProperties
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: Boolean
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: String
  /** Gets or sets the name of the stream. */
  var name: String
}

object VideoStreamDescriptor {
  @scala.inline
  def apply(encodingProperties: VideoEncodingProperties, isSelected: Boolean, language: String, name: String): VideoStreamDescriptor = {
    val __obj = js.Dynamic.literal(encodingProperties = encodingProperties.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamDescriptor]
  }
}

