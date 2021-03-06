package typings.pulumiAws.trafficMirrorTargetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget")
@js.native
class TrafficMirrorTarget protected () extends CustomResource {
  /**
    * Create a TrafficMirrorTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TrafficMirrorTargetArgs) = this()
  def this(name: String, args: TrafficMirrorTargetArgs, opts: CustomResourceOptions) = this()
  /**
    * A description of the traffic mirror session.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The network interface ID that is associated with the target.
    */
  val networkInterfaceId: Output_[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
    */
  val networkLoadBalancerArn: Output_[js.UndefOr[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget")
@js.native
object TrafficMirrorTarget extends js.Object {
  /**
    * Get an existing TrafficMirrorTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): TrafficMirrorTarget = js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorTargetState): TrafficMirrorTarget = js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorTargetState, opts: CustomResourceOptions): TrafficMirrorTarget = js.native
  /**
    * Returns true if the given object is an instance of TrafficMirrorTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorTarget.TrafficMirrorTarget */ Boolean = js.native
}

