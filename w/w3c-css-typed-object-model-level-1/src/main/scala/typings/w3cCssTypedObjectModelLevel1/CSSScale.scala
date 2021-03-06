package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSScale extends CSSTransformComponent {
  var x: CSSNumberish
  var y: CSSNumberish
  var z: CSSNumberish
}

object CSSScale {
  @scala.inline
  def apply(is2D: Boolean, toMatrix: () => DOMMatrix, x: CSSNumberish, y: CSSNumberish, z: CSSNumberish): CSSScale = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSScale]
  }
}

