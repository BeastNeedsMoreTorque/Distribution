package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to attach script events given by a sequence of {@link ScriptEventDescriptor} structures to a given interface. */
trait XEventAttacher extends XInterface {
  /**
    * registers the given "AllListener" object as a listener at the given interface by creating a suitable listener adapter and calling the "addListener"
    * method corresponding to the "ListenerType".
    */
  def attachListener(
    xTarget: XInterface,
    xAllListener: XAllListener,
    aHelper: js.Any,
    aListenerType: String,
    aAddListenerParam: String
  ): XEventListener
  /**
    * registers an object as a listener at the given interface by creating a suitable listener adapter and calling the method which corresponds to the
    * listener type.
    *
    * Only the event corresponding to the given event method will be delegated to **xAllListener** .
    */
  def attachSingleEventListener(
    xTarget: XInterface,
    xAllListener: XAllListener,
    aHelper: js.Any,
    aListenerType: String,
    aAddListenerParam: String,
    aEventMethod: String
  ): XEventListener
  /**
    * removes a listener object as a listener from the given interface.
    *
    * This method can and should be used as a contrary method to the two attach methods.
    */
  def removeListener(
    xTarget: XInterface,
    aListenerType: String,
    aRemoveListenerParam: String,
    xToRemoveListener: XEventListener
  ): Unit
}

object XEventAttacher {
  @scala.inline
  def apply(
    acquire: () => Unit,
    attachListener: (XInterface, XAllListener, js.Any, String, String) => XEventListener,
    attachSingleEventListener: (XInterface, XAllListener, js.Any, String, String, String) => XEventListener,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListener: (XInterface, String, String, XEventListener) => Unit
  ): XEventAttacher = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), attachListener = js.Any.fromFunction5(attachListener), attachSingleEventListener = js.Any.fromFunction6(attachSingleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction4(removeListener))
    __obj.asInstanceOf[XEventAttacher]
  }
}

