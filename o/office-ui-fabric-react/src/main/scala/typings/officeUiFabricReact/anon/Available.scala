package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Available extends js.Object {
  var available: String
  var away: String
  var background: String
  var busy: String
  var dnd: String
  var offline: String
  var oof: String
}

object Available {
  @scala.inline
  def apply(
    available: String,
    away: String,
    background: String,
    busy: String,
    dnd: String,
    offline: String,
    oof: String
  ): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], away = away.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], busy = busy.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], oof = oof.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
}

