package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityUsage extends js.Object {
  /**
    * Total data storage for this identity.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  /**
    * Number of datasets for the identity.
    */
  var DatasetCount: js.UndefOr[Integer] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityId] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
}

object IdentityUsage {
  @scala.inline
  def apply(
    DataStorage: js.UndefOr[Long] = js.undefined,
    DatasetCount: js.UndefOr[Integer] = js.undefined,
    IdentityId: IdentityId = null,
    IdentityPoolId: IdentityPoolId = null,
    LastModifiedDate: Date = null
  ): IdentityUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DataStorage)) __obj.updateDynamic("DataStorage")(DataStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DatasetCount)) __obj.updateDynamic("DatasetCount")(DatasetCount.get.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityUsage]
  }
}

