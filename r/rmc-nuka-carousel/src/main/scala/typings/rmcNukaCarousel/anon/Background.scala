package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: String
  var border: Double
  var color: String
  var cursor: String
  var opacity: Double
  var outline: Double
  var padding: Double
}

object Background {
  @scala.inline
  def apply(
    background: String,
    border: Double,
    color: String,
    cursor: String,
    opacity: Double,
    outline: Double,
    padding: Double
  ): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

