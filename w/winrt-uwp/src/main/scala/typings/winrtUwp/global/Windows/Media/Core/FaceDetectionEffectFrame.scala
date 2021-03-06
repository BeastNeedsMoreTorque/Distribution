package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.FaceAnalysis.DetectedFace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video frame that includes a list of faces detected by the FaceDetectionEffect . */
@JSGlobal("Windows.Media.Core.FaceDetectionEffectFrame")
@js.native
abstract class FaceDetectionEffectFrame ()
  extends typings.winrtUwp.Windows.Media.Core.FaceDetectionEffectFrame {
  /** Gets the list of objects representing the faces detected in the frame. */
  /* CompleteClass */
  override var detectedFaces: IVectorView[DetectedFace] = js.native
  /** Gets or sets the duration of the face detection effect frame. */
  /* CompleteClass */
  override var duration: Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  /* CompleteClass */
  override var extendedProperties: IPropertySet = js.native
  /** Gets or sets a value that indicates whether a video frame is the first frame after a gap in the stream. */
  /* CompleteClass */
  override var isDiscontinuous: Boolean = js.native
  /** Gets a value indicating whether the frame is read-only. */
  /* CompleteClass */
  override var isReadOnly: Boolean = js.native
  /** Gets or sets the relative time of the frame within the video stream. */
  /* CompleteClass */
  override var relativeTime: Double = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  /* CompleteClass */
  override var systemRelativeTime: Double = js.native
  /** Gets a string indicating the type of data the frame contains. */
  /* CompleteClass */
  override var `type`: String = js.native
  /** Disposes of the object and associated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
}

