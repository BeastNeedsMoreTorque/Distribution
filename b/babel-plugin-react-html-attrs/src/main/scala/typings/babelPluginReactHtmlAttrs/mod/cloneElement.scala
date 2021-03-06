package typings.babelPluginReactHtmlAttrs.mod

import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-plugin-react-html-attrs", "cloneElement")
@js.native
object cloneElement extends js.Object {
  // Custom components
  def apply[P](element: FunctionComponentElement[P]): FunctionComponentElement[P] = js.native
  def apply[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P](element: ReactElement[P, String | JSXElementConstructor[_]]): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P](
    element: ReactElement[P, String | JSXElementConstructor[_]],
    props: Partial[P] with Attributes,
    children: ReactNode*
  ): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T]): CElement[P, T] = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T]): DOMElement[P, T] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  // ReactHTMLElement, less specific
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T]): ReactHTMLElement[T] = js.native
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = js.native
  // SVGElement
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = js.native
}

