package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkGroupsOutput extends js.Object {
  /**
    * A token generated by the Athena service that specifies where to continue pagination if a previous request was truncated. To obtain the next set of pages, pass in the NextToken from the response object of the previous page call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The list of workgroups, including their names, descriptions, creation times, and states.
    */
  var WorkGroups: js.UndefOr[WorkGroupsList] = js.native
}

object ListWorkGroupsOutput {
  @scala.inline
  def apply(NextToken: Token = null, WorkGroups: WorkGroupsList = null): ListWorkGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WorkGroups != null) __obj.updateDynamic("WorkGroups")(WorkGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkGroupsOutput]
  }
}

