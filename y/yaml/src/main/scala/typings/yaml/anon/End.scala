package typings.yaml.anon

import typings.yaml.utilMod.LinePos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: LinePos
  var start: LinePos
}

object End {
  @scala.inline
  def apply(end: LinePos, start: LinePos): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

