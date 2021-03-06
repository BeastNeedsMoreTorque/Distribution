package typings.baseui.comboboxMod

import typings.baseui.anon.Input
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsT[OptionT] extends js.Object {
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var mapOptionToNode: js.UndefOr[js.Function1[/* hasIsSelectedOption */ js.Any, ReactNode]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* option */ OptionT | Null, _]] = js.undefined
  var options: OptionT
  var overrides: js.UndefOr[Input] = js.undefined
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.undefined
  var value: String
  def mapOptionToString(OptionT: js.Any): String
}

object PropsT {
  @scala.inline
  def apply[OptionT](
    mapOptionToString: js.Any => String,
    options: OptionT,
    value: String,
    autocomplete: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    mapOptionToNode: /* hasIsSelectedOption */ js.Any => ReactNode = null,
    name: String = null,
    onChange: (/* value */ String, /* option */ OptionT | Null) => _ = null,
    overrides: Input = null,
    size: compact | default_ | large_ | mini = null
  ): PropsT[OptionT] = {
    val __obj = js.Dynamic.literal(mapOptionToString = js.Any.fromFunction1(mapOptionToString), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(autocomplete)) __obj.updateDynamic("autocomplete")(autocomplete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (mapOptionToNode != null) __obj.updateDynamic("mapOptionToNode")(js.Any.fromFunction1(mapOptionToNode))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsT[OptionT]]
  }
}

