package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompareFacesMatch extends js.Object {
  /**
    * Provides face metadata (bounding box and confidence that the bounding box actually contains a face).
    */
  var Face: js.UndefOr[ComparedFace] = js.native
  /**
    * Level of confidence that the faces match.
    */
  var Similarity: js.UndefOr[Percent] = js.native
}

object CompareFacesMatch {
  @scala.inline
  def apply(Face: ComparedFace = null, Similarity: js.UndefOr[Percent] = js.undefined): CompareFacesMatch = {
    val __obj = js.Dynamic.literal()
    if (Face != null) __obj.updateDynamic("Face")(Face.asInstanceOf[js.Any])
    if (!js.isUndefined(Similarity)) __obj.updateDynamic("Similarity")(Similarity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareFacesMatch]
  }
}

