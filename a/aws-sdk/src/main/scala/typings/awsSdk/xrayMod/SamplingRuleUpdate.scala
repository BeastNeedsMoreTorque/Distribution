package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleUpdate extends js.Object {
  /**
    * Matches attributes derived from the request.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.native
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[NullableDouble] = js.native
  /**
    * Matches the HTTP method of a request.
    */
  var HTTPMethod: js.UndefOr[typings.awsSdk.xrayMod.HTTPMethod] = js.native
  /**
    * Matches the hostname from a request URL.
    */
  var Host: js.UndefOr[typings.awsSdk.xrayMod.Host] = js.native
  /**
    * The priority of the sampling rule.
    */
  var Priority: js.UndefOr[NullableInteger] = js.native
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  var ReservoirSize: js.UndefOr[NullableInteger] = js.native
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.xrayMod.ResourceARN] = js.native
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.native
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[typings.awsSdk.xrayMod.RuleName] = js.native
  /**
    * Matches the name that the service uses to identify itself in segments.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.xrayMod.ServiceName] = js.native
  /**
    * Matches the origin that the service uses to identify its type in segments.
    */
  var ServiceType: js.UndefOr[typings.awsSdk.xrayMod.ServiceType] = js.native
  /**
    * Matches the path from a request URL.
    */
  var URLPath: js.UndefOr[typings.awsSdk.xrayMod.URLPath] = js.native
}

object SamplingRuleUpdate {
  @scala.inline
  def apply(
    Attributes: AttributeMap = null,
    FixedRate: js.UndefOr[NullableDouble] = js.undefined,
    HTTPMethod: HTTPMethod = null,
    Host: Host = null,
    Priority: js.UndefOr[NullableInteger] = js.undefined,
    ReservoirSize: js.UndefOr[NullableInteger] = js.undefined,
    ResourceARN: ResourceARN = null,
    RuleARN: String = null,
    RuleName: RuleName = null,
    ServiceName: ServiceName = null,
    ServiceType: ServiceType = null,
    URLPath: URLPath = null
  ): SamplingRuleUpdate = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedRate)) __obj.updateDynamic("FixedRate")(FixedRate.get.asInstanceOf[js.Any])
    if (HTTPMethod != null) __obj.updateDynamic("HTTPMethod")(HTTPMethod.asInstanceOf[js.Any])
    if (Host != null) __obj.updateDynamic("Host")(Host.asInstanceOf[js.Any])
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReservoirSize)) __obj.updateDynamic("ReservoirSize")(ReservoirSize.get.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType.asInstanceOf[js.Any])
    if (URLPath != null) __obj.updateDynamic("URLPath")(URLPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRuleUpdate]
  }
}

