package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  /**
    * The AppBar appears at the bottom of the main view
    **/
  var bottom: String
  /**
    * The AppBar appears at the top of the main view
    **/
  var top: String
}

object Bottom {
  @scala.inline
  def apply(bottom: String, top: String): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

