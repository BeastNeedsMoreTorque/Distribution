package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
@JSGlobal("MVCxClientGlobalBeginCallbackEventArgs")
@js.native
class MVCxClientGlobalBeginCallbackEventArgs protected ()
  extends typings.devexpressWeb.MVCxClientGlobalBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the MVCxClientGlobalBeginCallbackEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param command A string value that is the name of the command that initiated a callback.
    */
  def this(control: typings.devexpressWeb.ASPxClientControl, command: String) = this()
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  /* CompleteClass */
  override var command: String = js.native
  /**
    * Gets an object that initiated a callback.
    */
  /* CompleteClass */
  override var control: typings.devexpressWeb.ASPxClientControl = js.native
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  /* CompleteClass */
  override var customArgs: js.Any = js.native
}

