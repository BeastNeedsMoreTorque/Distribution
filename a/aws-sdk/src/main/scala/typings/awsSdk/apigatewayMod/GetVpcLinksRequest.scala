package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcLinksRequest extends js.Object {
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
}

object GetVpcLinksRequest {
  @scala.inline
  def apply(limit: js.UndefOr[NullableInteger] = js.undefined, position: String = null): GetVpcLinksRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinksRequest]
  }
}

