package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request specifies if a password for opening or modifying a document is requested.
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @see com.sun.star.task.PasswordRequest
  * @see com.sun.star.task.DocumentPasswordRequest
  * @since OOo 3.3
  */
trait DocumentPasswordRequest2 extends DocumentPasswordRequest {
  /** specifies if the requested password is for opening a document or for modifying it. */
  var IsRequestPasswordToModify: Boolean
}

object DocumentPasswordRequest2 {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    IsRequestPasswordToModify: Boolean,
    Message: String,
    Mode: PasswordRequestMode,
    Name: String
  ): DocumentPasswordRequest2 = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], IsRequestPasswordToModify = IsRequestPasswordToModify.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPasswordRequest2]
  }
}

