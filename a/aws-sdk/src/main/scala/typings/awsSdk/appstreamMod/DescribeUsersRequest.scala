package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsersRequest extends js.Object {
  /**
    * The authentication type for the users in the user pool to describe. You must specify USERPOOL.
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType = js.native
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeUsersRequest {
  @scala.inline
  def apply(
    AuthenticationType: AuthenticationType,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null
  ): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUsersRequest]
  }
}

