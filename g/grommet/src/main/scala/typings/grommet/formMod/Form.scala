package typings.grommet.formMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.onChange
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FormHTMLAttributes
import typings.std.HTMLFormElement
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Form", "Form")
@js.native
class Form protected ()
  extends Component[
      FormProps[_] with (Omit[DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], onChange]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: FormProps[_] with (Omit[DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], onChange])) = this()
  def this(
    props: FormProps[_] with (Omit[DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], onChange]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Form", "Form")
@js.native
object Form
  extends TopLevel[TypedForm[js.Any]]

