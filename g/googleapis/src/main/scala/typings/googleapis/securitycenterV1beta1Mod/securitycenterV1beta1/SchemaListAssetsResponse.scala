package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing assets.
  */
@js.native
trait SchemaListAssetsResponse extends js.Object {
  /**
    * Assets matching the list request.
    */
  var listAssetsResults: js.UndefOr[js.Array[SchemaListAssetsResult]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Time used for executing the list request.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The total number of assets matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaListAssetsResponse {
  @scala.inline
  def apply(
    listAssetsResults: js.Array[SchemaListAssetsResult] = null,
    nextPageToken: String = null,
    readTime: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): SchemaListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (listAssetsResults != null) __obj.updateDynamic("listAssetsResults")(listAssetsResults.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAssetsResponse]
  }
}

