package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCapacityReservationSpecification extends js.Object {
  /**
    * Indicates the instance's Capacity Reservation preferences. Can be `open` or `none`. (Default `none`).
    */
  var capacityReservationPreference: js.UndefOr[Input[String]] = js.native
  /**
    * Used to target a specific Capacity Reservation:
    */
  var capacityReservationTarget: js.UndefOr[Input[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget]] = js.native
}

object LaunchTemplateCapacityReservationSpecification {
  @scala.inline
  def apply(
    capacityReservationPreference: Input[String] = null,
    capacityReservationTarget: Input[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] = null
  ): LaunchTemplateCapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationPreference != null) __obj.updateDynamic("capacityReservationPreference")(capacityReservationPreference.asInstanceOf[js.Any])
    if (capacityReservationTarget != null) __obj.updateDynamic("capacityReservationTarget")(capacityReservationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecification]
  }
}

