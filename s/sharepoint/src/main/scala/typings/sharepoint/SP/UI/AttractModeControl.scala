package typings.sharepoint.SP.UI

import typings.microsoftAjax.Sys.UI.Control
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttractModeControl extends Control {
  var cssAttractMode: String
  var cssAttractModeBackground: String
  var cssAttractModeCell: String
  var cssAttractModeIcon: String
  var cssAttractModeText: String
  var cssAttractModeWrapper: String
  var defaultAttractModeIcon: String
  def get_imageElement(): js.Any
  def get_textElement(): HTMLElement
}

object AttractModeControl {
  @scala.inline
  def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    beginUpdate: () => Unit,
    cssAttractMode: String,
    cssAttractModeBackground: String,
    cssAttractModeCell: String,
    cssAttractModeIcon: String,
    cssAttractModeText: String,
    cssAttractModeWrapper: String,
    defaultAttractModeIcon: String,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_element: () => HTMLElement,
    get_events: () => js.Any,
    get_id: () => String,
    get_imageElement: () => js.Any,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_textElement: () => HTMLElement,
    initialize: () => Unit,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raisePropertyChanged: String => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    set_id: String => Unit,
    toggleCssClass: String => Unit,
    updated: () => Unit
  ): AttractModeControl = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), cssAttractMode = cssAttractMode.asInstanceOf[js.Any], cssAttractModeBackground = cssAttractModeBackground.asInstanceOf[js.Any], cssAttractModeCell = cssAttractModeCell.asInstanceOf[js.Any], cssAttractModeIcon = cssAttractModeIcon.asInstanceOf[js.Any], cssAttractModeText = cssAttractModeText.asInstanceOf[js.Any], cssAttractModeWrapper = cssAttractModeWrapper.asInstanceOf[js.Any], defaultAttractModeIcon = defaultAttractModeIcon.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_imageElement = js.Any.fromFunction0(get_imageElement), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_textElement = js.Any.fromFunction0(get_textElement), initialize = js.Any.fromFunction0(initialize), onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), set_id = js.Any.fromFunction1(set_id), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[AttractModeControl]
  }
}

