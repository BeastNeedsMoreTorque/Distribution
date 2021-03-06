package typings.reactNativeMail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var attachment: js.UndefOr[Name] = js.undefined
  var bccRecipients: js.UndefOr[js.Array[String]] = js.undefined
  var body: String
  var ccRecipients: js.UndefOr[js.Array[String]] = js.undefined
  var isHTML: Boolean
  var recipients: js.UndefOr[js.Array[String]] = js.undefined
  var subject: String
}

object Attachment {
  @scala.inline
  def apply(
    body: String,
    isHTML: Boolean,
    subject: String,
    attachment: Name = null,
    bccRecipients: js.Array[String] = null,
    ccRecipients: js.Array[String] = null,
    recipients: js.Array[String] = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isHTML = isHTML.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (bccRecipients != null) __obj.updateDynamic("bccRecipients")(bccRecipients.asInstanceOf[js.Any])
    if (ccRecipients != null) __obj.updateDynamic("ccRecipients")(ccRecipients.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

