package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacePhotoRequest extends js.Object {
  /**
    * Specifies the maximum desired height or width, in pixels, of the image returned by the Place Photos service.
    * If the image is smaller than the values specified, the original image will be returned.
    * If the image is larger in either dimension, it will be scaled to match the smaller of the two dimensions,
    * restricted to its original aspect ratio. Both the `maxheight` and `maxwidth` properties accept an integer between 1 and 1600.
    */
  var maxheight: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the maximum desired height or width, in pixels, of the image returned by the Place Photos service.
    * If the image is smaller than the values specified, the original image will be returned.
    * If the image is larger in either dimension, it will be scaled to match the smaller of the two dimensions,
    * restricted to its original aspect ratio. Both the `maxheight` and `maxwidth` properties accept an integer between 1 and 1600.
    */
  var maxwidth: js.UndefOr[Double] = js.undefined
  /**
    * string identifier that uniquely identifies a photo.
    * Photo references are returned from either a Place Search or Place Details request.
    */
  var photoreference: String
}

object PlacePhotoRequest {
  @scala.inline
  def apply(
    photoreference: String,
    maxheight: js.UndefOr[Double] = js.undefined,
    maxwidth: js.UndefOr[Double] = js.undefined
  ): PlacePhotoRequest = {
    val __obj = js.Dynamic.literal(photoreference = photoreference.asInstanceOf[js.Any])
    if (!js.isUndefined(maxheight)) __obj.updateDynamic("maxheight")(maxheight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxwidth)) __obj.updateDynamic("maxwidth")(maxwidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePhotoRequest]
  }
}

