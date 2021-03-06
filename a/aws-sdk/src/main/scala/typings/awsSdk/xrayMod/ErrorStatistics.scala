package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorStatistics extends js.Object {
  /**
    * The number of requests that failed with untracked 4xx Client Error status codes.
    */
  var OtherCount: js.UndefOr[NullableLong] = js.native
  /**
    * The number of requests that failed with a 419 throttling status code.
    */
  var ThrottleCount: js.UndefOr[NullableLong] = js.native
  /**
    * The total number of requests that failed with a 4xx Client Error status code.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.native
}

object ErrorStatistics {
  @scala.inline
  def apply(
    OtherCount: js.UndefOr[NullableLong] = js.undefined,
    ThrottleCount: js.UndefOr[NullableLong] = js.undefined,
    TotalCount: js.UndefOr[NullableLong] = js.undefined
  ): ErrorStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(OtherCount)) __obj.updateDynamic("OtherCount")(OtherCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ThrottleCount)) __obj.updateDynamic("ThrottleCount")(ThrottleCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorStatistics]
  }
}

