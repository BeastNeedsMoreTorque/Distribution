package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataflowEndpointGroupsRequest extends js.Object {
  /**
    * Maximum number of dataflow endpoint groups returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * Next token returned in the request of a previous ListDataflowEndpointGroups call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListDataflowEndpointGroupsRequest {
  @scala.inline
  def apply(maxResults: js.UndefOr[Integer] = js.undefined, nextToken: String = null): ListDataflowEndpointGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataflowEndpointGroupsRequest]
  }
}

