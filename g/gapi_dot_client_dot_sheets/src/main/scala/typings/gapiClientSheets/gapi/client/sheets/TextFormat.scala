package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFormat extends js.Object {
  /** True if the text is bold. */
  var bold: js.UndefOr[Boolean] = js.undefined
  /** The font family. */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** The size of the font. */
  var fontSize: js.UndefOr[Double] = js.undefined
  /** The foreground color of the text. */
  var foregroundColor: js.UndefOr[Color] = js.undefined
  /**
    * The foreground color of the text.
    * If foreground_color is also set, this field takes precedence.
    */
  var foregroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** True if the text is italicized. */
  var italic: js.UndefOr[Boolean] = js.undefined
  /** True if the text has a strikethrough. */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  /** True if the text is underlined. */
  var underline: js.UndefOr[Boolean] = js.undefined
}

object TextFormat {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    foregroundColor: Color = null,
    foregroundColorStyle: ColorStyle = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): TextFormat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (foregroundColorStyle != null) __obj.updateDynamic("foregroundColorStyle")(foregroundColorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.get.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFormat]
  }
}

