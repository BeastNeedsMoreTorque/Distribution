package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcesRequest extends js.Object {
  /**
    * The Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The collection type.
    */
  var CollectionType: js.UndefOr[ResourceCollectionType] = js.native
  /**
    * The maximum number of resources to return.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The user ID for the resource collection. This is a required field for accessing the API operation using IAM credentials.
    */
  var UserId: js.UndefOr[IdType] = js.native
}

object GetResourcesRequest {
  @scala.inline
  def apply(
    AuthenticationToken: AuthenticationHeaderType = null,
    CollectionType: ResourceCollectionType = null,
    Limit: js.UndefOr[LimitType] = js.undefined,
    Marker: PageMarkerType = null,
    UserId: IdType = null
  ): GetResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (CollectionType != null) __obj.updateDynamic("CollectionType")(CollectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcesRequest]
  }
}

