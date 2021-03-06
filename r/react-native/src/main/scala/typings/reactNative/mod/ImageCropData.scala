package typings.reactNative.mod

import typings.reactNative.anon.Height
import typings.reactNative.anon.X
import typings.reactNative.reactNativeStrings.contain
import typings.reactNative.reactNativeStrings.cover
import typings.reactNative.reactNativeStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageCropData extends js.Object {
  /**
    * (Optional) size to scale the cropped image to.
    */
  var displaySize: js.UndefOr[Height] = js.undefined
  /**
    * The top-left corner of the cropped image, specified in the original
    * image's coordinate space.
    */
  var offset: X
  /**
    * (Optional) the resizing mode to use when scaling the image. If the
    * `displaySize` param is not specified, this has no effect.
    */
  var resizeMode: js.UndefOr[contain | cover | stretch] = js.undefined
  /**
    * The size (dimensions) of the cropped image, specified in the original
    * image's coordinate space.
    */
  var size: Height
}

object ImageCropData {
  @scala.inline
  def apply(offset: X, size: Height, displaySize: Height = null, resizeMode: contain | cover | stretch = null): ImageCropData = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (displaySize != null) __obj.updateDynamic("displaySize")(displaySize.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCropData]
  }
}

