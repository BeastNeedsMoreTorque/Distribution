package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionArgs
import typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getVpcPeeringConnection")
@js.native
object getVpcPeeringConnection extends js.Object {
  def apply(): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
  def apply(args: GetVpcPeeringConnectionArgs): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
  def apply(args: GetVpcPeeringConnectionArgs, opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
}

