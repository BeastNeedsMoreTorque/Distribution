package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Single crop hint that is used to generate a new crop when serving an image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1CropHint extends js.Object {
  /**
    * The bounding polygon for the crop region. The coordinates of the bounding
    * box are in the original image&#39;s scale.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1BoundingPoly] = js.native
  /**
    * Confidence of this being a salient region.  Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Fraction of importance of this salient region with respect to the
    * original image.
    */
  var importanceFraction: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1CropHint {
  @scala.inline
  def apply(
    boundingPoly: SchemaGoogleCloudVisionV1p3beta1BoundingPoly = null,
    confidence: js.UndefOr[Double] = js.undefined,
    importanceFraction: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleCloudVisionV1p3beta1CropHint = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(importanceFraction)) __obj.updateDynamic("importanceFraction")(importanceFraction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1CropHint]
  }
}

