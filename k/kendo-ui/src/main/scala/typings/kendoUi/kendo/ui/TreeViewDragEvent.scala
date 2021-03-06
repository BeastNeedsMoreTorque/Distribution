package typings.kendoUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDragEvent extends TreeViewEvent {
  var dropTarget: js.UndefOr[Element] = js.undefined
  var pageX: js.UndefOr[Double] = js.undefined
  var pageY: js.UndefOr[Double] = js.undefined
  var setStatusClass: js.UndefOr[js.Function] = js.undefined
  var sourceNode: js.UndefOr[Element] = js.undefined
  var statusClass: js.UndefOr[String] = js.undefined
}

object TreeViewDragEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeView,
    dropTarget: Element = null,
    pageX: js.UndefOr[Double] = js.undefined,
    pageY: js.UndefOr[Double] = js.undefined,
    setStatusClass: js.Function = null,
    sourceNode: Element = null,
    statusClass: String = null
  ): TreeViewDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY.get.asInstanceOf[js.Any])
    if (setStatusClass != null) __obj.updateDynamic("setStatusClass")(setStatusClass.asInstanceOf[js.Any])
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode.asInstanceOf[js.Any])
    if (statusClass != null) __obj.updateDynamic("statusClass")(statusClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragEvent]
  }
}

