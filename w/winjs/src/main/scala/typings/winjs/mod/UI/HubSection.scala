package typings.winjs.mod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section of a Hub.
  **/
@JSImport("winjs", "UI.HubSection")
@js.native
//#region Constructors
/**
  * Creates a new HubSection.
  * @constructor
  * @param element The DOM element hosts the new HubSection.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class HubSection ()
  extends typings.winjs.WinJS.UI.HubSection {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the HubSection control's content.
    **/
  /* CompleteClass */
  override var contentElement: HTMLElement = js.native
  /**
    * Gets the DOM element that hosts this HubSection.
    **/
  /* CompleteClass */
  override var element: HTMLElement = js.native
  /**
    * Gets or sets the header for this HubSection.
    **/
  /* CompleteClass */
  override var header: String = js.native
  /**
    * Gets a value that specifies whether the header is static.
    **/
  /* CompleteClass */
  override var isHeaderStatic: Boolean = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this HubSection. Call this method when the HubSection is no longer needed. After calling this method, the HubSection becomes unusable.
    **/
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSImport("winjs", "UI.HubSection")
@js.native
object HubSection extends js.Object {
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var isDeclarativeControlContainer: js.Any = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

