package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var datasetId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(datasetId: String = null, description: String = null, name: String = null): Name = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

