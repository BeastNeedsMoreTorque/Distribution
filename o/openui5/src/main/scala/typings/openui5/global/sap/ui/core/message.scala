package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.message")
@js.native
object message extends js.Object {
  @js.native
  /**
    * Constructor for a new ControlMessageProcessor
    */
  class ControlMessageProcessor ()
    extends typings.openui5.sap.ui.core.message.ControlMessageProcessor
  
  @js.native
  class Message protected ()
    extends typings.openui5.sap.ui.core.message.Message {
    /**
      * Constructor for a new Message.
      * @param mParameters (optional) a map which contains the following parameter properties:
      */
    def this(mParameters: js.Any) = this()
  }
  
  @js.native
  /**
    * Constructor for a new MessageManager.
    */
  class MessageManager ()
    extends typings.openui5.sap.ui.core.message.MessageManager
  
  @js.native
  /**
    * Abstract MessageParser class to be inherited in back-end specific implementations.
    */
  abstract class MessageParser ()
    extends typings.openui5.sap.ui.core.message.MessageParser
  
  @js.native
  /**
    * Constructor for a new MessageProcessor
    */
  abstract class MessageProcessor ()
    extends typings.openui5.sap.ui.core.message.MessageProcessor
  
}

