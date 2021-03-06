package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManagedPrefixListAssociationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[GetManagedPrefixListAssociationsMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId = js.native
}

object GetManagedPrefixListAssociationsRequest {
  @scala.inline
  def apply(
    PrefixListId: PrefixListResourceId,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    MaxResults: js.UndefOr[GetManagedPrefixListAssociationsMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): GetManagedPrefixListAssociationsRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedPrefixListAssociationsRequest]
  }
}

