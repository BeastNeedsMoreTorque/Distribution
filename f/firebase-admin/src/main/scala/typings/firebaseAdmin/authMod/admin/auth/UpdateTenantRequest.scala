package typings.firebaseAdmin.authMod.admin.auth

import typings.firebaseAdmin.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the properties to update on the provided tenant.
  */
trait UpdateTenantRequest extends js.Object {
  /**
    * The tenant display name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The email sign in configuration.
    */
  var emailSignInConfig: js.UndefOr[Enabled] = js.undefined
}

object UpdateTenantRequest {
  @scala.inline
  def apply(displayName: String = null, emailSignInConfig: Enabled = null): UpdateTenantRequest = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emailSignInConfig != null) __obj.updateDynamic("emailSignInConfig")(emailSignInConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTenantRequest]
  }
}

