package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.`read-only`
import typings.awsLambda.awsLambdaStrings.base64
import typings.awsLambda.awsLambdaStrings.replace
import typings.awsLambda.awsLambdaStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: `read-only` | replace
  var data: String
  var encoding: base64 | text_
  val inputTruncated: Boolean
}

object Action {
  @scala.inline
  def apply(action: `read-only` | replace, data: String, encoding: base64 | text_, inputTruncated: Boolean): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], inputTruncated = inputTruncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

