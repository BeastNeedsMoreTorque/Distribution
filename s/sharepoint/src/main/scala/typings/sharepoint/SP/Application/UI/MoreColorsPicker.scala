package typings.sharepoint.SP.Application.UI

import typings.microsoftAjax.Sys.UI.Control
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoreColorsPicker extends Control {
  def get_colorValue(): String
  def set_colorValue(value: String): Unit
}

object MoreColorsPicker {
  @scala.inline
  def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    beginUpdate: () => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_colorValue: () => String,
    get_element: () => HTMLElement,
    get_events: () => js.Any,
    get_id: () => String,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    initialize: () => Unit,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raisePropertyChanged: String => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    set_colorValue: String => Unit,
    set_id: String => Unit,
    toggleCssClass: String => Unit,
    updated: () => Unit
  ): MoreColorsPicker = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_colorValue = js.Any.fromFunction0(get_colorValue), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), initialize = js.Any.fromFunction0(initialize), onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), set_colorValue = js.Any.fromFunction1(set_colorValue), set_id = js.Any.fromFunction1(set_id), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[MoreColorsPicker]
  }
}

