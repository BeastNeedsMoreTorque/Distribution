package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationSetReputationOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to enable or disable reputation metric tracking for.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName = js.native
  /**
    * If true, tracking of reputation metrics is enabled for the configuration set. If false, tracking of reputation metrics is disabled for the configuration set.
    */
  var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.native
}

object PutConfigurationSetReputationOptionsRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
  ): PutConfigurationSetReputationOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    if (!js.isUndefined(ReputationMetricsEnabled)) __obj.updateDynamic("ReputationMetricsEnabled")(ReputationMetricsEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetReputationOptionsRequest]
  }
}

