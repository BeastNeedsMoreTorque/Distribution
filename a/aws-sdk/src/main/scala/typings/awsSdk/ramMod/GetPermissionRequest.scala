package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionRequest extends js.Object {
  /**
    * The ARN of the permission.
    */
  var permissionArn: String = js.native
  /**
    * The identifier for the version of the permission.
    */
  var permissionVersion: js.UndefOr[Integer] = js.native
}

object GetPermissionRequest {
  @scala.inline
  def apply(permissionArn: String, permissionVersion: js.UndefOr[Integer] = js.undefined): GetPermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any])
    if (!js.isUndefined(permissionVersion)) __obj.updateDynamic("permissionVersion")(permissionVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionRequest]
  }
}

