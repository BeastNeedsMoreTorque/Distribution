package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: String
  var field: String
  var resource: String
}

object Code {
  @scala.inline
  def apply(code: String, field: String, resource: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

