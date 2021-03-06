package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side ASPxClientScheduler.Shortcut event.
  */
@JSGlobal("ShortcutEventArgs")
@js.native
class ShortcutEventArgs protected ()
  extends typings.devexpressWeb.ShortcutEventArgs {
  /**
    * Initialize a new instance of the class.
    * @param commandName Specifies the command name.
    * @param htmlEvent Specifies the html event.
    */
  def this(commandName: String, htmlEvent: js.Any) = this()
  /**
    * Gets the name of a command associated with the keyboard shortcut.
    */
  /* CompleteClass */
  override var commandName: String = js.native
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Gets an object containing information about a keyboard shortcut event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
}

