package typings.primereact.dataScrollerMod

import typings.primereact.anon.First
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataScrollerProps extends js.Object {
  var buffer: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var loader: js.UndefOr[js.Any] = js.undefined
  var onLazyLoad: js.UndefOr[js.Function1[/* e */ First, Unit]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var scrollHeight: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataScrollerProps {
  @scala.inline
  def apply(
    buffer: js.UndefOr[Double] = js.undefined,
    className: String = null,
    footer: js.Any = null,
    header: js.Any = null,
    id: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: /* item */ js.Any => js.UndefOr[Element] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    loader: js.Any = null,
    onLazyLoad: /* e */ First => Unit = null,
    rows: js.UndefOr[Double] = js.undefined,
    scrollHeight: js.Any = null,
    style: js.Object = null,
    value: js.Array[_] = null
  ): DataScrollerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (onLazyLoad != null) __obj.updateDynamic("onLazyLoad")(js.Any.fromFunction1(onLazyLoad))
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataScrollerProps]
  }
}

