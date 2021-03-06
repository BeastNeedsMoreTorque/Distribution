package typings.reduxForm.reduxFormMod

import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitHandler[FormData, P, ErrorType] extends js.Object {
  def apply(event: SyntheticEvent[_, Event]): Unit = js.native
  def apply(submit: FormSubmitHandler[FormData, P, ErrorType]): js.Any = js.native
  def apply(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: DecoratedFormProps[FormData, P, ErrorType]
  ): js.Any = js.native
  def apply(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: DecoratedFormProps[FormData, P, ErrorType],
    valid: Boolean
  ): js.Any = js.native
  def apply(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: DecoratedFormProps[FormData, P, ErrorType],
    valid: Boolean,
    asyncValidate: js.Any
  ): js.Any = js.native
  def apply(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: DecoratedFormProps[FormData, P, ErrorType],
    valid: Boolean,
    asyncValidate: js.Any,
    fields: js.Array[String]
  ): js.Any = js.native
}

