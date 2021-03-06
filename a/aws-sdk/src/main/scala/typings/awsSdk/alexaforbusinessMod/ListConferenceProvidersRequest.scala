package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConferenceProvidersRequest extends js.Object {
  /**
    * The maximum number of conference providers to be returned, per paginated calls.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListConferenceProvidersRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListConferenceProvidersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConferenceProvidersRequest]
  }
}

