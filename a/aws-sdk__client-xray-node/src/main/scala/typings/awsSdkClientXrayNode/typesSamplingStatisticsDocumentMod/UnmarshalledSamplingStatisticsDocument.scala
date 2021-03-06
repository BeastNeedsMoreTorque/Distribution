package typings.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSamplingStatisticsDocument extends SamplingStatisticsDocument {
  /**
    * <p>The current time.</p>
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledSamplingStatisticsDocument: Date
}

object UnmarshalledSamplingStatisticsDocument {
  @scala.inline
  def apply(
    ClientID: String,
    RequestCount: Double,
    RuleName: String,
    SampledCount: Double,
    Timestamp: Date,
    BorrowCount: js.UndefOr[Double] = js.undefined
  ): UnmarshalledSamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(BorrowCount)) __obj.updateDynamic("BorrowCount")(BorrowCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSamplingStatisticsDocument]
  }
}

