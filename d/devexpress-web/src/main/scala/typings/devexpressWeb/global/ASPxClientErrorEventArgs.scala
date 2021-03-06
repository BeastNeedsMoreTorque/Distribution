package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.OnServerError, ASPxClientReportDesigner.OnServerError and ASPxClientQueryBuilder.OnServerError events.
  */
@JSGlobal("ASPxClientErrorEventArgs")
@js.native
class ASPxClientErrorEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientErrorEventArgs {
  /**
    * Initializes a new instance of the ASPxClientErrorEventArgs class with the specified settings.
    * @param error An object that provides information about a server-side error. This value is assigned to the Error property.
    */
  def this(error: js.Any) = this()
  /**
    * Provides access to information about a server-side error.
    */
  /* CompleteClass */
  override var Error: js.Any = js.native
}

