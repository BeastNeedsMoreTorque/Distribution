package typings.apostrophe.anon

import typings.apostrophe.mod.AposObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  def form(
    req: js.Any,
    data: js.Any,
    name: String,
    `object`: AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): Unit
  def string(
    req: js.Any,
    data: js.Any,
    name: String,
    `object`: AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): Unit
}

object Form {
  @scala.inline
  def apply(
    form: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit,
    string: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit
  ): Form = {
    val __obj = js.Dynamic.literal(form = js.Any.fromFunction6(form), string = js.Any.fromFunction6(string))
    __obj.asInstanceOf[Form]
  }
}

