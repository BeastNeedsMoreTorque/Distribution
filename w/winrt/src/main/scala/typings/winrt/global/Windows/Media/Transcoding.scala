package typings.winrt.global.Windows.Media

import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Transcoding")
@js.native
object Transcoding extends js.Object {
  @js.native
  class MediaTranscoder ()
    extends typings.winrt.Windows.Media.Transcoding.MediaTranscoder
  
  @js.native
  class PrepareTranscodeResult ()
    extends typings.winrt.Windows.Media.Transcoding.PrepareTranscodeResult {
    /* CompleteClass */
    override var canTranscode: Boolean = js.native
    /* CompleteClass */
    override var failureReason: TranscodeFailureReason = js.native
    /* CompleteClass */
    override def transcodeAsync(): IAsyncActionWithProgress[Double] = js.native
  }
  
  @js.native
  object TranscodeFailureReason extends js.Object {
    /* 3 */ val codecNotFound: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound with Double = js.native
    /* 2 */ val invalidProfile: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.none with Double = js.native
    /* 1 */ val unknown: typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Media.Transcoding.TranscodeFailureReason with Double] = js.native
  }
  
}

