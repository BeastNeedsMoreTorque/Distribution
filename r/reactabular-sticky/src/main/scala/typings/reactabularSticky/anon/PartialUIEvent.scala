package typings.reactabularSticky.anon

import typings.std.EventTarget
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.UIEvent> */
trait PartialUIEvent extends js.Object {
  var AT_TARGET: js.UndefOr[Double] = js.undefined
  var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
  var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
  var NONE: js.UndefOr[Double] = js.undefined
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var cancelBubble: js.UndefOr[Boolean] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var composed: js.UndefOr[Boolean] = js.undefined
  var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.undefined
  var currentTarget: js.UndefOr[EventTarget] = js.undefined
  var defaultPrevented: js.UndefOr[Boolean] = js.undefined
  var detail: js.UndefOr[Double] = js.undefined
  var eventPhase: js.UndefOr[Double] = js.undefined
  var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
  var isTrusted: js.UndefOr[Boolean] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  var returnValue: js.UndefOr[Boolean] = js.undefined
  var srcElement: js.UndefOr[EventTarget] = js.undefined
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var target: js.UndefOr[EventTarget] = js.undefined
  var timeStamp: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[Window] = js.undefined
  var which: js.UndefOr[Double] = js.undefined
}

object PartialUIEvent {
  @scala.inline
  def apply(
    AT_TARGET: js.UndefOr[Double] = js.undefined,
    BUBBLING_PHASE: js.UndefOr[Double] = js.undefined,
    CAPTURING_PHASE: js.UndefOr[Double] = js.undefined,
    NONE: js.UndefOr[Double] = js.undefined,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelBubble: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    composedPath: () => js.Array[EventTarget] = null,
    currentTarget: EventTarget = null,
    defaultPrevented: js.UndefOr[Boolean] = js.undefined,
    detail: js.UndefOr[Double] = js.undefined,
    eventPhase: js.UndefOr[Double] = js.undefined,
    initEvent: /* type */ String => Unit = null,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    preventDefault: () => Unit = null,
    returnValue: js.UndefOr[Boolean] = js.undefined,
    srcElement: EventTarget = null,
    stopImmediatePropagation: () => Unit = null,
    stopPropagation: () => Unit = null,
    target: EventTarget = null,
    timeStamp: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    view: Window = null,
    which: js.UndefOr[Double] = js.undefined
  ): PartialUIEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AT_TARGET)) __obj.updateDynamic("AT_TARGET")(AT_TARGET.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BUBBLING_PHASE)) __obj.updateDynamic("BUBBLING_PHASE")(BUBBLING_PHASE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CAPTURING_PHASE)) __obj.updateDynamic("CAPTURING_PHASE")(CAPTURING_PHASE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NONE)) __obj.updateDynamic("NONE")(NONE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelBubble)) __obj.updateDynamic("cancelBubble")(cancelBubble.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (composedPath != null) __obj.updateDynamic("composedPath")(js.Any.fromFunction0(composedPath))
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPrevented)) __obj.updateDynamic("defaultPrevented")(defaultPrevented.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eventPhase)) __obj.updateDynamic("eventPhase")(eventPhase.get.asInstanceOf[js.Any])
    if (initEvent != null) __obj.updateDynamic("initEvent")(js.Any.fromFunction1(initEvent))
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted.get.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue.get.asInstanceOf[js.Any])
    if (srcElement != null) __obj.updateDynamic("srcElement")(srcElement.asInstanceOf[js.Any])
    if (stopImmediatePropagation != null) __obj.updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(stopImmediatePropagation))
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(timeStamp)) __obj.updateDynamic("timeStamp")(timeStamp.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(which)) __obj.updateDynamic("which")(which.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUIEvent]
  }
}

