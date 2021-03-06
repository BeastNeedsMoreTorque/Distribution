package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBucketsRequest extends js.Object {
  /**
    * The criteria to use to filter the query results.
    */
  var criteria: js.UndefOr[BucketCriteria] = js.native
  /**
    * The maximum number of items to include in each page of the response. The default value is 50.
    */
  var maxResults: js.UndefOr[integer] = js.native
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  /**
    * The criteria to use to sort the query results.
    */
  var sortCriteria: js.UndefOr[BucketSortCriteria] = js.native
}

object DescribeBucketsRequest {
  @scala.inline
  def apply(
    criteria: BucketCriteria = null,
    maxResults: js.UndefOr[integer] = js.undefined,
    nextToken: string = null,
    sortCriteria: BucketSortCriteria = null
  ): DescribeBucketsRequest = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBucketsRequest]
  }
}

