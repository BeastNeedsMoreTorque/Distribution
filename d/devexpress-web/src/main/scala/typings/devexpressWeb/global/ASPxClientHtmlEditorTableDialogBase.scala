package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides base client functionality for the Table dialog within the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorTableDialogBase")
@js.native
class ASPxClientHtmlEditorTableDialogBase ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorTableDialogBase {
  /**
    * Provides access to the client object of the "Background color" color editor in the Html Editor's Table dialogs.
    */
  /* CompleteClass */
  override def GetBackgroundColorColorEdit(): typings.devexpressWeb.ASPxClientColorEdit = js.native
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

