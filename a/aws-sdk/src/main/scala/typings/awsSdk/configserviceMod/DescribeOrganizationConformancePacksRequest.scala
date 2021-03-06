package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConformancePacksRequest extends js.Object {
  /**
    * The maximum number of organization config packs returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name that you assign to an organization conformance pack.
    */
  var OrganizationConformancePackNames: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConformancePackNames] = js.native
}

object DescribeOrganizationConformancePacksRequest {
  @scala.inline
  def apply(
    Limit: js.UndefOr[CosmosPageLimit] = js.undefined,
    NextToken: String = null,
    OrganizationConformancePackNames: OrganizationConformancePackNames = null
  ): DescribeOrganizationConformancePacksRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationConformancePackNames != null) __obj.updateDynamic("OrganizationConformancePackNames")(OrganizationConformancePackNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConformancePacksRequest]
  }
}

