package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.UploadingProgressChanged event.
  */
trait ASPxClientUploadControlUploadingProgressChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the content length of the currently uploaded file.
    */
  var currentFileContentLength: Double
  /**
    * Gets the name of the file being currently uploaded.
    */
  var currentFileName: String
  /**
    * Gets the position of the current file upload progress.
    */
  var currentFileProgress: Double
  /**
    * Gets the content length of the current file already uploaded to the server.
    */
  var currentFileUploadedContentLength: Double
  /**
    * Gets the number of the files selected for upload.
    */
  var fileCount: Double
  /**
    * Gets the current position of total upload progress.
    */
  var progress: Double
  /**
    * Gets the content length of the files selected for upload.
    */
  var totalContentLength: Double
  /**
    * Gets the content length of the files already uploaded to the server.
    */
  var uploadedContentLength: Double
}

object ASPxClientUploadControlUploadingProgressChangedEventArgs {
  @scala.inline
  def apply(
    currentFileContentLength: Double,
    currentFileName: String,
    currentFileProgress: Double,
    currentFileUploadedContentLength: Double,
    fileCount: Double,
    progress: Double,
    totalContentLength: Double,
    uploadedContentLength: Double
  ): ASPxClientUploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength.asInstanceOf[js.Any], currentFileName = currentFileName.asInstanceOf[js.Any], currentFileProgress = currentFileProgress.asInstanceOf[js.Any], currentFileUploadedContentLength = currentFileUploadedContentLength.asInstanceOf[js.Any], fileCount = fileCount.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], totalContentLength = totalContentLength.asInstanceOf[js.Any], uploadedContentLength = uploadedContentLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlUploadingProgressChangedEventArgs]
  }
}

