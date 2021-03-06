package typings.psl.mod

import typings.psl.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
  var error: Code
  var input: String
}

object ParseError {
  @scala.inline
  def apply(error: Code, input: String): ParseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseError]
  }
}

