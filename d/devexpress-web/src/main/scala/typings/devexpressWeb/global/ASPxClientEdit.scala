package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientControlPredicate
import typings.devexpressWeb.ASPxClientEditValidationEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientProcessingModeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base object for all the editors that support validation.
  */
@JSGlobal("ASPxClientEdit")
@js.native
class ASPxClientEdit ()
  extends typings.devexpressWeb.ASPxClientEdit {
  /**
    * Fires on the client side when the editor receives input focus.
    */
  /* CompleteClass */
  override var GotFocus: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientEdit]] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Fires on the client side when the editor loses input focus.
    */
  /* CompleteClass */
  override var LostFocus: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientEdit]] = js.native
  /**
    * Allows you to specify whether the value entered into the editor is valid, and whether the editor is allowed to lose focus.
    */
  /* CompleteClass */
  override var Validation: typings.devexpressWeb.ASPxClientEvent[ASPxClientEditValidationEventHandler[typings.devexpressWeb.ASPxClientEdit]] = js.native
  /**
    * Fires after the editor's value has been changed by end-user interactions.
    */
  /* CompleteClass */
  override var ValueChanged: typings.devexpressWeb.ASPxClientEvent[ASPxClientProcessingModeEventHandler[typings.devexpressWeb.ASPxClientEdit]] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Sets input focus to the editor.
    */
  /* CompleteClass */
  override def Focus(): Unit = js.native
  /**
    * Returns the text displayed in the editor caption.
    */
  /* CompleteClass */
  override def GetCaption(): String = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  /**
    * Returns a value indicating whether an editor is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  /**
    * Gets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  /* CompleteClass */
  override def GetErrorText(): String = js.native
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  /**
    * Returns an HTML element that represents the control's input element.
    */
  /* CompleteClass */
  override def GetInputElement(): js.Any = js.native
  /**
    * Gets a value that indicates whether the editor's value passes validation.
    */
  /* CompleteClass */
  override def GetIsValid(): Boolean = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  /**
    * Returns a value indicating whether the editor's state is read-only on the client-side.
    */
  /* CompleteClass */
  override def GetReadOnly(): Boolean = js.native
  /**
    * Returns the editor's value.
    */
  /* CompleteClass */
  override def GetValue(): js.Any = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /**
    * Specifies the text displayed in the editor caption.
    * @param caption A string value specifying the editor caption.
    */
  /* CompleteClass */
  override def SetCaption(caption: String): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies whether an editor is enabled.
    * @param value true to enable the editor; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    * @param errorText A string value representing the error text.
    */
  /* CompleteClass */
  override def SetErrorText(errorText: String): Unit = js.native
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  /**
    * Sets a value that specifies whether the editor's value is valid.
    * @param isValid True if the editor's value is valid; otherwise, False.
    */
  /* CompleteClass */
  override def SetIsValid(isValid: Boolean): Unit = js.native
  /**
    * Specifies whether the control's state is read-only on the client side.
    * @param readOnly true, to make the control read-only on the client side; otherwise, false.
    */
  /* CompleteClass */
  override def SetReadOnly(readOnly: Boolean): Unit = js.native
  /**
    * Changes the editor's value.
    * @param value An object representing the data to be assigned to the editor's edit value.
    */
  /* CompleteClass */
  override def SetValue(value: js.Any): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  /**
    * Performs the editor's validation.
    */
  /* CompleteClass */
  override def Validate(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientEdit")
@js.native
object ASPxClientEdit extends js.Object {
  /**
    * Verifies whether the editors in a specified visibility state, which are located within a specified container and belong to a specific validation group, are valid. true if the editors are valid; otherwise, false.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param checkInvisibleEditors true to check both visible and invisible editors that belong to the specified container; false to check only visible editors.
    */
  def AreEditorsValid(): Boolean = js.native
  def AreEditorsValid(container: String): Boolean = js.native
  def AreEditorsValid(container: String, validationGroup: String): Boolean = js.native
  def AreEditorsValid(container: String, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = js.native
  def AreEditorsValid(container: js.Any): Boolean = js.native
  def AreEditorsValid(container: js.Any, validationGroup: String): Boolean = js.native
  def AreEditorsValid(container: js.Any, validationGroup: String, checkInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Attaches a handler to the ASPxClientEdit's event indicating whether the editor has been changed since the previous state.
    * @param handler An object representing a handler.
    * @param predicate An ASPxClientControlPredicate object representing the predicate criteria.
    */
  def AttachEditorModificationListener(handler: js.Any, predicate: ASPxClientControlPredicate): Unit = js.native
  /**
    * Assigns a null value to all editors in a specified visibility state, which are located within a specified container and belong to a specific validation group.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value specifying the validation group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified container and group; false to clear only visible editors.
    */
  def ClearEditorsInContainer(container: js.Any): Unit = js.native
  def ClearEditorsInContainer(container: js.Any, validationGroup: String): Unit = js.native
  def ClearEditorsInContainer(container: js.Any, validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Assigns a null value to all editors which are located within the specified container object, and belonging to a specific validation group, dependent on the visibility state specified.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value specifying the validatiion group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified container and group; false to clear only visible editors.
    */
  def ClearEditorsInContainerById(containerId: String): Unit = js.native
  def ClearEditorsInContainerById(containerId: String, validationGroup: String): Unit = js.native
  def ClearEditorsInContainerById(containerId: String, validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Assigns a null value to all editors which belong to a specific validation group, dependent on the visibility state specified.
    * @param validationGroup A string value specifying the validation group's name.
    * @param clearInvisibleEditors true to clear both visible and invisible editors that belong to the specified validation group; false to clear only visible editors.
    */
  def ClearGroup(validationGroup: String): Unit = js.native
  def ClearGroup(validationGroup: String, clearInvisibleEditors: Boolean): Unit = js.native
  /**
    * Detaches a handler from the editor's event if the editor meets the predicate criteria.
    * @param handler An object representing a handler.
    * @param predicate An ASPxClientControlPredicate object representing a predicate criteria.
    */
  def DetachEditorModificationListener(handler: js.Any, predicate: ASPxClientControlPredicate): Unit = js.native
  /**
    * Performs validation of all editors in a specified visibility state, which are located within a specified container and belong to a specific validation group. true if the specified editors pass validation; otherwise, false.
    * @param container An HTML element specifying the container of editors to be validated.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified container and group; false to validate only visible editors.
    */
  def ValidateEditorsInContainer(container: js.Any): Boolean = js.native
  def ValidateEditorsInContainer(container: js.Any, validationGroup: String): Boolean = js.native
  def ValidateEditorsInContainer(container: js.Any, validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Performs validation of the editors which are located within the specified container and belong to a specific validation group, dependent on the visibility state specified. true if the specified editors pass validation; otherwise, false.
    * @param containerId A string value specifying the editor container's identifier.
    * @param validationGroup A string value that specifies the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified container and group; false to validate only visible editors.
    */
  def ValidateEditorsInContainerById(containerId: String): Boolean = js.native
  def ValidateEditorsInContainerById(containerId: String, validationGroup: String): Boolean = js.native
  def ValidateEditorsInContainerById(containerId: String, validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
  /**
    * Performs validation of editors contained within the specified validation group, dependent on the editor visibility state specified. true if editors of the specified validation group pass validation; otherwise, false.
    * @param validationGroup A string value specifying the validation group's name.
    * @param validateInvisibleEditors true to validate both visible and invisible editors that belong to the specified validation group; false to validate only visible editors.
    */
  def ValidateGroup(validationGroup: String): Boolean = js.native
  def ValidateGroup(validationGroup: String, validateInvisibleEditors: Boolean): Boolean = js.native
}

