package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeLimits extends js.Object {
  /**
    *  The upper boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration. 
    */
  var MaximumCapacityUnits: Integer = js.native
  /**
    *  The upper boundary of EC2 units for core node type in a cluster. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The core units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and task nodes. 
    */
  var MaximumCoreCapacityUnits: js.UndefOr[Integer] = js.native
  /**
    *  The upper boundary of On-Demand EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between On-Demand and Spot instances. 
    */
  var MaximumOnDemandCapacityUnits: js.UndefOr[Integer] = js.native
  /**
    *  The lower boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration. 
    */
  var MinimumCapacityUnits: Integer = js.native
  /**
    *  The unit type used for specifying a managed scaling policy. 
    */
  var UnitType: ComputeLimitsUnitType = js.native
}

object ComputeLimits {
  @scala.inline
  def apply(
    MaximumCapacityUnits: Integer,
    MinimumCapacityUnits: Integer,
    UnitType: ComputeLimitsUnitType,
    MaximumCoreCapacityUnits: js.UndefOr[Integer] = js.undefined,
    MaximumOnDemandCapacityUnits: js.UndefOr[Integer] = js.undefined
  ): ComputeLimits = {
    val __obj = js.Dynamic.literal(MaximumCapacityUnits = MaximumCapacityUnits.asInstanceOf[js.Any], MinimumCapacityUnits = MinimumCapacityUnits.asInstanceOf[js.Any], UnitType = UnitType.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumCoreCapacityUnits)) __obj.updateDynamic("MaximumCoreCapacityUnits")(MaximumCoreCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumOnDemandCapacityUnits)) __obj.updateDynamic("MaximumOnDemandCapacityUnits")(MaximumOnDemandCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeLimits]
  }
}

