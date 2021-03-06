package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionActionsRequest extends js.Object {
  /**
    * The maximum number of sessions to return per response.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ARN of the session to retrieve.
    */
  var sessionArn: DeviceFarmArn = js.native
}

object ListTestGridSessionActionsRequest {
  @scala.inline
  def apply(
    sessionArn: DeviceFarmArn,
    maxResult: js.UndefOr[MaxPageSize] = js.undefined,
    nextToken: PaginationToken = null
  ): ListTestGridSessionActionsRequest = {
    val __obj = js.Dynamic.literal(sessionArn = sessionArn.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResult)) __obj.updateDynamic("maxResult")(maxResult.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionActionsRequest]
  }
}

