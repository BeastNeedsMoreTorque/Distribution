package typings.serveHandler.mod

import typings.serveHandler.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var headers: js.Array[Key]
  var source: String
}

object Header {
  @scala.inline
  def apply(headers: js.Array[Key], source: String): Header = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

