package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for dialogs within the  ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorDialogBase")
@js.native
class ASPxClientHtmlEditorDialogBase ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "Cancel" button in the Html Editor's dialogs.
    */
  /* CompleteClass */
  override def GetCancelButton(): typings.devexpressWeb.ASPxClientButton = js.native
  /**
    * Provides access to the client ASPxFormLayout object that arranges all editors in the Html Editor's dialogs.
    */
  /* CompleteClass */
  override def GetFormLayout(): typings.devexpressWeb.ASPxClientFormLayout = js.native
  /**
    * Provides access to the client object of the "OK" button in the Html Editor's dialogs.
    */
  /* CompleteClass */
  override def GetOkButton(): typings.devexpressWeb.ASPxClientButton = js.native
}

