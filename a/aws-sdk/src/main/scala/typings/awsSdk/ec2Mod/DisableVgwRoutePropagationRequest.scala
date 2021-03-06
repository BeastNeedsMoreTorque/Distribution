package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableVgwRoutePropagationRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: VpnGatewayId = js.native
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId = js.native
}

object DisableVgwRoutePropagationRequest {
  @scala.inline
  def apply(GatewayId: VpnGatewayId, RouteTableId: RouteTableId, DryRun: js.UndefOr[Boolean] = js.undefined): DisableVgwRoutePropagationRequest = {
    val __obj = js.Dynamic.literal(GatewayId = GatewayId.asInstanceOf[js.Any], RouteTableId = RouteTableId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableVgwRoutePropagationRequest]
  }
}

