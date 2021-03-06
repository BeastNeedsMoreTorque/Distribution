package typings.gapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteSize extends js.Object {
  var byteSize: js.UndefOr[Double] = js.undefined
  var contextLink: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var thumbnailHeight: js.UndefOr[Double] = js.undefined
  var thumbnailLink: js.UndefOr[String] = js.undefined
  var thumbnailWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ByteSize {
  @scala.inline
  def apply(
    byteSize: js.UndefOr[Double] = js.undefined,
    contextLink: String = null,
    height: js.UndefOr[Double] = js.undefined,
    thumbnailHeight: js.UndefOr[Double] = js.undefined,
    thumbnailLink: String = null,
    thumbnailWidth: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ByteSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byteSize)) __obj.updateDynamic("byteSize")(byteSize.get.asInstanceOf[js.Any])
    if (contextLink != null) __obj.updateDynamic("contextLink")(contextLink.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnailHeight)) __obj.updateDynamic("thumbnailHeight")(thumbnailHeight.get.asInstanceOf[js.Any])
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnailWidth)) __obj.updateDynamic("thumbnailWidth")(thumbnailWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteSize]
  }
}

