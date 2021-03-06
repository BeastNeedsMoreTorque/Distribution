package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedAssertionResult extends js.Object {
  var ancestorTitles: js.Array[String]
  var failureMessages: js.Array[String] | Null
  var fullName: String
  var location: js.UndefOr[Callsite | Null] = js.undefined
  var status: Status
  var title: String
}

object FormattedAssertionResult {
  @scala.inline
  def apply(
    ancestorTitles: js.Array[String],
    fullName: String,
    status: Status,
    title: String,
    failureMessages: js.Array[String] = null,
    location: js.UndefOr[Null | Callsite] = js.undefined
  ): FormattedAssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], failureMessages = failureMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedAssertionResult]
  }
}

