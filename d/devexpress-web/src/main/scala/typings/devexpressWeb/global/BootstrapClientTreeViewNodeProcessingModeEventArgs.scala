package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events related to node processing, and allowing the event's processing to be passed to the server side.
  */
@JSGlobal("BootstrapClientTreeViewNodeProcessingModeEventArgs")
@js.native
class BootstrapClientTreeViewNodeProcessingModeEventArgs protected ()
  extends typings.devexpressWeb.BootstrapClientTreeViewNodeProcessingModeEventArgs {
  /**
    * Initializes a new instance of the BootstrapClientTreeViewNodeProcessingModeEventArgs class with the specified setting.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param node An BootstrapClientTreeViewNode object representing the node related to the event.
    */
  def this(processOnServer: Boolean, node: typings.devexpressWeb.BootstrapClientTreeViewNode) = this()
  /**
    * Gets a node object related to the event.
    */
  /* CompleteClass */
  override var node: typings.devexpressWeb.BootstrapClientTreeViewNode = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

