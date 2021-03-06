package typings.reactIntl.injectIntlMod

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.reactIntl.anon.WrappedComponent
import typings.reactIntl.reactIntlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/injectIntl", JSImport.Default)
@js.native
object default_false extends js.Object {
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with (WrappedComponent[P, IntlPropName]) = js.native
}

