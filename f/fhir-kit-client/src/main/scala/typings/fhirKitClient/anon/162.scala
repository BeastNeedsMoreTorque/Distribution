package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.MessageDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `162` extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: MessageDefinition
  var version: String
}

object `162` {
  @scala.inline
  def apply(
    id: String,
    resourceType: MessageDefinition,
    version: String,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): `162` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`162`]
  }
}

