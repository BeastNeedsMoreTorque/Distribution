package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InheritedFrom extends js.Object {
  /** Deprecated - use permissionDetails/inherited instead. */
  var inherited: js.UndefOr[Boolean] = js.undefined
  /** Deprecated - use permissionDetails/inheritedFrom instead. */
  var inheritedFrom: js.UndefOr[String] = js.undefined
  /** Deprecated - use permissionDetails/role instead. */
  var role: js.UndefOr[String] = js.undefined
  /** Deprecated - use permissionDetails/permissionType instead. */
  var teamDrivePermissionType: js.UndefOr[String] = js.undefined
}

object InheritedFrom {
  @scala.inline
  def apply(
    inherited: js.UndefOr[Boolean] = js.undefined,
    inheritedFrom: String = null,
    role: String = null,
    teamDrivePermissionType: String = null
  ): InheritedFrom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherited)) __obj.updateDynamic("inherited")(inherited.get.asInstanceOf[js.Any])
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (teamDrivePermissionType != null) __obj.updateDynamic("teamDrivePermissionType")(teamDrivePermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritedFrom]
  }
}

