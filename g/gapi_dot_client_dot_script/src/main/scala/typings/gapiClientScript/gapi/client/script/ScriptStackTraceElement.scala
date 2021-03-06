package typings.gapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptStackTraceElement extends js.Object {
  /** The name of the function that failed. */
  var function: js.UndefOr[String] = js.undefined
  /** The line number where the script failed. */
  var lineNumber: js.UndefOr[Double] = js.undefined
}

object ScriptStackTraceElement {
  @scala.inline
  def apply(function: String = null, lineNumber: js.UndefOr[Double] = js.undefined): ScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptStackTraceElement]
  }
}

