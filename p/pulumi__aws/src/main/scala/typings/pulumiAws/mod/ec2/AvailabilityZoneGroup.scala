package typings.pulumiAws.mod.ec2

import typings.pulumiAws.availabilityZoneGroupMod.AvailabilityZoneGroupArgs
import typings.pulumiAws.availabilityZoneGroupMod.AvailabilityZoneGroupState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.AvailabilityZoneGroup")
@js.native
class AvailabilityZoneGroup protected ()
  extends typings.pulumiAws.ec2Mod.AvailabilityZoneGroup {
  /**
    * Create a AvailabilityZoneGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AvailabilityZoneGroupArgs) = this()
  def this(name: String, args: AvailabilityZoneGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.AvailabilityZoneGroup")
@js.native
object AvailabilityZoneGroup extends js.Object {
  /**
    * Get an existing AvailabilityZoneGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.availabilityZoneGroupMod.AvailabilityZoneGroup = js.native
  def get(name: String, id: Input[ID], state: AvailabilityZoneGroupState): typings.pulumiAws.availabilityZoneGroupMod.AvailabilityZoneGroup = js.native
  def get(name: String, id: Input[ID], state: AvailabilityZoneGroupState, opts: CustomResourceOptions): typings.pulumiAws.availabilityZoneGroupMod.AvailabilityZoneGroup = js.native
  /**
    * Returns true if the given object is an instance of AvailabilityZoneGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/availabilityZoneGroup.AvailabilityZoneGroup */ Boolean = js.native
}

