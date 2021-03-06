package typings.antdMobile.menuPropsTypeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataItem
  extends /* key */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DataItem {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    value: js.Any = null
  ): DataItem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItem]
  }
}

