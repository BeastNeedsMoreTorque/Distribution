package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var id: String
  var location: js.UndefOr[LocationValue] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(id: String, location: LocationValue = null, name: String = null): Location = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

