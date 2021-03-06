package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContactFlowsRequest extends js.Object {
  /**
    * The type of contact flow.
    */
  var ContactFlowTypes: js.UndefOr[typings.awsSdk.connectMod.ContactFlowTypes] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.native
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}

object ListContactFlowsRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    ContactFlowTypes: ContactFlowTypes = null,
    MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
    NextToken: NextToken = null
  ): ListContactFlowsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (ContactFlowTypes != null) __obj.updateDynamic("ContactFlowTypes")(ContactFlowTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactFlowsRequest]
  }
}

