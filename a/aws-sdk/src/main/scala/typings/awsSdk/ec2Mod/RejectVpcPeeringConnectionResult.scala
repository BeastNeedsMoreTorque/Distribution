package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectVpcPeeringConnectionResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object RejectVpcPeeringConnectionResult {
  @scala.inline
  def apply(Return: js.UndefOr[Boolean] = js.undefined): RejectVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectVpcPeeringConnectionResult]
  }
}

