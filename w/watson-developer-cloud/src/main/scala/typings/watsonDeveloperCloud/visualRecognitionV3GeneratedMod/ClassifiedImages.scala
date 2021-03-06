package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results for all images. */
trait ClassifiedImages extends js.Object {
  /** Number of custom classes identified in the images. */
  var custom_classes: js.UndefOr[Double] = js.undefined
  /** Classified images. */
  var images: js.Array[ClassifiedImage]
  /** Number of images processed for the API call. */
  var images_processed: js.UndefOr[Double] = js.undefined
  /** Information about what might cause less than optimal output. For example, a request sent with a corrupt .zip file and a list of image URLs will still complete, but does not return the expected output. Not returned when there is no warning. */
  var warnings: js.UndefOr[js.Array[WarningInfo]] = js.undefined
}

object ClassifiedImages {
  @scala.inline
  def apply(
    images: js.Array[ClassifiedImage],
    custom_classes: js.UndefOr[Double] = js.undefined,
    images_processed: js.UndefOr[Double] = js.undefined,
    warnings: js.Array[WarningInfo] = null
  ): ClassifiedImages = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    if (!js.isUndefined(custom_classes)) __obj.updateDynamic("custom_classes")(custom_classes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(images_processed)) __obj.updateDynamic("images_processed")(images_processed.get.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedImages]
  }
}

