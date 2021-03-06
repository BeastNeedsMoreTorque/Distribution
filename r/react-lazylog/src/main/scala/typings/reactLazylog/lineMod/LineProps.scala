package typings.reactLazylog.lineMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactLazylog.anon.Text
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends js.Object {
  var data: js.Array[Text]
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: Double
  var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  /**
    * This is never called
    * https://github.com/mozilla-frontend-infra/react-lazylog/issues/18
    */
  var onRowClick: js.UndefOr[js.Function0[_]] = js.undefined
  var rowHeight: Double
  var selectable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    data: js.Array[Text],
    number: Double,
    rowHeight: Double,
    formatPart: /* text */ String => ReactNode = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onLineNumberClick: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    onRowClick: () => _ = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): LineProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (onLineNumberClick != null) __obj.updateDynamic("onLineNumberClick")(js.Any.fromFunction1(onLineNumberClick))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction0(onRowClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
}

