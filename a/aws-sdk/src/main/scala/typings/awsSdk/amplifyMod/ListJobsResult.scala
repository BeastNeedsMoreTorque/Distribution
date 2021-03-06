package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResult extends js.Object {
  /**
    *  The result structure for the list job result request. 
    */
  var jobSummaries: JobSummaries = js.native
  /**
    *  A pagination token. If non-null the pagination token is returned in a result. Pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListJobsResult {
  @scala.inline
  def apply(jobSummaries: JobSummaries, nextToken: NextToken = null): ListJobsResult = {
    val __obj = js.Dynamic.literal(jobSummaries = jobSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResult]
  }
}

