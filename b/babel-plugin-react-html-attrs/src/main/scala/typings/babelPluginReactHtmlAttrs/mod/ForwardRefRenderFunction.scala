package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardRefRenderFunction[T, P] extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  def apply(props: PropsWithChildren[P]): (ReactElement[_, String | JSXElementConstructor[_]]) | Null = js.native
  def apply(props: PropsWithChildren[P], ref: js.Function1[/* instance */ T | Null, Unit]): (ReactElement[_, String | JSXElementConstructor[_]]) | Null = js.native
  def apply(props: PropsWithChildren[P], ref: MutableRefObject[T | Null]): (ReactElement[_, String | JSXElementConstructor[_]]) | Null = js.native
}

