package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteSnapshotRequest. */
trait IDeleteSnapshotRequest extends js.Object {
  /** DeleteSnapshotRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.undefined
}

object IDeleteSnapshotRequest {
  @scala.inline
  def apply(snapshot: js.UndefOr[Null | String] = js.undefined): IDeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteSnapshotRequest]
  }
}

