package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  /**
    * The rotation angle of the crop window around its center, in radians.
    * Rotation angle is applied after the offset.
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * The offset specifies the bottom edge of the crop rectangle that is located
    * above the original bounding rectangle bottom edge, relative to the object's
    * original height.
    */
  var bottomOffset: js.UndefOr[Double] = js.undefined
  /**
    * The offset specifies the left edge of the crop rectangle that is located to
    * the right of the original bounding rectangle left edge, relative to the
    * object's original width.
    */
  var leftOffset: js.UndefOr[Double] = js.undefined
  /**
    * The offset specifies the right edge of the crop rectangle that is located
    * to the left of the original bounding rectangle right edge, relative to the
    * object's original width.
    */
  var rightOffset: js.UndefOr[Double] = js.undefined
  /**
    * The offset specifies the top edge of the crop rectangle that is located
    * below the original bounding rectangle top edge, relative to the object's
    * original height.
    */
  var topOffset: js.UndefOr[Double] = js.undefined
}

object CropProperties {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    bottomOffset: js.UndefOr[Double] = js.undefined,
    leftOffset: js.UndefOr[Double] = js.undefined,
    rightOffset: js.UndefOr[Double] = js.undefined,
    topOffset: js.UndefOr[Double] = js.undefined
  ): CropProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomOffset)) __obj.updateDynamic("bottomOffset")(bottomOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftOffset)) __obj.updateDynamic("leftOffset")(leftOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightOffset)) __obj.updateDynamic("rightOffset")(rightOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffset)) __obj.updateDynamic("topOffset")(topOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropProperties]
  }
}

