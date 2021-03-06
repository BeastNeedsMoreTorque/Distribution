package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoleList extends js.Object {
  /** RoleList roles */
  var roles: js.UndefOr[js.Array[IRole] | Null] = js.undefined
}

object IRoleList {
  @scala.inline
  def apply(roles: js.UndefOr[Null | js.Array[IRole]] = js.undefined): IRoleList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(roles)) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoleList]
  }
}

