package typings.rcCascader.cascaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderOption
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[CascaderOption]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object CascaderOption {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: js.Array[CascaderOption] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    value: String | Double = null
  ): CascaderOption = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderOption]
  }
}

