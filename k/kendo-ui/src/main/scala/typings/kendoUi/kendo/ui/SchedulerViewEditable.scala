package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerViewEditable extends js.Object {
  var create: js.UndefOr[Boolean] = js.undefined
  var destroy: js.UndefOr[Boolean] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
}

object SchedulerViewEditable {
  @scala.inline
  def apply(
    create: js.UndefOr[Boolean] = js.undefined,
    destroy: js.UndefOr[Boolean] = js.undefined,
    update: js.UndefOr[Boolean] = js.undefined
  ): SchedulerViewEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerViewEditable]
  }
}

