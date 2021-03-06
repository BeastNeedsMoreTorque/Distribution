package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The crop properties of an object enclosed in a container. For example, an
  * Image.  The crop properties is represented by the offsets of four edges
  * which define a crop rectangle. The offsets are measured in percentage from
  * the corresponding edges of the object&#39;s original bounding rectangle
  * towards inside, relative to the object&#39;s original dimensions.  - If the
  * offset is in the interval (0, 1), the corresponding edge of crop rectangle
  * is positioned inside of the object&#39;s original bounding rectangle. - If
  * the offset is negative or greater than 1, the corresponding edge of crop
  * rectangle is positioned outside of the object&#39;s original bounding
  * rectangle. - If the left edge of the crop rectangle is on the right side of
  * its right edge, the object will be flipped horizontally. - If the top edge
  * of the crop rectangle is below its bottom edge, the object will be flipped
  * vertically. - If all offsets and rotation angle is 0, the object is not
  * cropped.  After cropping, the content in the crop rectangle will be
  * stretched to fit its container.
  */
@js.native
trait SchemaCropProperties extends js.Object {
  /**
    * The rotation angle of the crop window around its center, in radians.
    * Rotation angle is applied after the offset.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The offset specifies the bottom edge of the crop rectangle that is
    * located above the original bounding rectangle bottom edge, relative to
    * the object&#39;s original height.
    */
  var bottomOffset: js.UndefOr[Double] = js.native
  /**
    * The offset specifies the left edge of the crop rectangle that is located
    * to the right of the original bounding rectangle left edge, relative to
    * the object&#39;s original width.
    */
  var leftOffset: js.UndefOr[Double] = js.native
  /**
    * The offset specifies the right edge of the crop rectangle that is located
    * to the left of the original bounding rectangle right edge, relative to
    * the object&#39;s original width.
    */
  var rightOffset: js.UndefOr[Double] = js.native
  /**
    * The offset specifies the top edge of the crop rectangle that is located
    * below the original bounding rectangle top edge, relative to the
    * object&#39;s original height.
    */
  var topOffset: js.UndefOr[Double] = js.native
}

object SchemaCropProperties {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    bottomOffset: js.UndefOr[Double] = js.undefined,
    leftOffset: js.UndefOr[Double] = js.undefined,
    rightOffset: js.UndefOr[Double] = js.undefined,
    topOffset: js.UndefOr[Double] = js.undefined
  ): SchemaCropProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomOffset)) __obj.updateDynamic("bottomOffset")(bottomOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftOffset)) __obj.updateDynamic("leftOffset")(leftOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightOffset)) __obj.updateDynamic("rightOffset")(rightOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffset)) __obj.updateDynamic("topOffset")(topOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCropProperties]
  }
}

