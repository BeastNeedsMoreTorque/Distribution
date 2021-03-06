package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsAnswer extends js.Object {
  /**
    * The maximum number of groups allowed for your AWS account. The default is 200 groups per AWS Region.
    */
  var MaxNumberOfAutoScalingGroups: js.UndefOr[typings.awsSdk.autoscalingMod.MaxNumberOfAutoScalingGroups] = js.native
  /**
    * The maximum number of launch configurations allowed for your AWS account. The default is 200 launch configurations per AWS Region.
    */
  var MaxNumberOfLaunchConfigurations: js.UndefOr[typings.awsSdk.autoscalingMod.MaxNumberOfLaunchConfigurations] = js.native
  /**
    * The current number of groups for your AWS account.
    */
  var NumberOfAutoScalingGroups: js.UndefOr[typings.awsSdk.autoscalingMod.NumberOfAutoScalingGroups] = js.native
  /**
    * The current number of launch configurations for your AWS account.
    */
  var NumberOfLaunchConfigurations: js.UndefOr[typings.awsSdk.autoscalingMod.NumberOfLaunchConfigurations] = js.native
}

object DescribeAccountLimitsAnswer {
  @scala.inline
  def apply(
    MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups] = js.undefined,
    MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations] = js.undefined,
    NumberOfAutoScalingGroups: js.UndefOr[NumberOfAutoScalingGroups] = js.undefined,
    NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations] = js.undefined
  ): DescribeAccountLimitsAnswer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxNumberOfAutoScalingGroups)) __obj.updateDynamic("MaxNumberOfAutoScalingGroups")(MaxNumberOfAutoScalingGroups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxNumberOfLaunchConfigurations)) __obj.updateDynamic("MaxNumberOfLaunchConfigurations")(MaxNumberOfLaunchConfigurations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfAutoScalingGroups)) __obj.updateDynamic("NumberOfAutoScalingGroups")(NumberOfAutoScalingGroups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfLaunchConfigurations)) __obj.updateDynamic("NumberOfLaunchConfigurations")(NumberOfLaunchConfigurations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountLimitsAnswer]
  }
}

