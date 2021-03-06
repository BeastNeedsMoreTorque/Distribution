package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetTagSpecification extends js.Object {
  /**
    * The type of resource. Currently, the only resource type that is supported is instance. To tag the Spot Fleet request on creation, use the TagSpecifications parameter in  SpotFleetRequestConfigData .
    */
  var ResourceType: js.UndefOr[typings.awsSdk.ec2Mod.ResourceType] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SpotFleetTagSpecification {
  @scala.inline
  def apply(ResourceType: ResourceType = null, Tags: TagList = null): SpotFleetTagSpecification = {
    val __obj = js.Dynamic.literal()
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetTagSpecification]
  }
}

