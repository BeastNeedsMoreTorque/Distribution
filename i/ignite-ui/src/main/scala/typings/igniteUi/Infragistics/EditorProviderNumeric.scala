package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProviderNumeric extends js.Object {
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit
  def destroy(): Unit
  def getValue(): Unit
  def isValid(): Unit
  def refreshValue(): Unit
  def removeFromParent(): Unit
  def setFocus(): Unit
  def setSize(width: js.Object, height: js.Object): Unit
  def textChanged(evt: js.Object, ui: js.Object): Unit
  def validator(): Unit
}

object EditorProviderNumeric {
  @scala.inline
  def apply(
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getValue: () => Unit,
    isValid: () => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    setFocus: () => Unit,
    setSize: (js.Object, js.Object) => Unit,
    textChanged: (js.Object, js.Object) => Unit,
    validator: () => Unit
  ): EditorProviderNumeric = {
    val __obj = js.Dynamic.literal(createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), getValue = js.Any.fromFunction0(getValue), isValid = js.Any.fromFunction0(isValid), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), setFocus = js.Any.fromFunction0(setFocus), setSize = js.Any.fromFunction2(setSize), textChanged = js.Any.fromFunction2(textChanged), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[EditorProviderNumeric]
  }
}

