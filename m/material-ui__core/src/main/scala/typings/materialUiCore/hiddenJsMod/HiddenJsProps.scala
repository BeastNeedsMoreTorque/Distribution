package typings.materialUiCore.hiddenJsMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiddenJsProps extends js.Object {
  var initialWidth: js.UndefOr[Breakpoint] = js.native
  var lgDown: js.UndefOr[Boolean] = js.native
  var lgUp: js.UndefOr[Boolean] = js.native
  var mdDown: js.UndefOr[Boolean] = js.native
  var mdUp: js.UndefOr[Boolean] = js.native
  var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.native
  var smDown: js.UndefOr[Boolean] = js.native
  var smUp: js.UndefOr[Boolean] = js.native
  var xlDown: js.UndefOr[Boolean] = js.native
  var xlUp: js.UndefOr[Boolean] = js.native
  var xsDown: js.UndefOr[Boolean] = js.native
  var xsUp: js.UndefOr[Boolean] = js.native
}

object HiddenJsProps {
  @scala.inline
  def apply(
    initialWidth: Breakpoint = null,
    lgDown: js.UndefOr[Boolean] = js.undefined,
    lgUp: js.UndefOr[Boolean] = js.undefined,
    mdDown: js.UndefOr[Boolean] = js.undefined,
    mdUp: js.UndefOr[Boolean] = js.undefined,
    only: Breakpoint | js.Array[Breakpoint] = null,
    smDown: js.UndefOr[Boolean] = js.undefined,
    smUp: js.UndefOr[Boolean] = js.undefined,
    xlDown: js.UndefOr[Boolean] = js.undefined,
    xlUp: js.UndefOr[Boolean] = js.undefined,
    xsDown: js.UndefOr[Boolean] = js.undefined,
    xsUp: js.UndefOr[Boolean] = js.undefined
  ): HiddenJsProps = {
    val __obj = js.Dynamic.literal()
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(lgDown)) __obj.updateDynamic("lgDown")(lgDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lgUp)) __obj.updateDynamic("lgUp")(lgUp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mdDown)) __obj.updateDynamic("mdDown")(mdDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mdUp)) __obj.updateDynamic("mdUp")(mdUp.get.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(smDown)) __obj.updateDynamic("smDown")(smDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smUp)) __obj.updateDynamic("smUp")(smUp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xlDown)) __obj.updateDynamic("xlDown")(xlDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xlUp)) __obj.updateDynamic("xlUp")(xlUp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xsDown)) __obj.updateDynamic("xsDown")(xsDown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xsUp)) __obj.updateDynamic("xsUp")(xsUp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HiddenJsProps]
  }
}

