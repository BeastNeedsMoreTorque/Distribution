package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeManagement defines the set of node management services turned on for
  * the node pool.
  */
@js.native
trait SchemaNodeManagement extends js.Object {
  /**
    * A flag that specifies whether the node auto-repair is enabled for the
    * node pool. If enabled, the nodes in this node pool will be monitored and,
    * if they fail health checks too many times, an automatic repair action
    * will be triggered.
    */
  var autoRepair: js.UndefOr[Boolean] = js.native
  /**
    * A flag that specifies whether node auto-upgrade is enabled for the node
    * pool. If enabled, node auto-upgrade helps keep the nodes in your node
    * pool up to date with the latest release version of Kubernetes.
    */
  var autoUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the Auto Upgrade knobs for the node pool.
    */
  var upgradeOptions: js.UndefOr[SchemaAutoUpgradeOptions] = js.native
}

object SchemaNodeManagement {
  @scala.inline
  def apply(
    autoRepair: js.UndefOr[Boolean] = js.undefined,
    autoUpgrade: js.UndefOr[Boolean] = js.undefined,
    upgradeOptions: SchemaAutoUpgradeOptions = null
  ): SchemaNodeManagement = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRepair)) __obj.updateDynamic("autoRepair")(autoRepair.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpgrade)) __obj.updateDynamic("autoUpgrade")(autoUpgrade.get.asInstanceOf[js.Any])
    if (upgradeOptions != null) __obj.updateDynamic("upgradeOptions")(upgradeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeManagement]
  }
}

