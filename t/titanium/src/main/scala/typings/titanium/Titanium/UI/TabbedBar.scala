package typings.titanium.Titanium.UI

import typings.titanium.BarItemType
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A button bar that maintains a selected state.
  */
@js.native
trait TabbedBar extends View {
  /**
    * Index of the currently selected button.
    */
  var index: Double = js.native
  /**
    * Array of labels for the tabbed bar.
    */
  var labels: js.Array[BarItemType | String] = js.native
  /**
    * Style of the tabbed bar.
    */
  var style: Double = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: TabbedBarClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: TabbedBarDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: TabbedBarDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: TabbedBarFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: TabbedBarKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: TabbedBarLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: TabbedBarLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: TabbedBarPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: TabbedBarPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: TabbedBarSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: TabbedBarSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: TabbedBarTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: TabbedBarTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: TabbedBarTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: TabbedBarTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: TabbedBarTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.TabbedBar.index> property.
    * @deprecated Access <Titanium.UI.TabbedBar.index> instead.
    */
  def getIndex(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TabbedBar.labels> property.
    * @deprecated Access <Titanium.UI.TabbedBar.labels> instead.
    */
  def getLabels(): js.Array[BarItemType | String] = js.native
  /**
    * Gets the value of the <Titanium.UI.TabbedBar.style> property.
    * @deprecated Access <Titanium.UI.TabbedBar.style> instead.
    */
  def getStyle(): Double = js.native
  /**
    * Sets the value of the <Titanium.UI.TabbedBar.index> property.
    * @deprecated Set the value using <Titanium.UI.TabbedBar.index> instead.
    */
  def setIndex(index: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabbedBar.labels> property.
    * @deprecated Set the value using <Titanium.UI.TabbedBar.labels> instead.
    */
  def setLabels(labels: js.Array[BarItemType | String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabbedBar.style> property.
    * @deprecated Set the value using <Titanium.UI.TabbedBar.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
}

