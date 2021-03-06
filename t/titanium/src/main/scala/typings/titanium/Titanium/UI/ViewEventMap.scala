package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewEventMap extends ProxyEventMap {
  var click: ViewClickEvent
  var dblclick: ViewDblclickEvent
  var doubletap: ViewDoubletapEvent
  var focus: ViewFocusEvent
  var keypressed: ViewKeypressedEvent
  var longclick: ViewLongclickEvent
  var longpress: ViewLongpressEvent
  var pinch: ViewPinchEvent
  var postlayout: ViewPostlayoutEvent
  var singletap: ViewSingletapEvent
  var swipe: ViewSwipeEvent
  var touchcancel: ViewTouchcancelEvent
  var touchend: ViewTouchendEvent
  var touchmove: ViewTouchmoveEvent
  var touchstart: ViewTouchstartEvent
  var twofingertap: ViewTwofingertapEvent
}

object ViewEventMap {
  @scala.inline
  def apply(
    click: ViewClickEvent,
    dblclick: ViewDblclickEvent,
    doubletap: ViewDoubletapEvent,
    focus: ViewFocusEvent,
    keypressed: ViewKeypressedEvent,
    longclick: ViewLongclickEvent,
    longpress: ViewLongpressEvent,
    pinch: ViewPinchEvent,
    postlayout: ViewPostlayoutEvent,
    singletap: ViewSingletapEvent,
    swipe: ViewSwipeEvent,
    touchcancel: ViewTouchcancelEvent,
    touchend: ViewTouchendEvent,
    touchmove: ViewTouchmoveEvent,
    touchstart: ViewTouchstartEvent,
    twofingertap: ViewTwofingertapEvent
  ): ViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewEventMap]
  }
}

