package typings.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  var form: js.Array[String]
  var json: js.Array[String]
  var text: js.Array[String]
}

object Form {
  @scala.inline
  def apply(form: js.Array[String], json: js.Array[String], text: js.Array[String]): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
}

