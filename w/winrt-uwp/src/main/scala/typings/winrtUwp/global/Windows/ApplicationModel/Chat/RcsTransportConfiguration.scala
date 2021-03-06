package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the configuration of a Rich Communication Services (RCS) transport. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsTransportConfiguration")
@js.native
abstract class RcsTransportConfiguration ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.RcsTransportConfiguration {
  /** Gets the maximum number of attachments supported by the transport. */
  /* CompleteClass */
  override var maxAttachmentCount: Double = js.native
  /** Gets the maximum size of a file that can be sent using the transport. */
  /* CompleteClass */
  override var maxFileSizeInKilobytes: Double = js.native
  /** Gets the maximum size of a group chat message supported by the transport. */
  /* CompleteClass */
  override var maxGroupMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum size of a chat message supported by the transport. */
  /* CompleteClass */
  override var maxMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum number of recipients supported for a group chat. */
  /* CompleteClass */
  override var maxRecipientCount: Double = js.native
  /** Gets the size at which the user should be warned that they are attaching a large file for the transport. */
  /* CompleteClass */
  override var warningFileSizeInKilobytes: Double = js.native
}

