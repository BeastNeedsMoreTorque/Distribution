package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IapPublicKeysResponse extends js.Object {
  var pubkeys: PublicKeys
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.undefined
}

object IapPublicKeysResponse {
  @scala.inline
  def apply(pubkeys: PublicKeys, res: js.UndefOr[Null | GaxiosResponse[Unit]] = js.undefined): IapPublicKeysResponse = {
    val __obj = js.Dynamic.literal(pubkeys = pubkeys.asInstanceOf[js.Any])
    if (!js.isUndefined(res)) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[IapPublicKeysResponse]
  }
}

