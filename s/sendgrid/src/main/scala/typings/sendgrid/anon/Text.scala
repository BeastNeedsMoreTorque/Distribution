package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var enable: Boolean
  var html: String
  var text: String
}

object Text {
  @scala.inline
  def apply(enable: Boolean, html: String, text: String): Text = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

