package typings.libraCore.eventsPbMod.Event

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accessPath: js.UndefOr[typings.libraCore.accessPathPbMod.AccessPath.AsObject] = js.undefined
  var eventData: Uint8Array | String
  var sequenceNumber: String
}

object AsObject {
  @scala.inline
  def apply(
    eventData: Uint8Array | String,
    sequenceNumber: String,
    accessPath: typings.libraCore.accessPathPbMod.AccessPath.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    if (accessPath != null) __obj.updateDynamic("accessPath")(accessPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

