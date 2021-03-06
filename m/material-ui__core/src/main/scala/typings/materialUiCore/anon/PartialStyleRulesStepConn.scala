package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepConnector.StepConnectorClasskey>> */
@js.native
trait PartialStyleRulesStepConn extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.native
  var alternativeLabel: js.UndefOr[CSSProperties] = js.native
  var completed: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var horizontal: js.UndefOr[CSSProperties] = js.native
  var line: js.UndefOr[CSSProperties] = js.native
  var lineHorizontal: js.UndefOr[CSSProperties] = js.native
  var lineVertical: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var vertical: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesStepConn {
  @scala.inline
  def apply(
    active: CSSProperties = null,
    alternativeLabel: CSSProperties = null,
    completed: CSSProperties = null,
    disabled: CSSProperties = null,
    horizontal: CSSProperties = null,
    line: CSSProperties = null,
    lineHorizontal: CSSProperties = null,
    lineVertical: CSSProperties = null,
    root: CSSProperties = null,
    vertical: CSSProperties = null
  ): PartialStyleRulesStepConn = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alternativeLabel != null) __obj.updateDynamic("alternativeLabel")(alternativeLabel.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineHorizontal != null) __obj.updateDynamic("lineHorizontal")(lineHorizontal.asInstanceOf[js.Any])
    if (lineVertical != null) __obj.updateDynamic("lineVertical")(lineVertical.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesStepConn]
  }
}

