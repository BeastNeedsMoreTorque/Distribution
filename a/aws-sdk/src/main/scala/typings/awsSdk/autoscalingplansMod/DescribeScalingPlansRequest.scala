package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlansRequest extends js.Object {
  /**
    * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application sources.
    */
  var ApplicationSources: js.UndefOr[typings.awsSdk.autoscalingplansMod.ApplicationSources] = js.native
  /**
    * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.autoscalingplansMod.MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.autoscalingplansMod.NextToken] = js.native
  /**
    * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan names.
    */
  var ScalingPlanNames: js.UndefOr[typings.awsSdk.autoscalingplansMod.ScalingPlanNames] = js.native
  /**
    * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling plan name.
    */
  var ScalingPlanVersion: js.UndefOr[typings.awsSdk.autoscalingplansMod.ScalingPlanVersion] = js.native
}

object DescribeScalingPlansRequest {
  @scala.inline
  def apply(
    ApplicationSources: ApplicationSources = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ScalingPlanNames: ScalingPlanNames = null,
    ScalingPlanVersion: js.UndefOr[ScalingPlanVersion] = js.undefined
  ): DescribeScalingPlansRequest = {
    val __obj = js.Dynamic.literal()
    if (ApplicationSources != null) __obj.updateDynamic("ApplicationSources")(ApplicationSources.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScalingPlanNames != null) __obj.updateDynamic("ScalingPlanNames")(ScalingPlanNames.asInstanceOf[js.Any])
    if (!js.isUndefined(ScalingPlanVersion)) __obj.updateDynamic("ScalingPlanVersion")(ScalingPlanVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPlansRequest]
  }
}

