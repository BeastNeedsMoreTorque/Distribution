package typings.pulumiAws.anon

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.runtimesMod.Runtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePathOptions extends js.Object {
  /**
    * Options to control which paths/packages should be included or excluded in the zip file containing
    * the code for the AWS lambda.
    */
  var codePathOptions: js.UndefOr[typings.pulumiPulumi.codePathsMod.CodePathOptions] = js.native
  /**
    * A list of IAM policy ARNs to attach to the Function.  Will be used if [role] is not provide.
    * If neither [role] nor [policies] is provided, a default policy of [iam.AWSLambdaFullAccess]
    * will be used instead.
    */
  var policies: js.UndefOr[js.Array[ARN]] = js.native
  /**
    * A pre-created role to use for the Function. If not provided, [policies] will be used.
    */
  var role: js.UndefOr[Role] = js.native
  /**
    * The Lambda runtime to use.  If not provided, will default to [NodeJS8d10Runtime]
    */
  var runtime: js.UndefOr[Runtime] = js.native
}

object CodePathOptions {
  @scala.inline
  def apply(
    codePathOptions: typings.pulumiPulumi.codePathsMod.CodePathOptions = null,
    policies: js.Array[ARN] = null,
    role: Role = null,
    runtime: Runtime = null
  ): CodePathOptions = {
    val __obj = js.Dynamic.literal()
    if (codePathOptions != null) __obj.updateDynamic("codePathOptions")(codePathOptions.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePathOptions]
  }
}

