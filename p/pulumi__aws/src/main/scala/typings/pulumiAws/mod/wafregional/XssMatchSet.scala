package typings.pulumiAws.mod.wafregional

import typings.pulumiAws.xssMatchSetMod.XssMatchSetArgs
import typings.pulumiAws.xssMatchSetMod.XssMatchSetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional.XssMatchSet")
@js.native
class XssMatchSet protected ()
  extends typings.pulumiAws.wafregionalMod.XssMatchSet {
  /**
    * Create a XssMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: XssMatchSetArgs) = this()
  def this(name: String, args: XssMatchSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "wafregional.XssMatchSet")
@js.native
object XssMatchSet extends js.Object {
  /**
    * Get an existing XssMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
  def get(name: String, id: Input[ID], state: XssMatchSetState): typings.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
  def get(name: String, id: Input[ID], state: XssMatchSetState, opts: CustomResourceOptions): typings.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
  /**
    * Returns true if the given object is an instance of XssMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/xssMatchSet.XssMatchSet */ Boolean = js.native
}

