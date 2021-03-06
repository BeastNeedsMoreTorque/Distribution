package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolExitCode extends js.Object {
  /**
    * Tool execution exit code. A value of 0 means that the execution was successful.
    *
    * - In response: always set - In create/update request: always set
    */
  var number: js.UndefOr[Double] = js.undefined
}

object ToolExitCode {
  @scala.inline
  def apply(number: js.UndefOr[Double] = js.undefined): ToolExitCode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolExitCode]
  }
}

