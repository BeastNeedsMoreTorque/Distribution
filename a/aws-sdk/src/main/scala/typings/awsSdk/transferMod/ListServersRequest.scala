package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServersRequest extends js.Object {
  /**
    * Specifies the number of file transfer protocol-enabled servers to return as a response to the ListServers query.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transferMod.MaxResults] = js.native
  /**
    * When additional results are obtained from theListServers command, a NextToken parameter is returned in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional file transfer protocol-enabled servers.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.native
}

object ListServersRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListServersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServersRequest]
  }
}

