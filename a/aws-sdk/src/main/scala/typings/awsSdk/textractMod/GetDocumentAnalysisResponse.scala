package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentAnalysisResponse extends js.Object {
  /**
    * 
    */
  var AnalyzeDocumentModelVersion: js.UndefOr[String] = js.native
  /**
    * The results of the text-analysis operation.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  /**
    * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract video operation.
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.textractMod.DocumentMetadata] = js.native
  /**
    * The current status of the text detection job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.textractMod.JobStatus] = js.native
  /**
    * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text detection results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The current status of an asynchronous document-analysis operation.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.textractMod.StatusMessage] = js.native
  /**
    * A list of warnings that occurred during the document-analysis operation.
    */
  var Warnings: js.UndefOr[typings.awsSdk.textractMod.Warnings] = js.native
}

object GetDocumentAnalysisResponse {
  @scala.inline
  def apply(
    AnalyzeDocumentModelVersion: String = null,
    Blocks: BlockList = null,
    DocumentMetadata: DocumentMetadata = null,
    JobStatus: JobStatus = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    Warnings: Warnings = null
  ): GetDocumentAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    if (AnalyzeDocumentModelVersion != null) __obj.updateDynamic("AnalyzeDocumentModelVersion")(AnalyzeDocumentModelVersion.asInstanceOf[js.Any])
    if (Blocks != null) __obj.updateDynamic("Blocks")(Blocks.asInstanceOf[js.Any])
    if (DocumentMetadata != null) __obj.updateDynamic("DocumentMetadata")(DocumentMetadata.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Warnings != null) __obj.updateDynamic("Warnings")(Warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentAnalysisResponse]
  }
}

