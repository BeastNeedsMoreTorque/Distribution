package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoginProfileRequest extends js.Object {
  /**
    * The new password for the user. The regex pattern that is used to validate this parameter is a string of characters. That string can include almost any printable ASCII character from the space (\\u0020) through the end of the ASCII character range (\\u00FF). You can also include the tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D) characters. Any of these characters are valid in a password. However, many tools, such as the AWS Management Console, might restrict the ability to type certain characters because they have special meaning within that tool.
    */
  var Password: passwordType = js.native
  /**
    * Specifies whether the user is required to set a new password on next sign-in.
    */
  var PasswordResetRequired: js.UndefOr[booleanType] = js.native
  /**
    * The name of the IAM user to create a password for. The user must already exist. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}

object CreateLoginProfileRequest {
  @scala.inline
  def apply(
    Password: passwordType,
    UserName: userNameType,
    PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
  ): CreateLoginProfileRequest = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (!js.isUndefined(PasswordResetRequired)) __obj.updateDynamic("PasswordResetRequired")(PasswordResetRequired.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoginProfileRequest]
  }
}

