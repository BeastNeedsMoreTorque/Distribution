package typings.reactFlex.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps
  extends Props[Flex]
     with CommonFlexProps

object FlexProps {
  @scala.inline
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    children: ReactNode = null,
    column: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    flex: Double | String | Boolean = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    justifyContent: String = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[Flex]] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

