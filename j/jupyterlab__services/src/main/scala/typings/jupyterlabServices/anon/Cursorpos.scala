package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesNumbers.`0`
import typings.jupyterlabServices.jupyterlabServicesNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursorpos extends js.Object {
  var code: String
  var cursor_pos: Double
  var detail_level: `0` | `1`
}

object Cursorpos {
  @scala.inline
  def apply(code: String, cursor_pos: Double, detail_level: `0` | `1`): Cursorpos = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any], detail_level = detail_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursorpos]
  }
}

