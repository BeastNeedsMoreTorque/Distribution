package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRootsResponse extends js.Object {
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
  /**
    * A list of roots that are defined in an organization.
    */
  var Roots: js.UndefOr[typings.awsSdk.organizationsMod.Roots] = js.native
}

object ListRootsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Roots: Roots = null): ListRootsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Roots != null) __obj.updateDynamic("Roots")(Roots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRootsResponse]
  }
}

