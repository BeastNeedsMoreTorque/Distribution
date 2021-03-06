package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingConfiguration extends js.Object {
  /**
    * The retention period, in hours, for the Amazon Kinesis data.
    */
  var DataRetentionInHours: typings.awsSdk.chimeMod.DataRetentionInHours = js.native
  /**
    * When true, media streaming to Amazon Kinesis is turned off.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  /**
    * The streaming notification targets.
    */
  var StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList] = js.native
}

object StreamingConfiguration {
  @scala.inline
  def apply(
    DataRetentionInHours: DataRetentionInHours,
    Disabled: js.UndefOr[Boolean] = js.undefined,
    StreamingNotificationTargets: StreamingNotificationTargetList = null
  ): StreamingConfiguration = {
    val __obj = js.Dynamic.literal(DataRetentionInHours = DataRetentionInHours.asInstanceOf[js.Any])
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled.get.asInstanceOf[js.Any])
    if (StreamingNotificationTargets != null) __obj.updateDynamic("StreamingNotificationTargets")(StreamingNotificationTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingConfiguration]
  }
}

