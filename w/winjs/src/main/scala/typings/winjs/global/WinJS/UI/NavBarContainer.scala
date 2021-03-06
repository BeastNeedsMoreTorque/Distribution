package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a group of NavBarCommand objects in a NavBar.
  **/
@JSGlobal("WinJS.UI.NavBarContainer")
@js.native
//#region Constructors
/**
  * Creates a new NavBarContainer.
  * @constructor
  * @param element The DOM element hosts the new NavBarContainer.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class NavBarContainer ()
  extends typings.winjs.WinJS.UI.NavBarContainer {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSGlobal("WinJS.UI.NavBarContainer")
@js.native
object NavBarContainer extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

