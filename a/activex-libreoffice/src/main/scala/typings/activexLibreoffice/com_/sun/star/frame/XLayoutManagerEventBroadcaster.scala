package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from a layout manager.
  * @see com.sun.star.frame.LayoutManager
  * @since OOo 2.0
  */
trait XLayoutManagerEventBroadcaster extends XInterface {
  /**
    * adds a layout manager event listener to the object's listener list.
    * @param aLayoutManagerListener a listener that wants to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def addLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): Unit
  /**
    * removes a layout manager event listener from the object's listener list.
    * @param aLayoutManagerListener a listener that don't want to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def removeLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): Unit
}

object XLayoutManagerEventBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addLayoutManagerEventListener: XLayoutManagerListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLayoutManagerEventListener: XLayoutManagerListener => Unit
  ): XLayoutManagerEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addLayoutManagerEventListener = js.Any.fromFunction1(addLayoutManagerEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLayoutManagerEventListener = js.Any.fromFunction1(removeLayoutManagerEventListener))
    __obj.asInstanceOf[XLayoutManagerEventBroadcaster]
  }
}

