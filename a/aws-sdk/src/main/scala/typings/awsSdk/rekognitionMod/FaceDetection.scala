package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceDetection extends js.Object {
  /**
    * The face properties for the detected face.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  /**
    * Time, in milliseconds from the start of the video, that the face was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}

object FaceDetection {
  @scala.inline
  def apply(Face: FaceDetail = null, Timestamp: js.UndefOr[Timestamp] = js.undefined): FaceDetection = {
    val __obj = js.Dynamic.literal()
    if (Face != null) __obj.updateDynamic("Face")(Face.asInstanceOf[js.Any])
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetection]
  }
}

