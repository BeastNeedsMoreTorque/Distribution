package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientReportDesigner.SaveCommandExecuted event.
  */
@JSGlobal("MVCxClientReportDesignerSaveCommandExecutedEventArgs")
@js.native
class MVCxClientReportDesignerSaveCommandExecutedEventArgs protected ()
  extends typings.devexpressWeb.MVCxClientReportDesignerSaveCommandExecutedEventArgs {
  /**
    * Initializes a new instance of the MVCxClientReportDesignerSaveCommandExecutedEventArgs class with the specified settings.
    * @param result A string value that represents the result of server-side processing.
    */
  def this(result: String) = this()
  /**
    * Returns the operation result.
    */
  /* CompleteClass */
  override var Result: String = js.native
}

