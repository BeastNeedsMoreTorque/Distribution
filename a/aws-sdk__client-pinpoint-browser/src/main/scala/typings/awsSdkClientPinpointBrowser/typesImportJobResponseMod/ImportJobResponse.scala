package typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CREATED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILED
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INITIALIZING
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROCESSING
import typings.awsSdkClientPinpointBrowser.typesImportJobResourceMod.ImportJobResource
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportJobResponse extends js.Object {
  /**
    * The unique ID of the application to which the import job applies.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The number of pieces that have successfully imported as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[Double] = js.undefined
  /**
    * The date the import job completed in ISO 8601 format.
    */
  var CompletionDate: js.UndefOr[String] = js.undefined
  /**
    * The date the import job was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The import job settings.
    */
  var Definition: js.UndefOr[ImportJobResource] = js.undefined
  /**
    * The number of pieces that have failed to import as of the time of the request.
    */
  var FailedPieces: js.UndefOr[Double] = js.undefined
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  var Failures: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * The unique ID of the import job.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The status of the import job.
    * Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
    *
    * The job status is FAILED if one or more pieces failed to import.
    */
  var JobStatus: js.UndefOr[
    CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String
  ] = js.undefined
  /**
    * The number of endpoints that failed to import; for example, because of syntax errors.
    */
  var TotalFailures: js.UndefOr[Double] = js.undefined
  /**
    * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion of the endpoints to import.
    */
  var TotalPieces: js.UndefOr[Double] = js.undefined
  /**
    * The number of endpoints that were processed by the import job.
    */
  var TotalProcessed: js.UndefOr[Double] = js.undefined
  /**
    * The job type. Will be Import.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object ImportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CompletedPieces: js.UndefOr[Double] = js.undefined,
    CompletionDate: String = null,
    CreationDate: String = null,
    Definition: ImportJobResource = null,
    FailedPieces: js.UndefOr[Double] = js.undefined,
    Failures: js.Array[String] | Iterable[String] = null,
    Id: String = null,
    JobStatus: CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String = null,
    TotalFailures: js.UndefOr[Double] = js.undefined,
    TotalPieces: js.UndefOr[Double] = js.undefined,
    TotalProcessed: js.UndefOr[Double] = js.undefined,
    Type: String = null
  ): ImportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (!js.isUndefined(CompletedPieces)) __obj.updateDynamic("CompletedPieces")(CompletedPieces.get.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (!js.isUndefined(FailedPieces)) __obj.updateDynamic("FailedPieces")(FailedPieces.get.asInstanceOf[js.Any])
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalFailures)) __obj.updateDynamic("TotalFailures")(TotalFailures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalPieces)) __obj.updateDynamic("TotalPieces")(TotalPieces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalProcessed)) __obj.updateDynamic("TotalProcessed")(TotalProcessed.get.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobResponse]
  }
}

