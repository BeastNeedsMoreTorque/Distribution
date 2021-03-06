package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitDiffSourceCodeType extends js.Object {
  /**
    *  The SHA of the destination commit. 
    */
  var DestinationCommit: js.UndefOr[CommitId] = js.native
  /**
    *  The SHA of the source commit. 
    */
  var SourceCommit: js.UndefOr[CommitId] = js.native
}

object CommitDiffSourceCodeType {
  @scala.inline
  def apply(DestinationCommit: CommitId = null, SourceCommit: CommitId = null): CommitDiffSourceCodeType = {
    val __obj = js.Dynamic.literal()
    if (DestinationCommit != null) __obj.updateDynamic("DestinationCommit")(DestinationCommit.asInstanceOf[js.Any])
    if (SourceCommit != null) __obj.updateDynamic("SourceCommit")(SourceCommit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitDiffSourceCodeType]
  }
}

