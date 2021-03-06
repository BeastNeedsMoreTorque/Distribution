package typings.awsSdk.rdsSignerMod.Signer

import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.credentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignerOptions extends js.Object {
  var credentials: js.UndefOr[Credentials | CredentialsOptions] = js.native
  var hostname: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var region: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object SignerOptions {
  @scala.inline
  def apply(
    credentials: Credentials | CredentialsOptions = null,
    hostname: String = null,
    port: js.UndefOr[Double] = js.undefined,
    region: String = null,
    username: String = null
  ): SignerOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerOptions]
  }
}

