package typings.pdf2image.anon

import typings.pdf2image.mod.OutputFormat
import typings.pdf2image.pdf2imageStrings.Asterisk
import typings.pdf2image.pdf2imageStrings.Dotjpg
import typings.pdf2image.pdf2imageStrings.Dotpng
import typings.pdf2image.pdf2imageStrings.jpg
import typings.pdf2image.pdf2imageStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<pdf2image.pdf2image.Options> */
trait PartialOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var density: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var outputFormat: js.UndefOr[OutputFormat] = js.undefined
  var outputType: js.UndefOr[jpg | png | Dotjpg | Dotpng] = js.undefined
  var pages: js.UndefOr[Asterisk | String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var singleProcess: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    density: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    outputFormat: OutputFormat = null,
    outputType: jpg | png | Dotjpg | Dotpng = null,
    pages: Asterisk | String = null,
    quality: js.UndefOr[Double] = js.undefined,
    singleProcess: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(density)) __obj.updateDynamic("density")(density.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (outputType != null) __obj.updateDynamic("outputType")(outputType.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleProcess)) __obj.updateDynamic("singleProcess")(singleProcess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

