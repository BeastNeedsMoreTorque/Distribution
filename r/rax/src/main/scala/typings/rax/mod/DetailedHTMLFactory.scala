package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedHTMLFactory[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMFactory[P, T] {
  def apply(): DetailedRaxHTMLElement[P, T] = js.native
  def apply(children: RaxNode*): DetailedRaxHTMLElement[P, T] = js.native
  def apply(props: ClassAttributes[T] with P, children: RaxNode*): DetailedRaxHTMLElement[P, T] = js.native
}

