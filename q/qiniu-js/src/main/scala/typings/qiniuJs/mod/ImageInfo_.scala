package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsStrings.bmp
import typings.qiniuJs.qiniuJsStrings.gif
import typings.qiniuJs.qiniuJsStrings.jpeg
import typings.qiniuJs.qiniuJsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo_ extends js.Object {
                              // 图片高度，单位：像素(px) 。
  var colorModel: String
                              // 文件大小，单位：Bytes
  var format: png | jpeg | gif | bmp
                          // 彩色空间，如palette16、ycbcr等。
  var frameNumber: Double
                              // 图片宽度，单位：像素(px) 。
  var height: Double
  var size: Double
      // 图片类型，如png、jpeg、gif、bmp等。
  var width: Double
}

object ImageInfo_ {
  @scala.inline
  def apply(
    colorModel: String,
    format: png | jpeg | gif | bmp,
    frameNumber: Double,
    height: Double,
    size: Double,
    width: Double
  ): ImageInfo_ = {
    val __obj = js.Dynamic.literal(colorModel = colorModel.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], frameNumber = frameNumber.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo_]
  }
}

