package typings.pulumiAws.documentationVersionMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/documentationVersion", "DocumentationVersion")
@js.native
class DocumentationVersion protected () extends CustomResource {
  /**
    * Create a DocumentationVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DocumentationVersionArgs) = this()
  def this(name: String, args: DocumentationVersionArgs, opts: CustomResourceOptions) = this()
  /**
    * The description of the API documentation version.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApiId: Output_[String] = js.native
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/documentationVersion", "DocumentationVersion")
@js.native
object DocumentationVersion extends js.Object {
  /**
    * Get an existing DocumentationVersion resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DocumentationVersion = js.native
  def get(name: String, id: Input[ID], state: DocumentationVersionState): DocumentationVersion = js.native
  def get(name: String, id: Input[ID], state: DocumentationVersionState, opts: CustomResourceOptions): DocumentationVersion = js.native
  /**
    * Returns true if the given object is an instance of DocumentationVersion.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/documentationVersion.DocumentationVersion */ Boolean = js.native
}

