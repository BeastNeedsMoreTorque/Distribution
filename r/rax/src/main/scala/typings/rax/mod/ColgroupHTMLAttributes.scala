package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColgroupHTMLAttributes[T] extends HTMLAttributes[T] {
  var span: js.UndefOr[Double] = js.undefined
}

object ColgroupHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, span: js.UndefOr[Double] = js.undefined): ColgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(span)) __obj.updateDynamic("span")(span.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColgroupHTMLAttributes[T]]
  }
}

