package typings.mobxReactDevtools.mod

import typings.mobxReactDevtools.anon.Bottom
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.bottomLeft
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.bottomRight
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.topLeft
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.topRight
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDevToolProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var highlightTimeout: js.UndefOr[Double] = js.undefined
  var noPanel: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[topRight | bottomRight | bottomLeft | topLeft | Bottom] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object IDevToolProps {
  @scala.inline
  def apply(
    className: String = null,
    highlightTimeout: js.UndefOr[Double] = js.undefined,
    noPanel: js.UndefOr[Boolean] = js.undefined,
    position: topRight | bottomRight | bottomLeft | topLeft | Bottom = null,
    style: CSSProperties = null
  ): IDevToolProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightTimeout)) __obj.updateDynamic("highlightTimeout")(highlightTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noPanel)) __obj.updateDynamic("noPanel")(noPanel.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDevToolProps]
  }
}

