package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterInstanceEventNotificationAttributesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Information about the tag keys to register.
    */
  var InstanceTagAttribute: js.UndefOr[RegisterInstanceTagAttributeRequest] = js.native
}

object RegisterInstanceEventNotificationAttributesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    InstanceTagAttribute: RegisterInstanceTagAttributeRequest = null
  ): RegisterInstanceEventNotificationAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (InstanceTagAttribute != null) __obj.updateDynamic("InstanceTagAttribute")(InstanceTagAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceEventNotificationAttributesRequest]
  }
}

