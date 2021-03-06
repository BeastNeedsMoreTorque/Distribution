package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An allocator that can create PerceptionFrames directly which can be written into or copied from Windows::Media::VideoFrame into a PerceptionFrame. */
trait PerceptionVideoFrameAllocator extends js.Object {
  /**
    * Creates an empty PerceptionFrame with the properties specified when creating the PerceptionVideoFrameAllocator.
    * @return The empty frame with the properties specified when creating the PerceptionVideoFrameAllocator.
    */
  def allocateFrame(): PerceptionFrame
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit
  /**
    * Creates a deep copy of the video FrameProvider with the bytes already filled in with the resulting PerceptionFrame.
    * @param frame The input frame from which to copy the pixel data.
    * @return The resulting filled PerceptionFrame.
    */
  def copyFromVideoFrame(frame: VideoFrame): PerceptionFrame
}

object PerceptionVideoFrameAllocator {
  @scala.inline
  def apply(
    allocateFrame: () => PerceptionFrame,
    close: () => Unit,
    copyFromVideoFrame: VideoFrame => PerceptionFrame
  ): PerceptionVideoFrameAllocator = {
    val __obj = js.Dynamic.literal(allocateFrame = js.Any.fromFunction0(allocateFrame), close = js.Any.fromFunction0(close), copyFromVideoFrame = js.Any.fromFunction1(copyFromVideoFrame))
    __obj.asInstanceOf[PerceptionVideoFrameAllocator]
  }
}

