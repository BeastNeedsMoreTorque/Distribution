package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var backgroundImage: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    backgroundImage: String = null,
    borderColor: String = null,
    color: String = null,
    fill: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    fontWeight: String = null,
    height: js.UndefOr[Double] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    textAlign: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

