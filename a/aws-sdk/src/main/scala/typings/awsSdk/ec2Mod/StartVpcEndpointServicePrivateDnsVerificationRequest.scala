package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartVpcEndpointServicePrivateDnsVerificationRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: VpcEndpointServiceId = js.native
}

object StartVpcEndpointServicePrivateDnsVerificationRequest {
  @scala.inline
  def apply(ServiceId: VpcEndpointServiceId, DryRun: js.UndefOr[Boolean] = js.undefined): StartVpcEndpointServicePrivateDnsVerificationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartVpcEndpointServicePrivateDnsVerificationRequest]
  }
}

