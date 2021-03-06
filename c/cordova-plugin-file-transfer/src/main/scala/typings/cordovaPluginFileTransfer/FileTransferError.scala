package typings.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileTransferError object is passed to an error callback when an error occurs. */
trait FileTransferError extends js.Object {
  /* Response body. This attribute is only available when a response is received from the HTTP connection. */
  var body: String
  /**
    * One of the predefined error codes listed below.
    *     FileTransferError.FILE_NOT_FOUND_ERR
    *     FileTransferError.INVALID_URL_ERR
    *     FileTransferError.CONNECTION_ERR
    *     FileTransferError.ABORT_ERR
    *     FileTransferError.NOT_MODIFIED_ERR
    */
  var code: Double
  /* Exception that is thrown by native code */
  var exception: js.Any
  /** HTTP status code. This attribute is only available when a response code is received from the HTTP connection. */
  var http_status: Double
  /** URL to the source. */
  var source: String
  /** URL to the target. */
  var target: String
}

object FileTransferError {
  @scala.inline
  def apply(body: String, code: Double, exception: js.Any, http_status: Double, source: String, target: String): FileTransferError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], http_status = http_status.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransferError]
  }
}

