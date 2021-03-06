package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceLastAccessedDetailsResponse extends js.Object {
  /**
    * An object that contains details about the reason the operation failed.
    */
  var Error: js.UndefOr[ErrorDetails] = js.native
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed. This field is null if the job is still in progress, as indicated by a job status value of IN_PROGRESS.
    */
  var JobCompletionDate: dateType = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the report job was created.
    */
  var JobCreationDate: dateType = js.native
  /**
    * The status of the job.
    */
  var JobStatus: jobStatusType = js.native
  /**
    * The type of job. Service jobs return information about when each service was last accessed. Action jobs also include information about when tracked actions within the service were last accessed.
    */
  var JobType: js.UndefOr[AccessAdvisorUsageGranularityType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    *  A ServiceLastAccessed object that contains details about the most recent attempt to access the service.
    */
  var ServicesLastAccessed: typings.awsSdk.iamMod.ServicesLastAccessed = js.native
}

object GetServiceLastAccessedDetailsResponse {
  @scala.inline
  def apply(
    JobCompletionDate: dateType,
    JobCreationDate: dateType,
    JobStatus: jobStatusType,
    ServicesLastAccessed: ServicesLastAccessed,
    Error: ErrorDetails = null,
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    JobType: AccessAdvisorUsageGranularityType = null,
    Marker: responseMarkerType = null
  ): GetServiceLastAccessedDetailsResponse = {
    val __obj = js.Dynamic.literal(JobCompletionDate = JobCompletionDate.asInstanceOf[js.Any], JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], ServicesLastAccessed = ServicesLastAccessed.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.get.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceLastAccessedDetailsResponse]
  }
}

