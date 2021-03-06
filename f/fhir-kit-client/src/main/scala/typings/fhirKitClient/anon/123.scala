package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.DeviceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `123` extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: DeviceRequest
  var version: String
}

object `123` {
  @scala.inline
  def apply(
    id: String,
    resourceType: DeviceRequest,
    version: String,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): `123` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`123`]
  }
}

