package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorizerElementOptions extends IColorizerOptions {
  var mimeType: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object IColorizerElementOptions {
  @scala.inline
  def apply(mimeType: String = null, tabSize: js.UndefOr[Double] = js.undefined, theme: String = null): IColorizerElementOptions = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorizerElementOptions]
  }
}

