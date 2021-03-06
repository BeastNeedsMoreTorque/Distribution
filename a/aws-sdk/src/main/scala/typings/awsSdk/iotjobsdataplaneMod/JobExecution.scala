package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecution extends js.Object {
  /**
    * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT.
    */
  var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.native
  /**
    * A number that identifies a particular job execution on a particular device. It can be used later in commands that return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * The content of the job document.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was enqueued.
    */
  var queuedAt: js.UndefOr[QueuedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was started.
    */
  var startedAt: js.UndefOr[StartedAt] = js.native
  /**
    * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED", "REJECTED", or "REMOVED".
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.native
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  /**
    * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.native
}

object JobExecution {
  @scala.inline
  def apply(
    approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined,
    executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
    jobDocument: JobDocument = null,
    jobId: JobId = null,
    lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
    queuedAt: js.UndefOr[QueuedAt] = js.undefined,
    startedAt: js.UndefOr[StartedAt] = js.undefined,
    status: JobExecutionStatus = null,
    statusDetails: DetailsMap = null,
    thingName: ThingName = null,
    versionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): JobExecution = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(approximateSecondsBeforeTimedOut)) __obj.updateDynamic("approximateSecondsBeforeTimedOut")(approximateSecondsBeforeTimedOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(executionNumber)) __obj.updateDynamic("executionNumber")(executionNumber.get.asInstanceOf[js.Any])
    if (jobDocument != null) __obj.updateDynamic("jobDocument")(jobDocument.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (!js.isUndefined(lastUpdatedAt)) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queuedAt)) __obj.updateDynamic("queuedAt")(queuedAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startedAt)) __obj.updateDynamic("startedAt")(startedAt.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    if (!js.isUndefined(versionNumber)) __obj.updateDynamic("versionNumber")(versionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecution]
  }
}

