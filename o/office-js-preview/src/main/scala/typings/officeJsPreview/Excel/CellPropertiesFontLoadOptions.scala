package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies which properties to load on the `format.font` object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFontLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `bold` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `italic` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `name` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `size` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `strikethrough` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `subscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `superscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `underline` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[Boolean] = js.undefined
}

object CellPropertiesFontLoadOptions {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    subscript: js.UndefOr[Boolean] = js.undefined,
    superscript: js.UndefOr[Boolean] = js.undefined,
    tintAndShade: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): CellPropertiesFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript.get.asInstanceOf[js.Any])
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesFontLoadOptions]
  }
}

