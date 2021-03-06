package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /** The immutable ID of the label. */
  var id: js.UndefOr[String] = js.undefined
  /** The visibility of the label in the label list in the Gmail web interface. */
  var labelListVisibility: js.UndefOr[String] = js.undefined
  /** The visibility of the label in the message list in the Gmail web interface. */
  var messageListVisibility: js.UndefOr[String] = js.undefined
  /** The total number of messages with the label. */
  var messagesTotal: js.UndefOr[Double] = js.undefined
  /** The number of unread messages with the label. */
  var messagesUnread: js.UndefOr[Double] = js.undefined
  /** The display name of the label. */
  var name: js.UndefOr[String] = js.undefined
  /** The total number of threads with the label. */
  var threadsTotal: js.UndefOr[Double] = js.undefined
  /** The number of unread threads with the label. */
  var threadsUnread: js.UndefOr[Double] = js.undefined
  /**
    * The owner type for the label. User labels are created by the user and can be modified and deleted by the user and can be applied to any message or
    * thread. System labels are internally created and cannot be added, modified, or deleted. System labels may be able to be applied to or removed from
    * messages and threads under some circumstances but this is not guaranteed. For example, users can apply and remove the INBOX and UNREAD labels from
    * messages and threads, but cannot apply or remove the DRAFTS or SENT labels from messages or threads.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    id: String = null,
    labelListVisibility: String = null,
    messageListVisibility: String = null,
    messagesTotal: js.UndefOr[Double] = js.undefined,
    messagesUnread: js.UndefOr[Double] = js.undefined,
    name: String = null,
    threadsTotal: js.UndefOr[Double] = js.undefined,
    threadsUnread: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelListVisibility != null) __obj.updateDynamic("labelListVisibility")(labelListVisibility.asInstanceOf[js.Any])
    if (messageListVisibility != null) __obj.updateDynamic("messageListVisibility")(messageListVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesTotal)) __obj.updateDynamic("messagesTotal")(messagesTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesUnread)) __obj.updateDynamic("messagesUnread")(messagesUnread.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(threadsTotal)) __obj.updateDynamic("threadsTotal")(threadsTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threadsUnread)) __obj.updateDynamic("threadsUnread")(threadsUnread.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

