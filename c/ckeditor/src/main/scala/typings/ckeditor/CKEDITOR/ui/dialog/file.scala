package typings.ckeditor.CKEDITOR.ui.dialog

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait file extends labeledElement {
  def getAction(): String
  def registerEvents(definition: StringDictionary[js.Any]): file
  def reset(): Unit
  def setInitValue(): Unit
  def submit(): file
}

object file {
  @scala.inline
  def apply(
    accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
    accessKeyUp: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
    disable: () => Unit,
    enable: () => Unit,
    eventProcessors: js.Any,
    focus: () => js.UndefOr[uiElement],
    getAction: () => String,
    getDialog: () => typings.ckeditor.CKEDITOR.dialog,
    getElement: () => element,
    getInputElement: () => element,
    getLabel: () => String,
    getValue: () => js.Any,
    isChanged: () => Boolean,
    isEnabled: () => Boolean,
    isFocusable: () => Boolean,
    isVisible: () => Boolean,
    registerEvents: StringDictionary[js.Any] => file,
    reset: () => Unit,
    selectParentTab: () => uiElement,
    setInitValue: () => Unit,
    setValue: (js.Any, Boolean) => js.UndefOr[uiElement],
    setlabel: String => labeledElement,
    submit: () => file
  ): file = {
    val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction2(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getAction = js.Any.fromFunction0(getAction), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getLabel = js.Any.fromFunction0(getLabel), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), reset = js.Any.fromFunction0(reset), selectParentTab = js.Any.fromFunction0(selectParentTab), setInitValue = js.Any.fromFunction0(setInitValue), setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel), submit = js.Any.fromFunction0(submit))
    __obj.asInstanceOf[file]
  }
}

