package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  var bottom: Double
  var fight: Double
  var left: Double
  var top: Double
}

object Bottom {
  @scala.inline
  def apply(bottom: Double, fight: Double, left: Double, top: Double): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fight = fight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

