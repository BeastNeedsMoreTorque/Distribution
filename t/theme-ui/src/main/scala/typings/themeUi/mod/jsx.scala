package typings.themeUi.mod

import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.SVGAttributes
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.SVGElement
import typings.themeUi.themeUiStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theme-ui", "jsx")
@js.native
object jsx extends js.Object {
  def apply(`type`: input): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(`type`: input, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply[P /* <: js.Object */](`type`: String): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: String, children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState]): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P]): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    children: ReactNode*
  ): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): ReactSVGElement = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C]): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], children: ReactNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactNode*): CElement[P, T] = js.native
}

