package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveDialog event.
  */
trait ASPxClientReportDesignerCustomizeSaveDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the Save dialog.
    */
  var Popup: ASPxDesignerSaveDialog
  /**
    * Customizes the Save dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit
}

object ASPxClientReportDesignerCustomizeSaveDialogEventArgs {
  @scala.inline
  def apply(Customize: (String, ASPxDesignerDialogModel) => Unit, Popup: ASPxDesignerSaveDialog): ASPxClientReportDesignerCustomizeSaveDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2(Customize), Popup = Popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeSaveDialogEventArgs]
  }
}

