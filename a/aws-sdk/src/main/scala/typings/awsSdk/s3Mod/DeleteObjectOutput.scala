package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectOutput extends js.Object {
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarker] = js.native
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * Returns the version ID of the delete marker created as a result of the DELETE operation.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object DeleteObjectOutput {
  @scala.inline
  def apply(
    DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
    RequestCharged: RequestCharged = null,
    VersionId: ObjectVersionId = null
  ): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker.get.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectOutput]
  }
}

