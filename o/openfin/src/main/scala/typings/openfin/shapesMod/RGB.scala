package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends js.Object {
  var blue: Double
  var green: Double
  var red: Double
}

object RGB {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double): RGB = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGB]
  }
}

