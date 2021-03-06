package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSelectorProgramId extends js.Object {
  /**
    * Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the first program within the transport stream will be selected by default.
    */
  var ProgramId: js.UndefOr[integerMin0Max65536] = js.native
}

object VideoSelectorProgramId {
  @scala.inline
  def apply(ProgramId: js.UndefOr[integerMin0Max65536] = js.undefined): VideoSelectorProgramId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ProgramId)) __obj.updateDynamic("ProgramId")(ProgramId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSelectorProgramId]
  }
}

