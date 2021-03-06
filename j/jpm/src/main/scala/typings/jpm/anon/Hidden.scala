package typings.jpm.anon

import typings.jpm.toolbarMod.Toolbar
import typings.jpm.toolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hidden extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[ToolbarItem]
  var onAttach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.undefined
  var onDetach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.undefined
  var title: String
}

object Hidden {
  @scala.inline
  def apply(
    items: js.Array[ToolbarItem],
    title: String,
    hidden: js.UndefOr[Boolean] = js.undefined,
    onAttach: /* toolbar */ Toolbar => _ = null,
    onDetach: /* toolbar */ Toolbar => _ = null,
    onHide: /* toolbar */ Toolbar => _ = null,
    onShow: /* toolbar */ Toolbar => _ = null
  ): Hidden = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1(onAttach))
    if (onDetach != null) __obj.updateDynamic("onDetach")(js.Any.fromFunction1(onDetach))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    __obj.asInstanceOf[Hidden]
  }
}

