package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.frame.XController2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to be notified of events happening in an {@link OfficeDocument} , and to cause notification of such events.
  *
  * This interface is the successor of the {@link XEventBroadcaster} interface, which should not be used anymore.
  * @see DocumentEvent
  * @since OOo 3.1
  */
trait XDocumentEventBroadcaster extends js.Object {
  /**
    * registers a listener which is notified about document events
    * @param Listener the listener to register. The behavior of the method is undefined this listener is `NULL` .
    */
  def addDocumentEventListener(Listener: XDocumentEventListener): Unit
  /**
    * causes the broadcaster to notify all registered listeners of the given event
    *
    * The method will create a {@link DocumentEvent} instance with the given parameters, and fill in the `Source` member (denoting the broadcaster) as
    * appropriate.
    *
    * Whether the actual notification happens synchronously or asynchronously is up to the implementor of this method. However, implementations are
    * encouraged to specify this, for the list of supported event types, in their service contract.
    *
    * Implementations might also decide to limit the list of allowed events (means event names) at their own discretion. Again, in this case they're
    * encouraged to document this in their service contract.
    * @param EventName the name of the event to be notified.
    * @param ViewController the view/controller which the event applies to. May be `NULL`
    * @param Supplement supplemental information related to the event.
    * @throws com::sun::star::lang::IllegalArgumentException if EventName is empty, or if EventName is not supported by the document implementation.
    * @throws com::sun::star::lang::NoSupportException if the broadcaster implementation does not supported broadcasting events induced externally. This is usu
    */
  def notifyDocumentEvent(EventName: String, ViewController: XController2, Supplement: js.Any): Unit
  /**
    * revokes a listener which has previously been registered to be notified about document events.
    * @param Listener the listener to revoke. The behavior of the method is undefined this listener is `NULL` .
    */
  def removeDocumentEventListener(Listener: XDocumentEventListener): Unit
}

object XDocumentEventBroadcaster {
  @scala.inline
  def apply(
    addDocumentEventListener: XDocumentEventListener => Unit,
    notifyDocumentEvent: (String, XController2, js.Any) => Unit,
    removeDocumentEventListener: XDocumentEventListener => Unit
  ): XDocumentEventBroadcaster = {
    val __obj = js.Dynamic.literal(addDocumentEventListener = js.Any.fromFunction1(addDocumentEventListener), notifyDocumentEvent = js.Any.fromFunction3(notifyDocumentEvent), removeDocumentEventListener = js.Any.fromFunction1(removeDocumentEventListener))
    __obj.asInstanceOf[XDocumentEventBroadcaster]
  }
}

