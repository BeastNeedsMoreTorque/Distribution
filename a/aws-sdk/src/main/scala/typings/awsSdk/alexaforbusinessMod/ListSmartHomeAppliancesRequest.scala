package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSmartHomeAppliancesRequest extends js.Object {
  /**
    * The maximum number of appliances to be returned, per paginated calls.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The room that the appliances are associated with.
    */
  var RoomArn: Arn = js.native
}

object ListSmartHomeAppliancesRequest {
  @scala.inline
  def apply(RoomArn: Arn, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListSmartHomeAppliancesRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSmartHomeAppliancesRequest]
  }
}

