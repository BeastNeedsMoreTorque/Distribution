package typings.gestalt.mod

import typings.gestalt.anon.EventValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: String
  var name: js.UndefOr[String] = js.undefined
  var switched: js.UndefOr[Boolean] = js.undefined
  def onChange(args: EventValue): Unit
}

object SwitchProps {
  @scala.inline
  def apply(
    id: String,
    onChange: EventValue => Unit,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    switched: js.UndefOr[Boolean] = js.undefined
  ): SwitchProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(switched)) __obj.updateDynamic("switched")(switched.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

