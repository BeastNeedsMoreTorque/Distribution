package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsTransform extends js.Object {
  var WebkitTransform: String
  var left: String
  var msTransform: String
  var position: String
  var top: Double
  var transform: String
}

object MsTransform {
  @scala.inline
  def apply(
    WebkitTransform: String,
    left: String,
    msTransform: String,
    position: String,
    top: Double,
    transform: String
  ): MsTransform = {
    val __obj = js.Dynamic.literal(WebkitTransform = WebkitTransform.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], msTransform = msTransform.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsTransform]
  }
}

