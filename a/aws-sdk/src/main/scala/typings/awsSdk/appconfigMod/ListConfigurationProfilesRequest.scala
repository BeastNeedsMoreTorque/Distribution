package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationProfilesRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.appconfigMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appconfigMod.NextToken] = js.native
}

object ListConfigurationProfilesRequest {
  @scala.inline
  def apply(ApplicationId: Id, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListConfigurationProfilesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationProfilesRequest]
  }
}

