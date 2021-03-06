package typings.baseui.menuMod

import typings.baseui.anon.ChildMenuPopover
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionListProps extends BaseMenuPropsT {
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.undefined
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, ReactNode]] = js.undefined
  var item: js.Any
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.undefined
  var overrides: js.UndefOr[ChildMenuPopover] = js.undefined
  var renderHrefAsAnchor: js.UndefOr[Boolean] = js.undefined
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  var size: js.UndefOr[default_ | compact] = js.undefined
  def getItemLabel(item: js.Any): ReactNode
}

object OptionListProps {
  @scala.inline
  def apply(
    getItemLabel: js.Any => ReactNode,
    item: js.Any,
    $isFocused: js.UndefOr[Boolean] = js.undefined,
    $isHighlighted: js.UndefOr[Boolean] = js.undefined,
    getChildMenu: /* item */ js.Any => ReactNode = null,
    onMouseEnter: /* event */ MouseEvent => _ = null,
    overrides: ChildMenuPopover = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderHrefAsAnchor: js.UndefOr[Boolean] = js.undefined,
    resetMenu: () => Unit = null,
    size: default_ | compact = null
  ): OptionListProps = {
    val __obj = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item.asInstanceOf[js.Any])
    if (!js.isUndefined($isFocused)) __obj.updateDynamic("$isFocused")($isFocused.get.asInstanceOf[js.Any])
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted.get.asInstanceOf[js.Any])
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderHrefAsAnchor)) __obj.updateDynamic("renderHrefAsAnchor")(renderHrefAsAnchor.get.asInstanceOf[js.Any])
    if (resetMenu != null) __obj.updateDynamic("resetMenu")(js.Any.fromFunction0(resetMenu))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionListProps]
  }
}

