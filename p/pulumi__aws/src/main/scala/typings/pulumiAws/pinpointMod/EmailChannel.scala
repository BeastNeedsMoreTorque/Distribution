package typings.pulumiAws.pinpointMod

import typings.pulumiAws.emailChannelMod.EmailChannelArgs
import typings.pulumiAws.emailChannelMod.EmailChannelState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint", "EmailChannel")
@js.native
class EmailChannel protected ()
  extends typings.pulumiAws.emailChannelMod.EmailChannel {
  /**
    * Create a EmailChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EmailChannelArgs) = this()
  def this(name: String, args: EmailChannelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/pinpoint", "EmailChannel")
@js.native
object EmailChannel extends js.Object {
  /**
    * Get an existing EmailChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.emailChannelMod.EmailChannel = js.native
  def get(name: String, id: Input[ID], state: EmailChannelState): typings.pulumiAws.emailChannelMod.EmailChannel = js.native
  def get(name: String, id: Input[ID], state: EmailChannelState, opts: CustomResourceOptions): typings.pulumiAws.emailChannelMod.EmailChannel = js.native
  /**
    * Returns true if the given object is an instance of EmailChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/emailChannel.EmailChannel */ Boolean = js.native
}

