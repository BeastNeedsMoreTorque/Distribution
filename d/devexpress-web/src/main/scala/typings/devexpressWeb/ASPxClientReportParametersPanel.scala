package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxClientDocumentViewer control's Parameters Panel.
  */
trait ASPxClientReportParametersPanel extends ASPxClientControl {
  /**
    * Assigns a value to a parameter of the report displayed in the document viewer.
    * @param path A System.String specifying the parameter's path.
    * @param value An object specifying the parameter value.
    */
  def AssignParameter(path: String, value: js.Any): Unit
  /**
    * Assigns a value to a parameter of the report displayed in the document viewer.
    * @param parametersInfo An array of ASPxClientReportParameterInfo values specifying parameters and values to assign.
    */
  def AssignParameters(parametersInfo: js.Array[ASPxClientReportParameterInfo]): Unit
  /**
    * Returns a value editor that is associated with a parameter with the specified name. An editor.
    * @param parameterName A String value, specifying the parameter name.
    */
  def GetEditorByParameterName(parameterName: String): ASPxClientControl
  /**
    * Returns an array storing the names of parameters available in a report.
    */
  def GetParameterNames(): js.Array[String]
}

object ASPxClientReportParametersPanel {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    AssignParameter: (String, js.Any) => Unit,
    AssignParameters: js.Array[ASPxClientReportParameterInfo] => Unit,
    GetClientVisible: () => Boolean,
    GetEditorByParameterName: String => ASPxClientControl,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParameterNames: () => js.Array[String],
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientReportParametersPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AssignParameter = js.Any.fromFunction2(AssignParameter), AssignParameters = js.Any.fromFunction1(AssignParameters), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEditorByParameterName = js.Any.fromFunction1(GetEditorByParameterName), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParameterNames = js.Any.fromFunction0(GetParameterNames), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportParametersPanel]
  }
}

