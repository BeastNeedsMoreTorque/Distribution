package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceMatch extends js.Object {
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image ID that you assigned.
    */
  var Face: js.UndefOr[typings.awsSdk.rekognitionMod.Face] = js.native
  /**
    * Confidence in the match of this face with the input face.
    */
  var Similarity: js.UndefOr[Percent] = js.native
}

object FaceMatch {
  @scala.inline
  def apply(Face: Face = null, Similarity: js.UndefOr[Percent] = js.undefined): FaceMatch = {
    val __obj = js.Dynamic.literal()
    if (Face != null) __obj.updateDynamic("Face")(Face.asInstanceOf[js.Any])
    if (!js.isUndefined(Similarity)) __obj.updateDynamic("Similarity")(Similarity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceMatch]
  }
}

