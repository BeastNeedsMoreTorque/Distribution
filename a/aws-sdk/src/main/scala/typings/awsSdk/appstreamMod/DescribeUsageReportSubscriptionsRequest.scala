package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsageReportSubscriptionsRequest extends js.Object {
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeUsageReportSubscriptionsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[Integer] = js.undefined, NextToken: String = null): DescribeUsageReportSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUsageReportSubscriptionsRequest]
  }
}

