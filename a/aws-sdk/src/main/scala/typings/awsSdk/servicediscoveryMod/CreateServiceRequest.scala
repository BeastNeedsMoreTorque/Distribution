package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreateService requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create when you register an instance. 
    */
  var DnsConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.DnsConfig] = js.native
  /**
    *  Public DNS and HTTP namespaces only. A complex type that contains settings for an optional Route 53 health check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS records that you specify in DnsConfig.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  For information about the charges for health checks, see AWS Cloud Map Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  You can't add, update, or delete a HealthCheckCustomConfig configuration from an existing service.
    */
  var HealthCheckCustomConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckCustomConfig] = js.native
  /**
    * The name that you want to assign to the service. If you want AWS Cloud Map to create an SRV record when you register an instance, and if you're using a system that requires a specific SRV format, such as HAProxy, specify the following for Name:   Start the name with an underscore (_), such as _exampleservice    End the name with ._protocol, such as ._tcp    When you register an instance, AWS Cloud Map creates an SRV record and assigns a name to the record by concatenating the service name and the namespace name, for example:  _exampleservice._tcp.example.com 
    */
  var Name: ServiceName = js.native
  /**
    * The ID of the namespace that you want to use to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.native
  /**
    * The tags to add to the service. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateServiceRequest {
  @scala.inline
  def apply(
    Name: ServiceName,
    CreatorRequestId: ResourceId = null,
    Description: ResourceDescription = null,
    DnsConfig: DnsConfig = null,
    HealthCheckConfig: HealthCheckConfig = null,
    HealthCheckCustomConfig: HealthCheckCustomConfig = null,
    NamespaceId: ResourceId = null,
    Tags: TagList = null
  ): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DnsConfig != null) __obj.updateDynamic("DnsConfig")(DnsConfig.asInstanceOf[js.Any])
    if (HealthCheckConfig != null) __obj.updateDynamic("HealthCheckConfig")(HealthCheckConfig.asInstanceOf[js.Any])
    if (HealthCheckCustomConfig != null) __obj.updateDynamic("HealthCheckCustomConfig")(HealthCheckCustomConfig.asInstanceOf[js.Any])
    if (NamespaceId != null) __obj.updateDynamic("NamespaceId")(NamespaceId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceRequest]
  }
}

