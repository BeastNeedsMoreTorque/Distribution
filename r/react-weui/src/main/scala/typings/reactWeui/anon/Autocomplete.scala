package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autocomplete extends js.Object {
  var autocomplete: String
  var lang: Cancel
  var onCancel: js.Any
  var onChange: js.Any
  var onClear: js.Any
  var onSubmit: js.Any
  var placeholder: String
  var searchName: String
}

object Autocomplete {
  @scala.inline
  def apply(
    autocomplete: String,
    lang: Cancel,
    onCancel: js.Any,
    onChange: js.Any,
    onClear: js.Any,
    onSubmit: js.Any,
    placeholder: String,
    searchName: String
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClear = onClear.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], searchName = searchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autocomplete]
  }
}

