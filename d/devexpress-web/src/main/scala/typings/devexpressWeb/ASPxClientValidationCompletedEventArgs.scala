package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.ValidationCompleted client event that allows you to centrally validate user input within all DevExpress web controls to which validation is applied.
  */
trait ASPxClientValidationCompletedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a container object that holds the validated control(s).
    */
  var container: js.Any
  /**
    * Gets the first control (either visible or invisible) that hasn't passed the validation applied.
    */
  var firstInvalidControl: ASPxClientControl
  /**
    * Gets the first visible control that hasn't passed the validation applied.
    */
  var firstVisibleInvalidControl: ASPxClientControl
  /**
    * Gets a value that indicates whether validation has been applied to both visible and invisible controls.
    */
  var invisibleControlsValidated: Boolean
  /**
    * Gets a value specifying whether the validation has been completed successfully.
    */
  var isValid: Boolean
  /**
    * Gets the name of the validation group name to which validation has been applied.
    */
  var validationGroup: String
}

object ASPxClientValidationCompletedEventArgs {
  @scala.inline
  def apply(
    container: js.Any,
    firstInvalidControl: ASPxClientControl,
    firstVisibleInvalidControl: ASPxClientControl,
    invisibleControlsValidated: Boolean,
    isValid: Boolean,
    validationGroup: String
  ): ASPxClientValidationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], firstInvalidControl = firstInvalidControl.asInstanceOf[js.Any], firstVisibleInvalidControl = firstVisibleInvalidControl.asInstanceOf[js.Any], invisibleControlsValidated = invisibleControlsValidated.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], validationGroup = validationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientValidationCompletedEventArgs]
  }
}

