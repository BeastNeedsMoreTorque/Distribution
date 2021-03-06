package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMultiplexResponse extends js.Object {
  /**
    * The unique arn of the multiplex.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * A list of availability zones for the multiplex.
    */
  var AvailabilityZones: js.UndefOr[listOfString] = js.native
  /**
    * A list of the multiplex output destinations.
    */
  var Destinations: js.UndefOr[listOfMultiplexOutputDestination] = js.native
  /**
    * The unique id of the multiplex.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexSettings] = js.native
  /**
    * The name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.native
  /**
    * The number of programs in the multiplex.
    */
  var ProgramCount: js.UndefOr[integer] = js.native
  /**
    * The current state of the multiplex.
    */
  var State: js.UndefOr[MultiplexState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
}

object StartMultiplexResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    AvailabilityZones: listOfString = null,
    Destinations: listOfMultiplexOutputDestination = null,
    Id: string = null,
    MultiplexSettings: MultiplexSettings = null,
    Name: string = null,
    PipelinesRunningCount: js.UndefOr[integer] = js.undefined,
    ProgramCount: js.UndefOr[integer] = js.undefined,
    State: MultiplexState = null,
    Tags: Tags = null
  ): StartMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MultiplexSettings != null) __obj.updateDynamic("MultiplexSettings")(MultiplexSettings.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(PipelinesRunningCount)) __obj.updateDynamic("PipelinesRunningCount")(PipelinesRunningCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ProgramCount)) __obj.updateDynamic("ProgramCount")(ProgramCount.get.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMultiplexResponse]
  }
}

