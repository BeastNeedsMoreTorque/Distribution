package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAttachmentsToSetRequest extends js.Object {
  /**
    * The ID of the attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  /**
    * One or more attachments to add to the set. You can add up to three attachments per set. The size limit is 5 MB per attachment. In the Attachment object, use the data parameter to specify the contents of the attachment file. In the previous request syntax, the value for data appear as blob, which is represented as a base64-encoded string. The value for fileName is the name of the attachment, such as troubleshoot-screenshot.png.
    */
  var attachments: Attachments = js.native
}

object AddAttachmentsToSetRequest {
  @scala.inline
  def apply(attachments: Attachments, attachmentSetId: AttachmentSetId = null): AddAttachmentsToSetRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    if (attachmentSetId != null) __obj.updateDynamic("attachmentSetId")(attachmentSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAttachmentsToSetRequest]
  }
}

