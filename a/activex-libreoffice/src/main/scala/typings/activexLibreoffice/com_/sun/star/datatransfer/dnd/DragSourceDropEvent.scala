package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link DragSourceDropEvent} is delivered from an object that implements {@link XDragSourceContext} to its currently registered drag source
  * listener's.
  *
  * It contains sufficient information for the originator of the operation to provide appropriate feedback to the end user when the operation completes.
  * @see com.sun.star.datatransfer.dnd.XDragSourceListener
  */
trait DragSourceDropEvent extends DragSourceEvent {
  /**
    * The action performed by the target on the subject of the drop.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: Double
  /** Indicates if the drop was successful. */
  var DropSuccess: Boolean
}

object DragSourceDropEvent {
  @scala.inline
  def apply(
    DragSource: XDragSource,
    DragSourceContext: XDragSourceContext,
    DropAction: Double,
    DropSuccess: Boolean,
    Source: XInterface
  ): DragSourceDropEvent = {
    val __obj = js.Dynamic.literal(DragSource = DragSource.asInstanceOf[js.Any], DragSourceContext = DragSourceContext.asInstanceOf[js.Any], DropAction = DropAction.asInstanceOf[js.Any], DropSuccess = DropSuccess.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSourceDropEvent]
  }
}

