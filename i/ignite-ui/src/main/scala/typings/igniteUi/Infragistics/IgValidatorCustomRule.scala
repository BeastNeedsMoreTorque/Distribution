package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgValidatorCustomRule extends js.Object {
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String
  def getMessageType(): Unit
  /**
    * Gets an errorMessage from either the rule or field/global options.
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): String
  def isValid(options: js.Object, value: js.Object): Unit
  def shouldRun(options: js.Object): Unit
}

object IgValidatorCustomRule {
  @scala.inline
  def apply(
    formatMessage: String => String,
    getMessageType: () => Unit,
    getRuleMessage: js.Object => String,
    isValid: (js.Object, js.Object) => Unit,
    shouldRun: js.Object => Unit
  ): IgValidatorCustomRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = js.Any.fromFunction0(getMessageType), getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction2(isValid), shouldRun = js.Any.fromFunction1(shouldRun))
    __obj.asInstanceOf[IgValidatorCustomRule]
  }
}

