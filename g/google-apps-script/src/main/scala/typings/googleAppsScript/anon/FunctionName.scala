package typings.googleAppsScript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionName extends js.Object {
  var functionName: String
  var name: String
}

object FunctionName {
  @scala.inline
  def apply(functionName: String, name: String): FunctionName = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionName]
  }
}

