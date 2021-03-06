package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The position of the label instance on the image.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
    */
  var Confidence: js.UndefOr[Percent] = js.native
}

object Instance {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Confidence: js.UndefOr[Percent] = js.undefined): Instance = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

