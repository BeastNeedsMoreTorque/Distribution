package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleImageOptions extends js.Object {
  /**
    * Ignored if the current browser does not support image previews.
    *
    * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
    *
    * Once the resize is complete, your promise must be fulfilled.
    * You may, of course, reject your returned `Promise` is the resize fails in some way.
    */
  var customResizer: js.UndefOr[CustomResizerCallBack] = js.undefined
  /**
    * @default `false`
    */
  var includeExif: js.UndefOr[Boolean] = js.undefined
  /**
    * required
    */
  var maxSize: Double
  /**
    * @default `true`
    */
  var orient: js.UndefOr[Boolean] = js.undefined
  /**
    * number between `0` and `100`
    *
    * @default `80`
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * defaults to the type of the reference image
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ScaleImageOptions {
  @scala.inline
  def apply(
    maxSize: Double,
    customResizer: /* resizeInfo */ ResizeInfo => PromiseOptions = null,
    includeExif: js.UndefOr[Boolean] = js.undefined,
    orient: js.UndefOr[Boolean] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): ScaleImageOptions = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    if (customResizer != null) __obj.updateDynamic("customResizer")(js.Any.fromFunction1(customResizer))
    if (!js.isUndefined(includeExif)) __obj.updateDynamic("includeExif")(includeExif.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orient)) __obj.updateDynamic("orient")(orient.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleImageOptions]
  }
}

