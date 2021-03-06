package typings.consul.mod.Agent.Service

import typings.consul.mod.CommonOptions
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceOptions extends CommonOptions {
  var enable: Boolean
  var id: String
  var reason: js.UndefOr[String] = js.undefined
}

object MaintenanceOptions {
  @scala.inline
  def apply(
    enable: Boolean,
    id: String,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    reason: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): MaintenanceOptions = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent.get.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (dc != null) __obj.updateDynamic("dc")(dc.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceOptions]
  }
}

