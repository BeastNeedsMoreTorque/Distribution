package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the state of a radio button and makes it possible to register item event listeners. */
trait XRadioButton extends XInterface {
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  var State: Boolean
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  def getState(): Boolean
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
  /** sets the label of the radio button. */
  def setLabel(Label: String): Unit
  /** sets the state of the radio button. */
  def setState(b: Boolean): Unit
}

object XRadioButton {
  @scala.inline
  def apply(
    State: Boolean,
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    getState: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit,
    setLabel: String => Unit,
    setState: Boolean => Unit
  ): XRadioButton = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[XRadioButton]
  }
}

