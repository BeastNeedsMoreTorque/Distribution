package typings.minio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var accessKey: String
  var endPoint: String
  var partSize: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var region: js.UndefOr[Region] = js.undefined
  var secretKey: String
  var sessionToken: js.UndefOr[String] = js.undefined
  var transport: js.UndefOr[js.Any] = js.undefined
  var useSSL: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    accessKey: String,
    endPoint: String,
    secretKey: String,
    partSize: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    region: Region = null,
    sessionToken: String = null,
    transport: js.Any = null,
    useSSL: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    if (!js.isUndefined(partSize)) __obj.updateDynamic("partSize")(partSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

