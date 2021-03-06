package typings.gestalt.mod

import typings.gestalt.anon.ActiveTabIndex
import typings.gestalt.anon.Href
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeTabIndex: Double
  var size: js.UndefOr[md | lg] = js.undefined
  var tabs: js.Array[Href]
  var wrap: js.UndefOr[Boolean] = js.undefined
  def onChange(args: ActiveTabIndex): Unit
}

object TabsProps {
  @scala.inline
  def apply(
    activeTabIndex: Double,
    onChange: ActiveTabIndex => Unit,
    tabs: js.Array[Href],
    size: md | lg = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

