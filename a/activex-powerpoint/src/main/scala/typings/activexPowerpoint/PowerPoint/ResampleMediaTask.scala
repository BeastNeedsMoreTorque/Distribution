package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResampleMediaTask extends js.Object {
  val AudioCompressionType: String
  val AudioSamplingRate: Double
  val ContainerType: String
  val IsEmbedded: Boolean
  val IsLinked: Boolean
  @JSName("PowerPoint.ResampleMediaTask_typekey")
  var PowerPointDotResampleMediaTask_typekey: ResampleMediaTask
  val SampleHeight: Double
  val SampleWidth: Double
  val Shape: typings.activexPowerpoint.PowerPoint.Shape
  val VideoCompressionType: String
  val VideoFrameRate: Double
  val profile: PpResampleMediaProfile
}

object ResampleMediaTask {
  @scala.inline
  def apply(
    AudioCompressionType: String,
    AudioSamplingRate: Double,
    ContainerType: String,
    IsEmbedded: Boolean,
    IsLinked: Boolean,
    PowerPointDotResampleMediaTask_typekey: ResampleMediaTask,
    SampleHeight: Double,
    SampleWidth: Double,
    Shape: Shape,
    VideoCompressionType: String,
    VideoFrameRate: Double,
    profile: PpResampleMediaProfile
  ): ResampleMediaTask = {
    val __obj = js.Dynamic.literal(AudioCompressionType = AudioCompressionType.asInstanceOf[js.Any], AudioSamplingRate = AudioSamplingRate.asInstanceOf[js.Any], ContainerType = ContainerType.asInstanceOf[js.Any], IsEmbedded = IsEmbedded.asInstanceOf[js.Any], IsLinked = IsLinked.asInstanceOf[js.Any], SampleHeight = SampleHeight.asInstanceOf[js.Any], SampleWidth = SampleWidth.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], VideoCompressionType = VideoCompressionType.asInstanceOf[js.Any], VideoFrameRate = VideoFrameRate.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ResampleMediaTask_typekey")(PowerPointDotResampleMediaTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResampleMediaTask]
  }
}

