package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosed client event.
  */
@JSGlobal("ASPxClientHtmlEditorCustomDialogClosedEventArgs")
@js.native
class ASPxClientHtmlEditorCustomDialogClosedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorCustomDialogClosedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCustomDialogClosedEventArgs class with the specified settings.
    * @param name A string value that specifies the custom dialog's name. This value is assigned to the ASPxClientHtmlEditorCustomDialogEventArgs.name property.
    * @param status An object that specifies a status that is returned to the parent control when the custom dialog is closed. This value is assigned to the ASPxClientHtmlEditorCustomDialogCloseEventArgsBase.status property.
    * @param data An object that specifies the data that is returned to the parent control when the custom dialog is closed. This value is assigned to the ASPxClientHtmlEditorCustomDialogClosedEventArgs.data property.
    */
  def this(name: String, status: js.Any, data: js.Any) = this()
  /**
    * Gets an object associated with the closed dialog.
    */
  /* CompleteClass */
  override var data: js.Any = js.native
  /**
    * Gets the name that uniquely identifies the processed custom dialog.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the status of the closed custom dialog.
    */
  /* CompleteClass */
  override var status: js.Any = js.native
}

