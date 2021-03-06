package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P /* <: js.Object */](`type`: String): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: String, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    children: RaxNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: RaxNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState]): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], children: RaxNode*): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P]): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], children: RaxNode*): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: RaxNode*): DOMElement[P, T] = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): RaxSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    children: RaxNode*
  ): RaxSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: RaxNode*
  ): RaxSVGElement = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C]): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], children: RaxNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: RaxNode*): CElement[P, T] = js.native
}

