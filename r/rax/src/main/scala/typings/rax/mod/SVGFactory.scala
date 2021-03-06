package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFactory extends DOMFactory[SVGAttributes[SVGElement], SVGElement] {
  def apply(): RaxSVGElement = js.native
  def apply(children: RaxNode*): RaxSVGElement = js.native
  def apply(props: ClassAttributes[SVGElement] with SVGAttributes[SVGElement], children: RaxNode*): RaxSVGElement = js.native
}

