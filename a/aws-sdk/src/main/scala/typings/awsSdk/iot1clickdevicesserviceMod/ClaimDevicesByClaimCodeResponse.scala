package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimDevicesByClaimCodeResponse extends js.Object {
  /**
    * The claim code provided by the device manufacturer.
    */
  var ClaimCode: js.UndefOr[stringMin12Max40] = js.native
  /**
    * The total number of devices associated with the claim code that has been processed in
    the claim request.
    */
  var Total: js.UndefOr[integer] = js.native
}

object ClaimDevicesByClaimCodeResponse {
  @scala.inline
  def apply(ClaimCode: stringMin12Max40 = null, Total: js.UndefOr[integer] = js.undefined): ClaimDevicesByClaimCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (ClaimCode != null) __obj.updateDynamic("ClaimCode")(ClaimCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDevicesByClaimCodeResponse]
  }
}

